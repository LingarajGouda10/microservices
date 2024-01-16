package com.ivoyant.LeavesAndAttendance.controller;

import com.ivoyant.LeavesAndAttendance.model.PaidLeave;
import com.ivoyant.LeavesAndAttendance.model.UnpaidLeave;
import com.ivoyant.LeavesAndAttendance.service.UnpaidLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UnpaidLeaveController {

    @Autowired
    private UnpaidLeaveService unpaidLeaveService;

    @PostMapping("/employeesOnUnpaidLeave")
    public UnpaidLeave addEmplyoeesOnPaidLeave(@RequestBody UnpaidLeave  unpaidLeave){
        return  unpaidLeaveService.saveEmplyoeesonUnpaidLeave(unpaidLeave);
    }

    @PutMapping("/employeesOnUnpaidLeave")
    public UnpaidLeave  updateEmployeesOnPaidLeave(@RequestBody UnpaidLeave  unpaidLeave){
        return  unpaidLeaveService.upsertEmployeesonUnpaidLeave(unpaidLeave);
    }

    @GetMapping("/employeesOnUnpaidLeave")
    public List<UnpaidLeave > getAllEmployeesOnPaidLeave(){
        return unpaidLeaveService.getAllEmployeesOnUnpaidLeave();
    }

    @GetMapping("/employeesOnUnpaidLeave/{id}")
    public UnpaidLeave  getEmployeesOnPaidLeaveById(@PathVariable int id){
        return unpaidLeaveService.getEmployeesOnUnpaidLeaveById(id);
    }

    @DeleteMapping("/employeesOnUnpaidLeave/{id}")
    public String deleteEmployeesOnPaidLeaveById(@PathVariable int id){
        unpaidLeaveService.deleteEmployeeOnUnpaidLeaveById(id);
        return "deleted successfully" + id;
    }
}
