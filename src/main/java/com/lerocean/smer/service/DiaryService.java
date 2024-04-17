package com.lerocean.smer.service;

import com.lerocean.smer.dto.DiaryRecordDTO;
import com.lerocean.smer.entity.DiaryRecord;
import com.lerocean.smer.repository.DiaryRecordsRepository;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiaryService {
    private final DiaryRecordsRepository recordsRepository;

    public List<DiaryRecord> getAllDiaryRecords() {
        return recordsRepository.findAll();
    }

    public DiaryRecord saveDiaryRecord(DiaryRecordDTO diaryRecordDTO) {
        DiaryRecord diaryRecord = getDiaryRecordFromDto(diaryRecordDTO);
        return recordsRepository.save(diaryRecord);
    }

    public List<DiaryRecord> saveDiaryRecords(List<DiaryRecordDTO> diaryRecordDTOList) {
        ArrayList<DiaryRecord> diaryRecordsToSave = new ArrayList<>();
        for (DiaryRecordDTO diaryRecordDTO : diaryRecordDTOList) {
            diaryRecordsToSave.add(getDiaryRecordFromDto(diaryRecordDTO));
        }

        return recordsRepository.saveAll(diaryRecordsToSave);
    }

    private DiaryRecord getDiaryRecordFromDto(DiaryRecordDTO diaryRecordDTO) {
        DiaryRecord diaryRecord = new DiaryRecord();
        diaryRecord.setDateTime(LocalDateTime.now());
        diaryRecord.setEvent(diaryRecordDTO.getEvent());
        diaryRecord.setAutomaticallyThought(diaryRecordDTO.getAutomaticallyThought());
        diaryRecord.setEmotion(diaryRecordDTO.getEmotion());
        diaryRecord.setAction(diaryRecordDTO.getAction());
        diaryRecord.setDistortions(diaryRecordDTO.getDistortions());
        diaryRecord.setAnswer(diaryRecordDTO.getAnswer());
        return diaryRecord;
    }
}
