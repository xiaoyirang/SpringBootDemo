<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>物业管理中心</title>  
    <link rel="stylesheet" href="/css/pintuer.css">
    <link rel="stylesheet" href="/css/admin.css">
    <script src="/js/jquery.js"></script>   
</head>
<body style="background-color:#f2f9fd;">
	<div class="header bg-main">
	  <div class="logo margin-big-left fadein-top">
	    <h1><img src="/images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" /> 物业管理中心</h1>
	  </div>
	  <div class="head-l"><a class="button button-little bg-green" href="" target="_blank"><span class="icon-home"></span> 前台首页</a> &nbsp;&nbsp;<a href="##" class="button button-little bg-blue"><span class="icon-wrench"></span> 清除缓存</a> &nbsp;&nbsp;<a class="button button-little bg-red" href="/user/login"><span class="icon-power-off"></span> 退出登录</a> </div>
	</div>
	<div class="leftnav">
	  <div class="leftnav-title"><strong><span class="icon-list"></span> 菜单列表</strong></div>
	  <h2><span class="icon-user"></span> 基本设置</h2>
	  <ul style="display:block">
	    <li><a href="/room/roomByUser" target="right"><span class="icon-caret-right"></span> 基本信息</a></li>
	    <li><a href="/car/caradd" target="right"><span class="icon-caret-right"></span> 车辆信息</a></li>
	    <li><a href="/user/getupdatePassword" target="right"><span class="icon-caret-right"></span> 修改密码</a></li>
	    <li><a href="/notice/allnotice" target="right"><span class="icon-caret-right"></span> 社区公告</a></li>   
	    <li><a href="/complain/complainById" target="right"><span class="icon-caret-right"></span> 社区投诉</a></li>
	    <li><a href="/equipmentrepair/getaddequipmentrepair" target="right"><span class="icon-caret-right"></span> 社区维修</a></li>     
	    <li><a href="/userrepair/adduserrepair" target="right"><span class="icon-caret-right"></span> 物业维修</a></li>
	  </ul>   
	</div>
	<script type="text/javascript">
	$(function(){
	  $(".leftnav h2").click(function(){
		  $(this).next().slideToggle(200);	
		  $(this).toggleClass("on"); 
	  })
	  $(".leftnav ul li a").click(function(){
		    $("#a_leader_txt").text($(this).text());
	  		$(".leftnav ul li a").removeClass("on");
			$(this).addClass("on");
	  })
	});
	</script>
	<ul class="bread">
	  <li><a href="/user/getWelcome" target="right" class="icon-home"> 首页</a></li>
	  <li><a href="##" id="a_leader_txt"></a></li>
	</ul>
	<div class="admin">
	  <iframe scrolling="auto" rameborder="0" src="/car/getCarById" name="right" width="100%" height="100%"></iframe>
	</div>
	<div style="text-align:center;">
	
	</div>
</body>
</html>