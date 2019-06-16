<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Registration</title>
	<link href="<c:url value="/webapp/WEB-INF/css/registration.css" />" rel="stylesheet">
</head>
<body>
<h1>
	Customer Registration
</h1>
<form name="registration" action="register" method="POST" modelAttribute="customer">
<label>Name :</label>
<input type ="text" name ="cusName" value=""><br><br>
<label>age :</label>
<input type ="text" name ="age" value=""><br><br>
<label>Gender :</label>
<input type ="text" name ="cusSex" value=""><br><br>
<label>Email Id :</label>
<input type ="text" name ="cusEmailId" value=""><br><br>
<input type="submit" value="Save" />
</form>
</body>
</html>
