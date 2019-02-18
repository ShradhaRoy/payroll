package com.cg.payroll.test;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailNotfoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
import com.cg.payroll.util.PayrollDBUtil;

public class PayrollServicesTest {
	private static PayrollServices services;
	/*@BeforeClass
	public static void setUpTestEnv() {
		services=new PayrollServicesImpl();
	}
	@Before
	public void setUpTestData(){
		Associate associate1=new Associate(101,10001, "Shradha"," Roy","YTS","ceo", "12345","shradha.roy",new Salary(300000, 12345, 12000),
				new BankDetails(100001,"CITI","90"));
		Associate associate2=new Associate(102,10000, "dAIPU","GUHA"," IT"," ANALYST", "123456"," DAIP.GUHA",new Salary(300600, 1235, 1200),
				new BankDetails(100001,"CITI","901"));
		PayrollDBUtil.associates.put(associate1.getAssociateId(),associate1);
		PayrollDBUtil.associates.put(associate2.getAssociateId(),associate2);
		PayrollDBUtil.ASSOCIATE_ID_COUNTER=102;
	}
	@Test(expected=AssociateDetailNotfoundException.class)
	public void testGetAssociateDetailsForInvalidAssociateId() throws AssociateDetailNotfoundException {
		services.getAssociateDetails(1012);
	}
	@Test
	public void testGetAssociateDetailsForValidAssociateId() throws AssociateDetailNotfoundException {
		Associate expectedAssociate=new Associate(101,10001, "Shradha"," Roy","YTS","ceo", "12345","shradha.roy",new Salary(300000, 12345, 12000),
				new BankDetails(100001,"CITI","90"));
		Associate actualAssociate=services.getAssociateDetails(101);
		Assert.assertEquals(expectedAssociate, actualAssociate);
	}
	@Test
	public void testAcceptAssociateDetailsForValidData() {
		int expectedId=104;
		int actualId=services.acceptAssociateDetails("SAYAN", "Roy", "shradha.roy@gmail.com", "YTP", "CEO", "2323", 50000, 300000, 12000, 12000, 7888,"CITIBANK","ABCD1234");
		Assert.assertEquals(expectedId, actualId);
	}
	@Test(expected=AssociateDetailNotfoundException.class)
	public void testCalculateNetSalaryForInvalidAssociateId() throws AssociateDetailNotfoundException {
		services.calculateNetSalary(1023);
	}
	@Test
	public void testCalculateNetSalaryForValidAssociateId() throws AssociateDetailNotfoundException {
		double expectedNetSalary=299455;
		double actualNetSalary=services.calculateNetSalary(102);
		Assert.assertEquals(expectedNetSalary, actualNetSalary);
	}
	@Test
	public void testGetAllAssociateDetails() {
		Associate associate1=new Associate(101,10001, "Shradha"," Roy","YTS","ceo", "12345","shradha.roy",new Salary(300000, 12345, 12000),
				new BankDetails(100001,"CITI","90"));
		Associate associate2=new Associate(102,10000, "dAIPU","GUHA"," IT"," ANALYST", "123456"," DAIP.GUHA",new Salary(300600, 1235, 1200),
				new BankDetails(100001,"CITI","901"));
		ArrayList<Associate> expectedAssociateList=new ArrayList<>();
		expectedAssociateList.add(associate1);
		expectedAssociateList.add(associate2);

	}

	@After
	public void tearDownTestDate() {
		PayrollDBUtil.associates.clear();
		PayrollDBUtil.ASSOCIATE_ID_COUNTER=100;
	}
	@AfterClass
	public static void tearDownTestEnv() {
		services=null;
	}*/

}
