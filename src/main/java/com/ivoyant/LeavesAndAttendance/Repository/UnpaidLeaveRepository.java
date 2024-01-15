package com.ivoyant.LeavesAndAttendance.Repository;

import com.ivoyant.LeavesAndAttendance.model.UnpaidLeave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnpaidLeaveRepository extends JpaRepository<UnpaidLeave,Integer> {
}
