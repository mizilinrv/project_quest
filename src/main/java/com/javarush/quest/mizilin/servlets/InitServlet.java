package com.javarush.quest.mizilin.servlets;


import com.javarush.quest.mizilin.entity.QuestHouse;
import com.javarush.quest.mizilin.services.ServiceQuestHouse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "InitServlet", value = "/start")
public class InitServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        QuestHouse quest = new ServiceQuestHouse().startQuest();
        req.setAttribute("currentQuest", quest);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/index.jsp");
        requestDispatcher.forward(req,resp);
    }
}
