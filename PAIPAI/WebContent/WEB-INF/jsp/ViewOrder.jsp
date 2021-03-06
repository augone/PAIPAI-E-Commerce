<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*"%>
<%@ page import="beans.*"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="order" method="post">
    <table>
         <tr>
         <td>${order.items[0].name}</td>
      	 
            <td><form:input path="items[0].quantity"/></td>  
         </tr>   
         <tr>
            <td> Necklace</td>
            <td><form:input path="items[1].quantity"/></td>  
         </tr>     
    </table> 
</form:form>

<form:form modelAttribute="shippingInfo">
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
    </table> 
</form:form>

<form:form modelAttribute="paymentInfo" method="post" action="confirmOrder">
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