<%-- 
    Document   : home
    Created on : 11 Jul, 2019, 6:00:24 PM
    Author     : Gaurav
--%>

<%@page import="dto.PaquetesDTO"%>
<%@page import="dto.ProductosDTO"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="dao.ProductoDAO"%>
<%@page import="dao.PaqueteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Punto 3</title>
    </head>
    <body><center>
        <h1>Punto 3 de la prueba</h1>
        <%           
            PaquetesDTO paquete1 = (PaquetesDTO)request.getAttribute("paquete1");
            ProductosDTO producto = (ProductosDTO)request.getAttribute("producto"); 
        %>
        <h3>Paquete con ID 1</h3>
        <table style="font-size: 20px" border="1" class="table">
            
            <tr>
                <td><b>ID</b></td>
                <td><%=paquete1.getId()%></td>
            </tr>
            <tr>
                <td><b>Código</b></td>
                <td><%=paquete1.getCode()%></td>
            </tr>
            <tr>
                <td><b>Descripción</b></td>
                <td><%=paquete1.getDescription()%></td>
            </tr>
            <tr>
                <td><b>ID del producto</b></td>
                <td><%=paquete1.getProductid()%></td>
            </tr>
            <tr>
                <td><b>Cantidad</b></td>
                <td><%=paquete1.getAmount()%></td>
            </tr>
            <tr>
                <td><b>Valor</b></td>
                <td><%=paquete1.getValue()%></td>
            </tr>
        </table>
                    <h3>Producto con ID 3</h3>

                <table style="font-size: 20px" border="1" class="table">
            <tr>
                <td><b>ID</b></td>
                <td><%=producto.getId()%></td>
            </tr>
            <tr>
                <td><b>Código</b></td>
                <td><%=producto.getCode()%></td>
            </tr>
            <tr>
                <td><b>Descripción</b></td>
                <td><%=producto.getDescription()%></td>
            </tr>
            <tr>
                <td><b>Código de la bodega</b></td>
                <td><%=producto.getWarehouseid()%></td>
            </tr>
            <tr>
                <td><b>Valor del producto</b></td>
                <td><%=producto.getValue()%></td>
            </tr>
        </table>
                <% BigDecimal resultado = producto.getValue().multiply(paquete1.getValue()); %>
            <br>
            <h3>Solución</h3>
            <label>El valor del paquete con id=1 x el valor del producto con id=3 es : <%=resultado%> </label>
            <br> 
            <br>
            <b>Regresar al inicio <a class="btn btn-primary" href="inicio.jsp">Clic aquí</a></b><br><br>
    </centre></body>
</html>
