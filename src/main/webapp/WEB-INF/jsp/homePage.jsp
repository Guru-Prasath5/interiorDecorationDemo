<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Customer Details</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
	<style><%@include file="/WEB-INF/css/registration.css"%></style>
</head>
<body>
<img src="homePage.jpg" alt="Home Image" class="HomePage">
<h1 class = "title">
	Customer Details
</h1>
<h5 class = "registerbtn">
        <a href="RegisterCustomer" class="btn btn-white btn-animated">Add Customer</a><br>
        </h5>
<table  class="customerCard">

	    <c:forEach items="${data}" var="item" >
          <tr class="profilePhoto">
           <td>
           <img src="customerIcon.png" alt="Customer Icon" width=50% height=50%></br>
           <b><c:out value="CustomerId :"/></b><c:out value="${item.id}"/></br>
          <b><c:out value="Name :"/></b><c:out value="${item.cusName}"/></br>
         <b><c:out value="Age :"/></b><c:out value="${item.age}"/></br>
          <b><c:out value="Gender :"/></b><c:out value="${item.cusSex}"/></br>
           <b><c:out value="EmailId :"/></b><c:out value="${item.cusEmailId}"/></td>
           </tr>
        </c:forEach>
        </table>




</body>
</html>
