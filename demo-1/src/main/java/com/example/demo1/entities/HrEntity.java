package com.example.demo1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hr")
public class HrEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int hr_id;
	
	@Column
	public String hr_name;
	@Column
	public String hr_address;
	@Column
	public String hr_age;
	
	public int getHr_id() {
		return hr_id;
	}
	public void setHr_id(int hr_id) {
		this.hr_id = hr_id;
	}
	public String getHr_name() {
		return hr_name;
	}
	public void setHr_name(String hr_name) {
		this.hr_name = hr_name;
	}
	public String getHr_address() {
		return hr_address;
	}
	public void setHr_address(String hr_address) {
		this.hr_address = hr_address;
	}
	public String getHr_age() {
		return hr_age;
	}
	public void setHr_age(String hr_age) {
		this.hr_age = hr_age;
	}
	
	public HrEntity(int hr_id, String hr_name, String hr_address, String hr_age) {

		this.hr_id = hr_id;
		this.hr_name = hr_name;
		this.hr_address = hr_address;
		this.hr_age = hr_age;
	}
	
	
	public HrEntity() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "HrEntity [hr_id=" + hr_id + ", hr_name=" + hr_name + ", hr_address=" + hr_address + ", hr_age=" + hr_age
				+ "]";
	}
	
	
	
	
	
	
	

}
