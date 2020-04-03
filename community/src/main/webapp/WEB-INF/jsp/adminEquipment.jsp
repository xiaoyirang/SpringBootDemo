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
  <form method="post" class="form-x" action="/equipment/getaddEquipment">
	<table class="table table-hover text-center">
	    <c:if test="${equipments != null }">
	    <tr>
	      <th width="10%">ID</th>
	      <th width="10%">设备名称</th>
	      <th width="10%">数量</th>
	      <th width="20%">购买日期</th>
	      <th width="10%">型号</th>
	      <th width="10%">品牌</th>
	      <th width="10%">使用状况</th>
	      <th width="20%">创建时间</th>
	      <th width="10%">价格</th>
	    </tr>
	    <c:forEach items="${equipments }" var="equipments">
	    	<tr>
		      <td><c:out value="${equipments.id }"/></td>
		      <td><c:out value="${equipments.equipmentName }"/></td>
		      <td><c:out value="${equipments.serialNumber }"/></td>
		      <td><c:out value="${equipments.boughtDate }"/></td>
		      <td><c:out value="${equipments.type }"/></td>
		      <td><c:out value="${equipments.brand }"/></td>
		      <td><c:out value="${equipments.conditiona }"/></td>
		      <td><c:out value="${equipments.createTime }"/></td>
		      <td><c:out value="${equipments.price }"/></td>
	    	</tr>
	    </c:forEach>
	    </c:if>
	    <c:if test="${equipmentlist != null }">
	    <tr>
	      <th width="10%">ID</th>
	      <th width="10%">设备名称</th>
	      <th width="10%">序列号</th>
	      <th width="10%">型号</th>
	      <th width="10%">品牌</th>
	      <th width="10%">使用状况</th>
	      <th width="10%">位置</th>
	      <th width="20%">创建时间</th>
	    </tr>
	    <c:forEach items="${equipmentlist }" var="equipmentlist">
	    	<tr>
		      <td><c:out value="${equipmentlist.id }"/></td>
		      <td><c:out value="${equipmentlist.equipmentName }"/></td>
		      <td><c:out value="${equipmentlist.serialNumber }"/></td>
		      <td><c:out value="${equipmentlist.type }"/></td>
		      <td><c:out value="${equipmentlist.brand }"/></td>
		      <td><c:out value="${equipmentlist.conditiona }"/></td>
		      <td><c:out value="${equipmentlist.location }"/></td>
		      <td><c:out value="${equipmentlist.createTime }"/></td>
	    	</tr>
	    </c:forEach>
	    </c:if>
	  </table>  
  </form>
</div>
<c:if test="${equipments != null }">
<div class="panel admin-panel margin-top" id="add">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 添加设备</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/equipment/addEquipment">    
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
		         <label>位置:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="location" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>序列号:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="serialNumber" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>购买日期:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="boughtDate" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>型号:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="type" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>品牌:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="brand" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>状态:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="正常" name="status" />
		        <div class="tips"></div>
		    </div>
		 </div>
		 <div class="form-group">
		     <div class="label">
		         <label>使用状况:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="正常" name="condition" />
		        <div class="tips"></div>
		    </div>
		 </div>  
		 <div class="form-group">
		     <div class="label">
		         <label>价格:</label>
		      </div>
		    <div class="field">
		        <input type="text" class="input w50" value="" name="price" />
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
