package com.ivoyant.Assets.service;

import com.ivoyant.Assets.model.HeadPhone;
import com.ivoyant.Assets.repository.HeadPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadPhoneService {

    @Autowired
    private HeadPhoneRepository headPhoneRepository;

    public HeadPhone upsertHeadPhone(HeadPhone headPhone){
        return headPhoneRepository.save(headPhone);
    }

    public HeadPhone saveHeadPhone(HeadPhone headPhone){
        return headPhoneRepository.save(headPhone);
    }

    public List<HeadPhone> getAllHeadPhones(){
        return headPhoneRepository.findAll();
    }

    public HeadPhone getHeadPhoneById(int id){
        return headPhoneRepository.findById(id).get();
    }

    public String deleteHeadPhoneById(int id){
        headPhoneRepository.deleteById(id);
        return "deleted successfully" + id;
    }
}
