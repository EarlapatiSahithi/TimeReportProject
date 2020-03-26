package com.capgemini.ui;
import java.util.Scanner;

import com.capgemini.dao.validateItem;
import com.capgemini.dao.validateProduct;
import com.capgemini.services.TimeReportServices;
public class TimeReportMainui {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])  {
	
		Scanner scan = new Scanner(System.in);
		
	while(true)
	{
		System.out.println("Time report for delivery ");
			System.out.println("1.Item level wise delivery");
			System.out.println("2.Product Category wise delivery");
			System.out.println("3.exit");
			System.out.println("enter option which delivery you want to choose");
			int option = scan.nextInt();
			switch (option) {
			case 1:
			
				
				try {
					System.out.println(" It didplays about item wise delivery");
					System.out.println("choose your Items from the list");
					TimeReportServices service1 = new TimeReportServices();
					service1.showitemName();
				}
					catch(validateItem e)
					{
						System.out.println("Item not found");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			case 2:
				try {
					System.out.println("It displays about product wise delivery");
					System.out.println("Choose your Products from the list");
					TimeReportServices service = new TimeReportServices();
					service.showproductName();
					
					}
					catch(validateProduct e){
						System.out.println("Product not found");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					break;
					
					
					
			case 3:
				System.out.println("Thank you");
System.exit(0);
			}
		}
	}
}


