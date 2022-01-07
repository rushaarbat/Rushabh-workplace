    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Account List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>No</th><th>Name</th><th>Balance</th><th>Type</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="acco" items="${list}"> 
    <tr>
    <td>${acco.no}</td>
    <td>${acco.name}</td>
    <td>${acco.balance}</td>
    <td>${acco.type}</td>
    <td><a href="editacco/${acco.type}">Edit</a></td>
    <td><a href="deleteacco/${acco.no}">Delete</a></td>
    </tr>type
    </c:forEach>
    </table>
    <br/>
    <a href="accoform">Add New Account</a>