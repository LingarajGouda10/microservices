package com.ivoyant.LeavesAndAttendance.controller;

import com.ivoyant.LeavesAndAttendance.model.Present;
import com.ivoyant.LeavesAndAttendance.model.SickLeave;
import com.ivoyant.LeavesAndAttendance.service.PresentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PresentController {

    @Autowired
    private PresentService presentService;

    @PostMapping("/employeesPresent")
    public Present addEmployeesPresent(@RequestBody Present present) {
        return presentService.saveEmployeesPresent(present);
    }

    @PutMapping("/employeesPresent")
    public Present updateEmployeesPresent(@RequestBody Present present){
        return  presentService.upsertEmployeesPresent(present);
    }

    @GetMapping("/employeesPresent")
    public List<Present> getAllEmployeesPresent(){
        return presentService.getAllEmployeesPresent();
    }

    @GetMapping("/employeesPresent/{id}")
    public Present getEmployeesPresentById(@PathVariable int id){
        return presentService.getEmployeesPresenteById(id);
    }

    @DeleteMapping("/employeesPresent/{id}")
    public String deleteEmployeesPresentById(@PathVariable int id){
        presentService.deleteEmployeePresentById(id);
        return "deleted successfully" + id;
    }
}
