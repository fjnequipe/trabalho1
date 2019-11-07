<%-- 
    Document   : remedio
    Created on : 03/11/2019, 09:57:02
    Author     : emanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CADASTRO DE REMÉDIO</title>
    </head>
    <body>
        <h1>Cadastro de REMÉDIO</h1>
        <form action="saveRemedio" method="post">
            <div>
                <label>Nome</label>
                <input type="text" name="remedio.nome"/>
            </div>
            <div>
                <label>Validade</label>
                <input type="text" name="remedio.validade"/>
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
