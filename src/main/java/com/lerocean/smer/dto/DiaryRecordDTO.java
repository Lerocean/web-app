package com.lerocean.smer.dto;


import lombok.Data;

@Data
public class DiaryRecordDTO {
    private String event;
    private String automaticallyThought;
    private String emotion;
    private String action;
    private String distortions;
    private String answer;
}
