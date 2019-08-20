<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>后台管理</title>
<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
<style type="text/css">
    table
        {
            border-collapse: collapse;
            margin: 0 auto;
            text-align: center;
        }
        table td, table th
        {
            border: 1px solid #cad9ea;
            color: #666;
            height: 30px;
        }
        table thead th
        {
            background-color: #CCE8EB;
            width: 100px;
        }
        table tr:nth-child(odd)
        {
            background: #fff;
        }
        table tr:nth-child(even)
        {
            background: #F5FAFA;
        }
        .leftd{
        float: left;
        width:30%;
        
        }
        .rightd{
        float: right;
        width:69%;
        }
        a{
        display:inline-block;
        border:1px solid red;
        border-radius:3px;
        margin-left:5px;
        color:white;
        text-decoration:none;
        background-color: red;
        }
    </style>
</head>
<body>
<div class="bigout">
<p align="center" style="">后台管理</p>

<div id="form1" style="display:none;width:400px;height: 100px;background-color: white;position: absolute;border: 1px solid black;top:300px; left:45%;">
<form action="changeuser" style="position: absolute;">
<input id="uid" type="text" name="id" style="display:none;">
用户名<input id="username" size="50" type="text" name="username"><br>
密码<input id="password" size="50" type="text" name="password"><br>
邮箱<input id="email" size="50" type="text" name="email"><br>
<input type="submit" value="提交">
<input id="b1" type="button" value="取消">
</form>
</div>


<div id="form2" style="display:none;width:400px;height: 170px;background-color: white;position: absolute;border: 1px solid black;top:300px; left:45%;">
<form action="changeplace" style="position: absolute;">
<input id="pid" type="text" name="id" style="display:none;">
所在地<input id="province" size="50" type="text" name="province"><br>
所在地<input id="location" size="50" type="text" name="location"><br>
评论<input id="assess" size="50" type="text" name="assess"><br>
图片<input  readonly="readonly"  id="scene" size="40" type="text" name="scene" ><br>
低价<input id="low" size="50" type="text" name="price_low"><br>
高价<input id="high" size="50" type="text" name="price_high"><br>
<input type="submit" value="提交">
<input id="b2" type="button" value="取消">
</form>
</div>

<div id="filediv" style="display:none;width:200px;height: 100px;background-color: white;position: absolute;border: 1px solid black;top:600px; left:45%;">
<form id="fileform" action="fileupdate" enctype="multipart/form-data" method="post">id
<input type="text" name="id" id="pcid" readonly="readonly"><br>上传图片
<input type="file" name="filedata"><br>
<input type="submit" value="开始上传">
<input id="b4" type="button" value="取消">

</form>
</div>

<div id="form3" style="display:none;width:400px;height: 170px;background-color: white;position: absolute;border: 1px solid black;top:300px; left:45%;">
<form action="addplace" style="position: absolute;" method="post">
所在省份<input id="province" size="50" type="text" name="province"><br>
具体地址<input id="location" size="50" type="text" name="location"><br>
评论<input id="assess" size="50" type="text" name="assess"><br>
图片<input  readonly="readonly"  id="scene" size="40" type="text" name="scene" value="添加后上传"><br>
低价<input id="low" size="50" type="text" name="price_low"><br>
高价<input id="high" size="50" type="text" name="price_high"><br>
<input type="submit" value="提交">
<input id="b3" type="button" value="取消">
</form>
</div>


<div id="leftd" class="leftd">
<p align="center" style="margin: 0 auto;">用户管理</p>
<table width="99%" class="table" style="">
	<tr>
		<th>ID</th>
		<th>用户名</th>
		<th>密码</th>
		<th>邮箱</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${users}" var="user">
	<tr>
		<td>${user.id }</td>
		<td>${user.username }</td>
		<td>${user.password }</td>
		<td>${user.email }</td>
		<td><a href="javascript:void(0)" 
		onclick="edituser('${user.id}','${user.username }','${user.password }','${user.email }')">修改</a>
		<a href="javascript:void(0)" onclick="deleteuser(${user.username})">删除</a></td>
	</tr>
	</c:forEach>
</table>
</div>
<div id="rightd" class="rightd">
<p align="center" style="margin: 0 auto;">景点管理</p>
<table width="99%" class="table" style="">
	<tr>
		<th>ID</th>
		<th>省份</th>
		<th>所在地</th>
		<th>评论</th>
		<th>图片</th>
		<th>低价</th>
		<th>高价</th>
		<th>操作<a href="javascript:void(0)" onclick="addplace()">添加景点</a></th>
	</tr>
	<c:forEach items="${places}" var="place">
	<tr>
		<td>${place.id }</td>
		<td>${place.province }</td>
		<td>${place.location }</td>
		<td>${place.assess }</td>
		<td><img style="width:80px;height:60px;" src="scene/${place.scene }"></td>
		<td>${place.price_low }</td>
		<td>${place.price_high }</td>
		<td><a href="javascript:void(0)" 
		onclick="editplace('${place.id}','${place.province}','${place.location}','${place.assess}','${place.scene }','${place.price_low}','${place.price_high}')">修改</a>
		<a href="javascript:void(0)" onclick="deleteplace('${place.location}')">删除</a>
		<a href="javascript:void(0)" id="fileup" onclick="uppic('${place.id}')" >上传图片</a></td>
	</tr>
	</c:forEach>
</table>
</div>
</div>
<script type="text/javascript">
var num1 = ${num};
var num2 = ${pn};
function deleteuser(user){
	if (confirm("确认要删除用户"+user+"吗?")) {
		var htmlObj = $.ajax({
			url : "deleteuser",
			type : "post",
			async : false,
			data : {username:user}
		});
		 var text = htmlObj.responseText;
		var json = JSON.parse(text);
		var msg = json.msg;
		alert(msg);
	  } else {
	    txt = "您按了取消";
	  }
	window.location.reload();
}
function deleteplace(place){
	if (confirm("确认要删除景点"+place+"吗?")) {
		var htmlObj = $.ajax({
			url : "deleteplace",
			type : "post",
			async : false,
			data : {placename:place}
		});
		 var text = htmlObj.responseText;
		var json = JSON.parse(text);
		var msg = json.msg;
		alert(msg);
	  } else {
	    txt = "您按了取消";
	  }
	window.location.reload();
}
function uppic(id){
	$("#fileform").attr("action","fileupdate/"+id);
	$("#pcid").attr("value",id);
	$("#filediv").css("display","block");
}
function editplace(p1,p7,p2,p3,p4,p5,p6){
	$("#pid").attr("value",p1);
	$("#form2").css("display","block");
	$("#location").attr("value",p2);
	$("#province").attr("value",p7);
	$("#assess").attr("value",p3);
	$("#scene").attr("value",p4);
	$("#low").attr("value",p5);
	$("#high").attr("value",p6);
}
function edituser(p1,p2,p3,p4){
	$("#uid").attr("value",p1);
	$("#username").attr("value",p2);
	$("#password").attr("value",p3);
	$("#email").attr("value",p4);
	$("#form1").css("display","block");
}
$("#b1").click(function(){
	$("#form1").css("display","none");
});
$("#b2").click(function(){
	$("#form2").css("display","none");
});
$("#b3").click(function(){
	$("#form3").css("display","none");
});
$("#b4").click(function(){
	$("#filediv").css("display","none");
});
chushihua(num1,num2);
function chushihua(num1,num2){
	for(var i=0;i<num1;i++){
		var k=i+1;
	$("#leftd").append('<a href="allusermation?ubegin='+i*20+'">'+k+'</a>');
	}
	for(var j=0;j<num2;j++){
		var g=j+1;
	$("#rightd").append('<a href="allusermation?pbegin='+j*10+'">'+g+'</a>');
	}
}
function addplace(){
	$("#form3").css("display","block");
}
</script>
</body>
</html>