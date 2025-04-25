package com.context.task1;

public class Vehicle {
	private int vehicleId;
	private String vehicleModelName;
	private int average;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		System.out.println("Setting the vehicle Id ");
		this.vehicleId = vehicleId;
	}
	public String getvehicleModelName() {
		return vehicleModelName;
	}
	public void setvehicleModelName(String vehicleModelName) {
		System.out.println("Setting the vehicle model name ");
		this.vehicleModelName = vehicleModelName;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		System.out.println("Setting the vehicle average ");
		this.average = average;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicelModelName=" + vehicleModelName + ", average=" + average
				+ "]";
	}
	
	
}
