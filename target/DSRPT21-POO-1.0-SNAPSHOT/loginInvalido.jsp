<%--
  Created by IntelliJ IDEA.
  User: danilo
  Date: 2020-11-10
  Time: 22:01

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8" />
    <meta http-equiv="x-ua-compatible" content="ie-edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="./styles/flex.css">

    <title>ERROR</title>
</head>

<body>
<%
    session.invalidate();
%>
<div class="flex-container">
    <div class="Main">
        <div class="Header">
            <h1>Oops!</h1>
            <hr>
        </div> <!-- Fim da div Header -->
        <div class="Stucture">
            Parece que não encontramos seu cadastro!
            Por favor, contate um administrador.
            <div class="goBack">
                <br />
                <a id="link" href="index.html">Voltar</a>
            </div> <!-- Fim da div goBack -->
            </form>
        </div> <!-- Fim da div Structure -->
    </div> <!-- Fim da div Main -->
</div> <!-- Fim da div Flex-Container -->
</body>

</html>