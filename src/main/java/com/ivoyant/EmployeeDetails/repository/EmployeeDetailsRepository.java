package com.ivoyant.EmployeeDetails.repository;

import com.ivoyant.EmployeeDetails.model.EmployeeDetails;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer> {
}
