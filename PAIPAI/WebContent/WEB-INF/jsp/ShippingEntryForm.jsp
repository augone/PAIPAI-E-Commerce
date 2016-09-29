<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="shippingInfo" method="post" action="submitShipping">
    <table>
		<tr>
		   <td> Name </td>
		   <td><form:input path="name"/></td>  
		</tr> 
		<tr>
		   <td> Address Line1 </td>
		   <td><form:input path="addressLine1"/></td>  
		</tr>   
		<tr>
		   <td> Address Line2</td>
		   <td><form:input path="addressLine2"/></td>  
		</tr>     
		<tr>
		   <td> City</td>
		   <td><form:input path="city"/></td>  
		</tr> 
		<tr>
		   <td> State</td>
		   <td><form:input path="state"/></td>  
		</tr> 
		<tr>
		   <td> Zip Code</td>
		   <td><form:input path="zip"/></td>  
		</tr> 
		
		<tr>
		     <td><input type="submit" name="submit" value="submit"/></td>
		</tr> 
    </table> 
</form:form>
</body>
</html>