<%-- 
    Document   : endereco
    Created on : 03/11/2019, 09:56:41
    Author     : emanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CADASTRO DE ENDEREÇO</title>
    </head>
    <body>
        <h1>Cadastro de ENDEREÇO</h1>
        <form action="saveEndereco" method="post">
            <div>
                <label>Rua</label>
                <input type="text" name="endereco.rua"/>
            </div>
            <div>
                <label>Número</label>
                <input type="text" name="endereco.numero"/>
            </div>
            <div>
                <label>Bairro</label>
                <input type="text" name="endereco.bairro"/>
            </div>
            <div>
                <label>Cidade</label>
                <input type="text" name="endereco.cidade"/>
            </div>
            <div>
                <label>Estado</label>
                <input type="text" name="endereco.estado"/>
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
