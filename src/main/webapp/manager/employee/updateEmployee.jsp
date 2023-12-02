<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <!-- Custom styles for this template-->
    <link href="../../css/customer.css" rel="stylesheet">

  <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
   
</head>
<body>
<%
String userid=request.getParameter("userid");
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
String address = request.getParameter("address");
String username = request.getParameter("username");
String password = request.getParameter("password");
String position = request.getParameter("position");
String accountid = request.getParameter("accountid");
%>

  <div class="container">
	<div class="mt-5 d-flex flex-row" >
		<h1 class="col-md-8 mr-3 mb-5">Update employee</h1>
		<a href="manager/employee/viewEmployee.jsp" class="col-md-2 btn btn-primary text-center m-3 ">Add Employee</a>
		<a href="customer/login.jsp" class="btn btn-primary col-md-2 text-center m-3">logout</a>
	</div>


<form method="post" action="../../EmployeeUpdate" class="row g-3">
	
<input type="text" name="userid" value="<%=userid%>" class="form-control" hidden><br>
<input type="text" name="accountid" value="<%=accountid%>" class="form-control" hidden><br>

<div class="col-md-12 mb-5">
    <label class="form-label">Name</label>
    <input type="text" name="name" value="<%=name%>" class="form-control" >
  </div>
 
  <div class="col-md-6 mb-5">
    <label class="form-label">Email</label>
    <input type="email" name="email" value="<%=email%>" class="form-control" >
  </div>
  
    <div class="col-md-3 mb-5">
    <label class="form-label">Phone</label>
    <input type="text" name="phone" value="<%=phone%>" class="form-control" >
  </div>
  
  
  <div class="col-md-3 mb-5">
    <label class="form-label">Address</label>
    <input type="text" name="address" value="<%=address%>" class="form-control" >
  </div>
  
  <div class="col-md-12 mb-5">
    <label class="form-label">Username</label>
    <input type="text" name="username" value="<%=username%>" class="form-control" >
  </div>
  
  <div class="col-md-6 mb-5">
    <label class="form-label">Password</label>
    <input type="password" name="password" value="<%=password%>" class="form-control" >
  </div>
  
  <div class="col-md-6 mb-5">
    <label class="form-label">Position</label>
    <input type="text" name="position" value="<%=position%>" class="form-control" >
  </div>
	<input type="submit" name="submit" value="Update Employee" class="btn btn-primary mt-5 mx-auto" >
</form>


</body>
</html>