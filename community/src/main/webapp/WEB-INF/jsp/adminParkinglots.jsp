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
<title></title>
<link rel="stylesheet" href="/css/pintuer.css">
<link rel="stylesheet" href="/css/admin.css">
<script src="/js/jquery.js"></script>
<script src="/js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong></div>
  <div class="padding border-bottom">  
  </div>
  <form method="post" class="form-x" action="">
	<c:if test="${parkinglots != null }">
		<table class="table table-hover text-center">
		    <tr>
		      <th width="10%">ID</th>
		      <th width="10%">用户姓名</th>
		      <th width="10%">车库编号</th>
		      <th width="10%">所在区域</th>
		      <th width="10%">位置</th>
		      <th width="10%">是否售出</th>
		      <th width="20%">开始时间</th>
		      <th width="20%">截止时间</th>
		      
		    </tr>
		    <c:forEach items="${parkinglots }" var="parkinglots">
		    	<tr>
			      <td><c:out value="${parkinglots.id }"/></td>
			      <td><c:out value="${parkinglots.realName }"/></td>
			      <td><c:out value="${parkinglots.carId }"/></td>
			      <td><c:out value="${parkinglots.serialNumber }"/></td>
			      <td><c:out value="${parkinglots.location }"/></td>
			      <td>已出售</td>
			      <td><c:out value="${parkinglots.startTime }"/></td>
			      <td><c:out value="${parkinglots.endTime }"/></td>
			      
		    	</tr>
		    </c:forEach>
		  </table>
	  </c:if> 
  </form>
</div>
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 停车场出售</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/parkinglots/addparkinglots">    
		  <div class="form-group">
		     <div class="label">
		         <label>车库编号:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="serialNumber" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>用户ID:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="userId" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>位置:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="location" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>开始时间:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="startTime" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>截止时间:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="endTime" />
		        <div class="tips"></div>
		    </div>
		 </div>
	     <div class="form-group">
	        <div class="label">
	          <label></label>
	        </div>
	        <div class="field">
	          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
	        </div>
	      </div>
     </form>
  </div>
</div>
</html>
