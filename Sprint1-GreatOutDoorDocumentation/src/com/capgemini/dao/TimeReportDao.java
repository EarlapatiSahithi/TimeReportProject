

package com.capgemini.dao;
import java.sql.ResultSet;
import java.util.Map;

import com.capgemini.entity.TimeReportItem;
import com.capgemini.entity.TimeReportProduct;
public interface TimeReportDao {
	public Map<String, TimeReportProduct> showproductName() throws Exception;
	public Map<String, TimeReportItem> showitemName() throws Exception;

}








