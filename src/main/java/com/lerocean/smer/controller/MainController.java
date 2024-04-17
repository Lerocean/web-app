package com.lerocean.smer.controller;


import com.lerocean.smer.dto.DiaryRecordDTO;
import com.lerocean.smer.entity.DiaryRecord;
import com.lerocean.smer.service.DiaryService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final DiaryService diaryService;

    public MainController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @GetMapping(value = "/")
    public Object getGreetings() {
        return "Welcome to SMER diary";
    }

    @GetMapping(value = "/getAllRecord")
    public List<DiaryRecord> getAllDiaryRecords() {
        return diaryService.getAllDiaryRecords();
    }


    @PostMapping(value = "/saveRecord")
    public DiaryRecord getAllDiaryRecords(@RequestBody DiaryRecordDTO diaryRecordDTO) {
        return diaryService.saveDiaryRecord(diaryRecordDTO);
    }

    @PostMapping(value = "/saveRecords")
    public List<DiaryRecord> getAllDiaryRecords(@RequestBody List<DiaryRecordDTO> diaryRecordDTOList) {
        return diaryService.saveDiaryRecords(diaryRecordDTOList);
    }
}
