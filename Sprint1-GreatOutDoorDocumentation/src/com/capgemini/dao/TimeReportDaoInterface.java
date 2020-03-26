package com.capgemini.dao;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.entity.TimeReportItem;
import com.capgemini.entity.TimeReportProduct;



public class TimeReportDaoInterface implements TimeReportDao {
	
	
	  private Map<String, TimeReportItem> reportItemEntry;
	  protected Map<String,TimeReportItem>getreportItemEntry(){
	  return reportItemEntry;
	}
	  
	  private Map<String, TimeReportProduct> reportProductEntry;
	  protected Map<String,TimeReportProduct>getreportProductEntry(){
	  return reportProductEntry;
	}
	  
	  
	    public TimeReportDaoInterface() {
	       reportItemEntry = new HashMap<>();
	       TimeReportItem report1= new TimeReportItem(1,"Vivov15","26000","4-6 days");
	       TimeReportItem report2= new TimeReportItem(2,"Honor","15000","3-6 days");
	       TimeReportItem report3= new TimeReportItem(3,"Samsungled","55000","7-9 days");
	       TimeReportItem report4= new TimeReportItem(4,"Samsunglcd","48000","6-9 days");
	       TimeReportItem report5= new TimeReportItem(5,"Silk","180","1-3 days");
	       TimeReportItem report6= new TimeReportItem(6,"Celebrations","150","2-3 days");

	       reportProductEntry = new HashMap<>();
	       TimeReportProduct r= new TimeReportProduct(1,"Mobiles","4-6days");
	       TimeReportProduct r1= new TimeReportProduct(2,"Telivisions","7-9days");
	       TimeReportProduct r2= new TimeReportProduct(1,"Choclates","4-6days");
	       
	       
	       
	 }

	

	public Map<String, TimeReportItem> showitemName() {
return getreportItemEntry();
		}

	public Map<String, TimeReportProduct> showProductName() {
return getreportProductEntry();
		}


	@Override
	public Map<String, TimeReportProduct> showproductName() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
