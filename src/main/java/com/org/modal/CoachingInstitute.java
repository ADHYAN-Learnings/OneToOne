package com.org.modal;


import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="Coaching_Details")
public class CoachingInstitute {
		
	@Id
	@GeneratedValue
    private Long id;
	
	@Min(value=5000,message="Salary should not be less than 5000")
	private int salary;
	@Min(value=15000,message="fees should not be less than 15000")
	private int fees;
	@Range(min=2000,max=15000,message="Maintenance payment should be between 2000 to 15000")
	private int maintenance;
	
	@Size(min=3,message ="Minimum value it should have 3 character")
	@NotBlank(message="Head of Finance Should not be blank")
	private String head_of_financeDepartment;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id",referencedColumnName="id")
	private Address coachingInstitute_Address;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(int maintenance) {
		this.maintenance = maintenance;
	}
	
	public String getHead_of_financeDepartment() {
		return head_of_financeDepartment;
	}
	public void setHead_of_financeDepartment(String head_of_financeDepartment) {
		this.head_of_financeDepartment = head_of_financeDepartment;
	}
	public Address getCoachingInstitute_Address() {
		return coachingInstitute_Address;
	}
	public void setCoachingInstitute_Address(Address coachingInstitute_Address) {
		this.coachingInstitute_Address = coachingInstitute_Address;
	}
	
	
}
