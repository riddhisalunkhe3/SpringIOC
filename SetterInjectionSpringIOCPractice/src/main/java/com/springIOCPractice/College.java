package com.springIOCPractice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	private int clgId;
	private String clgName;
	private String clgCity;
	
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int clgId, String clgName, String clgCity) {
		super();
		this.clgId = clgId;
		this.clgName = clgName;
		this.clgCity = clgCity;
	}
	public int getClgId() {
		return clgId;
	}
	public void setClgId(int clgId) {
		System.out.println("Setter Injection");
		this.clgId = clgId;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		System.out.println("Setter Injection");
		this.clgName = clgName;
	}
	public String getClgCity() {
		return clgCity;
	}
	public void setClgCity(String clgCity) {
		System.out.println("Setter Injection");
		this.clgCity = clgCity;
	}
	@Override
	public String toString() {
		return "College [clgId=" + clgId + ", clgName=" + clgName + ", clgCity=" + clgCity + "]";
	}
	
	
}
