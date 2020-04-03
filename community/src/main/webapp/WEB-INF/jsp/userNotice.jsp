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
  <table class="table table-hover text-center">
    <tr>
      <th width="10%">ID</th>
      <th width="15%">标题</th>
      <th width="10%">时间</th>
      <th width="20%">描述</th>
      <th width="10%">作者</th>
    </tr>
    <c:forEach items="${noticeslist }" var="notice">
    	<tr>
	      <td><c:out value="${notice.id }"/></td>     
	      <td><c:out value="${notice.title }"/></td>
	      <td><c:out value="${notice.date }"/></td>
	      <td><c:out value="${notice.content }"/></td>
	      <td><c:out value="${notice.author }"/></td>
    	</tr>
    </c:forEach>
  </table>
</div>
</body>
</html>