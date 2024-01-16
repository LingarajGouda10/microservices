package com.ivoyant.Assets.controller;

import com.ivoyant.Assets.model.Keyboard;
import com.ivoyant.Assets.model.Laptop;
import com.ivoyant.Assets.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class LaptopController {

    @Autowired
    private LaptopService laptopService;


    @PostMapping("/laptop")
    public Laptop addLaptop(@RequestBody Laptop laptop ){
        return laptopService.saveLaptop(laptop);
    }

    @PutMapping("/laptop")
    public Laptop updateLaptop(@RequestBody Laptop laptop ){
        return laptopService.upsertLaptop(laptop);
    }

    @GetMapping("/laptops")
    public List<Laptop> getAllLaptops(){
        return laptopService.getAllLaptop();
    }

    @GetMapping("/laptop/{id}")
    public Laptop getLaptopById(@PathVariable int id){
        return laptopService.getLaptopById(id);
    }

    @DeleteMapping("/laptop/{id}")
    public String deleteLaptopById(@PathVariable int id){
        laptopService.deleteLaptopById(id);
        return "deleted successfully" + id;
    }
}
