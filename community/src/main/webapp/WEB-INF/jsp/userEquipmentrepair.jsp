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
  <form method="post" class="form-x" action="/complain/complainById">
	  <c:if test="${msg != null }">
	  	<center><font size="5">${msg }</font></center>
	  </c:if>
	  <c:if test="${equipmentrepair1 != null }">
	  	<table class="table table-hover text-center">
		    <tr>
		      <th width="10%">ID</th>
		      <th width="10%">设备名称</th>
		      <th width="10%">操作分类</th>
		      <th width="10%">创建人姓名</th>
		      <th width="10%">位置</th>
		      <th width="20%">创建时间</th>
		      <th width="10%">状态</th>
		    </tr>
		    <c:forEach items="${equipmentrepair1 }" var="equipmentrepair1">
		    	<tr>
			      <td><c:out value="${equipmentrepair1.id }"/></td>
			      <td><c:out value="${equipmentrepair1.equipmentName }"/></td>
			      <td><c:out value="${equipmentrepair1.operateName }"/></td>
			      <td><c:out value="${equipmentrepair1.createName }"/></td>
			      <td><c:out value="${equipmentrepair1.location }"/></td>
			      <td><c:out value="${equipmentrepair1.createTime }"/></td>
			      <td>等待处理</td>
		    	</tr>
		    </c:forEach>
	  	</table>
	  </c:if>
	  <c:if test="${equipmentrepair0 != null }">
	  	<table class="table table-hover text-center">
		    <tr>
		      <th width="10%">ID</th>
		      <th width="10%">设备名称</th>
		      <th width="10%">创建人姓名</th>
		      <th width="10%">维修人姓名</th>
		      <th width="10%">位置</th>
		      <th width="20%">备注</th>
		      <th width="10%">状态</th>
		    </tr>
		    <c:forEach items="${equipmentrepair0 }" var="equipmentrepair0">
		    	<tr>
			      <td><c:out value="${equipmentrepair0.id }"/></td>
			      <td><c:out value="${equipmentrepair0.equipmentName }"/></td>
			      <td><c:out value="${equipmentrepair0.createName }"/></td>
			      <td><c:out value="${equipmentrepair0.operaterName }"/></td>
			      <td><c:out value="${equipmentrepair0.location }"/></td>
			      <td><c:out value="${equipmentrepair0.comments }"/></td>
			      <td>已处理</td>
		    	</tr>
		    </c:forEach>
	  	</table>
	  </c:if>
  </form>
</div>
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 申请维修</strong></div>
  <div class="body-content">
    <c:if test="${user != null }">
    <form method="post" class="form-x" action="/equipmentrepair/addequipmentpair">    
		  <div class="form-group">
		     <div class="label">
		         <label>设备名称:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="equipmentName" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>操作分类:</label>
		      </div>
		    <div class="field">
		        <select name="operateName">
				  <option value ="灯具">灯具</option>
				  <option value ="管道">管道</option>
				  <option value="器材">器材</option>
				  <option value="其他">其他</option>
				</select>
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>备注:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="comments" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>创建人:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="${user.id }" name="createUserId" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>创建人姓名:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="${user.userName }" name="createName" />
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
	          <label></label>
	        </div>
	        <div class="field">
	          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
	        </div>
	      </div>
     </form>
     </c:if>
  </div>
</div>
</html>
