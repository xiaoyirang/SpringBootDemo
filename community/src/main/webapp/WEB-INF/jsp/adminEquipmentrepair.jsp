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
	<c:if test="${msg != null }">
		<center><font size="5">${msg }</font></center>
	</c:if>
	<c:if test="${equipmentrepairlist1 != null }">
	<table class="table table-hover text-center">
	    <tr>
	      <th width="10%">ID</th>
	      <th width="10%">设备名称</th>
	      <th width="10%">操作分类</th>
	      <th width="10%">备注</th>
	      <th width="10%">创建人姓名</th>
	      <th width="10%">位置</th>
	      <th width="10%">状态</th>
	      <th width="10%">创建时间</th>
	    </tr>
	    <c:forEach items="${equipmentrepairlist1 }" var="equipmentrepairlist1">
	    	<tr>
		      <td><c:out value="${equipmentrepairlist1.id }"/></td>
		      <td><c:out value="${equipmentrepairlist1.equipmentName }"/></td>
		      <td><c:out value="${equipmentrepairlist1.operateName }"/></td>
		      <td><c:out value="${equipmentrepairlist1.comments }"/></td>
		      <td><c:out value="${equipmentrepairlist1.createName }"/></td>
		      <td><c:out value="${equipmentrepairlist1.location }"/></td>
		      <td>等待处理</td>
		      <td><c:out value="${equipmentrepairlist1.createTime }"/></td>
	    	</tr>
	    </c:forEach>
	  </table>
	  </c:if> 
	  <c:if test="${equipmentrepairlist0 != null }">
	<table class="table table-hover text-center">
	    <tr>
	      <th width="10%">ID</th>
	      <th width="10%">设备名称</th>
	      <th width="10%">操作分类</th>
	      <th width="10%">创建人姓名</th>
	      <th width="10%">维修人</th>
	      <th width="10%">位置</th>
	      <th width="10%">状态</th>
	      <th width="10%">费用</th>
	    </tr>
	    <c:forEach items="${equipmentrepairlist0 }" var="equipmentrepairlist0">
	    	<tr>
		      <td><c:out value="${equipmentrepairlist0.id }"/></td>
		      <td><c:out value="${equipmentrepairlist0.equipmentName }"/></td>
		      <td><c:out value="${equipmentrepairlist0.operateName }"/></td>
		      <td><c:out value="${equipmentrepairlist0.createName }"/></td>
		      <td><c:out value="${equipmentrepairlist0.operaterName }"/></td>
		      <td><c:out value="${equipmentrepairlist0.location }"/></td>
		      <td>已处理</td>
		      <td><c:out value="${equipmentrepairlist0.fee }"/></td>
	    	</tr>
	    </c:forEach>
	  </table>
	  </c:if> 
  </form>
</div>
<c:if test="${equipmentrepairlist1 != null }">
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 修改设备</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/equipmentrepair/updateequipmentrepair">    
		  <div class="form-group">
		     <div class="label">
		         <label>ID:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="id" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>维修人:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="operaterName" />
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
		         <label>结束时间:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="endTime" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>费用:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="fee" />
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
</c:if>
</html>
