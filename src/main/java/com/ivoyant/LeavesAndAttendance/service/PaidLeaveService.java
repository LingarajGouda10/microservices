package com.ivoyant.LeavesAndAttendance.service;

import com.ivoyant.LeavesAndAttendance.Repository.PaidLeaveRepository;
import com.ivoyant.LeavesAndAttendance.model.PaidLeave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaidLeaveService {

    @Autowired
    private PaidLeaveRepository paidLeaveRepository;

    public PaidLeave upsertEmployeesinPaidLeave(PaidLeave paidLeave){
        return paidLeaveRepository.save(paidLeave);
    }

    public PaidLeave saveEmplyoeesinpaidLeave(PaidLeave paidLeave){
        return paidLeaveRepository.save(paidLeave);
    }

    public List<PaidLeave> getAllEmployeesOnPaidLeave(){
        return paidLeaveRepository.findAll();
    }

    public PaidLeave getEmployeesOnPaidLeaveById(int id){
        return paidLeaveRepository.findById(id).get();
    }

    public  String deleteEmployeeOnPaidLeaveById(int id){
         paidLeaveRepository.deleteById(id);
         return "deleted successfully" + id;
    }
}
