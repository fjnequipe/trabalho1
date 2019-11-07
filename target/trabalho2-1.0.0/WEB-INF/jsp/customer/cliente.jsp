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
                <label>Código do Endereço</label>
                <input type="text" name="cliente.endereco"/>
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
