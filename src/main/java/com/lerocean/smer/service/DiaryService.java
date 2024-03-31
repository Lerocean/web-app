package com.lerocean.smer.service;

import com.lerocean.smer.model.DiaryRecord;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DiaryService {
    public List<DiaryRecord> getAllDiaryRecords() {
        ArrayList<DiaryRecord> diaryRecords = new ArrayList<>();

//        DiaryRecord diaryRecord = new DiaryRecord();
//                diaryRecord.setDateTime(LocalDateTime.now());
//        diaryRecord.setEvent("Консультация");
//        diaryRecord.setAutomaticallyThought("Меня накажут за несделанную домашку");
//        diaryRecord.setAction("иду на консультацию");
//        diaryRecord.setAnswer("Я есть сама у себя и всегда на своей стороне.");
//        diaryRecord.setDistortions("Катастрофизация");
//        diaryRecord.setEmotion("страх");
//
//        diaryRecords.add(diaryRecord);


        diaryRecords.add(DiaryRecord.builder()
                .dateTime(LocalDateTime.now())
                .event("Консультация")
                .automaticallyThought("Меня накажут за несделанную домашку")
                .action("иду на консультацию")
                .answer("Я есть сама у себя и всегда на своей стороне.")
                .distortions("Катастрофизация")
                .emotion("страх")
                .build());

        diaryRecords.add(DiaryRecord.builder()
                .dateTime(LocalDateTime.now())
                .event("Упал на улице")
                .automaticallyThought("Я неудачник")
                .action("встаю и отряхиваюсь, матерюсь")
                .answer("Все падают, главное встать")
                .distortions("Катастрофизация")
                .emotion("злость")
                .build());

        diaryRecords.add(DiaryRecord.builder()
                .dateTime(LocalDateTime.now())
                .event("Обед с мамой")
                .automaticallyThought("Сейчас меня отчитают, я совершенно беззащитна перед мамой")
                .action("Иду к мужу прошу поддержки")
                .answer("Я не одна, у меня всегда есть поддержка, я могу выбирать у кого и как просить помощи")
                .distortions("Катастрофизация")
                .emotion("стыд")
                .build());


        return diaryRecords;
    }

}
