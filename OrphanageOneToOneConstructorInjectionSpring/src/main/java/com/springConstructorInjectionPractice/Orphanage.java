package com.springConstructorInjectionPractice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Orphanage {
	@Id
	private int orphanageId;
	private String orphanageName;
	private String orphanageCity;
	@OneToMany
	private List<Person> person;
	
	public Orphanage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Orphanage(int orphanageId, String orphanageName, String orphanageCity, List<Person> person) {
		super();
		System.out.println(" Using Constructor Injection");
		this.orphanageId = orphanageId;
		this.orphanageName = orphanageName;
		this.orphanageCity = orphanageCity;
		this.person = person;
	}

	public Orphanage(int orphanageId, String orphanageName, String orphanageCity) {
		super();
		this.orphanageId = orphanageId;
		this.orphanageName = orphanageName;
		this.orphanageCity = orphanageCity;
	}
	
public int getOrphanageId() {
		return orphanageId;
	}

	public void setOrphanageId(int orphanageId) {
		this.orphanageId = orphanageId;
	}

	public String getOrphanageName() {
		return orphanageName;
	}

	public void setOrphanageName(String orphanageName) {
		this.orphanageName = orphanageName;
	}

	public String getOrphanageCity() {
		return orphanageCity;
	}

	public void setOrphanageCity(String orphanageCity) {
		this.orphanageCity = orphanageCity;
	}

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

@Override
	public String toString() {
		return "Orphanage [orphanageId=" + orphanageId + ", orphanageName=" + orphanageName + ", orphanageCity="
				+ orphanageCity + ", person=" + person + "]";
	}
	
}
