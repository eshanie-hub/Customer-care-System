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
<div class="container">
<div class="mt-5 d-flex flex-row" >
<h1 class="col-md-10 ">View Messages</h1>
<a href="customer/login.jsp" class="btn btn-dark col-md-2 text-center">logout</a>
</div>

<table class="table">

<table class="table mt-5 ">
  <thead>
    <tr>
      <th scope="col" >Message Id</th>
      <th scope="col">Customer name</th>
      <th scope="col">Phone</th>
      <th scope="col">Email</th>
      <th scope="col">Topic</th>
      <th scope="col">Description</th>
      <th scope="col">cusid</th>
       <th scope="col">agentid</th>
      <th scope="col"></th>
       <th scope="col"></th>
    </tr>
  </thead>

<c:forEach var="isu" items="${issueDetails}">

<c:set var="messageid" value="${isu.messageid}"/>
<c:set var="name" value="${isu.name}"/>
<c:set var="phone" value="${isu.phone}"/>
<c:set var="email" value="${isu.email}"/>
<c:set var="topic" value="${isu.topic}"/>
<c:set var="description" value="${isu.description}"/>
<c:set var="cusid" value="${isu.cusid}"/>
<c:set var="agentid" value="${isu.agentid}"/>

<c:url value="agent/respond.jsp" var="respondissue">
<c:param name="messageid" value="${messageid}"/>
<c:param name="name" value="${name}"/>
<c:param name="phone" value="${phone}"/>
<c:param name="email" value="${email}"/>
<c:param name="topic" value="${topic}"/>
<c:param name="description" value="${description}"/>
<c:param name="cusid" value="${cusid}"/>
<c:param name="agentid" value="${agentid}"/>
</c:url>


<c:url value="agent/delete.jsp" var="deleteissue">
<c:param name="messageid" value="${messageid}"/>
<c:param name="name" value="${name}"/>
<c:param name="phone" value="${phone}"/>
<c:param name="email" value="${email}"/>
<c:param name="topic" value="${topic}"/>
<c:param name="description" value="${description}"/>
<c:param name="cusid" value="${cusid}"/>
<c:param name="agentid" value="${agentid}"/>
</c:url>


<c:url value="agent/newmessage.jsp" var="newmessage">
<c:param name="messageid" value="${messageid}"/>
<c:param name="name" value="${name}"/>
<c:param name="phone" value="${phone}"/>
<c:param name="email" value="${email}"/>
<c:param name="topic" value="${topic}"/>
<c:param name="description" value="${description}"/>
<c:param name="cusid" value="${cusid}"/>
<c:param name="agentid" value="${agentid}"/>
</c:url>


<tr>
<td>${isu.messageid}</td>
<td class="table-light">${isu.name}</td>
<td>${isu.phone}</td>
<td class="table-light">${isu.email}</td>
<td>${isu.topic}</td>
<td class="table-light">${isu.description}</td>
<td>${isu.cusid}</td>
<td class="table-light">${isu.agentid}</td>

<td>
<a href="${deleteissue}" class="btn btn-danger">Delete</a>
</td>

<td>
<a href="${respondissue}" class="btn btn-warning">Update</a>
</td>
</tr>




</c:forEach>


</table>


<a href="${newmessage}" class="btn btn-dark">Create New Message</a>
</div>

</body>
</html>