package com.ivoyant.Assets.controller;

import com.ivoyant.Assets.model.Laptop;
import com.ivoyant.Assets.model.Mouse;
import com.ivoyant.Assets.service.MouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MouseController {

    @Autowired
    private MouseService mouseService;


    @PostMapping("/mouse")
    public Mouse addMouse (@RequestBody Mouse mouse ){
        return mouseService.saveMouse(mouse);
    }

    @PutMapping("/mouse")
    public Mouse updateMouse (@RequestBody Mouse mouse ){
        return mouseService.upsertMouse(mouse);
    }

    @GetMapping("/mouses")
    public List<Mouse> getAllMouses(){
        return mouseService.getAllMouses();
    }

    @GetMapping("/mouse/{id}")
    public Mouse getMouseById(@PathVariable int id){
        return mouseService.getMouseById(id);
    }

    @DeleteMapping("/mouse/{id}")
    public String deleteMouseById(@PathVariable int id){
        mouseService.deleteMouseById(id);
        return "deleted successfully" + id;
    }
}
