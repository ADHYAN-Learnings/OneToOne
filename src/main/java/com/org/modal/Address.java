package com.org.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;

@Entity
@Table(name ="Institute_Address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String location;
	
	@OneToOne(mappedBy="coachingInstitute_Address")
	private CoachingInstitute coachingInstitute;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public CoachingInstitute getCoachingInstitute() {
		return coachingInstitute;
	}
	public void setCoachingInstitute(CoachingInstitute coachingInstitute) {
		this.coachingInstitute = coachingInstitute;
	}
	
}
