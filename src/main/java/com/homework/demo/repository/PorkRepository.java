package com.homework.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.homework.demo.entity.Pig;
import com.homework.demo.entity.Pork;



public interface PorkRepository extends JpaRepository<Pork, Long> {

    Optional<Pork> findById(Long id);
    List<Pork> findByPigId(Long pigId);
}
