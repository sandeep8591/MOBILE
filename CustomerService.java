package com.cg.service;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.entity.Customer;
import com.cg.entity.Mobile;
import com.cg.entity.MobileInfo;
import com.cg.exception.CustomerException;

public interface CustomerService {
	public int purchaseModel(Customer c,Mobile m);
	public Mobile getPurchaseDetails(int orderId);
	public HashMap<String, MobileInfo> mobileDetails();
	public MobileInfo mobileModelDetails(String modelname);
	public Customer customerDetails(int customerid);
	
	public static boolean validatecname(String cname)throws CustomerException{
		Pattern p=Pattern.compile("[A-Za-z]{1,10}");
		Matcher m=p.matcher(cname);
		if(m.matches()){
			return true;
		}
		return false;
	}
	public static boolean validatecadd(String cadd)throws CustomerException{
	Pattern p1=Pattern.compile("[A-Za-z]{1,10}");
	Matcher m1=p1.matcher(cadd);
	if(m1.matches()){
		return true;
	}
	return false;
	}
	public static boolean validateccell(CharSequence ccell)throws CustomerException{
		Pattern p=Pattern.compile("[0-9]{10}");
		Matcher m=p.matcher(ccell);
		if(m.matches()){
			return true;
		}
		return false;
	}
}
