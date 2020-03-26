package com.capgemini.services;
import java.util.Map;

import com.capgemini.dao.TimeReportDao;
import com.capgemini.dao.TimeReportDaoInterface;
import com.capgemini.entity.TimeReportItem;
import com.capgemini.entity.TimeReportProduct;
public  class TimeReportServices implements TimeReportServicesInterface {

		TimeReportDaoInterface timedao = new TimeReportDaoInterface();		
	

	public Map<String, TimeReportItem> showitemName(TimeReportItem item){
		return timedao.showitemName();
	}
	public Map<String, TimeReportProduct> showproductName(TimeReportProduct product) throws Exception{
		return timedao.showproductName();
	}
	@Override
	public void showproductName() throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showitemName() throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}





	


	
