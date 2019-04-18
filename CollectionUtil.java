package com.cg.util;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;

import com.cg.entity.Customer;
import com.cg.entity.Mobile;
import com.cg.entity.MobileInfo;

public class CollectionUtil {
	private static HashMap<String,MobileInfo> hm1=new HashMap<>();
private static HashMap<Integer, Customer> hc=new HashMap<>();
private static HashMap<Integer,Mobile> hm=new HashMap<>();
static{
	hc.put(1111,new Customer("Rkreddy","andhra","1111111111"));
	hc.put(2222,new Customer("sri","hyderabad","2222222222"));
	hc.put(3333, new Customer("vijay","karimnagar","333333333"));
	hc.put(4444,new Customer("shiva","bangalore","444444444"));    
	hc.put(5555,new Customer ("Uday","Warangal","555555555"));
	hm.put(111,new Mobile(1,11,"Nokia",25000,LocalDate.of(2019,Month.JANUARY,8)));
	hm.put(222,new Mobile(2,22,"mi",26000,LocalDate.of(2019,Month.FEBRUARY,9)));
	hm.put(333, new Mobile(3,33,"sony",27000,LocalDate.of(2019,Month.MARCH,10)));
	hm.put(444,new Mobile(4,44,"apple",28000,LocalDate.of(2019,Month.APRIL,11)));
	hm.put(555,new Mobile(5,55,"oneplus",29000,LocalDate.of(2019,Month.MAY,12)));	
	hm1.put("Nokia",new MobileInfo("Nokia",25000));
	hm1.put("mi",new MobileInfo("mi",26000));
	hm1.put("sony", new MobileInfo("sony",27000));
	hm1.put("apple",new MobileInfo("apple",28000));
	hm1.put("oneplus",new MobileInfo("oneplus",29000));		
}
public static int purchaseModel(Customer c,Mobile m){
	hc.put(m.getCustomerid(), c);
	hm.put(m.getOrderid(), m);
	return m.getOrderid();
}
public static Mobile getPurchaseDetails(int orderid){
	Mobile m=hm.get(orderid);
	return m;
}
public static HashMap<String, MobileInfo> mobileDetails(){
	return hm1;	
}
public static MobileInfo mobileModelDetails(String modelname){
	MobileInfo m1=hm1.get(modelname);
	return m1;
}
public static Customer customerDetails(int customerid){
	return hc.get(customerid);
}

}
