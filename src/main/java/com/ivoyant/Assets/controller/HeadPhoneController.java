package com.ivoyant.Assets.controller;

import com.ivoyant.Assets.model.HeadPhone;
import com.ivoyant.Assets.service.HeadPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HeadPhoneController {

    @Autowired
    private HeadPhoneService headPhoneService;

    @GetMapping()
        public String welcomeMessage(){
        return "Welcome to Assets service";

    }

    @PostMapping("/headPhone")
    public HeadPhone addheadPhone(@RequestBody HeadPhone headPhone){
        return headPhoneService.saveHeadPhone(headPhone);
    }

    @PutMapping("/headPhone")
    public HeadPhone updateheadPhone(@RequestBody HeadPhone headPhone){
    return headPhoneService.upsertHeadPhone(headPhone);
    }

    @GetMapping("/headPhones")
    public List<HeadPhone> getAllHeadPhones(){
        return headPhoneService.getAllHeadPhones();
    }

    @GetMapping("/headPhone/{id}")
    public HeadPhone getPhoneById(@PathVariable int id){
        return headPhoneService.getHeadPhoneById(id);
    }

    @DeleteMapping("/headPhone/{id}")
    public String deleteHeadPhoneById(@PathVariable int id){
        headPhoneService.deleteHeadPhoneById(id);
        return "deleted successfully" + id;
    }
}
