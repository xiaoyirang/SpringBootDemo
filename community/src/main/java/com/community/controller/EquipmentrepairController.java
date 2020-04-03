package com.community.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.community.entity.Equipmentrepair;
import com.community.entity.User;
import com.community.service.EquipmentrepairService;

@Controller
@RequestMapping("/equipmentrepair")
public class EquipmentrepairController {
	
	@Autowired
	private EquipmentrepairService equipmentrepairService;
	
	String msg = "暂无维修内容!";
	
	/**
	 * 查询所有
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/allequipmenterpair")
	public String getAllEquipmentrepair(HttpServletRequest request,ModelMap model){
		List<Equipmentrepair> equipmentrepairlist1= equipmentrepairService.getEquipmentrepairByStatus(1);
		if(equipmentrepairlist1 != null && equipmentrepairlist1.size()>0){
			model.put("equipmentrepairlist1", equipmentrepairlist1);
		}else{
			model.put("msg", msg);
		}
		return "adminEquipmentrepair";
	}
	
	/**
	 * 修改设备维修
	 * @param request
	 * @param model
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping(value="/updateequipmentrepair")
	public String getUpdateEquipmentrepair(HttpServletRequest request,ModelMap model) throws ParseException{
		int id = Integer.parseInt(request.getParameter("id"));
		String operaterName = request.getParameter("operaterName");
		//时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String date1 = request.getParameter("startTime");
		Date startTime = sdf.parse(date1);
		String date2 = request.getParameter("endTime");
		Date endTime = sdf.parse(date2);
		//费用
		BigDecimal bigDecimal = new BigDecimal(request.getParameter("fee"));
		BigDecimal fee = bigDecimal.setScale(2, BigDecimal.ROUND_DOWN);
		
		Equipmentrepair equipmentrepair = new Equipmentrepair();
		equipmentrepair.setId(id);
		equipmentrepair.setOperaterName(operaterName);
		equipmentrepair.setStatus(0);
		equipmentrepair.setStartTime(startTime);
		equipmentrepair.setEndTime(endTime);
		equipmentrepair.setFee(fee);
		equipmentrepairService.updateEquipmentrepair(equipmentrepair);
		
		List<Equipmentrepair> equipmentrepairlist0= equipmentrepairService.getEquipmentrepairByStatus(0);
		if(equipmentrepairlist0 != null && equipmentrepairlist0.size()>0){
			model.put("equipmentrepairlist0", equipmentrepairlist0);
		}
		List<Equipmentrepair> equipmentrepairlist1= equipmentrepairService.getEquipmentrepairByStatus(1);
		if(equipmentrepairlist1 != null && equipmentrepairlist1.size()>0){
			model.put("equipmentrepairlist1", equipmentrepairlist1);
		}
		
		return "adminEquipmentrepair";
		
	}
	
	/**
	 * 跳转--申请维修
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/getaddequipmentrepair")
	public String getaddequipmentrepair(HttpServletRequest request,ModelMap model,
			HttpSession session){
		User user = (User) session.getAttribute("user");
		
		List<Equipmentrepair> equipmentrepair1 = 
				equipmentrepairService.getEquipmentrepairById(user.getId(),1);
		if(equipmentrepair1 != null && equipmentrepair1.size()>0){
			model.put("equipmentrepair1", equipmentrepair1);
		}else{
			model.put("msg", msg);
		}
		
		return "userEquipmentrepair";
	}
	
	/**
	 * 添加设备维修
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/addequipmentpair")
	public String getaddEquipmentrepair(HttpServletRequest request,HttpSession session,
			ModelMap model){
//		int equipmentId = Integer.parseInt(request.getParameter("equipmentId"));
		String equipmentName = request.getParameter("equipmentName");
		String operateName = request.getParameter("operateName");
		String comments = request.getParameter("comments");
		int createUserId = Integer.parseInt(request.getParameter("createUserId"));
		String createName = request.getParameter("createName");
		String location = request.getParameter("location");
		Date createTime = new Date(System.currentTimeMillis());
		
		Equipmentrepair equipmentrepair = new Equipmentrepair();
//		equipmentrepair.setEquipmentId(equipmentId);
		equipmentrepair.setEquipmentName(equipmentName);
		equipmentrepair.setOperateName(operateName);
		equipmentrepair.setComments(comments);
		equipmentrepair.setCreateUserId(createUserId);
		equipmentrepair.setCreateName(createName);
		equipmentrepair.setLocation(location);
		equipmentrepair.setStatus(1);
		equipmentrepair.setCreateTime(createTime);
		equipmentrepairService.addEquipmentrepair(equipmentrepair);
		
		List<Equipmentrepair> equipmentrepair1 = 
				equipmentrepairService.getEquipmentrepairById(createUserId,1);
		if(equipmentrepair1 != null && equipmentrepair1.size()>0){
			model.put("equipmentrepair1", equipmentrepair1);
		}
		List<Equipmentrepair> equipmentrepair0 = 
				equipmentrepairService.getEquipmentrepairById(createUserId,0);
		if(equipmentrepair0 != null && equipmentrepair0.size()>0){
			model.put("equipmentrepair0", equipmentrepair0);
		}
		
		return "userEquipmentrepair";
	}
	
}
