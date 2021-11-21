<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address</title>
</head>
<body>
<h2>Data is accessing from Address side</h2>
<table border="2">
    <thead>
     <tr>
      <th>Location</th>
      <th>Fees</th>
      <th>Salary</th>
      <th>Maintenance</th>
      <th>Head Of Finance Department</th>
     </tr>
    </thead>
    <tbody>
     <c:forEach items="${address}" var="addr"> 
      <tr>
       <td>${addr.location }</td>
       <td>${addr.coachingInstitute.fees }</td>
       <td>${addr.coachingInstitute.salary}</td>
       <td>${addr.coachingInstitute.maintenance }</td>
       <td>${addr.coachingInstitute.head_of_financeDepartment}</td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
</body>
</html>