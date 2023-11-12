package com.javarush.quest.mizilin.services;

import com.javarush.quest.mizilin.entity.QuestHouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestLogicTest {

    @Test
    void nextQuest() {
        QuestHouse questHouse = new QuestLogic().nextQuest("Начать новую игру");
        assertEquals(1,questHouse.getId());
    }
}