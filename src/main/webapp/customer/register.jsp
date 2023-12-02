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
<!-- Navbar & Hero Start -->
    <div class="container-fluid position-relative p-0">
        <nav class="navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0">
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
                <a href="login.jsp" class="btn btn-primary rounded-pill py-2 px-4">Login</a>
            </div>
        </nav>

    
    <!-- Navbar & Hero End -->
    <div class="wrapper">
    <form action="../insert" method="post">
    <div class="flex row login">
      <div class="col image-side">
        <img src="../img/destination-2.jpg" style="width: 100%;">
       </div>
       
       <div class="col-5 text-center ">
        <h1 class="mt-5 mb-5">Customer Register</h1>
        
        <div class="row g-3">
        <div class="mb-4 col-md-12">
    	  <label class="form-label">Name:</label>
   			<input type="text" name="name" placeholder="Enter name" class="form-control text-center" required/>
    	</div>
  		<div class="row">
  		<div class="mb-4 col-md-8" >
    	  <label class="form-label">Email:</label>
     		  <input type="text" name="email" placeholder="Enter email" class="form-control text-center" required/>
  		</div>
  		
  		<div class="mb-4 col-md-4">
    	  <label class="form-label">Phone:</label>
     		  <input type="text" name="phone" placeholder="Enter phone number" class="mb-3 form-control text-center" required/>
  		</div>
  		</div>
  		
  		<div class="mb-4 col-md-12 mt-2">
    	  <label class="form-label">username:</label>
     		  <input type="text" name="username" placeholder="Enter username" class="mb-3 form-control text-center" required/>
  		</div>
  		
  		<div class="mb-4 col-md-12">
    	  <label class="form-label">password:</label>
     		  <input type="text" name="password" placeholder="Enter password" class="form-control text-center" required/>
  		</div>
  		</div>
      <input type="submit" name="register" value="Register" class="btn btn-primary mt-3 ">
        <p class="mt-3 mb-2"><a href="login.jsp">Login</a></p>
     
        </div>
      </div>
    </div>
    
   
        </form>
  </div>
  </body>


</body>
</html>