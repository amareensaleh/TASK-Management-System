package com.ios.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ios.backend.entities.TaskRecord;

@Repository
public interface TaskRecordRepository extends JpaRepository<TaskRecord, Long> {

  @Query("SELECT t FROM TaskRecord t WHERE t.uid=:id")
  List<TaskRecord> getTaskRecordByUser(@Param("id") long uid);
  
  List<TaskRecord> findByPidAndUid(long program, long uid);
  
  TaskRecord findByPidAndUidAndTask(long program, long user, long task);
}
