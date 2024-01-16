package com.ivoyant.LeavesAndAttendance.Repository;

import com.ivoyant.LeavesAndAttendance.model.PaidLeave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaidLeaveRepository extends JpaRepository<PaidLeave,Integer> {
}
