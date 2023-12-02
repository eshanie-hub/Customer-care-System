<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    
    <!-- Custom styles for this template-->
    <link href="../../css/customer.css" rel="stylesheet">
</head>
<body>
<% 
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	%>
<!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" >
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <div class="sidebar-brand-text mx-3">Dashboard</div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                Interface
            </div>

            

            <!-- Nav Item - Inquiries -->
            <li class="nav-item">
                <a class="nav-link" href="charts.html">
                    <i class="fas fa-fw fa-chart-area"></i>
                    <span>Inquiries</span></a>
            </li>

            <!-- Nav Item - Complaints -->
            <li class="nav-item">
                <a class="nav-link" href="customer/complain/sendComplain.jsp">
                    <i class="fas fa-fw fa-table"></i>
                    <span>Complaints</span></a>
            </li>

            <!-- Nav Item - Appointments -->
            <li class="nav-item">
                <a class="nav-link" href="tables.html">
                    <i class="fas fa-fw fa-table"></i>
                    <span>Appointments</span></a>
            </li>

        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>

                    <!-- Topbar Search -->
                    <form
                        class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                        <div class="input-group">
                            <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..."
                                aria-label="Search" aria-describedby="basic-addon2">
                            <div class="input-group-append">
                                <button class="btn btn-primary" type="button">
                                    <i class="fas fa-search fa-sm"></i>
                                </button>
                            </div>
                        </div>
                    </form>

                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">

                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                        <li class="nav-item dropdown no-arrow d-sm-none">
                            <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-search fa-fw"></i>
                            </a>
                            <!-- Dropdown - Messages -->
                            <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
                                aria-labelledby="searchDropdown">
                                <form class="form-inline mr-auto w-100 navbar-search">
                                    <div class="input-group">
                                        <input type="text" class="form-control bg-light border-0 small"
                                            placeholder="Search for..." aria-label="Search"
                                            aria-describedby="basic-addon2">
                                        <div class="input-group-append">
                                            <button class="btn btn-primary" type="button">
                                                <i class="fas fa-search fa-sm"></i>
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </li>

                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow">
                            <a class="nav-link" href="${profile}" id="userDropdown" role="button">
                                <span class="mr-2 d-none d-lg-inline text-gray-600">Update Profile</span>
                            </a>
                         </li>
                         <li class="nav-item dropdown no-arrow">
                            <a class="nav-link" href="${delete}" id="userDropdown" role="button">
                                <span class="mr-2 d-none d-lg-inline text-gray-600">Delete Profile</span>
                            </a>
                         </li>
                         <li class="nav-item dropdown no-arrow">
                            <a class="nav-link" href="../customer/login.jsp" id="userDropdown" role="button">
                                <span class="mr-2 d-none d-lg-inline text-gray-600">Logout</span>
                            </a>
                         </li>
                         
                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
             <div class="container-fluid text-center">
             <h1 class="h3 mb-0 text-gray-800">Create Message</h1>
              
             

<form method="post" action="../../sendMessageServlet" class="row g-3">

    <input type="text" name="cusid" value="<%= id %>" class="form-control" hidden>
  <div class="col-md-12 mb-5 mt-5">
    <label class="form-label">Name</label>
    <input type="text" name="name" value="<%= name %>" class="form-control" readonly>
  </div>
  <div class="col-md-8 mb-5">
    <label class="form-label">Email</label>
    <input type="text" name="email" value="<%= email %>" class="form-control" readonly>
  </div>
 <div class="col-md-4 mb-5">
    <label class="form-label">Phone</label>
    <input type="text" name="phone" value="<%= phone %>" class="form-control" readonly>
  </div>
    <div class="col-md-8 mb-5">
    <label class="form-label">Topic</label>
    <input type="text" name="topic" placeholder="topic" class="form-control" >
  </div>
 <div class="col-md-4 mb-5">
    <label class="form-label">Description</label>
    <input type="text" name="description" placeholder="description" class="form-control">
  </div>


	<input type="submit" name="submit" value="sent Message" class="btn btn-primary mt-5 mx-auto" >
	
</form>

<button class="btn btn-primary mt-5 mx-auto" href="viewComplain.jsp">View Complain</button>
                   

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

            <!-- Footer -->
            <footer class="sticky-footer bg-white">
                <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>Copyright &copy; Customer care 2023</span>
                    </div>
                </div>
            </footer>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="login.html">Logout</a>
                </div>
            </div>
        </div>
    </div>
             
</body>
</html>