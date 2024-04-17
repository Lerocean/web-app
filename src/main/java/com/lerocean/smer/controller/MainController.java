package com.lerocean.smer.controller;


import com.lerocean.smer.dto.DiaryRecordDTO;
import com.lerocean.smer.entity.DiaryRecord;
import com.lerocean.smer.service.DiaryService;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/diary")
public class MainController {
    private final DiaryService diaryService;

    public MainController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @GetMapping("/records")
    public List<DiaryRecord> getAllDiaryRecords() {
        return diaryService.getAllDiaryRecords();
    }

    @GetMapping("/records/{id}")
    public ResponseEntity<DiaryRecord> getDiaryRecordById(@PathVariable Long id) {
        DiaryRecord record = diaryService.getDiaryRecordById(id);
        return ResponseEntity.ok().body(record);
    }
    @PostMapping("/records")
    public ResponseEntity<DiaryRecord> createDiaryRecord(@RequestBody DiaryRecordDTO diaryRecordDTO) {
        DiaryRecord savedRecord = diaryService.saveDiaryRecord(diaryRecordDTO);
        return ResponseEntity.ok().body(savedRecord);
    }

    @PutMapping("/records/{id}")
    public ResponseEntity<DiaryRecord> updateDiaryRecord(@PathVariable Long id, @RequestBody DiaryRecordDTO diaryRecordDTO) {
        DiaryRecord updatedRecord = diaryService.updateDiaryRecord(id, diaryRecordDTO);
        return ResponseEntity.ok().body(updatedRecord);
    }

    @DeleteMapping("/records/{id}")
    public ResponseEntity<?> deleteDiaryRecord(@PathVariable Long id) {
        diaryService.deleteDiaryRecord(id);
        return ResponseEntity.ok().build();
    }
}



