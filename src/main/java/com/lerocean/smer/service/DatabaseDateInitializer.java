package com.lerocean.smer.service;

import com.lerocean.smer.entity.DiaryRecord;
import com.lerocean.smer.repository.DiaryRecordsRepository;
import jakarta.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DatabaseDateInitializer {

    private final DiaryRecordsRepository diaryRecordsRepository;

    @PostConstruct
    public void addDataInDiaryTable() {
        List<DiaryRecord> diaryRecords = new ArrayList<>();

        DiaryRecord diaryRecord_1 = new DiaryRecord();
        diaryRecord_1.setDateTime(LocalDateTime.now());
        diaryRecord_1.setEvent("Консультация");
        diaryRecord_1.setAutomaticallyThought("Меня накажут за несделанную домашку");
        diaryRecord_1.setAction("иду на консультацию");
        diaryRecord_1.setAnswer("Я есть сама у себя и всегда на своей стороне.");
        diaryRecord_1.setDistortions("Катастрофизация");
        diaryRecord_1.setEmotion("страх");

        diaryRecords.add(diaryRecord_1);

        DiaryRecord diaryRecord_2 = new DiaryRecord();
        diaryRecord_2.setDateTime(LocalDateTime.now());
        diaryRecord_2.setEvent("Упал на улице");
        diaryRecord_2.setAutomaticallyThought("Я неудачник");
        diaryRecord_2.setAction("встаю и отряхиваюсь, матерюсь");
        diaryRecord_2.setAnswer("Все падают, главное встать");
        diaryRecord_2.setDistortions("Катастрофизация");
        diaryRecord_2.setEmotion("злость");

        diaryRecords.add(diaryRecord_2);

        DiaryRecord diaryRecord_3 = new DiaryRecord();
        diaryRecord_3.setDateTime(LocalDateTime.now());
        diaryRecord_3.setEvent("Обед с мамой");
        diaryRecord_3.setAutomaticallyThought("Сейчас меня отчитают, я совершенно беззащитна перед мамой");
        diaryRecord_3.setAction("Иду к мужу прошу поддержки");
        diaryRecord_3.setAnswer("Я не одна, у меня всегда есть поддержка, я могу выбирать у кого и как просить помощи");
        diaryRecord_3.setDistortions("Катастрофизация");
        diaryRecord_3.setEmotion("стыд");

        diaryRecords.add(diaryRecord_3);

        diaryRecordsRepository.saveAll(diaryRecords);
    }
}
