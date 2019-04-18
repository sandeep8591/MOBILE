package com.cg.Dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.entity.Customer;
import com.cg.entity.Mobile;
import com.cg.entity.MobileInfo;

public interface CustomerDao {
	public int purchaseModel(Customer c,Mobile m);
	public Mobile getPurchaseDetails(int orderId);
	public HashMap<String, MobileInfo> mobileDetails();
	public MobileInfo mobileModelDetails(String modelname);
	public Customer customerDetails(int customerid);
}
