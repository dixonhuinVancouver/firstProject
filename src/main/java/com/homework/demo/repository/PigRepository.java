package com.homework.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.homework.demo.entity.Pig;

public interface PigRepository extends JpaRepository<Pig, Long> {
	@Query("select p from Pig p where p.isImmunized = true")
	List<Pig> findAllImmunizedPigs();
	
	List<Pig> findBySexAndIsImmunized(Integer sex, Boolean isImmunnized);
	
	List<Pig> findBySexAndIsAbnormal(Integer sex, Boolean isAbnormal);

    Optional<Pig> findById(Long id);
}
