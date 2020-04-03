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
    <title>基本信息</title>  
    <link rel="stylesheet" href="/css/pintuer.css">
    <link rel="stylesheet" href="/css/admin.css">
    <script src="/js/jquery.js"></script>
    <script src="/js/pintuer.js"></script>  
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 基本信息</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="">
     <table class="table table-hover text-center">
	   <c:forEach items="${userList }" var="user">
	   <tr>
	   		<td colspan="5" align="left">
	   			<font size="3" color="red">业主:${user.realName }</font>
	   		</td>
	   </tr>
	   <tr>
	   	  <th width="10%">ID</th>
	      <th width="10%">用户名</th>
	      <th width="10%">真实姓名</th>
	      <th width="10%">性别</th>
	      <th width="10%">手机</th>
	    </tr>
     	<tr>
     		<td><c:out value="${user.id }"/></td>
     		<td><c:out value="${user.userName }"/></td>
     		<td><c:out value="${user.realName }"/></td>
     		<td><c:out value="${user.sex }"/></td>
     		<td><c:out value="${user.phone }"/></td>
     	</tr>
     	<tr>
     		<th width="10%">公司名称</th>
	      	<th width="10%">身份证号</th>
	      	<th width="10%">邮箱</th>
	      	<th width="10%">户籍地址</th>
	      	<th width="10%">小区住址</th>
     	</tr>
     	<tr>
     		<td><c:out value="${user.companyName }"/></td>
     		<td><c:out value="${user.idCardNum }"/></td>
     		<td><c:out value="${user.email }"/></td>
     		<td><c:out value="${user.address }"/></td>
     		<td><c:out value="${user.relationship }"/></td>
     	</tr>
     	<tr>
	   	  <th width="20%">入住时间</th>
	      <th width="20%">主账号名</th>
	      <th width="20%">记录创建时间</th>
	      <th width="20%">记录更新时间</th>
	      <th width="20%">迁出时间</th>
	    </tr>
     	<tr>
     		<td><c:out value="${user.settleTime }"/></td>
     		<td><c:out value="${user.mainAccount }"/></td>
     		<td><c:out value="${user.createTime }"/></td>
     		<td><c:out value="${user.updateTime }"/></td>
     		<td><c:out value="${user.outmigrationTime }"/></td>
     	</tr>
     	</c:forEach>
  	</table>
   </form>
  </div>
</div>
</body>
</html>