package com.ivoyant.Assets.controller;

import com.ivoyant.Assets.model.HeadPhone;
import com.ivoyant.Assets.model.Keyboard;
import com.ivoyant.Assets.service.KeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class KeyboardController {

    @Autowired
    private KeyboardService keyboardService;


    @PostMapping("/keyboard")
    public Keyboard addKeyboard(@RequestBody Keyboard keyboard){
        return keyboardService.saveKeyboard(keyboard);
    }

    @PutMapping("/keyboard")
    public Keyboard updateKeyboard(@RequestBody Keyboard keyboard){
        return keyboardService.upsertKeyboard(keyboard);
    }

    @GetMapping("/keyboards")
    public List<Keyboard> getAllKeyboards(){
        return keyboardService.getAllkeyboards();
    }

    @GetMapping("/keyboards/{id}")
    public Keyboard getKeyboardById(@PathVariable int id){
        return keyboardService.getKeyboardById(id);
    }

    @DeleteMapping("/keyboard/{id}")
    public String deleteKeyboardById(@PathVariable int id){
        keyboardService.deleteKeyboardById(id);
        return "deleted successfully" + id;
    }
}
