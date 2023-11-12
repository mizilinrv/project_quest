
<%@ page import="com.javarush.quest.mizilin.entity.QuestHouse" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Дом В лесу</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body class="mainBody">

<% QuestHouse questHouse = (QuestHouse) request.getAttribute("currentQuest");%>

<div class="mainText">

<%=questHouse.getQuestText()%>

<% if (questHouse.getId() == 0) { %>
<form action="/controller" method="get">
    <input class="input" placeholder="Введите имя" type="text" name="userName" >
    <p><input class="newGame" type="submit" name="currentAnswer" value="Начать новую игру"></p>
</form>

<% } %>

    <div class="leftButton">
        <% if (questHouse.getId() > 0)  { %>
        <form action="/controller" method="get">
            <button class="leftButtonStyle" name="currentAnswer" value="<%=questHouse.getLeftButtonText()%>"><%=questHouse.getLeftButtonText()%></button>
        </form>
        <% } %>
    </div>

    <div class="rightButton">
        <% if ((questHouse.getId()) > 0 && (questHouse.getId()) < 8) { %>
        <form action="/controller" method="get">
            <button class="rightButtonStyle" name="currentAnswer" value="<%=questHouse.getRightButtonText()%>"><%=questHouse.getRightButtonText()%></button>
        </form>
        <% } %>
    </div>

    <div class="changePlayer">
        <% if (questHouse.getId() > 0)  { %>
        <form action="/restart" method="get">
            <button class="changePlayerStyle">Сменить игрока</button>
        </form>
        <% } %>
    </div>
    <div class="userName">
        <% if (questHouse.getId() > 0)  { %>
        <%String username = session.getAttribute("nameUser").toString();%>
        <% session.setAttribute("nameUser", username);%>
        <h2><%=username%></h2>
        <% } %>
    </div>
</div>

<% session.setAttribute("currentQuest", questHouse);%>

</body>

</html>
