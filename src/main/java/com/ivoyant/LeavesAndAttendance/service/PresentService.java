package com.ivoyant.LeavesAndAttendance.service;

import com.ivoyant.LeavesAndAttendance.Repository.PresentRepository;
import com.ivoyant.LeavesAndAttendance.model.Present;
import com.ivoyant.LeavesAndAttendance.model.SickLeave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresentService {

    @Autowired
    private PresentRepository presentRepository;

    public Present upsertEmployeesPresent(Present present){
        return presentRepository.save(present);
    }

    public Present saveEmployeesPresent(Present present){
        return presentRepository.save(present);
    }

    public List<Present> getAllEmployeesPresent(){
        return presentRepository.findAll();
    }

    public Present getEmployeesPresenteById(int id){
        return presentRepository.findById(id).get();
    }

    public  String deleteEmployeePresentById(int id){
        presentRepository.deleteById(id);
        return "deleted successfully" + id;
    }
}
