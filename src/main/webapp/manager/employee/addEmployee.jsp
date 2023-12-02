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

  <div class="container">
	<div class="mt-5 d-flex flex-row" >
		<h1 class="col-md-8 mr-3 mb-5">Add employee</h1>
		<a href="manager/employee/viewEmployee.jsp" class="col-md-2 btn btn-primary text-center m-3 ">Add Employee</a>
		<a href="customer/login.jsp" class="btn btn-primary col-md-2 text-center m-3">logout</a>
	</div>

<form method="post" action="../../EmployeeInsert" class="row g-3">
<div class="col-md-12 mb-5">
    <label class="form-label">Name</label>
    <input type="text" name="name" placeholder="name" class="form-control" >
  </div>
 
  <div class="col-md-6 mb-5">
    <label class="form-label">Email</label>
    <input type="email" name="email" placeholder="email" class="form-control" >
  </div>
  
    <div class="col-md-3 mb-5">
    <label class="form-label">Phone</label>
    <input type="text" name="phone" placeholder="phone" class="form-control" >
  </div>
  
  
  <div class="col-md-3 mb-5">
    <label class="form-label">Address</label>
    <input type="text" name="address" placeholder="address" class="form-control" >
  </div>
  
  <div class="col-md-12 mb-5">
    <label class="form-label">Username</label>
    <input type="text" name="username" placeholder="username" class="form-control" >
  </div>
  
  <div class="col-md-6 mb-5">
    <label class="form-label">Password</label>
    <input type="password" name="password" placeholder="password" class="form-control" >
  </div>
  
  <div class="col-md-6 mb-5">
    <label class="form-label">Position</label>
    <input type="text" name="position" placeholder="position" class="form-control" >
  </div>
  
 
	
	<input type="submit" name="submit" value="Insert Employee" class="btn btn-primary mx-auto" >
</form>

</body>
</html>