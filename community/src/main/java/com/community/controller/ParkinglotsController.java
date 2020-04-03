package com.community.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.community.entity.Car;
import com.community.entity.Parkinglots;
import com.community.service.CarService;
import com.community.service.ParkinglotsService;

@Controller
@RequestMapping("/parkinglots")
public class ParkinglotsController {

	@Autowired
	private ParkinglotsService parkinglotsService;
	
	@Autowired
	private CarService carservice;
	
	/**
	 * 查询所有的停车场信息
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/allparkinglots")
	public String getAllParkinglots(HttpServletRequest request,ModelMap model){
		List<Parkinglots> parkinglots =
				parkinglotsService.getAllParkinglotsByPage(0, 10);
		model.put("parkinglots", parkinglots);
		return "adminParkinglots";
	}
	
	/**
	 * 出售停车场(同时添加car表相关信息)
	 * @param request
	 * @param model
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value="/addparkinglots")
	public String addparkinglots(HttpServletRequest request,ModelMap model) 
			throws ParseException{
		String serialNumber = request.getParameter("serialNumber");
		int userId = Integer.parseInt(request.getParameter("userId"));
		Car car = carservice.getCarById(userId);
		
		String location = request.getParameter("location");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String date1 = request.getParameter("startTime");
		String date2 = request.getParameter("endTime");
		Date startTime = sdf.parse(date1);
		Date endTime = sdf.parse(date2);
		
		//停车场信息
		Parkinglots parking = new Parkinglots();
		parking.setSerialNumber(serialNumber);
		parking.setUserId(userId);
		parking.setRealName(car.getRealName());
		parking.setLocation(location);
		parking.setSold(1);
		parking.setStartTime(startTime);
		parking.setEndTime(endTime);
		parking.setCarId(car.getId());
		
		parkinglotsService.addParkinglots(parking);
		
		List<Parkinglots> parkinglots =
				parkinglotsService.getAllParkinglotsByPage(0, 10);
		model.put("parkinglots", parkinglots);
		
		Parkinglots parkings = 
				parkinglotsService.getParkinglotsByserialNumber(serialNumber);
		//车辆信息
		car.setSerialNumber(serialNumber);
		car.setStartTime(startTime);
		car.setEndTime(endTime);
		car.setParkNum(parkings.getId());
		carservice.updateCar(car);
		
		return "adminParkinglots";
	}

}
