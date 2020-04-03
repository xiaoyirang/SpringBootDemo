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
  <button type="button" class="button border-yellow" onclick="window.location.href='/notice/getaddnotice'">
  	<span class="icon-plus-square-o"></span> 添加内容
  </button>
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

<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 增加内容</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/notice/addnotice">    
      <div class="form-group">
        <div class="label">
          <label>标题:</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="title" />
          <div class="tips"></div>
        </div>
      </div>
       <div class="form-group">
        <div class="label">
          <label>内容:</label>
        </div>
        <div class="field">
          <textarea type="text" class="input" name="content" style="height:120px;" value=" "></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <c:if test="${user != null }">
	      <div class="form-group">
	        <div class="label">
	          <label>作者:</label>
	        </div>
	        <div class="field">
	          <input type="text" class="input w50" value="${user.realName }" name="author" />
	          <div class="tips"></div>
	        </div>
	      </div>
      </c:if>
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
</body>
</html>