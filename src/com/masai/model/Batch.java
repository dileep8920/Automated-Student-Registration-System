package com.masai.model;

public class Batch {


	private int bid;
	private String bname;
	private int bduration;
	private int bseats;
	private int cid;
	
	
	public Batch() {
		// TODO Auto-generated constructor stub
	}


	public Batch(int bid, String bname, int bduration, int bseats, int cid) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bduration = bduration;
		this.bseats = bseats;
		this.cid = cid;
	}


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public int getBduration() {
		return bduration;
	}


	public void setBduration(int bduration) {
		this.bduration = bduration;
	}


	public int getBseats() {
		return bseats;
	}


	public void setBseats(int bseats) {
		this.bseats = bseats;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", bname=" + bname + ", bduration=" + bduration + ", bseats=" + bseats + ", cid="
				+ cid + "]";
	}

}
