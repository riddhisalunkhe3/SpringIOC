package com.springConstructorInjectionPractice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	private int personId;
	private String personName;
	private String personCity;
	@ManyToOne
	private Orphanage orphanage;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(int personId, String personName, String personCity, Orphanage orphanage) {
		super();
		System.out.println("Using constructor Injection");
		this.personId = personId;
		this.personName = personName;
		this.personCity = personCity;
		this.orphanage = orphanage;
	}


	public Person(int personId, String personName, String personCity) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personCity = personCity;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personCity=" + personCity
				+ ", orphanage=" + orphanage + "]";
	}
	
}
