package com.springIOC.Task;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tree {
	@Id
	private int treeId;
	private String treeName;
	
	public Tree() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tree(int treeId, String treeName) {
		super();
		this.treeId = treeId;
		this.treeName = treeName;
	}

	public int getTreeId() {
		return treeId;
	}

	public void setTreeId(int treeId) {
		this.treeId = treeId;
	}

	public String getTreeName() {
		return treeName;
	}

	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	@Override
	public String toString() {
		return "Tree [treeId=" + treeId + ", treeName=" + treeName + "]";
	}
	
}
