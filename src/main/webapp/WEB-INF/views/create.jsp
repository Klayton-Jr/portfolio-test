<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Cadastro de Projeto</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>

<div class="container mt-5">
    <h2>Cadastro de Projeto</h2>

    <form action="/create" method="post">
        <div class="form-group">
            <label for="nome">Nome:</label>
            <input type="text" class="form-control" id="nome" name="nome" required>
        </div>
        <div class="form-group">
            <label for="dataInicio">Data de Início:</label>
            <input type="date" class="form-control" id="dataInicio" name="dataInicio" required>
        </div>
        <div class="form-group">
            <label for="gerenteId">Gerente Responsável (ID):</label>
            <input type="text" class="form-control" id="gerenteId" name="gerenteId" required>
        </div>
        <div class="form-group">
            <label for="dataPrevisaoTermino">Data de Previsão de Término:</label>
            <input type="date" class="form-control" id="dataPrevisaoTermino" name="dataPrevisaoTermino" required>
        </div>
        <div class="form-group">
            <label for="dataRealTermino">Data Real de Término:</label>
            <input type="date" class="form-control" id="dataRealTermino" name="dataRealTermino">
        </div>
        <div class="form-group">
            <label for="orcamentoTotal">Orçamento Total:</label>
            <input type="number" class="form-control" id="orcamentoTotal" name="orcamentoTotal" required>
        </div>
        <div class="form-group">
            <label for="descricao">Descrição:</label>
            <textarea class="form-control" id="descricao" name="descricao" rows="3" required></textarea>
        </div>
        <div class="form-group">
            <label for="status">Status:</label>
            <input type="text" class="form-control" id="status" name="status" required>
        </div>
        <button type="submit" class="btn btn-primary">Cadastrar Projeto</button>
    </form>
</div>

</body>
</html>
