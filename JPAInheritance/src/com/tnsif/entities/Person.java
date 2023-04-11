package com.tnsif.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
/*
 * @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
 * 
 * @DiscriminatorColumn(name="ptype", discriminatorType =
 * DiscriminatorType.STRING, length = 20)
 * 
 * @DiscriminatorValue("PersonMember")
 */

//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)


@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
	@Id
	@Column(name = "memberId")
	private int id;
	@Column(length=50)
	private String name;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
