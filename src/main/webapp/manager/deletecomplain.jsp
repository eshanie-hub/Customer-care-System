<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <!-- Custom styles for this template-->
    <link href="../css/customer.css" rel="stylesheet">

  <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    
</head>
<body>
<% 
	String cusid = request.getParameter("cusid");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	String topic = request.getParameter("topic");
	String complain = request.getParameter("complain");
	String agentid = request.getParameter("agentid");
	String comId = request.getParameter("comId");
	
	
%>

    <div class="container">
	<div class="mt-5 d-flex flex-row" >
		<h1 class="col-md-8 mr-3 mb-5">Manager complain delete</h1>
		<a href="manager/employee/viewEmployee.jsp" class="col-md-2 btn btn-primary text-center m-3 ">Add Employee</a>
		<a href="customer/login.jsp" class="btn btn-primary col-md-2 text-center m-3">logout</a>
	</div>
             
<form method="post" action="../DeleteComplainManager" class="row g-3">

    <input type="text" name="cusid" value="<%= cusid %>" class="form-control" >
  <div class="col-md-12 mb-5 mt-5">
    <label class="form-label">Name</label>
    <input type="text" name="name" value="<%= name %>" class="form-control" readonly>
  </div>
   <div class="col-md-4 mb-5">
    <label class="form-label">Phone</label>
    <input type="text" name="phone" value="<%= phone %>" class="form-control" readonly>
  </div>
  <div class="col-md-8 mb-5">
    <label class="form-label">Email</label>
    <input type="text" name="email" value="<%= email %>" class="form-control" readonly>
  </div>

   <div class="col-md-4">
    <label class="form-label"> topic</label>
    <input type="text" name="topic" value="<%= topic %>" class="form-control" readonly>
  </div>
   <div class="col-md-8">
    <label class="form-label">complain</label>
    <input type="text" name="complain" value="<%= complain %>" class="form-control" readonly>
  </div>

  <input type="text" name="agentid" value="<%= agentid %>" class="form-control" hidden>
  <input type="text" name="comId" value="<%= comId %>" class="form-control" hidden>

	<input type="submit" name="submit" value="Delete data" class="btn btn-primary mt-5 mx-auto" >
	
</form>

</div>
</body>
</html>