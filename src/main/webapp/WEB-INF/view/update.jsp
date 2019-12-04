<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<title>Insert title here</title>
</head>
<body>
<form>

<table>
	<tr>
		<td>商品
			<input type="text" name="gname">
		</td>
	</tr>
	
	<tr>
		<td>分类
			<select name="tid">
				<option value="1">电器</option>
				<option value="2">数码</option>
			</select>
		</td>
	</tr>
	
	<tr>
		<td>价格
			<input type="text" name="price">
		</td>
	</tr>
	<tr>
		<td>时间
			<input type="text" name="datea" onclick="WdatePicker()">
		</td>
	</tr>
	<tr>
		<td>
			<input type="submit" value="提交">
		</td>
	</tr>
</table>

</form>

</body>
</html>