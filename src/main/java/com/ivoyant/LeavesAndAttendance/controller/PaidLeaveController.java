package com.ivoyant.LeavesAndAttendance.controller;

import com.ivoyant.LeavesAndAttendance.model.PaidLeave;
import com.ivoyant.LeavesAndAttendance.service.PaidLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaidLeaveController {

    @Autowired
    private PaidLeaveService paidLeaveService;

    @PostMapping("/employeesOnPaidLeave")
    public PaidLeave addEmplyoeesOnPaidLeave(@RequestBody PaidLeave paidLeave){
        return  paidLeaveService.saveEmplyoeesinpaidLeave(paidLeave);
    }

    @PutMapping("/employeesOnPaidLeave")
    public PaidLeave updateEmployeesOnPaidLeave(@RequestBody PaidLeave paidLeave){
        return  paidLeaveService.upsertEmployeesinPaidLeave(paidLeave);
    }

    @GetMapping("/employeesOnPaidLeave")
    public List<PaidLeave> getAllEmployeesOnPaidLeave(){
        return paidLeaveService.getAllEmployeesOnPaidLeave();
    }

    @GetMapping("/employeesOnPaidLeave/{id}")
    public PaidLeave getEmployeesOnPaidLeaveById(@PathVariable int id){
        return paidLeaveService.getEmployeesOnPaidLeaveById(id);
    }

    @DeleteMapping("/employeesOnPaidLeave/{id}")
    public String deleteEmployeesOnPaidLeaveById(@PathVariable int id){
        paidLeaveService.deleteEmployeeOnPaidLeaveById(id);
        return "deleted successfully" + id;
    }


}
