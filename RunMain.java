package com.cd.ui;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import java.util.Map.Entry;

import com.cg.entity.Customer;
import com.cg.entity.Mobile;
import com.cg.entity.MobileInfo;
import com.cg.exception.CustomerException;
import com.cg.service.CustomerService;
import com.cg.service.CustomerServiceImpl;

public class RunMain {
	static Scanner sc=null;
	static CustomerService cs=null;
public static void main(String[] args) throws CustomerException {
	sc=new Scanner(System.in);
	cs=new CustomerServiceImpl();
	int choice=0;
	
		System.out.println("PLEASE ENTER 1 GET MOBILE DETAILS");
		choice=sc.nextInt();
		switch(choice){
		case 1:
			mobileDetails();
		case 2:
			mobileModelDetails();
			break;
		}
		while(true){
		System.out.println("Enter Your Choice");
		System.out.println("1:Purchase Model\n2:Order Details");
		System.out.println("3:MobileDetails\n4:CustomerDetails");
		choice=sc.nextInt();
		switch(choice){
		case 1:
			purchaseModel();
			break;
		case 2:
			getpurchaseDetails();
			break;
		case 3:
			mobileModelDetails();
			break;
		case 4:
			customerDetails();
			break;
			default:
				System.out.println("try again");
		}
	}
}
public static void customerDetails(){
	System.out.println("Enter Customer id:");
	int cid=sc.nextInt();
	Customer c=cs.customerDetails(cid);
	System.out.println("CustomerDetails:"+c); 
}
private static void mobileDetails(){
	HashMap<String, MobileInfo> m=cs.mobileDetails();
	for(Entry<String, MobileInfo> h:m.entrySet()){    
	System.out.println(" "+h.getValue());
}
}
private static void mobileModelDetails(){
	System.out.println("CHOOOSE MobileModel:");
	String mm=sc.next();
	MobileInfo c1=cs.mobileModelDetails(mm);
	System.out.println(c1);
	if(c1==null)
	{
		System.out.println("Please choose model from list");
		System.exit(0);
	}
	
}
private static void getpurchaseDetails(){

	System.out.println("Enter orderId:");
	int oid=sc.nextInt();
	Mobile m1=cs.getPurchaseDetails(oid);
	System.out.println("order details:"+m1);
}

	private static void purchaseModel() throws CustomerException{
		System.out.println("Enter the Customer name:");
		String cname=sc.next();
		try{
			if(CustomerService.validatecname(cname)){
			while(true){
		System.out.println("Enter the Customer Address:");
		String cadd=sc.next();
		try{
			if(CustomerService.validatecadd(cadd)){
			while(true){
		System.out.println("Enter the Customer cell no");
		String ccell=sc.next();
		try{
			if(CustomerService.validateccell(ccell)){
		Customer c=new Customer(cname,cadd,ccell);
		System.out.println("Enter Mobile Model:");
		cs.mobileModelDetails(modelname);
		System.out.println("Enter GstPrice andMobilePrice");
		int mprice=sc.nextInt();
		System.out.println("Enter purchased date:");
		LocalDate date=LocalDate.now();
		   int max = 5000; 
	        int min = 1; 
	        int range = max - min + 1; 
	        int oid = (int)(Math.random() * range) + min; 
	        int max1 = 25000; 
	        int min1 = 1; 
	        int range1= max1- min1 + 1; 
	        int cid = (int)(Math.random() * range1) + min1; 
		Mobile m=new Mobile(oid,cid,mm,mprice,date);
		MobileInfo mi=new MobileInfo(mm,mprice);
		int CustomerDetails=cs.purchaseModel(c, m);
		System.out.println("Purchased Mobile:"+mm+"and Orderid is:"+oid);
		System.out.println("order id:"+CustomerDetails);
		//System.out.println("Customer id:"+m.getCustomerid());
		break;
			}
			}
		
			catch(Exception e){
			}
		}break;
			}
			}
		catch(Exception r){
		}break;
			}
	}
			}
		catch(Exception c){
}
			}
}
			


