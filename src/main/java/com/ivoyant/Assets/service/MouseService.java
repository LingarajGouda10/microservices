package com.ivoyant.Assets.service;

import com.ivoyant.Assets.model.Mouse;
import com.ivoyant.Assets.repository.MouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MouseService {

    @Autowired
    private MouseRepository mouseRepository;


    public Mouse upsertMouse(Mouse mouse){
        return mouseRepository.save(mouse);
    }

    public Mouse saveMouse(Mouse mouse){
        return mouseRepository.save(mouse);
    }

    public List<Mouse> getAllMouses(){
        return mouseRepository.findAll();
    }

    public Mouse getMouseById(int id){
        return mouseRepository.findById(id).get();
    }

    public String deleteMouseById(int id){
        mouseRepository.deleteById(id);
        return "deleted successfully"+ id;
    }
}
