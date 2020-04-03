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
  <form action="">
	  <!-- 更新前显示 -->
	  	<table class="table table-hover text-center">
		    <c:if test="${msg != null }">
		    	<center><font size="5">${msg }</font></center>
		    </c:if>
		    <c:if test="${complains != null }">
		    <c:forEach items="${complains }" var="complains">
		    	<tr>
			      <th width="10%">ID</th>
			      <th width="10%">用户id</th>
			      <th width="10%">真实姓名</th>
			      <th width="10%">手机</th>
			      <th width="20%">投诉内容</th>
			      <th width="20%">投诉时间</th>
			      <th width="10%">状态</th>
			      <th width="10%">操作</th>
			    </tr>
		    	<tr>
		    	
			      <td><c:out value="${complains.id }"/></td>
			      <td><c:out value="${complains.userId }"/></td>
			      <td><c:out value="${complains.realName }"/></td>
			      <td><c:out value="${complains.phone }"/></td>
			      <td><c:out value="${complains.content }"/></td>
			      <td><c:out value="${complains.createTime }"/></td>
			      <td><c:out value="${complains.status }"/></td>
			      <td>
			      	<div class="button-group">
			      		<button type="submit" class="button border-red"><span class="icon-trash-o"></span> 处理</button>
			      	</div>
			      </td>
		    	</tr>
		    </c:forEach>
		    </c:if>
		  </table>
	  </form>
	  
	  <!-- 更新后显示 -->
	  <c:if test="${complainlist != null }">
	  	<table class="table table-hover text-center">
		    <tr>
		      <th width="5%">ID</th>
		      <th width="10%">处理人用户id</th>
		      <th width="10%">处理人姓名</th>
		      <th width="10%">处理时间</th>
		      <th width="10%">用户真实姓名</th>
		      <th width="10%">手机</th>
		      <th width="10%">投诉内容</th>
		      <th width="10%">回复</th>
		      <th width="10%">状态</th>
		    </tr>
		    <c:forEach items="${complainlist }" var="complainlist">
		    	<tr>
			      <td><c:out value="${complainlist.id }"/></td>
			      <td><c:out value="${complainlist.operaterUserId }"/></td>
			      <td><c:out value="${complainlist.operaterName }"/></td>
			      <td><c:out value="${complainlist.dealTime }"/></td>
			      <td><c:out value="${complainlist.realName }"/></td>
			      <td><c:out value="${complainlist.phone }"/></td>
			      <td><c:out value="${complainlist.content }"/></td>
			      <td><c:out value="${complainlist.comments }"/></td>
			      <td><c:out value="${complainlist.status }"/></td>
		    	</tr>
		    </c:forEach>
		  </table>
	  </c:if>
</div>

<!-- 更新投诉admin -->
<c:if test="${complains != null }">
	<div class="panel admin-panel margin-top" id="add">
	  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 处理投诉</strong></div>
	  <div class="body-content">
	    <form method="post" class="form-x" action="/complain/updateComplain">    
			      <div class="form-group">
			        <div class="label">
			          <label>ID:</label>
			        </div>
			        <div class="field">
			          	<input type="text" class="input w50" value="" name="id" />
			          <div class="tips"></div>
			        </div>
			      </div>
		      <c:if test="${user != null }">
			      <div class="form-group">
			        <div class="label">
			          <label>处理人姓名:</label>
			        </div>
			        <div class="field">
			          <input type="text" class="input w50" value="${user.userName }" name="operaterName" />
			          <div class="tips"></div>
			        </div>
			      </div>
			      <div class="form-group">
			        <div class="label">
			          <label>处理人id:</label>
			        </div>
			        <div class="field">
			          <input type="text" class="input w50" name="operaterUserId" value="${user.id }"  />
			          <div class="tips"></div>
			        </div>
			      </div>
		      </c:if>
		       <div class="form-group">
		        <div class="label">
		          <label>回复内容:</label>
		        </div>
		        <div class="field">
		          <textarea type="text" class="input" name="comments" style="height:120px;" value="好的"></textarea>
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
</body>
</html>