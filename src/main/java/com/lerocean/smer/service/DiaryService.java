package com.lerocean.smer.service;

import com.lerocean.smer.dto.DiaryRecordDTO;
import com.lerocean.smer.entity.DiaryRecord;
import com.lerocean.smer.repository.DiaryRecordsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DiaryService {
    private final DiaryRecordsRepository recordsRepository;

    public List<DiaryRecord> getAllDiaryRecords() {
        return recordsRepository.findAll();
    }

    public DiaryRecord getDiaryRecordById(Long id) {
        return recordsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Diary Record not found with id " + id));
    }

    public DiaryRecord saveDiaryRecord(DiaryRecordDTO diaryRecordDTO) {
        DiaryRecord diaryRecord = getDiaryRecordFromDto(diaryRecordDTO);
        return recordsRepository.save(diaryRecord);
    }

    public DiaryRecord updateDiaryRecord(Long id, DiaryRecordDTO diaryRecordDTO) {
        DiaryRecord existingRecord = getDiaryRecordById(id);
        DiaryRecord updatedRecord = getDiaryRecordFromDto(diaryRecordDTO);
        existingRecord.setEvent(updatedRecord.getEvent());
        existingRecord.setAutomaticallyThought(updatedRecord.getAutomaticallyThought());
        existingRecord.setEmotion(updatedRecord.getEmotion());
        existingRecord.setAction(updatedRecord.getAction());
        existingRecord.setDistortions(updatedRecord.getDistortions());
        existingRecord.setAnswer(updatedRecord.getAnswer());
        return recordsRepository.save(existingRecord);
    }

    public void deleteDiaryRecord(Long id) {
        recordsRepository.deleteById(id);
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