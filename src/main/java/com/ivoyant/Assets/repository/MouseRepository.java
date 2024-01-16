package com.ivoyant.Assets.repository;

import com.ivoyant.Assets.model.Mouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MouseRepository extends JpaRepository<Mouse,Integer> {
}
