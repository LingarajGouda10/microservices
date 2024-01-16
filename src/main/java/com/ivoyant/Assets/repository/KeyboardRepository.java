package com.ivoyant.Assets.repository;

import com.ivoyant.Assets.model.Keyboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyboardRepository extends JpaRepository<Keyboard,Integer> {
}
