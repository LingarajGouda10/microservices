package com.ivoyant.LeavesAndAttendance.controller;

import com.ivoyant.LeavesAndAttendance.model.PaidLeave;
import com.ivoyant.LeavesAndAttendance.model.SickLeave;
import com.ivoyant.LeavesAndAttendance.service.SickLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SickLeaveController {

    @Autowired
    private SickLeaveService sickLeaveService;

    @PostMapping("/employeesOnSickLeave")
    public SickLeave addEmplyoeesOnPaidLeave(@RequestBody SickLeave sickLeave) {
        return sickLeaveService.saveEmplyoeesonSickLeave(sickLeave);
    }

    @PutMapping("/employeesOnSickLeave")
    public SickLeave updateEmployeesOnPaidLeave(@RequestBody SickLeave sickLeave){
        return  sickLeaveService.upsertEmployeesonSickLeave(sickLeave);
    }

    @GetMapping("/employeesOnSickLeave")
    public List<SickLeave> getAllEmployeesOnPaidLeave(){
        return sickLeaveService.getAllEmployeesOnSickLeave();
    }

    @GetMapping("/employeesOnSickLeave/{id}")
    public SickLeave getEmployeesOnPaidLeaveById(@PathVariable int id){
        return sickLeaveService.getEmployeesOnSickLeaveById(id);
    }

    @DeleteMapping("/employeesOnSickLeave/{id}")
    public String deleteEmployeesOnPaidLeaveById(@PathVariable int id){
        sickLeaveService.deleteEmployeeOnSickLeaveById(id);
        return "deleted successfully" + id;
    }
}
