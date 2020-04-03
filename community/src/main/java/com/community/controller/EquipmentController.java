package com.community.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.community.entity.Equipment;
import com.community.service.EquipmentService;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {

	@Autowired
	private EquipmentService equipmentService;
	
	/**
	 * 查询所有设备信息
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/allequipment")
	public String getAllEquipment(HttpServletRequest request,ModelMap model){
		List<Equipment> equipments = equipmentService.getAllEquipmentByPage(0,10);
		model.put("equipments", equipments);
		return "adminEquipment";
	}
	
	/**
	 * 跳转--添加/修改
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/getaddEquipment")
	public String getAddEquipment(HttpServletRequest request){
		return "adminEquipment";
		
	}
	
	/**
	 * 添加设备信息
	 * @param request
	 * @param model
	 * @param equipment
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping(value="/addEquipment")
	public String getAddEquipment(HttpServletRequest request,ModelMap model) throws ParseException{
		
		String equipmentName = request.getParameter("equipmentName");
		String location = request.getParameter("location");
		String serialNumber = request.getParameter("serialNumber");
		String type = request.getParameter("type");
		String brand = request.getParameter("brand");
		String status = request.getParameter("status");
		String condition = request.getParameter("condition");
		//价格
		BigDecimal price = new BigDecimal(request.getParameter("price"));
		BigDecimal bigDecimal  = price.setScale(2, BigDecimal.ROUND_DOWN);
		//时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String boughtDate = request.getParameter("boughtDate");
		Date date = sdf.parse(boughtDate);
		Date date2 = new Date(System.currentTimeMillis());
		
		Equipment equipment = new Equipment();
		equipment.setEquipmentName(equipmentName);
		equipment.setLocation(location);
		equipment.setSerialNumber(serialNumber);
		equipment.setBoughtDate(date);
		equipment.setType(type);
		equipment.setBrand(brand);
		equipment.setStatus(status);
		equipment.setConditiona(condition);
		equipment.setPrice(bigDecimal);
		equipment.setCreateTime(date2);
		
		equipmentService.addEquipment(equipment);
		System.out.println(equipment.toString());
		
		List<Equipment> equipments = equipmentService.getAllEquipmentByPage(0,10);
		model.put("equipments", equipments);
		
		return "adminEquipment";
	}
	
	
	/**
	 * 跳转--修改
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/getupdateEquipment")
	public String getUpEquipment(HttpServletRequest request){
		return "adminEquipmentUpdate";
		
	}
	
	/**
	 * 修改设备信息
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/updateEquipment")
	public String getupdateEquipment(HttpServletRequest request,ModelMap model){
		int id = Integer.parseInt(request.getParameter("id"));
		String location = request.getParameter("location");
		String status = request.getParameter("status");
		String conditiona = request.getParameter("conditiona");
		
		Equipment equipment = new Equipment();
		equipment.setId(id);
		equipment.setLocation(location);
		equipment.setStatus(status);
		equipment.setConditiona(conditiona);
		
		equipmentService.updateEquipment(equipment);
		
		List<Equipment> equipmentlist = equipmentService.getAllEquipmentByPage(0,10);
		model.put("equipmentlist", equipmentlist);
		
		return "adminEquipment";
		
	}
}
