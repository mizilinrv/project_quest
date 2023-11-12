package com.javarush.quest.mizilin.servlets;


import com.javarush.quest.mizilin.entity.QuestHouse;
import com.javarush.quest.mizilin.services.QuestLogic;
import com.javarush.quest.mizilin.services.ServiceQuestHouse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet(name = "ControllerServlet", value = "/controller")
public class ControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("userName");
        HttpSession session = req.getSession();
        QuestHouse currentQuest = (QuestHouse) session.getAttribute("currentQuest");
        if(currentQuest.getId() == 0) {
            session.setAttribute("nameUser", name);
        }
        String currentAnswer = req.getParameter("currentAnswer");
        QuestHouse nextQuest = new QuestLogic().nextQuest(currentAnswer);
        System.out.println(nextQuest.getId());
        req.setAttribute("currentQuest", nextQuest);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/index.jsp");
        requestDispatcher.forward(req,resp);
    }

}
