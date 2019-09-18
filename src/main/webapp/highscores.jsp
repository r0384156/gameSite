<%@ page import="be.multimedi.gameSite.GamersScore" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Rombout
  Date: 18/09/2019
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>gameSite|Highscores</title>
</head>
<body>
<header>
    <nav>
        <ul>
            <li><a href="IndexServlet?page=home">Home</a></li>
            <li><a href="IndexServlet?page=highscores">Highscores</a></li>
        </ul>
    </nav>
</header>
<main>
    <article>
        <p>
            <a href="IndexServlet?page=home">Home</a>
        </p>

        <h2>Highscores</h2>
        <table>
            <thead>
            <tr>
                <td>    </td>
                <td>voornaam</td>
                <td>naam</td>
                <td>score</td>
                <td>playtime</td>
                <td>datum</td>
            </tr>
            </thead>
            <tbody>
            <%for(GamersScore s : (ArrayList<GamersScore>)request.getAttribute("lijst")){%>
            <tr>
                <td><%= s.getId()%></td>
                <td><%= s.getGamersVoornaam()%></td>
                <td><%= s.getGamersNaam()%></td>
                <td><%= s.getGamersScore()%></td>
                <td><%= s.getGamersPlaytime()%></td>
                <td><%= s.getGamersDatum()%></td>
            </tr>
            <% } %>
            </tbody>
        </table>
    </article>
</main>
</body>
</html>
