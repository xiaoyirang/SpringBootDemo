<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>登录</title>  
    <link rel="stylesheet" href="/css/pintuer.css">
    <link rel="stylesheet" href="/css/admin.css">
    <script src="/js/jquery.js"></script>
    <script src="/js/pintuer.js"></script>
<!-- ajax 提交参数到后端  不跳转页面
    <script type="text/javascript">
		function loginform(){
			var username = $("#username").val();
			var password = $("#password").val();
			$.ajax({
				type:"post",
				url:"/user/login",
				data:{"username":username,"password":password},
				dataType:"json",
				success:function(data){
					alert("请求成功");
				}
			});
		}
    </script> 
-->
</head>
<body>
	<div class="bg"></div>
	<div class="container">
	    <div class="line bouncein">
	        <div class="xs6 xm4 xs3-move xm4-move">
	            <div style="height:150px;"></div>
	            <div class="media media-y margin-big-bottom">           
	            </div>         
	            <form id="myForm" action="/user/login" method="post">
	            <div class="panel loginbox">
	                <div class="text-center margin-big padding-big-top"><h1>物业管理中心</h1></div>
	                <div class="panel-body" style="padding:30px; padding-bottom:10px; padding-top:10px;">
	                    <div class="form-group">
	                        <div class="field field-icon-right">
	                            <input type="text" class="input input-big" name="username" id="username" placeholder="登录账号" data-validate="required:请填写账号" />
	                            <span class="icon icon-user margin-small"></span>
	                        </div>
	                    </div>
	                    <div class="form-group">
	                        <div class="field field-icon-right">
	                            <input type="password" class="input input-big" name="password" id="password" placeholder="登录密码" data-validate="required:请填写密码" />
	                            <span class="icon icon-key margin-small"></span>
	                        </div>
	                    </div>
	                </div>
	                <div style="padding:30px;"><input type="submit" class="button button-block bg-main text-big input-big" value="登录"></div>
	            </div>
	            <div align="right"><a href="/user/getregister"><font color="blue">新用户注册</font></a></div>
	            <c:if test="${msg != null }">
					<center><font size="4" color="red">${msg}</font></center>
				</c:if> 
	            </form>   
	        </div>
	    </div>
	</div>
</body>
</html>