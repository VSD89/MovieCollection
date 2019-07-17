<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Movies</title>
</head>
<body>
<h1>Movies</h1>
<h2><a href="/edit">edit page</a></h2>
<table>
    <tr>
        <th>id</th>
        <th>title</th>
        <th>year</th>
        <th>genre</th>
        <th>watched</th>
        <th>action</th>
    </tr>
    <c:forEach var="movie" items="${moviesList}">
        <tr>
            <td>${movie.id}</td>
            <td>${movie.title}</td>
            <td>${movie.year}</td>
            <td>${movie.genre}</td>
            <td>${movie.watched}</td>
            <td>
                <a href="/edit/${movie.id}">edit</a>
                <a href="/delete/${movie.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h1>Add</h1>
<c:url value="/add" var="add"/>
<a href="${add}">Add new movie</a>
</body>
</html>
