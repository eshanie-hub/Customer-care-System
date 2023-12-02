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
String messageid=request.getParameter("messageid");
String name=request.getParameter("name");
String phone=request.getParameter("phone");
String email=request.getParameter("email");
String topic=request.getParameter("topic");
String description=request.getParameter("description");
String cusid=request.getParameter("cusid");
String agentid=request.getParameter("agentid");

%>
<!-- Page Wrapper -->
    <div class="container mt-5">	
<h1 class="text-center">Update Agent Message</h1>

<form action="../respond" method="post" class="row g-3">

   <input type="text" name="agentid" value="<%=agentid %>" class="form-control" hidden>
  
  <div class="col-md-6 mb-5 mt-5">
    <label class="form-label">Customer id</label>
    <input type="text" name="cusid" value="<%=cusid %>" class="form-control" readonly>
  </div>
  
  <div class="col-md-6 mb-5 mt-5">
    <label class="form-label">Message id</label>
    <input type="text" name="messageid" value="<%=messageid %>" class="form-control" readonly>
  </div>

  <div class="col-md-4 mb-5">
    <label class="form-label">Customer Name</label>
    <input type="text" name="name" value="<%=name %>" class="form-control" readonly>
  </div>
  
  <div class="col-md-4 mb-5">
    <label class="form-label">Phone Number</label>
    <input type="text" name="phone" value="<%=phone %>" class="form-control" readonly>
  </div>
   
  <div class="col-md-4 mb-5">
    <label class="form-label">Email</label>
    <input type="text" name="email" value="<%=email %>" class="form-control" readonly>
  </div>
  
  <div class="col-md-12 mb-5">
    <label class="form-label">Topic</label>
    <input type="text" name="topic" value="<%=topic %>" class="form-control" >
  </div>
  
 <div class="col-md-12 mb-5">
    <label class="form-label">Description</label>
    <input type="text" name="description" value="<%=description %>" class="form-control" >
  </div>

<input type="submit" name="submit" value="send" class="col-md-12 mb-5 btn btn-success">
 </form>
 </div>
</body>
</html>