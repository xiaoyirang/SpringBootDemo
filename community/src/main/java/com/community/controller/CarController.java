package com.community.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.community.entity.Car;
import com.community.entity.PageDto;
import com.community.entity.Room;
import com.community.entity.User;
import com.community.service.CarService;
import com.community.service.RoomService;
import com.community.service.UserService;

@Controller
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private RoomService roomservice;
	
	/**
	 * 删除车辆(批量删除（未完成）/删除)--1
	 * @param request
	 * @return
	 */
	@RequestMapping("/deleteCar")
	public String deleteCar(HttpServletRequest request,ModelMap model){
		String[] ids = request.getParameterValues("ids");
		String id = "";
		for (int i = 0; i < ids.length; i++) {
			id = ids[i];
			if(i != ids.length-1){
				id += ",";
			}
		}
		carService.deleteCarById(id);
		List<Car> carList = carService.getCarByStatus(1);
		model.put("carList", carList);
		return "adminCar";
	}
	
	/**
	 * 查询车辆列表--1
	 * @param page
	 * @return
	 */
	@RequestMapping("/queryCarList")
	public String queryCarList(PageDto page,ModelMap model){
//		List<Car> carList = carService.getAllCatByPage(0,10);
		List<Car> carList = carService.getCarByStatus(1);
		model.put("carList", carList);
		
		List<Car> carListlist = carService.getCarByStatus(0);
		model.put("carListlist", carListlist);
		
		return "adminCar";
	}
	
	/**
	 * 获取单个车辆信息
	 * @param request
	 * @return
	 */
	@RequestMapping("/getCarById")
	public String getCarById(HttpServletRequest request,ModelMap model,
			HttpSession session){
		User user = (User) session.getAttribute("user");
		int userId = user.getId();
		Car car = carService.getCarById(userId);
		HttpSession sessioncar = request.getSession();
		sessioncar.setAttribute("sessioncar", car);
		model.put("car", car);
		if(user.getRole().equals(0)){
			return "user";
		}else {
			return "user";
		}
	}
	
	/**
	 * 跳转更新车辆信息
	 */
/*	@RequestMapping(value="/getUpdateCar")
	public String getUpdatecar(HttpServletRequest request,ModelMap model){
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		int userId = user.getId();
		Car car = carService.getCarById(userId);
		model.addAttribute("car", car);
		return "updateCar";
	}
*/	
	/**
	 * 更新车信息
	 * @param car
	 * @return
	 */
/*	@RequestMapping("/updateCar")
	public String updateCar(HttpServletRequest request,HttpSession session,ModelMap model){
		Car car = (Car) session.getAttribute("sessioncar");
		
		String color = request.getParameter("color");
		int roomId = Integer.parseInt(request.getParameter("roomId"));
		
		car.setColor(color);
		car.setRoomId(roomId);
		car.setId(car.getId());
		carService.updateCar(car);
		car = carService.getCarById(car.getUserId());
		model.addAttribute("car", car);
		return "userinfo";
	}
*/	
	/**
	 * 跳转--添加车辆
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/caradd")
	public String getcaradd(HttpServletRequest request){
		return "userAddCar";
		
	}
	
	/**
	 * 添加车辆信息
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/addcar")
	public String getAddCar(HttpServletRequest request,ModelMap model,HttpSession session){
		String plateNum = request.getParameter("plateNum");
		String brand = request.getParameter("brand");
		String color = request.getParameter("color");
		String idCardNum =request.getParameter("idCardNum");
		
		User user =	(User) session.getAttribute("user");
		int userId = user.getId();
		String realName = user.getRealName();
		
		Room room = roomservice.getRoomByUserId(userId);
		int roomId = room.getId();
		
		Car addcar = new Car();
		addcar.setPlateNum(plateNum);
		addcar.setBrand(brand);
		addcar.setColor(color);
		addcar.setUserId(userId);
		addcar.setRealName(realName);
		addcar.setRoomId(roomId);
		addcar.setStatus(1);
		
		carService.addCar(addcar);
		
//		Car car = carService.getCarByCarId(addcar.getId());
		model.put("car", addcar);
		return "user";
	}

}
