package com.ivoyant.EmployeeDetails.service;

import com.ivoyant.EmployeeDetails.model.EmployeeDetails;
import com.ivoyant.EmployeeDetails.repository.EmployeeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplyoeeDetailsService {

    @Autowired
    private EmployeeDetailsRepository employeeDetailsRepository;

    public EmployeeDetails upsertEmployeeDetails(EmployeeDetails employeeDetails) {
        return employeeDetailsRepository.save(employeeDetails);
    }

    public EmployeeDetails saveEmployeeDetails(EmployeeDetails employeeDetails) {
        return employeeDetailsRepository.save(employeeDetails);
    }

    public List<EmployeeDetails> getAllEmployeeDetails() {
        return employeeDetailsRepository.findAll();
    }

    public EmployeeDetails getEmployeeDetailsById(int id) {
        return employeeDetailsRepository.findById(id).get();
    }

    public String deleteEmployeeById(int id) {
        employeeDetailsRepository.deleteById(id);
        return "Deleted Successfully" + id;
    }
}
