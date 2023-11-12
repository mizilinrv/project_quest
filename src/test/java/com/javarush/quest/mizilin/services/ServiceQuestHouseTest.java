package com.javarush.quest.mizilin.services;

import com.javarush.quest.mizilin.entity.QuestHouse;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiceQuestHouseTest {

    @Test
    void startQuest() {
        QuestHouse questHouse = new ServiceQuestHouse().startQuest();
        assertEquals(0, questHouse.getId());
    }

    @Test
    void getQuestHouseList() {
        List<QuestHouse> questHouseList = new ServiceQuestHouse().getQuestHouseList();
        assertEquals(11, questHouseList.size());
    }
}