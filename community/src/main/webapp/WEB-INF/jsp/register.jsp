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
    <title>新用户注册</title>  
    <link rel="stylesheet" href="/css/pintuer.css">
    <link rel="stylesheet" href="/css/admin.css">
    <script src="/js/jquery.js"></script>
    <script src="/js/pintuer.js"></script>
</head>
<body>
	<div class="bg"></div>
	<div class="container">
	    <div class="line bouncein">
	        <div class="xs6 xm4 xs3-move xm4-move">
	            <div style="height:0px;"></div>
	            <div class="media media-y margin-big-bottom">           
	            </div>         
	            <form action="/user/register">
	            <div class="panel loginbox">
	                <div class="text-center margin-big padding-big-top"><h1>物业管理中心</h1></div>
	                <div class="panel-body" style="padding:30px; padding-bottom:0px; padding-top:10px;">
	                    <div class="form-group">
	                        <div class="field field-icon-right">
	                            <input type="text" class="input input-big" name="username" placeholder="用户名" data-validate="required:请填写用户名" />
	                            <span class="icon icon-user margin-small"></span>
	                        </div>
	                    </div>
	                     <div class="form-group">
	                        <div class="field field-icon-right">
	                            <input type="password" class="input input-big" name="password" placeholder="密码" data-validate="required:请填写密码" />
	                            <span class="icon icon-key margin-small"></span>
	                        </div>
	                    </div>
	                    <div class="form-group">
	                        <div class="field field-icon-right">
	                            <input type="text" class="input input-big" name="realname" placeholder="真实姓名" data-validate="required:请填写姓名" />
	                            <span class="icon icon-user margin-small"></span>
	                        </div>
	                    </div>
	                    <div class="form-group">
	                        <div class="field field-icon-right">
	                            <input type="text" class="input input-big" name="sex" placeholder="性别" data-validate="required:请填写性别" />
	                            <span class="icon icon-user margin-small"></span>
	                        </div>
	                    </div>
	                    <div class="form-group">
	                        <div class="field field-icon-right">
	                            <input type="text" class="input input-big" name="idCardNum" placeholder="身份证号" data-validate="required:请填写身份证号" />
	                            <span class="icon icon-user margin-small"></span>
	                        </div>
	                    </div>
	                    <div class="form-group">
	                        <div class="field field-icon-right">
	                            <input type="text" class="input input-big" name="settleTime" placeholder="入驻时间" data-validate="required:请填写入驻时间" />
	                            <span class="icon icon-user margin-small"></span>
	                        </div>
	                    </div>
	                    <div class="form-group">
	                        <div class="field field-icon-right">
	                            <input type="text" class="input input-big" name="address" placeholder="户籍地" data-validate="required:请填写户籍地" />
	                            <span class="icon icon-user margin-small"></span>
	                        </div>
	                    </div>
	                </div>
	                <div style="padding:30px;"><input type="submit" class="button button-block bg-main text-big input-big" value="注册"></div>
	            </div>
	             <c:if test="${msg != null }">
					<center><font size="4" color="red">${msg}</font></center>
				</c:if> 
	            </form>   
	        </div>
	    </div>
	</div>
</body>
</html>