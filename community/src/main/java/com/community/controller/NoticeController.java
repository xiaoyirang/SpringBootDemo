package com.community.controller;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.community.entity.Notice;
import com.community.entity.User;
import com.community.service.NoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	/**
	 * 查询所有--1,2
	 * @param notice
	 * @return
	 */
	@RequestMapping(value="/allnotice")
	public String getAllnotice(HttpServletRequest request,ModelMap model,HttpSession session){
		List<Notice> noticeslist = noticeService.getNoticeByPage(0, 10);
		User user = (User) session.getAttribute("user");
		if(user.getRole().equals(0)){
			model.put("noticeslist", noticeslist);
			return "adminNotice";
		}else{
			model.put("noticeslist", noticeslist);
			return "userNotice";
		}
	}
	
	/**
	 * 添加跳转--1
	 * @return
	 */
	@RequestMapping(value="/getaddnotice")
	public String getaddnotice(HttpServletRequest request,HttpSession session){
		return "adminNotice";
	}
	/**
	 * 添加--1
	 * @param notice
	 * @return
	 */
	@RequestMapping(value="/addnotice")
	public String addNotice(HttpServletRequest request,ModelMap model){
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String author = request.getParameter("author");
		Date date = new Date(System.currentTimeMillis());//当前时间
		
		Notice notice = new Notice();
		notice.setTitle(title);
		notice.setContent(content);
		notice.setAuthor(author);
		notice.setDate(date);
		noticeService.addNotice(notice);
		
		List<Notice> noticeslist = noticeService.getNoticeByPage(0, 10);
		model.put("noticeslist", noticeslist);
		return "adminNotice";
		
	}
}
