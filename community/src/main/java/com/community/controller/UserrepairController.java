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

import com.community.entity.User;
import com.community.entity.Userrepair;
import com.community.service.UserrepairService;

@Controller
@RequestMapping("/userrepair")
public class UserrepairController {
	@Autowired
	private UserrepairService userrepairService ;
	
	String msg ="暂无维修内容!";
	
	/**
	 * 查看所有业主待维修信息--admin
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/alluserrepair")
	public String getAllUserrepair(HttpServletRequest request,ModelMap model){
		List<Userrepair> userrepair1 = userrepairService.getUserrepairByStatus(1);
		if(userrepair1 != null && userrepair1.size()>0){
			model.put("userrepair1", userrepair1);
		}else{
			model.put("msg", msg);
		}
		return "adminUserrepair";
	}
	
	/**
	 * 跳转--业主添加维修--user
	 */
	@RequestMapping(value="/adduserrepair")
	public String getAdduserrepair(HttpServletRequest request,ModelMap model,
			HttpSession session){
		User user = (User) session.getAttribute("user");
		model.put("user", user);
		
		List<Userrepair> userrepair1 = userrepairService.getUserrepairById(user.getId(),1);
		if(userrepair1 != null && userrepair1.size()>0){
			model.put("userrepair1", userrepair1);
		}else{
			model.put("msg", msg);
		}
		return "userUserrepair";
	}
	
	/**
	 * 业主添加维修信息--user
	 * @param request
	 * @param model
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value="/addUserrepair")
	public String getAddUserrepair(HttpServletRequest request,
			ModelMap model) throws ParseException{
		int userId = Integer.parseInt(request.getParameter("userId"));
		String realName = request.getParameter("realName");
		String phone = request.getParameter("phone");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String date = request.getParameter("bookTime"); 
		Date bookTime = sdf.parse(date);
		String comments = request.getParameter("comments");
		
		Userrepair userrepair = new Userrepair();
		userrepair.setUserId(userId);
		userrepair.setRealName(realName);
		userrepair.setPhone(phone);
		userrepair.setBookTime(bookTime);
		userrepair.setComments(comments);
		userrepair.setStatus(1);
		
		userrepairService.addUserrepair(userrepair);
		List<Userrepair> userrepair1 = userrepairService.getUserrepairById(userId,1);
		if(userrepair1 != null && userrepair1.size()>0){
			model.put("userrepair1", userrepair1);
		}
		
		List<Userrepair> userrepair0 = userrepairService.getUserrepairById(userId,0);
		if(userrepair0 != null && userrepair0.size()>0){
			model.put("userrepair0", userrepair0);
		}
		
		return "userUserrepair";
	}
	
	/**
	 * 物业修改维修信息--admin
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/updateUserrepair")
	public String getUpdateUserrepair(HttpServletRequest request,ModelMap model){
		int id = Integer.parseInt(request.getParameter("id"));
		BigDecimal serviceCost = new BigDecimal(request.getParameter("serviceCost"));
		BigDecimal equipmentCost = new BigDecimal(request.getParameter("equipmentCost"));
		BigDecimal allCost = serviceCost.add(equipmentCost);
		String replyComments = request.getParameter("replyComments");
		
		Userrepair userrepair = new Userrepair();
		userrepair.setId(id);
		userrepair.setServiceCost(serviceCost);
		userrepair.setEquipmentCost(equipmentCost);
		userrepair.setAllCost(allCost);
		userrepair.setReplyComments(replyComments);
		userrepair.setAgreement(1);
		userrepair.setStatus(0);
		
		userrepairService.updateUserrepair(userrepair);

		List<Userrepair> userrepair0 = userrepairService.getUserrepairByStatus(0);
		if(userrepair0 != null && userrepair0.size()>0){
			model.put("userrepair0", userrepair0);
		}
		List<Userrepair> userrepair1 = userrepairService.getUserrepairByStatus(1);
		if(userrepair1 != null && userrepair1.size()>0){
			model.put("userrepair1", userrepair1);
		}
		return "adminUserrepair";
	}
	
}
