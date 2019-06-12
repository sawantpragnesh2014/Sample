<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
${reservation.firstName}
${reservation.lastName}
<ul>  
<c:forEach var="m" items="${reservation.meal}">  
<li>${m}</li>  
</c:forEach>  
</ul> 
${reservation.goingTo} 