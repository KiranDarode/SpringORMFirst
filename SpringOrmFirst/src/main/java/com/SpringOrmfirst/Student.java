package com.SpringOrmfirst;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String last;
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

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(int id, String name, String last, String city) {
		super();
		this.id = id;
		this.name = name;
		this.last = last;
		this.city = city;
	}

	
	
	public Student(int id) {
		super();
		this.id=id;
	}
	
	
	
	public Student(String name, String last, String city) {
		super();
		this.name = name;
		this.last = last;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Student o) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", last=" + last + ", city=" + city + "]";
	}

}
