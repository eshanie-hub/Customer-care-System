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

	String agentid = request.getParameter("agentid");
	
%>
<!-- Page Wrapper -->
    <div class="container mt-5">	
<h1 class="text-center">New Agent Message</h1>

<form action="../insertMesseageAgent" method="post" class="row g-3">
 <div class="col-md-6 mt-5">
    <label class="form-label">Agent id</label>
    <input type="text" name="agentid" value="<%=agentid%>" class="form-control">
  </div>
  
  <div class="col-md-6 mt-5">
    <label class="form-label">Customer id</label>
    <input type="text" name="cusid" class="form-control">
  </div>

  <div class="col-md-6 mb-5 mt-5">
    <label class="form-label">Name</label>
    <input type="text" name="name" class="form-control">
  </div>

  <div class="col-md-6 mb-5 mt-5">
    <label class="form-label">Email</label>
    <input type="text" name="email" class="form-control">
  </div>
  
  <div class="col-md-6 mb-5">
    <label class="form-label">Phone</label>
    <input type="text" name="phone" class="form-control">
  </div>

  <div class="col-md-6 mb-5">
    <label class="form-label">Topic</label>
    <input type="text" name="topic" class="form-control">
  </div>

  <div class="col-md-12 mb-5">
    <label class="form-label">Message</label>
    <input type="text" name="description" class="form-control">
  </div>

<input type="submit" name="submit" value="send" class="col-md-12 mb-5 btn btn-success"></form>
</body>
</html>