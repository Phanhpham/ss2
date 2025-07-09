package com.data.demo2.repository;


import com.data.demo2.model.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheaterRepository extends JpaRepository<Theater, Long> {
    List<Theater> findByNameContainingIgnoreCase(String name);
    List<Theater> findByAddressContainingIgnoreCase(String address);
}