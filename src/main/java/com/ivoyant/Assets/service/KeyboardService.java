package com.ivoyant.Assets.service;

import com.ivoyant.Assets.model.Keyboard;
import com.ivoyant.Assets.repository.KeyboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyboardService {

    @Autowired
    private KeyboardRepository keyboardRepository;

    public Keyboard upsertKeyboard(Keyboard keyboard){
        return keyboardRepository.save(keyboard);
    }

    public Keyboard saveKeyboard(Keyboard keyboard){
        return keyboardRepository.save(keyboard);
    }

    public List<Keyboard> getAllkeyboards(){
        return keyboardRepository.findAll();
    }

    public  Keyboard getKeyboardById(int id){
        return keyboardRepository.findById(id).get();
    }

    public String deleteKeyboardById(int id){
        keyboardRepository.deleteById(id);
        return "deleted successfully" + id;
    }
}
