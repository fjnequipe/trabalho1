<%-- 
    Document   : cliente
    Created on : 03/11/2019, 09:18:13
    Author     : emanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CADASTRO DE CLIENTE</title>
    </head>
    <body>
        <h1>Cadastro de CLIENTE</h1>
        <form action="saveCliente" method="post">
            <div>
                <label>CPF</label>
                <input type="text" name="cliente.cpf"/>
            </div>
            <div>
                <label>Nome</label>
                <input type="text" name="cliente.nome"/>
            </div>
            <div>
                <label>Telefone</label>
                <input type="text" name="cliente.telefone"/>
            </div>
            <div>
                <label>Rua</label>
                <input type="text" name="cliente.endereco.rua"/>
            </div>
            <div>
                <label>Número</label>
                <input type="text" name="cliente.endereco.numero"/>
            </div>
            <div>
                <label>Bairro</label>
                <input type="text" name="cliente.endereco.bairro"/>
            </div>
            <div>
                <label>Cidade</label>
                <input type="text" name="cliente.endereco.cidade"/>
            </div>
            <div>
                <label>Estado</label>
                <input type="text" name="cliente.endereco.estado"/>
            </div>
            <div>
                <button type="submit">Salvar</button>
            </div>
        </form>
        <div>
            <p>${msgSuccess}</p>
        </div>
    </body>
</html>
