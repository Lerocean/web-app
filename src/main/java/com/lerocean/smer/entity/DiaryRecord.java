package com.lerocean.smer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "diary_records")
@NoArgsConstructor
public class DiaryRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date_time")
    private LocalDateTime dateTime;
    private String event;
    @Column(name = "automatically_thought")
    private String automaticallyThought;
    private String emotion;
    private String action;
    private String distortions;
    private String answer;
}