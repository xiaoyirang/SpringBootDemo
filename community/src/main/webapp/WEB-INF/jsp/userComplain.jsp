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
		  <c:if test="${msg != null }">
		  	<center><font size="5">${msg }</font></center>
		  </c:if>
		  <c:if test="${complainslist0 != null }">
		  	<table class="table table-hover text-center">
			    <tr>
			      <th width="10%">投诉时间</th>
			      <th width="10%">处理时间</th>
			      <th width="10%">处理人姓名</th>
			      <th width="10%">投诉内容</th>
			      <th width="10%">回复</th>
			      <th width="10%">状态</th>
			    </tr>
			    <c:forEach items="${complainslist0 }" var="complainslist0">
			    	<tr>
				      <td><c:out value="${complainslist0.createTime }"/></td>
				      <td><c:out value="${complainslist0.dealTime }"/></td>
				      <td><c:out value="${complainslist0.operaterName }"/></td>
				      <td><c:out value="${complainslist0.content }"/></td>
				      <td><c:out value="${complainslist0.comments }"/></td>
				      <td><c:out value="${complainslist0.status }"/></td>
			    	</tr>
			    </c:forEach> 
		  	</table>
		  </c:if>
		  
		  <c:if test="${complainslist1 != null }">
		  	<table class="table table-hover text-center">
			    <tr>
			      <th width="10%">ID</th>
			      <th width="10%">真实姓名</th>
			      <th width="10%">手机</th>
			      <th width="10%">投诉内容</th>
			      <th width="10%">投诉时间</th>
			      <th width="10%">状态</th>
			    </tr>
			    <c:forEach items="${complainslist1 }" var="complainslist1">
			    	<tr>
				      <td><c:out value="${complainslist1.id }"/></td>
				      <td><c:out value="${complainslist1.realName }"/></td>
				      <td><c:out value="${complainslist1.phone }"/></td>
				      <td><c:out value="${complainslist1.content }"/></td>
				      <td><c:out value="${complainslist1.createTime }"/></td>
				      <td><c:out value="${complainslist1.status }"/></td>
			    	</tr>
			    </c:forEach>
		  	</table>
		  </c:if>
	</div>

	<div class="panel admin-panel">
	  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span> 物业投诉</strong></div>
	  <div class="body-content">
	  <c:if test="${user != null }">
	  	<form method="post" class="form-x" action="/complain/addComplain">  
	      <div class="form-group">
	        <div class="label">
	          <label>用户id:</label>
	        </div>
	        <div class="field">
	          <input type="text" class="input w50" value="${user.id }" name="userId"/>
	          <div class="tips"></div>
	        </div>
	      </div>
	       <div class="form-group">
	        <div class="label">
	          <label>真实姓名:</label>
	        </div>
	        <div class="field">
	          <input type="text" class="input w50" value="${user.realName }" name="realName"/>
	          <div class="tips"></div>
	        </div>
	      </div>
	      <div class="form-group">
	        <div class="label">
	          <label>手机号:</label>
	        </div>
	        <div class="field">
	          <input type="text" class="input w50" name="phone" value="${user.phone }" />
	        </div>
	      </div>
	      <div class="form-group">
	        <div class="label">
	          <label>投诉内容:</label>
	        </div>
	        <div class="field">
	          <textarea name="content" class="input" style="height:300px; border:1px solid #ddd;"></textarea>
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
</body>
</html>