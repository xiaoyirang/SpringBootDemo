package com.community.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.community.entity.Complain;
import com.community.entity.User;
import com.community.service.ComplainService;

@Controller
@RequestMapping("/complain")
public class ComplainController {
	
	@Autowired
	private ComplainService complainService;
	
	/**
	 * 查询所有投诉--admin
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/allComplain")
	public String getAllCompalinByPage(ModelMap model){
		List<Complain> complains = complainService.getComplainByStatus("等待处理");
		if(complains != null && complains.size()>0){
			model.put("complains", complains);
			return "adminComplain";
		}else{
			String msg = "无投诉内容!";
			model.put("msg", msg);
			return "adminComplain";
		}
	}
	
	/**
	 * 根据id查询--user
	 * @return
	 */
	@RequestMapping(value="/complainById")
	public String getComplainById(HttpServletRequest request,HttpSession session,
			ModelMap model){
		User user = (User) session.getAttribute("user");
		
		Map<String, Object> map = new HashMap<>();
		map.put("userId", user.getId());
		map.put("status", "等待处理");
		
		List<Complain> complainslist1 = complainService.getComplainByUser(map);
		if(complainslist1 != null && complainslist1.size()>0){
			model.put("complainslist1", complainslist1);
		}else{
			String msg = "暂无投诉内容!";
			model.put("msg", msg);
		}
		return "userComplain";
	}
	
	/**
	 * 跳转--添加/修改
	 * @return
	 */
	@RequestMapping(value="/getaddComplain")
	public String getaddComplain(HttpServletRequest request,HttpSession session,ModelMap model){
		User user = (User) session.getAttribute("user");
		if(user.getRole().equals(0)){
			return "adminComplain";
		}else{
			return "userComplain";
		}
	}
	
	/**
	 * 添加投诉--user
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/addComplain")
	public String addComplain(HttpServletRequest request,ModelMap model,
			HttpSession session,Complain complain){
		
		Date createTime = new Date(System.currentTimeMillis()); 
		int userId = Integer.parseInt(request.getParameter("userId"));
		String realName = request.getParameter("realName");
		String phone = request.getParameter("phone");
		String content= request.getParameter("content");
		
		complain.setCreateTime(createTime);
		complain.setUserId(userId);
		complain.setRealName(realName);
		complain.setPhone(phone);
		complain.setContent(content);
		complain.setStatus("等待处理");
		complain.setAgreement(0);
		
		complainService.addComplain(complain);
		
		User user = (User) session.getAttribute("user");
		
		Map<String, Object> map0 = new HashMap<>();
		map0.put("userId", user.getId());
		map0.put("status", "已处理");
		
		List<Complain> complainslist0 = complainService.getComplainByUser(map0);
		if(complainslist0 != null && complainslist0.size()>0){
			model.put("complainslist0", complainslist0);
		}
		
		Map<String, Object> map1 = new HashMap<>();
		map1.put("userId", user.getId());
		map1.put("status", "等待处理");
		
		List<Complain> complainslist1 = complainService.getComplainByUser(map1);
		if(complainslist1 != null && complainslist1.size()>0){
			model.put("complainslist1", complainslist1);
		}

		return "userComplain";
	}
	
	/**
	 * 更新投诉--admin
	 * @param request
	 * @param complain
	 * @return
	 */
	@RequestMapping(value="/updateComplain")
	public String updateComplain(HttpServletRequest request,
			Complain complain,ModelMap model){
		Date date = new Date(System.currentTimeMillis());
		int id = Integer.parseInt(request.getParameter("id"));
		String operaterName = request.getParameter("operaterName");
		int operaterUserId = Integer.parseInt(request.getParameter("operaterUserId"));
		//是否接受  0--不接受  1--接受
		String comments = request.getParameter("comments");
		
		complain.setId(id);
		complain.setDealTime(date);
		complain.setOperaterName(operaterName);
		complain.setOperaterUserId(operaterUserId);
		complain.setAgreement(1);
		complain.setComments(comments);
		complain.setStatus("已处理");
		complainService.updateComplain(complain);
		
//		List<Complain> complains = complainService.getAllCompalinByPage(0, 10);
		List<Complain> complainlist = complainService.getComplainByStatus("已处理");
		model.put("complainlist", complainlist);
		return "adminComplain";
	}

}
