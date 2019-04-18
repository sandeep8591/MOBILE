package com.cg.entity;

public class MobileInfo {
	private String modelname;
	private int totalpricewithGST;
	public MobileInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MobileInfo(String modelname, int totalpricewithGST) {
		super();
		this.modelname = modelname;
		this.totalpricewithGST = totalpricewithGST;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getTotalpricewithGST() {
		return totalpricewithGST;
	}
	public void setTotalpricewithGST(int totalpricewithGST) {
		this.totalpricewithGST = totalpricewithGST;
	}
	@Override
	public String toString() {
		return "MobileInfo [modelname=" + modelname + ", totalpricewithGST="
				+ totalpricewithGST + "]";
	}
}
