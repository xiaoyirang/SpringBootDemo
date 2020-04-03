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
  <form method="post" class="form-x" action="/complain/getaddComplain">
	  <c:if test="${room0 != null }">
	  	<table class="table table-hover text-center">
			<tr>
			  <th width="10%">ID</th>
	     	  <th width="10%">户主</th>
		      <th width="10%">小区名称</th>
		      <th width="10%">楼号</th>
		      <th width="10%">单元号</th>
		      <th width="10%">房号</th>
		      <th width="10%">公共面积</th>
		      <th width="10%">总面积</th>
		      <th width="10%">户型</th>
		      <th width="10%">是否出售</th>
		    </tr>
	     	<c:forEach items="${room0 }" var="room0">
		     	<tr>
		     		<td><c:out value="${room0.id }"/></td>
		     		<td><c:out value="${room0.realName }"/></td>
		     		<td><c:out value="${room0.communityName }"/></td>
		     		<td><c:out value="${room0.buildingNum }"/></td>
		     		<td><c:out value="${room0.unitNum }"/></td>
		     		<td><c:out value="${room0.roomNum }"/></td>
		     		<td><c:out value="${room0.commonArea }"/></td>
		     		<td><c:out value="${room0.area }"/></td>
		     		<td><c:out value="${room0.roomType }"/></td>
		     		<td>已出售</td>
		     	</tr>
	     	</c:forEach>
		  </table>
	  </c:if>
	  <c:if test="${room1 != null }">
	  	<table class="table table-hover text-center">
		   <tr>
		   	  <th width="10%">ID</th>
	     	  <th width="10%">户主</th>
		      <th width="10%">小区名称</th>
		      <th width="10%">楼号</th>
		      <th width="10%">单元号</th>
		      <th width="10%">房号</th>
		      <th width="10%">公共面积</th>
		      <th width="10%">总面积</th>
		      <th width="10%">户型</th>
		      <th width="10%">是否出售</th>
		    </tr>
	     	<c:forEach items="${room1 }" var="room1">
		     	<tr>
		     		<td><c:out value="${room1.id }"/></td>
		     		<td>暂无</td>
		     		<td><c:out value="${room1.communityName }"/></td>
		     		<td><c:out value="${room1.buildingNum }"/></td>
		     		<td><c:out value="${room1.unitNum }"/></td>
		     		<td><c:out value="${room1.roomNum }"/></td>
		     		<td><c:out value="${room1.commonArea }"/></td>
		     		<td><c:out value="${room1.area }"/></td>
		     		<td><c:out value="${room1.roomType }"/></td>
		     		<td>未出售</td>
		     	</tr>
	     	</c:forEach> 
		</table>
	  </c:if>
  </form>
</div>
<c:if test="${room1 != null }">
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 房屋出售</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/room/updateroom">    
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
		          <label>身份证号:</label>
		        </div>
		        <div class="field">
		          <input type="text" class="input w50" name="idCardNum" value=""  />
		          <div class="tips"></div>
		        </div>
		      </div>
	       <div class="form-group">
	        <div class="label">
	          <label>是否出售:</label>
	        </div>
	        <div class="field">
	          <select name="sold">
	          	<option value="1">是</option>
	          	<option value="0">否</option>
	          </select>
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