package com.cg.entity;

public class Customer {
private String customername;
private String address;
private String customercellno;
public Customer(String cname, String cadd, int ccell) {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(String customername, String address, String customercellno) {
	super();
	this.customername = customername;
	this.address = address;
	this.customercellno = customercellno;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCustomercellno() {
	return customercellno;
}
public void setCustomercellno(String customercellno) {
	this.customercellno = customercellno;
}
@Override
public String toString() {
	return "Customer [customername=" + customername + ", address=" + address
			+ ", customercellno=" + customercellno + "]";
}
}
