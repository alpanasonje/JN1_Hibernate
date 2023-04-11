package com.tnsif.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("StudentMember")
public class Student extends Person{
	private String course;
	private float per;
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
		return "Student [course = " + course + ", per = " + per + ", Id = " + getId() + ", Name = " + getName()
				+ ", City = " + getCity() + "]";
	}
	
	
}
