package com.masai.model;

public class StudentDTO {

	private int roll;
	private String sname;
	private String semail;
	private int cid;
	private String cname;
	private int fee;
	private int bid;
	private String bname;
	
	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}

	public StudentDTO(int roll, String sname, String semail, int cid, String cname, int fee, int bid, String bname) {
		super();
		this.roll = roll;
		this.sname = sname;
		this.semail = semail;
		this.cid = cid;
		this.cname = cname;
		this.fee = fee;
		this.bid = bid;
		this.bname = bname;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
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

	@Override
	public String toString() {
		return "StudentDTO [roll=" + roll + ", sname=" + sname + ", semail=" + semail + ", cid=" + cid + ", cname="
				+ cname + ", fee=" + fee + ", bid=" + bid + ", bname=" + bname + "]";
	}
	
}
