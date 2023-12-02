<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

  <!-- Libraries Stylesheet -->
    <link href="animation/animate/animate.min.css" rel="stylesheet"></link>
    <link href="animation/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet"></link>
    <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet"></link>

 <!-- Libraries Stylesheet -->
    <link href="animation/animate/animate.css" rel="stylesheet"></link>
    <link href="animation/owlcarousel/assets/owl.carousel.css" rel="stylesheet"></link>
     <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.css" rel="stylesheet"></link>
     
      <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">


<!-- Customized Bootstrap Stylesheet -->
<link rel="stylesheet" href="css/bootstrap.min.css"></link>

<!-- Stylesheet -->
<link rel="stylesheet" href="css/style.css"></link>

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
                    <a href="" class="nav-item nav-link active">Home</a>
                    <!--<a href="about.html" class="nav-item nav-link">About</a>-->
                    <a href="" class="nav-item nav-link">About us</a>
                    <a href="" class="nav-item nav-link">Resources</a>
					 <a href="" class="nav-item nav-link">Reviews</a>
					  <a href="" class="nav-item nav-link">FAQ</a>
                </div>
                <a href="customer/login.jsp" class="btn btn-primary rounded-pill py-2 px-4">Login</a>
            </div>
        </nav>

        <div class="container-fluid bg-primary py-5 mb-5 hero-header">
            <div class="container py-5">
                <div class="row justify-content-center py-5">
                    <div class="col-lg-10 pt-lg-5 mt-lg-5 text-center">
                        <h1 class="display-3 text-white mb-3 animated slideInDown">We're Hear to Help</h1>
                        <p class="fs-4 text-white mb-4 animated slideInDown">Providing Best Customer Service is our priority</p>
                    </div>
                </div>
            </div>
        </div>
    
    <!-- Navbar & Hero End -->
    
    <!-- About -->
    	 <section class="about_section layout_padding">
    <div class="container ">
      <div class="row">
        <div class="col-md-6">
          <div class="detail-box">
            <div class="heading_container">
              <h1 class="section-title bg-white text-start text-primary pe-3">About Us</h1><br><br><br>
                    <h2 class="mb-4">Welcome to <span class="text-primary">Our Customer Service  </span></h2>
            </div>
            <p class="mb-4">Our goal is provide expectational customer service and support to ensure your satisfaction and success.</p>
                    <p class="mb-4">At the heart of our organization is a simple yet powerful mission: to empower and assist our customers in every way possible. We are committed to resolving your queries, addressing your concerns, and exceeding your expectations through a seamless and efficient customer care experience</p>
            <div class="row gy-2 gx-4 mb-4">
                        <div class="col-sm-6">
                            <p class="mb-0"><i class="fa fa-arrow-right text-primary me-2"></i>24/7 Service</p>
                        </div>
                        <div class="col-sm-6">
                            <p class="mb-0"><i class="fa fa-arrow-right text-primary me-2"></i>Expertise</p>
                        </div>
                        <div class="col-sm-6">
                            <p class="mb-0"><i class="fa fa-arrow-right text-primary me-2"></i>Personalized Support</p>
                        </div>
                        <div class="col-sm-6">
                            <p class="mb-0"><i class="fa fa-arrow-right text-primary me-2"></i>Efficiency</p>
                        </div>
                        
                    </div>
			<a href="">
              Read More
            </a>
          </div>
        </div>
        <div class="col-md-6 ">
          <div class="img-box">
            <img src="img/ag.jpeg" width="90%" alt="" />
          </div>
        </div>
      </div>
    </div>
  </section>
    
   
  
  <!-- resources -->
  <div style="background-color: #F5F5F5;" >
  <div class="container-xxl py-5 mt-4" >
        <div class="container">
            <div class="text-center wow fadeInUp" data-wow-delay="0.1s">
                <h1 class="mb-5">Resources</h1>
            </div>
             <div class="position-relative w-75 mx-auto animated slideInDown">
                        <input type="text" id="searchText" class="form-control rounded-pill w-100 py-3 ps-4 pe-5" placeholder="Eg: How can we help you today">
                            <button type="button" class="btn btn-primary rounded-pill py-2 px-4 position-absolute top-0 end-0 me-2" style="margin-top: 7px;" onclick="filterResults()">Search</button>
                        </div>
            <div class="row g-4">
                <div class="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.1s">
                    <div class="service-item rounded pt-3">
                        <div class="p-4">
                            <i class="fa fa-3x fa-globe text-primary mb-4"></i>
                            <h5>Devices</h5>
                            <p>Devices are truly incredible tools that make our lives easier and more convenient.</p>
							<a class="btn btn-primary py-3 px-5 mt-2" href="">Read More</a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.3s">
                    <div class="service-item rounded pt-3">
                        <div class="p-4">
                            <i class="fa fa-3x fa-hotel text-primary mb-4"></i>
                            <h5>Billing</h5>
                            <p>Online payments have revolutionized the way we shop and do business, and let's be honest, it's pretty awesome!</p>
							<a class="btn btn-primary py-3 px-5 mt-2" href="">Read More</a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.5s">
                    <div class="service-item rounded pt-3">
                        <div class="p-4">
                            <i class="fa fa-3x fa-user text-primary mb-4"></i>
                            <h5>Troubleshoot Account Issues</h5>
                            <p>Hey there! We understand that dealing with account issues can be a hassle, but don't worry, we've got your back! </p>
							<a class="btn btn-primary py-3 px-5 mt-2" href="">Read More</a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.7s">
                    <div class="service-item rounded pt-3">
                        <div class="p-4">
                            <i class="fa fa-3x fa-cog text-primary mb-4"></i>
                            <h5>Technical Related</h5>
                           <p>Just shoot us a message or give us a call, and we'll do our best to troubleshoot and resolve any problems you're facing.</p>
						   <a class="btn btn-primary py-3 px-5 mt-2" href="">Read More</a>
                        </div>
                    </div>
                </div>
                
            </div>
        </div>
    </div>
    </div>
     
    

<!-- Testimonial Start -->
 <div class="container-xxl py-5">
        <div class="container">
            <div class="text-center pb-4 wow fadeInUp" data-wow-delay="0.1s">
                <h1 class="mb-5">Testimonial</h1>
            </div>
            <div class="owl-carousel testimonial-carousel position-relative">
                <div class="container-xxl py-5 wow fadeInUp text-center" data-wow-delay="0.1s">
                    <div class="testimonial-item position-relative border border-primary pt-5 pb-4 px-4">
                        <div class="d-inline-flex align-items-center justify-content-center bg-primary rounded-circle position-absolute top-0 start-50 translate-middle shadow" style="width: 100px; height: 100px;">
                            <img class="rounded-circle" src="img/testimonial-1.jpg" style="width: 100px; height: 100px;">
                        </div>
                        <h5 class="mb-2 mt-4">John Doe</h5>
                        <div class="mb-3">
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                        </div>
                        <p class="mb-0">From the moment I reached out for assistance, the response time was impressive. Thank you for the service</p>
                    </div>
                </div>
                <div class="container-xxl py-5 wow fadeInUp text-center" data-wow-delay="0.1s">
                    <div class="testimonial-item position-relative border border-primary pt-5 pb-4 px-4">
                        <div class="d-inline-flex align-items-center justify-content-center bg-primary rounded-circle position-absolute top-0 start-50 translate-middle shadow" style="width: 100px; height: 100px;">
                            <img class="rounded-circle" src="img/testimonial-1.jpg" style="width: 100px; height: 100px;">
                        </div>
                        <h5 class="mb-2 mt-4">John Doe</h5>
                        <div class="mb-3">
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                        </div>
                        <p class="mb-0">Promptness and friendliness of the system not only left me satisfied but also made me feel valued as a customer.</p>
                    </div>
                </div>
                <div class="container-xxl py-5 wow fadeInUp text-center" data-wow-delay="0.1s">
                    <div class="testimonial-item position-relative border border-primary pt-5 pb-4 px-4">
                        <div class="d-inline-flex align-items-center justify-content-center bg-primary rounded-circle position-absolute top-0 start-50 translate-middle shadow" style="width: 100px; height: 100px;">
                            <img class="rounded-circle" src="img/testimonial-1.jpg" style="width: 100px; height: 100px;">
                        </div>
                        <h5 class="mb-2 mt-4">John Doe</h5>
                        <div class="mb-3">
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                        </div>
                        <p class="mb-0"> I truly appreciate their efforts in providing such efficient and helpful customer service. Great System!</p>
                    </div>
                </div>
                <div class="container-xxl py-5 wow fadeInUp text-center" data-wow-delay="0.1s">
                    <div class="testimonial-item position-relative border border-primary pt-5 pb-4 px-4">
                        <div class="d-inline-flex align-items-center justify-content-center bg-primary rounded-circle position-absolute top-0 start-50 translate-middle shadow" style="width: 100px; height: 100px;">
                            <img class="rounded-circle" src="img/testimonial-1.jpg" style="width: 100px; height: 100px;">
                        </div>
                        <h5 class="mb-2 mt-4">John Doe</h5>
                        <div class="mb-3">
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                        </div>
                        <p class="mb-0">The team was courteous and took the time to thoroughly address my questions. Keep up the good work!</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <!-- FAQ Section -->
    <div class="accordion" id="accordionExample">
  <div class="accordion-item">
    <h2 class="accordion-header" id="headingOne">
      <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
        1. What is M3 High Speed Internet?
      </button>
    </h2>
    <div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
      <div class="accordion-body">
        M3 high speed internet is one of the fastest data connectivity service which enables you to download and upload large data files at very high speeds wherever you are, provided that you are within 3.5G coverage. M3 High Speed Internet is powered by HSPA.
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header" id="headingTwo">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
        2. How can I check my usage?.
      </button>
    </h2>
    <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
      <div class="accordion-body">
        You can check your usage through your online account on the Mobitel corporate website at MyAccount <code>.Q2</code>
      </div>
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header" id="headingThree">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
        3. The data usage is calculated for Downloading or Uploading or for both?.
      </button>
    </h2>
    <div id="collapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree" data-bs-parent="#accordionExample">
      <div class="accordion-body">
        On selected packages, rental will be charged from the date of connection, up to the date of your bill. The data usage is calculated both for uploading and downloading.  <code>.Q3</code>
      </div>
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header" id="headingFour">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseFour" aria-expanded="true" aria-controls="collapseFour">
        4. How do I get a replacement for my lost/damaged SIM card?
      </button>
    </h2>
    <div id="collapseFour" class="accordion-collapse collapse" aria-labelledby="headingFour" data-bs-parent="#accordionExample">
      <div class="accordion-body">
      You can request for a SIM change by calling over at one of the Mobitel touch points http://www.mobitel.lk/store-find Visit - https://online.mobitel.lk/ImsiChange/
    </div>
  </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header" id="headingFive">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseFive" aria-expanded="true" aria-controls="collapseFive">
       5. Can I get a copy of a previous bill e mailed to my e mail address? 
      </button>
    </h2>
    <div id="collapseFive" class="accordion-collapse collapse" aria-labelledby="headingFive" data-bs-parent="#accordionExample">
      <div class="accordion-body">
        5. Can I get a copy of a previous bill e mailed to my e mail address? Bill copy/s of previous months can be e mailed to the corresponding registered e mail address upon request. This service is provided free of charge.
    </div>
  </div>

        <!-- Footer Start -->
    <div class="container-fluid bg-dark text-light footer pt-5 mt-5 wow fadeIn" data-wow-delay="0.1s">
        <div class="container py-5">
            <div class="row g-5">
                <div class="col-lg-3 col-md-6">
                    <h4 class="text-white mb-3">Company</h4>
                    <a class="btn btn-link" href="">About Us</a>
                    <a class="btn btn-link" href="">Contact Us</a>
                    <a class="btn btn-link" href="">Privacy Policy</a>
                    <a class="btn btn-link" href="">FAQs & Help</a>
                </div>
                <div class="col-lg-3 col-md-6">
                    <h4 class="text-white mb-3">Contact</h4>
                    <p class="mb-2"><i class="fa fa-map-marker-alt me-3"></i>123 Street, New York, USA</p>
                    <p class="mb-2"><i class="fa fa-phone-alt me-3"></i>+012 345 67890</p>
                    <p class="mb-2"><i class="fa fa-envelope me-3"></i>info@example.com</p>
                    <div class="d-flex pt-2">
                        <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-twitter"></i></a>
                        <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-facebook-f"></i></a>
                        <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-youtube"></i></a>
                        <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-linkedin-in"></i></a>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <h4 class="text-white mb-3">Newsletter</h4>
                    <p>Join our newsletter subscription to get the latest news.</p>
                    <div class="position-relative mx-auto" style="max-width: 400px;">
                        <input class="form-control border-primary w-100 py-3 ps-4 pe-5" type="text" placeholder="Your email">
                        <button type="button" class="btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2">SignUp</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>
     <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="animation/wow/wow.min.js"></script>
    <script src="animation/easing/easing.min.js"></script>
    <script src="animation/waypoints/waypoints.min.js"></script>
    <script src="animation/owlcarousel/owl.carousel.min.js"></script>
    <script src="animation/tempusdominus/js/moment.min.js"></script>
    <script src="animation/tempusdominus/js/moment-timezone.min.js"></script>
    <script src="animation/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>
    
    
    <!-- Template Javascript -->
    <script src="js/main.js"></script>
    
    <!-- JavaScript for Filtering Results -->
    <script>
        function filterResults() {
            const searchText = document.getElementById("searchText").value.toLowerCase();
            const items = document.querySelectorAll('.service-item');

            items.forEach(item => {
                const itemText = item.textContent.toLowerCase();
                if (itemText.includes(searchText)) {
                    item.style.display = "block"; // Show the item
                } else {
                    item.style.display = "none"; // Hide the item
                }
            });
        }
    </script>

</body>
</html>