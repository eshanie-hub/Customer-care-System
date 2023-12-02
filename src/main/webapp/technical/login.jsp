<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Customized Bootstrap Stylesheet -->
<link rel="stylesheet" href="../css/bootstrap.min.css"></link>

<!-- Stylesheet -->
<link rel="stylesheet" href="../css/style.css"></link>
</head>
<body>
<div class="wrapper ">
<!-- Navbar & Hero Start -->
    <div class="container-fluid position-relative p-0">
        <nav class="navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0 mb-5">
            <a href="" class="navbar-brand p-0">
                
                <img src="img/logo.png" alt="Logo" style="width: 10%"> 
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                <span class="fa fa-bars"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <div class="navbar-nav ms-auto py-0">
                    <a href="../index.jsp" class="nav-item nav-link active">Home</a>
                    <!--<a href="about.html" class="nav-item nav-link">About</a>-->
                    <a href="" class="nav-item nav-link">Services</a>
                    <a href="" class="nav-item nav-link">Resources</a>
					 <a href="" class="nav-item nav-link">Reviews</a>
					  <a href="" class="nav-item nav-link">FAQ</a>
                </div>
                <a href="../customer/login.jsp" class="btn btn-primary rounded-pill py-2 px-4">Login</a>
            </div>
        </nav>

    <!-- Navbar & Hero End -->


   <form action="../viewServlet" method="post">
    <div class="flex row login">
      <div class="col image-side">
        <img src="../img/destination-2.jpg" style="width: 100%;">
       </div>
       
       <div class="col-5 text-center mt-5">
        <h1 class="mt-5">Technical Agent Login</h1>

        <p class="mt-5">agentid:</p>
        <input type="text" name="agentid" class="mb-3 form-control text-center" placeholder="Enter agentid" required/> <br><br>

        <input type="submit" value="Login" class="btn btn-primary mt-3">
        
  
        <!-- Login change -->
        <div class="mt-3 mb-5">
        	<p><a href="../manager/loginManager.jsp">Manager login</a></p>
        	<p><a href="../agent/login.jsp">Agent login</a></p>
        	<p><a href="../technical/login.jsp">Technical login</a></p>
		</div>
        </div>
      </div>
    </div>
     
    
        </form>
  </div>


</body>
</html>