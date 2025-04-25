package com.springIOC.Task;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Bird {
	@Id
	private int birdId;
	private String birdName;
	@OneToMany
	private List<Tree> trees;
	
	
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bird(int birdId, String birdName, List<Tree> trees) {
		super();
		this.birdId = birdId;
		this.birdName = birdName;
		this.trees = trees;
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
	public List<Tree> getTrees() {
		return trees;
	}
	public void setTrees(List<Tree> trees) {
		this.trees = trees;
	}
	@Override
	public String toString() {
		return "Bird [birdId=" + birdId + ", birdName=" + birdName + ", trees=" + trees + "]";
	}
	
}