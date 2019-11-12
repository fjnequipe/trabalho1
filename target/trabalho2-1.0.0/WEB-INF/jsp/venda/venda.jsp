<%-- 
    Document   : venda
    Created on : 03/11/2019, 09:57:22
    Author     : emanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CADASTRO DE VENDA</title>
    </head>
    <body>
        <h1>Cadastro de VENDA</h1>
        <form action="saveVenda" method="post">
            <div>
                <label>Código do Cliente</label>
                <input type="text" name="venda.cliente"/>
            </div>
            <div>
                <label>Código do Produto</label>
                <input type="text" name="venda.produto"/>
            </div>
            <div>
                <label>Valor</label>
                <input type="text" name="venda.valor"/>
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
