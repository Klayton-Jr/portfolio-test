<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Cadastro de Projeto - Confirmação</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>

<div class="container mt-5">
    <h2>Projeto Criado com Sucesso</h2>

    <div class="card">
        <div class="card-body">
            <h5 class="card-title">Detalhes do Projeto</h5>
            <p class="card-text">
                <strong>Nome:</strong> ${projeto.nome}<br>
                <strong>Data de Início:</strong> ${projeto.dataInicio}<br>
                <strong>Gerente Responsável (ID):</strong> ${projeto.gerenteId}<br>
                <strong>Data de Previsão de Término:</strong> ${projeto.dataPrevisaoTermino}<br>
                <strong>Data Real de Término:</strong> ${projeto.dataRealTermino}<br>
                <strong>Orçamento Total:</strong> ${projeto.orcamentoTotal}<br>
                <strong>Descrição:</strong> ${projeto.descricao}<br>
                <strong>Status:</strong> ${projeto.status}
            </p>
        </div>
    </div>
</div>

</body>
</html>
