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
<form method="post" action="/car/deleteCar">
  <div class="panel admin-panel">
    <div class="panel-head"><strong class="icon-reorder"> 车辆信息</strong></div>
    <!-- 
    <div class="padding border-bottom">
      <ul class="search">
        <li>
          <button type="button"  class="button border-green" id="checkall"><span class="icon-check"></span> 全选</button>
          <button type="submit" class="button border-red"><span class="icon-trash-o"></span> 批量处理</button>
        </li>
      </ul>
    </div>
     -->
	    <table class="table table-hover text-center">
		     <c:if test="${carList != null }">  
		      <tr>
		      	  <th width="5%">ID</th>
			      <th width="10%">车牌</th>
			      <th width="10%">停车位号码</th>
			      <th width="10%">品牌</th>
			      <th width="10%">颜色</th>
			      <th width="10%">入驻时间</th>
			      <th width="10%">所在区域</th>
			      <th width="10%">迁出时间</th>
			      <th width="5%">户号</th>
			      <th width="10%">状态</th>
			      <th width="10%">操作</th>
			  </tr>      
		      <c:forEach items="${carList }" var="car">
		      	<tr>
		          <td><input type="hidden" name="ids" value="${car.id }" /><c:out value="${car.id }"/></td>
		          <td><c:out value="${car.plateNum }"/></td>
		     	  <td><c:out value="${car.parkNum }"/></td>
		     	  <td><c:out value="${car.brand }"/></td>
		     	  <td><c:out value="${car.color }"/></td>
		     	  <td><c:out value="${car.startTime }"/></td>
		     	  <td><c:out value="${car.serialNumber }"/></td>
		     	  <td><c:out value="${car.endTime }"/></td>
		     	  <td><c:out value="${car.roomId }"/></td>
		     	  <td>等待处理</td>
		          <td>
		          	<div class="button-group"> 
		          		<button type="submit" class="button border-red"><span class="icon-trash-o"></span>处理</button> 
		          	</div>
		          </td>
		       	</tr>
		      </c:forEach>
		    </c:if>
	    </table>
	    <table class="table table-hover text-center">
		    <c:if test="${carListlist != null }">
		      <tr>
		      	  <th width="5%">ID</th>
			      <th width="10%">车牌</th>
			      <th width="10%">停车位号码</th>
			      <th width="10%">品牌</th>
			      <th width="10%">颜色</th>
			      <th width="10%">入驻时间</th>
			      <th width="10%">序列号</th>
			      <th width="10%">迁出时间</th>
			      <th width="5%">户号</th>
			      <th width="10%">状态</th>
			  </tr>      
		      <c:forEach items="${carListlist }" var="carListlist">
		      	<tr>
		          <td><c:out value="${carListlist.plateNum }"/></td>
		     	  <td><c:out value="${carListlist.parkNum }"/></td>
		     	  <td><c:out value="${carListlist.brand }"/></td>
		     	  <td><c:out value="${carListlist.color }"/></td>
		     	  <td><c:out value="${carListlist.startTime }"/></td>
		     	  <td><c:out value="${carListlist.serialNumber }"/></td>
		     	  <td><c:out value="${carListlist.endTime }"/></td>
		     	  <td><c:out value="${carListlist.roomId }"/></td>
		     	  <td>已处理</td>
		       	</tr>
		      </c:forEach>
		    </c:if>
	    </table>
  </div>
</form>
<script type="text/javascript">
function del(id){
	if(confirm("您确定要修改吗?")){
		
	}
}
$("#checkall").click(function(){ 
  $("input[name='ids']").each(function(){
	  if (this.checked) {
		  this.checked = false;
	  }
	  else {
		  this.checked = true;
	  }
  });
})
function DelSelect(){
	var Checkbox=false;
	 $("input[name='ids']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){
		var t=confirm("您确认要删除选中的内容吗？");
		if (t==false) return false; 		
	}
	else{
		alert("请选择您要删除的内容!");
		return false;
	}
}
</script>
</body>
</html>