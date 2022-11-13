package com.masai.model;

public class StudentBatch {

	private int roll;
	private int cid;
	private int bid;
	
	public StudentBatch() {
		// TODO Auto-generated constructor stub
	}

	public StudentBatch(int roll, int cid, int bid) {
		super();
		this.roll = roll;
		this.cid = cid;
		this.bid = bid;
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

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "StudentBatch [roll=" + roll + ", cid=" + cid + ", bid=" + bid + "]";
	}
	

}
