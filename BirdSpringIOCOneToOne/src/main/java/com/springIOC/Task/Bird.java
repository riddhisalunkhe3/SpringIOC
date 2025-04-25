package com.springIOC.Task;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bird {
	@Id
	private int birdId;
	private String birdName;
	@OneToOne(cascade=CascadeType.ALL)
	private Tree tree;
	
	
	public Bird(int birdId, String birdName, Tree tree) {
		super();
		this.birdId = birdId;
		this.birdName = birdName;
		this.tree = tree;
	}
	public Tree getTree() {
		return tree;
	}
	public void setTree(Tree tree) {
		this.tree = tree;
	}
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bird(int birdId, String birdName) {
		super();
		this.birdId = birdId;
		this.birdName = birdName;
	}
	public int getBirdId() {
		return birdId;
	}
	public void setBirdId(int birdId) {
		this.birdId = birdId;
	}
	public String getBirdName() {
		return birdName;
	}
	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}
	
	@Override
	public String toString() {
		return "Bird [birdId=" + birdId + ", birdName=" + birdName + ", tree=" + tree + "]";
	}

}
