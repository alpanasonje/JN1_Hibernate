package com.tnsif.entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="StudentMaster")
public class Student {
	@Id
	private int rollNo;
	private String course;
	private float per;
	private String name;
	
	/*
	 * @ManyToOne(cascade = CascadeType.ALL) private Person person;
	 */
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name : "+name+", course=" + course + ", per=" + per + "]";
	}
	
	
	
}
