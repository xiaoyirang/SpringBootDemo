<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
	  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span> 修改信息</strong></div>
	  <div class="body-content">
	    <form method="post" class="form-x" action="/user/updateUser">  
	      <div class="form-group">
	        <div class="label">
	          <label>用户名:</label>
	        </div>
	        <div class="field">
	          <input type="text" class="input w50" name="username" value="${user.userName }"  />
	          <div class="tips"></div>
	        </div>
	      </div>
	      <div class="form-group">
	        <div class="label">
	          <label>公司名称:</label>
	        </div>
	        <div class="field">
	          <input type="text" class="input w50" name="companyname" value="${user.companyName }"  />
	          <div class="tips"></div>
	        </div>
	      </div>
	      <div class="form-group">
	        <div class="label">
	          <label>手机号:</label>
	        </div>
	        <div class="field">
	          <input type="text" class="input w50" name="phone" value="${user.phone }"  />
	          <div class="tips"></div>
	        </div>
	      </div>
	      <div class="form-group">
	        <div class="label">
	          <label>邮箱:</label>
	        </div>
	        <div class="field">
	          <input type="text" class="input w50" name="email" value="${user.email}"  />
	          <div class="tips"></div>
	        </div>
	      </div>
	      <div class="form-group">
	        <div class="label">
	          <label>家属关系:</label>
	        </div>
	        <div class="field">
	          <input type="text" class="input w50" name="relationship" value="${user.relationship}"  />
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
</body>
</html>