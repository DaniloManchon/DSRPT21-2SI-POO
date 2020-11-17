<%@ page import="dao.PistasDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Pistas" %><%--
  Created by IntelliJ IDEA.
  User: danil
  Date: 2020-11-17
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jogar</title>
</head>
<body>
<%
    PistasDAO dao = new PistasDAO();
    List<Pistas> lista = (List<Pistas>) dao.listarPistas();
    
%>
</body>
</html>
