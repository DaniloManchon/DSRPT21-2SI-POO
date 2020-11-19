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
    <style>
        table, th, tr, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
    <script>
        var a = ["0","1"];
        var b = [];
        function isEqual() {
            // if length is not equal
            if(a.length!=b.length)
                return false;
            else
            {
                // comapring each element of array
                for(var i=0;i<a.length;i++)
                    if(a[i]!=b[i])
                        return false;
                return true;
            }
        }
        var v = isEqual();
        function goTO(){
            if (isEqual() === true){
                window.location.href = "resultado.jsp";
            }else{
                alert("Droga... Não foi dessa vez! :(");
            }
        }
        function restart(){
            while(b.length > 0) {
                b.pop();
            }
        }
    </script>
</head>
<body>
<button onclick="goTO()" value="check">Check</button>
<button onclick="restart()" value="restart">Restart</button>
<br />
<br />
    <%
    PistasDAO dao = new PistasDAO();
    List<Pistas> lista = dao.listarPistas();
    int i = 0;
    int j = 0;
        for (Pistas pista : lista ) {
    %>
    <button id='<%=i++ %>' value='<%=j++ %>' onclick="b.push(value)"> <%=pista.getNome() %> </button>
    <%
        }
    %>
    <br />
    <br />
<table>
    <caption><h2>Tabela de Informações</h2></caption>
    <tr>
        <th>Latitude: </th>
        <th>Longitude: </th>
        <th>Elevação: </th>
        <th>Nome: </th>
        <th>Cidade: </th>
        <th>Pais: </th>
        <th>Info: </th>
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
