<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="submitForm" modelAttribute="reservation">
	FirstName:<form:input path="firstName"/><br/>
	LastName:<form:input path="lastName"/><br/>
	Gender
	Male<form:radiobutton path="gender" value="male"/><br/>
	Female<form:radiobutton path="gender" value="female"/>
	<br/>
	Meals
	breakfast: <form:checkbox path="meal" value="breakfast"/>
	Lunch: <form:checkbox path="meal" value="lunch"/>
	Dinner: <form:checkbox path="meal" value="dinner"/>
	<br>
	Going to<form:select path="goingTo">
	<form:option label="Ghaziabad" value="Ghaziabad"/>
	<form:option label="Ladakh" value="Ladakh"/>
	<form:option label="ooty" value="ooty"/>
	<form:option label="manali" value="manali"/>
	</form:select>
	
	
	<input type="submit" value="login"/>
</form:form>
</body>
</html>