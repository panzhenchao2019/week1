package com.bw.bean;

public class Movie {
	private Integer id;
	private String mname;
	private String dy;
	private int pj;
	private String time;
	private int sc;
	private String lx;
	private int nd;
	private String qy;
	private String zt;
	@Override
	public String toString() {
		return "Movie [id=" + id + ", mname=" + mname + ", dy=" + dy + ", pj=" + pj + ", time=" + time + ", sc=" + sc
				+ ", lx=" + lx + ", nd=" + nd + ", qy=" + qy + ", zt=" + zt + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getDy() {
		return dy;
	}
	public void setDy(String dy) {
		this.dy = dy;
	}
	public int getPj() {
		return pj;
	}
	public void setPj(int pj) {
		this.pj = pj;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getSc() {
		return sc;
	}
	public void setSc(int sc) {
		this.sc = sc;
	}
	public String getLx() {
		return lx;
	}
	public void setLx(String lx) {
		this.lx = lx;
	}
	public int getNd() {
		return nd;
	}
	public void setNd(int nd) {
		this.nd = nd;
	}
	public String getQy() {
		return qy;
	}
	public void setQy(String qy) {
		this.qy = qy;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	
	
}
