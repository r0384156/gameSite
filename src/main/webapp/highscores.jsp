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
                <td>name</td>
                <td>weight</td>
                <td>length</td>
                <td>notes</td>
            </tr>
            </thead>
            <tbody>
            <%for(GamersScore s : (ArrayList<GamersScore>)request.getAttribute("lijst")){ int i=0;%>
            <tr>
                <td id="testName<%=i%>"><%= s.getName()%></td>
                <td id="testWeight<%=i%>"><%= s.getWeight()%>kg</td>
                <td id="testLength<%=i%>"><%= s.getLength()%>cm</td>
                <td id="testNotes<%=i%>"><%= s.getNotes()%></td>
            </tr>
            <%i++;} %>
            </tbody>
        </table>
        <p>
            <a href="ArmorySubmission.jsp">Submit new sword</a>
        </p>
    </article>
</main>
</body>
</html>
