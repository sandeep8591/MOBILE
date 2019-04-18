package com.cg.entity;

import java.time.LocalDate;

public class Mobile {
private int orderid;
private int customerid;
private String modelname;
private int totalpricewithGST;
private LocalDate date;
public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}
public Mobile(int orderid, int customerid,String modelname, int totalpricewithGST, LocalDate date) {
	super();
	this.orderid = orderid;
	this.customerid = customerid;
	this.modelname=modelname;
	this.totalpricewithGST = totalpricewithGST;
	this.date = date;
}
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
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
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public void setTotalpricewithGST(int totalpricewithGST) {
	this.totalpricewithGST = totalpricewithGST;
}
@Override
public String toString() {
	return "Mobile [orderid=" + orderid + ", customerid=" + customerid
			+ ", modelname=" + modelname + ", totalpricewithGST="
			+ totalpricewithGST + ", date=" + date + "]";
}

}

