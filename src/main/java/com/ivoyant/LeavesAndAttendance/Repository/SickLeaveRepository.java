package com.ivoyant.LeavesAndAttendance.Repository;

import com.ivoyant.LeavesAndAttendance.model.SickLeave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SickLeaveRepository extends JpaRepository<SickLeave,Integer> {
}
