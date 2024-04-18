package com.lerocean.smer.service;

import com.lerocean.smer.dto.DiaryRecordDTO;
import com.lerocean.smer.entity.DiaryRecord;
import com.lerocean.smer.repository.DiaryRecordsRepository;
import jakarta.persistence.EntityNotFoundException;
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

    public DiaryRecord getDiaryRecordById(Long id) {
        return recordsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Diary Record not found with id " + id));
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

    public DiaryRecord updateDiaryRecord(Long id, DiaryRecordDTO diaryRecordDTO) {
        DiaryRecord existingRecord = getDiaryRecordById(id);

        existingRecord.setEvent(diaryRecordDTO.getEvent());
        existingRecord.setAutomaticallyThought(diaryRecordDTO.getAutomaticallyThought());
        existingRecord.setEmotion(diaryRecordDTO.getEmotion());
        existingRecord.setAction(diaryRecordDTO.getAction());
        existingRecord.setDistortions(diaryRecordDTO.getDistortions());
        existingRecord.setAnswer(diaryRecordDTO.getAnswer());
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