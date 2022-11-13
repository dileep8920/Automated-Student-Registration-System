package com.masai.model;

public class StudentCourse {

	private int roll;
	private int cid;
	
	public StudentCourse() {
		// TODO Auto-generated constructor stub
	}

	public StudentCourse(int roll, int cid) {
		super();
		this.roll = roll;
		this.cid = cid;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "StudentCourse [roll=" + roll + ", cid=" + cid + "]";
	}
	

}
