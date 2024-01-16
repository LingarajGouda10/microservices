package com.ivoyant.EmployeeDetails.controller;

import com.ivoyant.EmployeeDetails.model.EmployeeDetails;
import com.ivoyant.EmployeeDetails.service.EmplyoeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmplyoeeDetailsController {

    @Autowired
    private EmplyoeeDetailsService emplyoeeDetailsService;

    @PostMapping("/employeeDetails")
    public EmployeeDetails employeeDetails(@RequestBody EmployeeDetails employeeDetails) {
        return emplyoeeDetailsService.saveEmployeeDetails(employeeDetails);
    }

    @PutMapping("/employeeDetails")
    public EmployeeDetails updateEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) {
        return emplyoeeDetailsService.upsertEmployeeDetails(employeeDetails);
    }

    @GetMapping("/allEmployeeDetails")
    public List<EmployeeDetails> getAllEmployeeDetails() {
        return emplyoeeDetailsService.getAllEmployeeDetails();
    }

    @GetMapping("/employeeDetails/{id}")
    public EmployeeDetails getEmployeeDetailslOnId(@PathVariable int id) {
        return emplyoeeDetailsService.getEmployeeDetailsById(id);
    }

    @DeleteMapping("employeeDetails/{id}")
    public String deleteEmployeeDetails(@PathVariable int id) {
        return emplyoeeDetailsService.deleteEmployeeById(id);
    }
}
