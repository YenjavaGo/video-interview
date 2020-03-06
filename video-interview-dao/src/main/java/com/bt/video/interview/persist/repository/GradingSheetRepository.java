package com.bt.video.interview.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bt.video.interview.persist.entity.GradingSheet;

@Repository
public interface GradingSheetRepository extends JpaRepository<GradingSheet, Long> {

}
