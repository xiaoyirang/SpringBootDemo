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
	<c:if test="${userrepair1 != null }">
	<table class="table table-hover text-center">
	    <tr>
	      <th width="10%">ID</th>
	      <th width="10%">用户id</th>
	      <th width="10%">真实姓名</th>
	      <th width="10%">电话</th>
	      <th width="20%">申请时间</th>
	      <th width="20%">预约时间</th>
	      <th width="10%">内容</th>
	      <th width="10%">状态</th>
	    </tr>
	    <c:forEach items="${userrepair1 }" var="userrepair1">
	    	<tr>
		      <td><c:out value="${userrepair1.id }"/></td>
		      <td><c:out value="${userrepair1.userId }"/></td>
		      <td><c:out value="${userrepair1.realName }"/></td>
		      <td><c:out value="${userrepair1.phone }"/></td>
		      <td><c:out value="${userrepair1.applyTime }"/></td>
		      <td><c:out value="${userrepair1.bookTime }"/></td>
		      <td><c:out value="${userrepair1.comments }"/></td>
		      <td>等待处理</td>
	    	</tr>
	    </c:forEach>
	  </table>
	  </c:if> 
	  <c:if test="${userrepair0 != null }">
	<table class="table table-hover text-center">
	    <tr>
	      <th width="10%">内容</th>
	      <th width="10%">服务费</th>
	      <th width="10%">材料费</th>
	      <th width="10%">总费用</th>
	      <th width="20%">申请时间</th>
	      <th width="20%">预约时间</th>
	      <th width="10%">回复</th>
	      <th width="10%">状态</th>
	    </tr>
	    <c:forEach items="${userrepair0 }" var="userrepair0">
	    	<tr>
		      <td><c:out value="${userrepair0.comments }"/></td>
		      <td><c:out value="${userrepair0.serviceCost }"/></td>
		      <td><c:out value="${userrepair0.equipmentCost }"/></td>
		      <td><c:out value="${userrepair0.allCost }"/></td>
		      <td><c:out value="${userrepair0.applyTime }"/></td>
		      <td><c:out value="${userrepair0.bookTime }"/></td>
		      <td><c:out value="${userrepair0.replyComments }"/></td>
		      <td>已处理</td>
	    	</tr>
	    </c:forEach>
	  </table>
	  </c:if> 
  </form>
</div>
<c:if test="${userrepair1 != null }">
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 物业维修</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/userrepair/updateUserrepair">    
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
		         <label>服务费:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="150" name="serviceCost" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>材料费:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="equipmentCost" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>回复:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="准时到达" name="replyComments" />
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
