package com.community.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.community.entity.Car;
import com.community.entity.Room;
import com.community.entity.User;
import com.community.service.CarService;
import com.community.service.RoomService;
import com.community.service.UserService;

@Controller
@RequestMapping("/room")
public class RoomController {
	
	@Autowired
	private RoomService roomservice;
	
	@Autowired
	private CarService carservice;
	
	@Autowired
	private UserService userservice;
	
	/**
	 * 根据sold查看所有房屋
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/allroom")
	public String getAllRoom(HttpServletRequest request,ModelMap model){
		//已出售
		List<Room> room0 = roomservice.getRoomBySold(0);
		if(room0.size()>0 && room0 != null){
			model.put("room0", room0);
		}
		//未出售
		List<Room> room1 = roomservice.getRoomBySold(1);
		if(room1.size()>0 && room1 != null){
			model.put("room1", room1);
		}

		return "adminRoom";
	}
	
	/**
	 * 根据用户ID查询
	 * @param request
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/roomByUser")
	public String getRoomByUserId(HttpServletRequest request,HttpSession session,
			ModelMap model){
		User user = (User) session.getAttribute("user");
		int id = user.getId();
		
		Room room = roomservice.getRoomByUserId(id);
		model.put("room", room);
		Car car = carservice.getCarById(id);
		model.put("car", car);
		
		return "userinfo";
	}
	
	/**
	 * 出售
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/updateroom")
	public String getUpdateRoom(HttpServletRequest request,ModelMap model,HttpSession session){
		int id = Integer.parseInt(request.getParameter("id"));
		String idCardNum = request.getParameter("idCardNum");
		User user = (User) session.getAttribute("user");;
		
		Room room = new Room();
		room.setId(id);
		room.setUserId(user.getId());
		room.setRealName(user.getRealName());
		room.setSold(0);
		
		roomservice.updateRoom(room);
		//已出售
		List<Room> rooms = roomservice.getRoomBySold(0);
		model.put("rooms", rooms);
		//未出售
		List<Room> roomlist = roomservice.getRoomBySold(1);
		model.put("roomlist", roomlist);
		
		return "adminRoom";
		
	}

}
