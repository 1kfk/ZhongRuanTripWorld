<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login</title>
</head>
<body>
	<form action="/HelloSpringMvc2/login" method="post" style="border: #0000FF 1px solid; padding: 5px;">
			<div style="text-align: center;font-size: 1.5em;padding: 5px;">欢迎登录</div>
			<div>姓名： <input name="name" type="text" value="${name }"  /></div>
			<div>密码： 
				<input name="password" type="password" value="${password }" />
			</div>
			
			<div style="text-align: center;margin-top: 1em;">
				<input type="submit" value="登录"  />
				
			</div>
			
			
		</form>

</body>
</html>