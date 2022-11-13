package com.masai.model;

public class CourseDTO {

	private int bseat;
	private int cid;
	private String cname;
	
	public CourseDTO() {
		// TODO Auto-generated constructor stub
	}

	public CourseDTO(int bseat, int cid, String cname) {
		super();
		this.bseat = bseat;
		this.cid = cid;
		this.cname = cname;
	}

	public int getBseat() {
		return bseat;
	}

	public void setBseat(int bseat) {
		this.bseat = bseat;
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

	@Override
	public String toString() {
		return "CourseDTO [bseat=" + bseat + ", cid=" + cid + ", cname=" + cname + "]";
	}

	
}
