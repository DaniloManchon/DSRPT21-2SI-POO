<%@ page import="dao.PistasDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Pistas" %>
<%--
  Created by IntelliJ IDEA.
  User: danil
  Date: 2020-11-17
  Time: 17:41
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jogar</title>
</head>
<body>
    <%
    PistasDAO dao = new PistasDAO();
    List<Pistas> lista = dao.listarPistas();
    %>
    <%
        for (Pistas pista : lista ) {
    %>
    <button><%=pista.getNome() %></button>
    <%
        }
    %>
    <br /> <br />
<table border="black"> Tabelo
    <tr>
        <td>Latitude: </td>
        <td>Longitude: </td>
        <td>Elevação: </td>
        <td>Nome: </td>
        <td>Cidade: </td>
        <td>Pais: </td>
        <td>Info: </td>
    </tr>
    <%
        for (Pistas pista : lista ) {
    %>
    <tr>
        <td><%=pista.getLatitude() %></td>
        <td><%=pista.getLongitude() %></td>
        <td><%=pista.getElevacao() %></td>
        <td><%=pista.getNome() %></td>
        <td><%=pista.getCidade() %></td>
        <td><%=pista.getPais() %></td>
        <td><%=pista.getInfo() %></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
