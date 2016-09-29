<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="paymentInfo" method="post" action="submitPayment">
    <table>
		<tr>
		   <td> Card Holder Name</td>
		   <td><form:input path="cardHolderName"/></td>  
		</tr> 
		<tr>
		   <td> Input Your Credit Card Number </td>
		   <td><form:input path="crediCardNumber"/></td>  
		</tr>   
		<tr>
		   <td> Expiration Date</td>
		   <td><form:input path="expirationDate"/></td>  
		</tr>     
		<tr>
		   <td> CVV Code</td>
		   <td><form:input path="cvvCode"/></td>  
		</tr> 
		
		<tr>
		     <td><input type="submit" name="submit" value="submit"/></td>
		</tr> 
    </table> 
</form:form>
</body>
</html>