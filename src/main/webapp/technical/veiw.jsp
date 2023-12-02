<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Customized Bootstrap Stylesheet -->
<link rel="stylesheet" href="css/bootstrap.min.css">

  <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

</head>
<body>

    <!-- Page Wrapper -->
    <div id="wrapper">
<div class="container">
<div id="content-wrapper">
<div class="mt-5 d-flex flex-row" >
<h1 class="text-center col-md-10 ">View Appointments</h1>
<a href="customer/login.jsp" class="btn btn-primary col-md-2 text-center">logout</a>
</div>
<table class="table mt-5 table-dark">
  <thead>
    <tr>
      <th scope="col" >Appointment Id</th>
      <th scope="col">Topic</th>
      <th scope="col">Customer name</th>
      <th scope="col">Time</th>
      <th scope="col">date</th>
      <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
		
<c:forEach var="com" items="${appointmentDetails}" > 
	<c:set var="appId" value="${com.appId}" />
	<c:set var="cusId" value="${com.cusId}" />
	<c:set var="name" value="${com.name}" />
	<c:set var="appDate" value="${com.appDate}" />
	<c:set var="appTime" value="${com.appTime}" />
	<c:set var="email" value="${com.email}" />
	<c:set var="phone" value="${com.phone}" />
	<c:set var="topic" value="${com.topic}" />
	<c:set var="agentid" value="${com.agentid}" />
	
		<c:url value="technical/updateAppointment.jsp" var="updateAppointment">
	<c:param name="appId" value="${appId}"/>
	<c:param name="cusId" value="${cusId}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="appDate" value="${appDate}"/>
	<c:param name="appTime" value="${appTime}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="phone" value="${phone}"/>
	<c:param name="topic" value="${topic}" />
	<c:param name="agentid" value="${agentid}" />
	</c:url>
	
	
	
	<c:url value="technical/deleteAppointment.jsp" var="deleteAppointment">
	<c:param name="appId" value="${appId}"/>
	<c:param name="cusId" value="${cusId}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="appDate" value="${appDate}"/>
	<c:param name="appTime" value="${appTime}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="phone" value="${phone}"/>
	<c:param name="topic" value="${topic}" />
	<c:param name="agentid" value="${agentid}" />
	</c:url>
	


	

  <tbody class="table">
    <tr >
      <th scope="row" >${com.appId}</th>
      <td>${com.topic}</td>
      <td>${com.name}</td>
      <td> ${com.appTime}</td>
      <td>${appDate}</td>
      <td><a href="${updateAppointment}" class="card-link">update</a></td>
      <td><a href="${deleteAppointment}" class="card-link">Delete</a></td>
    </tr>
	</c:forEach>
  </tbody>
</table>
	

			<c:url value="technical/insertAppointment.jsp" var="insertAppointment">
	<c:param name="agentid" value="${agentid}" />
	</c:url>

	<a href="${insertAppointment}" class="btn btn-primary  justify-content-center mt-5">Appointment</a>
	
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
            </div>
             
</div>	
</body>
</html>