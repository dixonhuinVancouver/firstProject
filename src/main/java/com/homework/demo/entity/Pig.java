package com.homework.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pig {
	@Id
	private Long id;

	public Pig(Long id, Integer sex, Boolean isAbnormal) {
		super();
		this.id = id;
		this.sex = sex;
		this.isAbnormal = isAbnormal;
	}

	private String birthDate;

	// 1 stand for male, 0 stand for female
	private Integer sex;

	private String location;

	private String category;

	private Boolean isAbnormal;

	private Boolean isYoungDie;

	private Integer weaned;

	private Integer weight;

	private Boolean isImmunized;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getIsAbnormal() {
		return isAbnormal;
	}

	public void setIsAbnormal(Boolean isAbnormal) {
		this.isAbnormal = isAbnormal;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Boolean getIsYoungDie() {
		return isYoungDie;
	}

	public void setIsYoungDie(Boolean isYoungDie) {
		this.isYoungDie = isYoungDie;
	}

	public Boolean getIsImmunized() {
		return isImmunized;
	}

	public void setIsImmunized(Boolean isImmunized) {
		this.isImmunized = isImmunized;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getWeaned() {
		return weaned;
	}

	public void setWeaned(Integer weaned) {
		this.weaned = weaned;
	}

}
