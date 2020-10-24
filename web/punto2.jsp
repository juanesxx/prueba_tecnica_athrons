<%-- 
    Document   : home
    Created on : 11 Jul, 2019, 6:00:24 PM
    Author     : Gaurav
--%>

<%@page import="dto.PaquetesDTO"%>
<%@page import="dao.PaqueteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Punto 2</title>
    </head>
    <body><center>
        <h3>Punto 2 de la prueba</h3>
        <%PaquetesDTO paquete2 = (PaquetesDTO)request.getAttribute("paquete2"); %>
        
        <h3>Paquete con ID 2</h3>

        <table style="font-size: 20px" border="1" class="table">
            <tr>
                <td><b>ID</b></td>
                <td><%=paquete2.getId()%></td>
            </tr>
            <tr>
                <td><b>Código</b></td>
                <td><%=paquete2.getCode()%></td>
            </tr>
            <tr>
                <td><b>Descripción</b></td>
                <td><%=paquete2.getDescription()%></td>
            </tr>
            <tr>
                <td><b>ID del producto</b></td>
                <td><%=paquete2.getProductid()%></td>
            </tr>
            <tr>
                <td><b>Cantidad</b></td>
                <td><%=paquete2.getAmount()%></td>
            </tr>
            <tr>
                <td><b>Valor</b></td>
                <td><%=paquete2.getValue()%></td>
            </tr>
        </table>
            <br>
                        <h3>Solución</h3>

            <label>El valor del paquete con ID 2 es: <%=paquete2.getValue()%></label>
            <br> 
            <br>
            <b>Regresar al inicio <a class="btn btn-primary" href="inicio.jsp">Clic aquí</a></b><br><br>
    </centre></body>
</html>
