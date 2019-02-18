package com.cg.payroll.client;
import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailNotfoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {
	public static void main(String[] args) {
		PayrollServices services=new PayrollServicesImpl();
		Associate associate=null;
		int associateId=services.acceptAssociateDetails("Shradha", "Roy", "shradha.roy@gmail.com", "YTP", "CEO", "2323", 30000, 300000, 1200, 120, 7888,"CITIBANK","ABCD1234");
		int associateId2=services.acceptAssociateDetails("Sayan", "Datta", "sayan.roy@gmail.com", "YTP", "CEO", "2323", 34000, 300900, 1250, 1200, 7888,"CITIBANK","ABCD1234");
		System.out.println("Associate Id "+associateId);
		System.out.println("Associate Id "+associateId2);
		
		
		try {
			Associate associateid;
			System.out.println(services.getAssociateDetails(associateId));
			System.out.println(services.getAssociateDetails(associateId2));
		} catch (AssociateDetailNotfoundException e) {
			e.printStackTrace();
		}
		
		
		  /*try { associate=services.getAssociateDetails(associateId);
		  System.out.println("\nDetails found for AssociateID: "+associateId);
		  System.out.println("Annual net salary: "+services.calculateNetSalary(
		  associateId)); } catch(AssociateDetailNotfoundException e) {
		  e.printStackTrace(); } try {
		  associate=services.getAssociateDetails(associateId2);
		  System.out.println("\nDetails found for AssociateId: "+associateId2);
		  System.out.println("Annual Net Salary"+services.calculateNetSalary(
		  associateId2)); }catch(AssociateDetailNotfoundException e) {
		  e.printStackTrace(); }
		 */
		
		  try { System.out.println("For Associate ID 101");
		  System.out.println("Net Annual Salary---->"+services.calculateNetSalary(
		  associateId));
		  System.out.println("Net Monthly Salary---->"+(services.calculateNetSalary(
		  associateId))/12); double
		  basicSalary=services.getAssociateDetails(associateId).getsalary().
		  getBasicSalary(); double netSalary=services.calculateNetSalary(associateId);
		  double tax=basicSalary-netSalary; System.out.println("Annual Tax----> "+tax);
		  System.out.println("Monthly Tax--->"+tax/12); } catch
		  (AssociateDetailNotfoundException e) {
		  e.printStackTrace(); } try { System.out.println("For Associate ID 102");
		  System.out.println("Net Annual Salary---->"+services.calculateNetSalary(
		  associateId2));
		  System.out.println("Net Monthly Salary---->"+(services.calculateNetSalary(
		  associateId2))/12); double
		  basicSalary=services.getAssociateDetails(associateId2).getsalary().
		  getBasicSalary(); double netSalary=services.calculateNetSalary(associateId2);
		  double tax=basicSalary-netSalary; System.out.println("Annual Tax----> "+tax);
		  System.out.println("Monthly Tax--->"+tax/12); } catch
		  (AssociateDetailNotfoundException e) {
		  
		  e.printStackTrace(); }
		 
		
		//List<Associate>a1=services.getAllAssociateDetails();
		//for(Associate associate2:a1) {
			System.out.println(services.getAllAssociateDetails());
	//	}
	}
}
