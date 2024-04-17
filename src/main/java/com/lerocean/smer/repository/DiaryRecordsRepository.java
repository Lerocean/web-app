package com.lerocean.smer.repository;

import com.lerocean.smer.entity.DiaryRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRecordsRepository extends JpaRepository<DiaryRecord, Long> {
}
