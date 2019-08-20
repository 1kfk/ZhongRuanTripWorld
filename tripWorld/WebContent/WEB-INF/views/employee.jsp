<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login</title>
</head>
<body>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	
	<form:form action="${pageContext.request.contextPath }/employee"
	 method="post" modelAttribute="employee" 
	 style="border: #0000FF 1px solid; padding: 5px;">
			<div style="text-align: center;font-size: 1.5em;padding: 5px;">添加雇员</div>
			
			<div><spring:message code="text.employee.name" />： <form:input path="name"  />
				<form:errors path="name" /></div>
			<div>年龄： 
				<form:input path="age" /><form:errors path="age" />
			</div>
			<div>邮箱： 
				<form:input path="email"  /><form:errors path="email" />
			</div>
			<div>出生日期： 
				<form:input path="birth"  /><form:errors path="birth" />
			</div>
			<div style="text-align: center;margin-top: 1em;">
				<input type="submit" value="添加"  />
				
			</div>
		</form:form>

</body>
</html>