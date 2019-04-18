package com.cg.Dao;

import java.util.Collections;
import java.util.HashMap;

import com.cg.entity.Customer;
import com.cg.entity.Mobile;
import com.cg.entity.MobileInfo;
import com.cg.util.CollectionUtil;


public class CustomerDaoImpl implements CustomerDao {

	@Override
	public int purchaseModel(Customer c,Mobile m) {
		// TODO Auto-generated method stub
		int c1=CollectionUtil.purchaseModel(c,m);
		return c1;
	}

	@Override
	public Mobile getPurchaseDetails(int orderId) {
		// TODO Auto-generated method stub
		Mobile m3=CollectionUtil.getPurchaseDetails(orderId);
		return m3;
	}

	@Override
	public HashMap<String, MobileInfo> mobileDetails() {
		// TODO Auto-generated method stub
		HashMap<String, MobileInfo> m1=CollectionUtil.mobileDetails();
		return m1;
	}
	public MobileInfo mobileModelDetails(String modelname){
		MobileInfo m1=CollectionUtil.mobileModelDetails(modelname);
		return m1;
		
	}

	@Override
	public Customer customerDetails(int customerid) {
		// TODO Auto-generated method stub
		Customer c=CollectionUtil.customerDetails(customerid);
		return c;
	}

}
