package com.homework.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pig {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
    
	//1 stand for male, 0 stand for female
    private Integer sex;

    private String location;

    private String category;

    private Boolean isAbnormal;

    private Boolean isYoungDie;

    private Integer weaned;

    private Integer weight;

    private Boolean isImmunized;

}
