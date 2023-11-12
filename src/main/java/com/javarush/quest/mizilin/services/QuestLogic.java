package com.javarush.quest.mizilin.services;

import com.javarush.quest.mizilin.entity.QuestHouse;
import java.util.List;

public class QuestLogic {


    public QuestHouse nextQuest(String currentAnswer) {
        QuestHouse nextQuest = null;
        List<QuestHouse> questsList = new ServiceQuestHouse().getQuestHouseList();
        switch (currentAnswer) {
            case ("Начать новую игру"):
                nextQuest = questsList.get(1);
                break;
            case ("Открыть дверь"):
                nextQuest = questsList.get(2);
                break;
            case ("Поесть из холодильника"):
                nextQuest = questsList.get(3);
                break;
            case ("Встретить и поговорить"):
                nextQuest = questsList.get(4);
                break;
            case ("Дождаться хозяина"):
                nextQuest = questsList.get(5);
                break;
            case ("Уйти в лес"):
                nextQuest = questsList.get(6);
                break;
            case ("Найти еду"):
                nextQuest = questsList.get(7);
                break;
            case ("Съесть ягоды"):
                nextQuest = questsList.get(8);
                break;
            case ("Съесть грибы"):
                nextQuest = questsList.get(9);
                break;
            case ("Продолжить ходить по лесу"):
                nextQuest = questsList.get(10);
                break;
            case ("Убежать в лес"):
                nextQuest = questsList.get(6);
                break;
        }
        return nextQuest;
    }
}
