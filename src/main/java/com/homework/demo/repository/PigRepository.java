package com.homework.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.homework.demo.entity.Pig;

public interface PigRepository extends JpaRepository<Pig, Long> {
	@Query("select p from Pig p where p.isImmunized = true")
	List<Pig> findAllImmunizedPigs();
	
	List<Pig> findBySexAndIsImmunized(Integer sex, Boolean isImmunnized);
}
