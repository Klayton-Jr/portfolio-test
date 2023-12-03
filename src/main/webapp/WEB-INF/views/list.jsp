<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Lista de Projetos</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>

<div class="container mt-5">
    <h2>Lista de Projetos Disponíveis</h2>

    <c:if test="${empty projetos}">
        <p>Não há projetos disponíveis no momento.</p>
    </c:if>

    <ul class="list-group">
        <c:forEach var="projeto" items="${projetos}">
            <li class="list-group-item">
                <span>${projeto.nome}</span>
                <button type="button" class="btn btn-primary btn-sm float-right"
                        onclick="redirectToDetails(${projeto.id})">Detalhes
                </button>
            </li>
        </c:forEach>
    </ul>
</div>

<script>
    function redirectToDetails(projectId) {
        window.location.href = "detail?id=" + projectId;
    }
</script>

</body>
</html>

