package com.ivoyant.Assets.service;

import com.ivoyant.Assets.model.Laptop;
import com.ivoyant.Assets.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public Laptop upsertLaptop(Laptop laptop){
        return laptopRepository.save(laptop);
    }

    public Laptop saveLaptop(Laptop laptop){
        return laptopRepository.save(laptop);
    }

    public List<Laptop> getAllLaptop(){
        return laptopRepository.findAll();
    }

    public Laptop getLaptopById(int id){
        return laptopRepository.findById(id).get();
    }

    public String deleteLaptopById(int id){
        laptopRepository.deleteById(id);
    return "deleted successfully" + id;
    }
}
