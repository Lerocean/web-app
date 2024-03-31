package com.lerocean.smer.model;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class DiaryRecord {
    private LocalDateTime dateTime;
    private String event;
    private String automaticallyThought;
    private String emotion;
    private String action;
    private String distortions;
    private String answer;
}
