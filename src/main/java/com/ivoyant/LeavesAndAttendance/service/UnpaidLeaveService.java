package com.ivoyant.LeavesAndAttendance.service;

import com.ivoyant.LeavesAndAttendance.Repository.UnpaidLeaveRepository;
import com.ivoyant.LeavesAndAttendance.model.PaidLeave;
import com.ivoyant.LeavesAndAttendance.model.UnpaidLeave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnpaidLeaveService {

    @Autowired
    private UnpaidLeaveRepository unpaidLeaveRepository;

    public UnpaidLeave upsertEmployeesonUnpaidLeave(UnpaidLeave unpaidLeave){
        return unpaidLeaveRepository.save(unpaidLeave);
    }

    public UnpaidLeave saveEmplyoeesonUnpaidLeave(UnpaidLeave unpaidLeave){
        return unpaidLeaveRepository.save(unpaidLeave);
    }

    public List<UnpaidLeave> getAllEmployeesOnUnpaidLeave(){
        return unpaidLeaveRepository.findAll();
    }

    public UnpaidLeave getEmployeesOnUnpaidLeaveById(int id){
        return unpaidLeaveRepository.findById(id).get();
    }

    public  String deleteEmployeeOnUnpaidLeaveById(int id){
        unpaidLeaveRepository.deleteById(id);
        return "deleted successfully" + id;
    }
}
