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
    
<!-- Customized Bootstrap Stylesheet -->
<link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body>

<% 
	String appId = request.getParameter("appId");
	String cusId = request.getParameter("cusId");
	String name = request.getParameter("name");
	String appDate = request.getParameter("appDate");
	String appTime = request.getParameter("appTime");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	String topic = request.getParameter("topic");
	String agentid = request.getParameter("agentid");
	
%>	

    <div class="container mt-5">
<h1 class="text-center">Update technical Appointment</h1>

<form method="post" action="../Technicalupdate" class="row g-3">
	<input type="text" name="appId" value="<%= appId %>" class="form-control" hidden>
	<input type="text" name="agentid" value="<%= agentid %>" class="form-control" hidden>
    <input type="text" name="cusId" value="<%= cusId %>" class="form-control" hidden>
  <div class="col-md-12 mb-5 mt-5">
    <label class="form-label">Name</label>
    <input type="text" name="name" value="<%= name %>" class="form-control">
  </div>
  <div class="col-md-8 mb-5">
    <label class="form-label">Date</label>
    <input type="text" name="appDate" value="<%= appDate %>" class="form-control">
  </div>
 <div class="col-md-4 mb-5">
    <label class="form-label">Time</label>
    <input type="text" name="appTime" value="<%= appTime %>" class="form-control">
  </div>
   <div class="col-md-3">
    <label class="form-label">Email</label>
    <input type="text" name="email" value="<%= email %>" class="form-control">
  </div>
 <div class="col-md-3">
    <label class="form-label">Phone</label>
    <input type="text" name="phone" value="<%= phone %>" class="form-control">
  </div>
  
  <div class="col-md-6">
    <label class="form-label">Topic</label>
    <input type="text" name="topic" value="<%= topic %>" class="form-control">
  </div>

	<input type="submit" name="submit" value="Update my data" class="btn btn-primary mt-5 mx-auto" >
	
</form>
</div>


</body>
</html>