<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Confirmation</title>
</head>
<body>

	The registration of employee is confirmed: ${employeemodel.firstname}
	${employeemodel.lastname}
	<br>
	<br> The department assign is: ${employeemodel.department}
	<br>
	<br> The technologies that employee knows:
	${employeemodel.technologies}
	<ul>
		<c:forEach var="temp" items="${employeemodel.technologies}">
			<li>${temp}</li>
		</c:forEach>
	</ul>

</body>
</html>