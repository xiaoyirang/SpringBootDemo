package com.community.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.community.entity.Car;
import com.community.entity.Room;
import com.community.entity.User;
import com.community.service.CarService;
import com.community.service.RoomService;
import com.community.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CarService carservice;
	
	@Autowired
	private RoomService roomservice;
	
	@RequestMapping("/welcome")
	public String welcome(HttpServletRequest request,ModelMap model){
		return "login";
	}
	
	/**
	 * 用户登录
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest request,ModelMap model){
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
			return "login";
		}
		User user = userService.getUserByUsername(username);
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		if(user.getPassword().equals(password)){
				if(user.getRole().equals(0)){
					return "adminindex";
				}else {
					return "userindex";
				}
		}else{
			model.put("msg", "用户名或者密码错误!");
			return "login";
		}
	}

	/**
	 * 跳转用户注册页面
	 */
	@RequestMapping(value="/getregister")
	public String getRegister(){
		return "register";
	}
	
	/**
	 * 用户注册
	 * @param user
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/register")
	public String register(ModelMap modelMap,HttpServletRequest request){
		
		try{
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String realname = request.getParameter("realname");
			String idCardNum = request.getParameter("idCardNum");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");			
			String settleTime = request.getParameter("settleTime");
			Date date = sdf.parse(settleTime);
			String sex = request.getParameter("sex");
			String address = request.getParameter("address");
			
			User user = new User();
			user.setUserName(username);
			user.setPassword(password);
			user.setRealName(realname);
			user.setIdCardNum(idCardNum);
			user.setSettleTime(date);
			user.setSex(sex);
			user.setAddress(address);
			
			userService.addUser(user);
			modelMap.put("msg", "注册成功，请登录!");
			return "login";
		}catch(Exception e){
			modelMap.put("msg", "注册失败!");
			e.printStackTrace();
			return "register";
		}
	}
	
	/**
	 * 跳转更新用户页面
	 */
	@RequestMapping(value="/getupdateUser")
	public String getupdateUser(HttpServletRequest request,User user,ModelMap model){
		HttpSession session = request.getSession();
		user = (User) session.getAttribute("user");
		int id = user.getId();
		user = userService.getUserById(id);
		model.put("user", user);
		return "updateUser";
	}
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping("/updateUser")
	public String updateUser(HttpServletRequest request,User user,ModelMap model,
			HttpSession session) throws ParseException{
		user = (User) session.getAttribute("user");
		int id = user.getId();
		String userName = request.getParameter("username");
		String companyName = request.getParameter("companyname");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		String outmigrationTime = request.getParameter("outmigrationTime");
		Date date = sdf.parse(outmigrationTime);*/
		String relationship =  request.getParameter("relationship");
		
		user.setId(id);
		user.setUserName(userName);
		user.setCompanyName(companyName);
		user.setPhone(phone);
		user.setEmail(email);
		/*user.setOutmigrationTime(date);*/
		user.setRelationship(relationship);
		userService.updateUser(user);
		//人
		user = userService.getUserByUsername(userName);
		model.put("user", user);
		//车
		Car car = carservice.getCarById(id);
		model.put("car", car);
		//房
		Room room = roomservice.getRoomByUserId(id);
		model.put("room", room);
		
		return "userinfo";
	}
	
	/**
	 * 跳转修改密码页面
	 */
	@RequestMapping(value="/getupdatePassword")
	public String getUpdatePassword(HttpServletRequest request,User user,
			ModelMap model){
		HttpSession session = request.getSession();
		user = (User) session.getAttribute("user");
		String username = user.getUserName();
		model.put("username", username);
		return "pass";
	}
	
	/**
	 * 更新密码
	 * @param user
	 * @return
	 */
	@RequestMapping("/updatePassword")
	public String updatePassword(HttpServletRequest request,ModelMap modelMap){
		
		HttpSession session = request.getSession();
		User user1=(User) session.getAttribute("user");
		String username = user1.getUserName();
		String mpass = request.getParameter("mpass");
		String newpass = request.getParameter("newpass");
		
		User user2 = userService.getUserByUsername(username);
		if (user2.getPassword().equals(mpass)) {
			User user3 = new User();
			user3.setUserName(username);
			user3.setPassword(newpass); 
			userService.updatePassword(user3);
			modelMap.put("msg", "更新成功!");
			//人
			User user = userService.getUserByUsername(username);
			modelMap.put("user", user);
			//车
			Car car = carservice.getCarById(user2.getId());
			modelMap.put("car", car);
			//房
			Room room = roomservice.getRoomByUserId(user2.getId());
			modelMap.put("room", room);
				
			return "user";
		}else{
			modelMap.put("msg", "原密码输入错误!");
			return "pass";
		}
	}
	
	/**
	 * 分页查询用户列表(未做)
	 * @param page
	 * @return
	 */
	@RequestMapping("/getAllUserByPage")
	public String getAllUserByPage(HttpServletRequest request,ModelMap model){
		List<User> userList = userService.getAllUsers();
		model.put("userList", userList);
		for (User user : userList) {
			Room room = roomservice.getRoomByUserId(user.getId());
			user.setRelationship(room.getBuildingNum()+"号楼"+room.getUnitNum()+"单元"+room.getRoomNum());
		}
		
		return "adminUserAll";
	}
	
	/**
	 * 获取单个用户信息
	 * @param request
	 * @return
	 */
	@RequestMapping("/getUserById")
	public String getUserById(HttpServletRequest request,ModelMap model,HttpSession session){
		User user1 = (User) session.getAttribute("user");
		int id = user1.getId();
		User user = userService.getUserById(id);
		model.addAttribute("user", user);
		return "user";
	}
	
	/**
	 * 首页
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/getWelcome")
	public String Welcome(HttpServletRequest request){
		return "user";
		
	}
	
}
