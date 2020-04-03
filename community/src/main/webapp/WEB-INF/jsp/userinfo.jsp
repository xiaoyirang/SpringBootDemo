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
	   <tr>
	      <th width="10%">用户名</th>
	      <th width="10%">真实姓名</th>
	      <th width="10%">性别</th>
	      <th width="10%">工作单位</th>
	      <th width="10%">手机</th>
	      <th width="10%">身份证号</th>
	      <th width="10%">住宿地址</th>
	      <th width="10%">操作</th>
	    </tr>
     	<tr>
     		<td><c:out value="${user.userName }"/></td>
     		<td><c:out value="${user.realName }"/></td>
     		<td><c:out value="${user.sex }"/></td>
     		<td><c:out value="${user.companyName }"/></td>
     		<td><c:out value="${user.phone }"/></td>
     		<td><c:out value="${user.idCardNum }"/></td>
     		<td><c:out value="${user.address }"/></td>
     		<td>
	      		<div class="button-group">
	      			<a class="button border-main" href="/user/getupdateUser"><span class="icon-edit"></span> </a>
	      		</div>
	      	</td>
     	</tr>
     	<tr>
     	  <th width="10%">户主</th>
	      <th width="10%">楼号</th>
	      <th width="10%">单元号</th>
	      <th width="10%">房号</th>
	      <th width="10%">户型</th>
	      <th width="10%">总面积</th>
	      <th width="10%">公共面积</th>
	      <th width="10%">操作</th>
	    </tr>
     	<tr>
     		<td><c:out value="${room.realName }"/></td>
     		<td><c:out value="${room.buildingNum }"/></td>
     		<td><c:out value="${room.unitNum }"/></td>
     		<td><c:out value="${room.roomNum }"/></td>
     		<td><c:out value="${room.roomType }"/></td>
     		<td><c:out value="${room.area }"/></td>
     		<td><c:out value="${room.commonArea }"/></td>
     		<td>
	      		<div class="button-group">
	      			<a class="button border-main" href=""><span class="icon-edit"></span> </a>
	      		</div>
	      	</td>
     	</tr>
     	<tr>
     	  <th width="10%">户号</th>
     	  <th width="10%">车牌</th>
     	  <th width="10%">停车位</th>
     	  <th width="10%">品牌</th>
	      <th width="10%">颜色</th>
	      <th width="15%">入驻时间</th>
	      <th width="15%">迁出时间</th>
	      <th width="10%">操作</th>
	      
	    </tr>
     	<tr>
     		<td><c:out value="${car.roomId }"/></td>
     		<td><c:out value="${car.plateNum }"/></td>
     		<td><c:out value="${car.parkNum }"/></td>
     		<td><c:out value="${car.brand }"/></td>
     		<td><c:out value="${car.color }"/></td>
     		<td><c:out value="${car.startTime }"/></td>
     		<td><c:out value="${car.endTime }"/></td>
     		<td>
	      		<div class="button-group">
	      			<a class="button border-main" href=""><span class="icon-edit"></span> </a>
	      		</div>
	      	</td>
     	</tr>
  	</table>
   </form>
  </div>
</div>
</body>
</html>