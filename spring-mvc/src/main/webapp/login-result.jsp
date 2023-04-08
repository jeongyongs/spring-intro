<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">

    <title>Login</title>
</head>
<body>
<div class="container">
    <header>
        <h1>Spring Web MVC</h1>
    </header>
    <main role="main">
        <div class="window">
            <h2>Login</h2>
            <p>${result}</p>
            <%="<p>" + (session.getAttribute("user") != null ? session.getAttribute("user") : "-") + "</p>"%>
            <%
                for (Cookie cookie : request.getCookies()) {
                    if (cookie.getName().equals("color")) {
            %>
            <p><%= cookie.getValue() %></p>
            <%
                    }
                }
            %>
        </div>
    </main>
    <footer>
        <p>Copyright(c)Jeongyongs. All rights reserved.</p>
    </footer>
</div>
</body>
</html>