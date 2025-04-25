package com.springIOC.task1;

public class Mobile {
	private int moId;
	private String modelName;
	private String companyName;
	private String ram;
	private Recharge recharge;
	
	
	public Mobile(int moId, String modelName, String companyName, String ram, Recharge recharge) {
		super();
		this.moId = moId;
		this.modelName = modelName;
		this.companyName = companyName;
		this.ram = ram;
		this.recharge = recharge;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int moId, String modelName, String companyName, String ram) {
		super();
		this.moId = moId;
		this.modelName = modelName;
		this.companyName = companyName;
		this.ram = ram;
	}
	public int getMoId() {
		return moId;
	}
	public void setMoId(int moId) {
		this.moId = moId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public Recharge getRecharge() {
		return recharge;
	}
	public void setRecharge(Recharge recharge) {
		this.recharge = recharge;
	}
	@Override
	public String toString() {
		return "Mobile [moId=" + moId + ", modelName=" + modelName + ", companyName=" + companyName + ", ram=" + ram
				+ ", recharge=" + recharge + "]";
	}
	
	
	
}
