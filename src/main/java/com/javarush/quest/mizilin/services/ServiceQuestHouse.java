package com.javarush.quest.mizilin.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javarush.quest.mizilin.entity.QuestHouse;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ServiceQuestHouse {

    private List<QuestHouse> questHouseList;

    public List<QuestHouse> getQuestHouseList() {
        initHouseList();
        return questHouseList;
    }

    public void initHouseList() {
        try {
            questHouseList = Arrays.asList(new ObjectMapper().readValue(new File(Objects.requireNonNull(ServiceQuestHouse.class
                    .getClassLoader().getResource("forestHouseQuest.json")).getFile()), QuestHouse[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public QuestHouse startQuest() {
        return getQuestHouseList().get(0);
    }
    }


