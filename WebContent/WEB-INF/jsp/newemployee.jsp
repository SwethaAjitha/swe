<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr_frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<spr_frm:form action="save_employee" modelAttribute="employee">
		Employee ID:    <spr_frm:input path="eid"/>
		Employee Name:  <spr_frm:input path="name"/>
		Department:     <spr_frm:input path="dept"/>
		Designation:    <spr_frm:input path="desig"/>
		<input type="submit" value="saveRecord">
	</spr_frm:form>
</body>
</html>