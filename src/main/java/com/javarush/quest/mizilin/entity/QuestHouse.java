package com.javarush.quest.mizilin.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect
public class QuestHouse {
    private int id;
    private String questText;

    private String leftButtonText;
    private String rightButtonText;

    public QuestHouse(){}

    public int getId() {
        return id;
    }
    public String getQuestText() {
        return questText;
    }

    public String getLeftButtonText() {
        return leftButtonText;
    }

    public String getRightButtonText() {
        return rightButtonText;
    }
}
