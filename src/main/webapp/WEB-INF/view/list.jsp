<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<title>Insert title here</title>
<script type="text/javascript">

function qx(own){
	$("[name=check]").attr("checked",own.checked);
}

function del(gid){
	
	if(confirm("确认删除么?")){
		$.post("delete",{gid:gid},function(obj){
			if(obj){
				alert("删除成功");
				location.reload();
			}else{
				alert("删除失败");
			}
		},"json")
	}
	
}

function delAll(){
	
	var gid="";
	$("[name=check]:checked").each(function(){
		gid+=","+$(this).val();
	})
	gid=gid.substring(1);
	
	if(confirm("确认删除么?")){
		$.post("delete",{gid:gid},function(obj){
			if(obj){
				alert("删除成功");
				location.reload();
			}else{
				alert("删除失败");
			}
		},"json")
	}
	
}

function add(){
	location = "toAdd";
}

function update(gid){
	
	if(confirm("确认删除么?")){
		$.post("update",{gid:gid},function(obj){
			if(obj){
				alert("修改成功");
				location.reload();
			}else{
				alert("修改失败");
			}
		},"json")
	}
	
	
}


</script>
</head>
<body>
<form action="list" method="post">

<input type="text" name="name" value="${name }">
<input type="submit" value="查询">

</form>

<button onclick="add()">新增</button>
<button onclick="delAll()">批量删除</button>

<table>
	<tr>
		<td>
			<input type="checkbox" name="check" value="${b.gid }" onclick="qx(this)">全选
		</td>
		<td>编号</td>
		<td>品牌</td>
		<td>价格</td>
		<td>种类</td>
		<td>时间</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${info.list }" var="b">
		<tr>
		<td>
			<input type="checkbox" name="check" value="${b.gid }">
		</td>
		<td>${b.gid }</td>
		<td>${b.gname }</td>
		<td>${b.price }</td>
		<td>${b.tname }</td>
		<td>${b.datea }</td>
		<td>
			<button onclick="update(${b.gid})">编辑</button>
			<button onclick="del(${b.gid})">删除</button>
		</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="11">
			当前页是${info.pageNum }/${info.pages }--共${info.total }条 
			<a href="list?pageNum=1&name=${name }">首页</a>
			<a href="list?pageNum=${info.prePage }&name=${name }">上一页</a>
			<a href="list?pageNum=${info.nextPage }&name=${name }">下一页</a>
			<a href="list?pageNum=${info.pages }&name=${name }">尾页</a>
		</td>
	</tr>
</table>
</body>
</html>