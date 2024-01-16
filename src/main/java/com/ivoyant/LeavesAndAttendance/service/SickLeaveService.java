package com.ivoyant.LeavesAndAttendance.service;

import com.ivoyant.LeavesAndAttendance.Repository.SickLeaveRepository;
import com.ivoyant.LeavesAndAttendance.model.PaidLeave;
import com.ivoyant.LeavesAndAttendance.model.SickLeave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SickLeaveService {

    @Autowired
    private SickLeaveRepository sickLeaveRepository;

    public SickLeave upsertEmployeesonSickLeave(SickLeave sickLeave){
        return sickLeaveRepository.save(sickLeave);
    }

    public SickLeave saveEmplyoeesonSickLeave(SickLeave sickLeave){
        return sickLeaveRepository.save(sickLeave);
    }

    public List<SickLeave> getAllEmployeesOnSickLeave(){
        return sickLeaveRepository.findAll();
    }

    public SickLeave getEmployeesOnSickLeaveById(int id){
        return sickLeaveRepository.findById(id).get();
    }

    public  String deleteEmployeeOnSickLeaveById(int id){
        sickLeaveRepository.deleteById(id);
        return "deleted successfully" + id;
    }
}
