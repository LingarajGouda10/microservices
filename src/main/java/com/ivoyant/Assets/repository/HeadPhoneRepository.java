package com.ivoyant.Assets.repository;

import com.ivoyant.Assets.model.HeadPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadPhoneRepository extends JpaRepository<HeadPhone,Integer> {
}
