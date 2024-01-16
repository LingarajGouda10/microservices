package com.ivoyant.LeavesAndAttendance.Repository;

import com.ivoyant.LeavesAndAttendance.model.Present;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresentRepository extends JpaRepository<Present,Integer> {
}
