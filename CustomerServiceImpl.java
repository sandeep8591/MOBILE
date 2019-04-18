package com.cg.service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.Dao.CustomerDao;
import com.cg.Dao.CustomerDaoImpl;
import com.cg.entity.Customer;
import com.cg.entity.Mobile;
import com.cg.entity.MobileInfo;
import com.cg.exception.CustomerException;
import com.cg.util.CollectionUtil;

public class CustomerServiceImpl  implements CustomerService{
	CustomerDao cd=new CustomerDaoImpl();

	@Override
	public int purchaseModel(Customer c,Mobile m) {
		// TODO Auto-generated method stub
		int c1=cd.purchaseModel(c,m);
		return c1;
	}

	@Override
	public Mobile getPurchaseDetails(int orderId) {
		// TODO Auto-generated method stub
		Mobile m2=cd.getPurchaseDetails(orderId);
		return m2;
	}

	@Override
	public HashMap<String, MobileInfo> mobileDetails() {
		// TODO Auto-generated method stub
		HashMap<String, MobileInfo> m1=cd.mobileDetails();
		return m1;
	}
	
	public MobileInfo mobileModelDetails(String modelname){
		MobileInfo m1=cd.mobileModelDetails(modelname);
		return m1;
	}

	@Override
	public Customer customerDetails(int customerid) {
		// TODO Auto-generated method stub
		Customer c=cd.customerDetails(customerid);
		return c;
	}
}
