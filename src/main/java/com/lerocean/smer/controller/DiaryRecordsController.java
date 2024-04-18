package com.lerocean.smer.controller;


import com.lerocean.smer.dto.DiaryRecordDTO;
import com.lerocean.smer.entity.DiaryRecord;
import com.lerocean.smer.service.DiaryService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diary/records")
public class DiaryRecordsController {
    private final DiaryService diaryService;

    public DiaryRecordsController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @GetMapping("/")
    public List<DiaryRecord> getAllDiaryRecords() {
        return diaryService.getAllDiaryRecords();
    }

    @GetMapping("/find/{id}")
    public DiaryRecord getDiaryRecordById(@PathVariable Long id) {
        return diaryService.getDiaryRecordById(id);
    }

    @PostMapping("/create")
    public DiaryRecord createDiaryRecord(@RequestBody DiaryRecordDTO diaryRecordDTO) {
        return diaryService.saveDiaryRecord(diaryRecordDTO);
    }

    @PostMapping(value = "/create/list")
    public List<DiaryRecord> getAllDiaryRecords(@RequestBody List<DiaryRecordDTO> diaryRecordDTOList) {
        return diaryService.saveDiaryRecords(diaryRecordDTOList);
    }

    @PutMapping("/update/{id}")
    public DiaryRecord updateDiaryRecord(@PathVariable Long id, @RequestBody DiaryRecordDTO diaryRecordDTO) {
        return diaryService.updateDiaryRecord(id, diaryRecordDTO);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDiaryRecord(@PathVariable Long id) {
        diaryService.deleteDiaryRecord(id);
        return ResponseEntity.ok().build();
    }

}



