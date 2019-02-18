package com.cg.payroll.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.exceptions.AssociateDetailNotfoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class PayrollServicesTestEasyMock {
	private static PayrollServices payrollServices;
	private static AssociateDAO mockAssociateDao;
	@BeforeClass
	public static void setUpTestEnv() {
		mockAssociateDao=EasyMock.mock(AssociateDAO.class);
		payrollServices=new PayrollServicesImpl(mockAssociateDao);
		}
	@Before
	public void setUpTestMockData() {
		Associate associate1=new Associate(101,10001, "Shradha"," Roy","YTS","ceo", "12345","shradha.roy",new Salary(300000, 12345, 12000),
				new BankDetails(100001,"CITI","90"));
		Associate associate2=new Associate(102,10000, "dAIPU","GUHA"," IT"," ANALYST", "123456"," DAIP.GUHA",new Salary(300600, 1235, 1200),
				new BankDetails(100001,"CITI","901"));
		Associate associate3=new Associate(102,10000, "Sayan","GUHA"," IT"," ANALYST", "12356"," DAIP.GUHA",new Salary(310600, 135, 100),
				new BankDetails(100051,"CITI","01"));
		
		ArrayList<Associate> associatesList=new ArrayList<>();
		associatesList.add(associate1);
		associatesList.add(associate2);
		
		EasyMock.expect(mockAssociateDao.save(associate3)).andReturn(associate3);
		
		EasyMock.expect(mockAssociateDao.findOne(101)).andReturn(associate1);
		EasyMock.expect(mockAssociateDao.findOne(102)).andReturn(associate2);
		EasyMock.expect(mockAssociateDao.findOne(1234)).andReturn(null);
		EasyMock.expect(mockAssociateDao.findAll()).andReturn(associatesList);
		EasyMock.expect(mockAssociateDao);
		
	}
	@Test(expected=AssociateDetailNotfoundException.class)
	public void testGetAssociateDataForInvalidAssociateId() throws AssociateDetailNotfoundException {
		payrollServices.getAssociateDetails(1234);
		EasyMock.verify(mockAssociateDao.findOne(1234));
		}
	@Test
	public void testGetAssociateDataForValidAssociateId() throws AssociateDetailNotfoundException{
		Associate expectedAssociate=new Associate(101,10001, "Shradha"," Roy","YTS","ceo", "12345","shradha.roy",new Salary(300000, 12345, 12000),
				new BankDetails(100001,"CITI","90"));
		Associate actualAssociate=payrollServices.getAssociateDetails(101);
		 Assert.assertEquals(expectedAssociate,actualAssociate);
		EasyMock.verify(mockAssociateDao.findOne(101));
		
	}
	@After
	public void tearDownTestMockData() {
		EasyMock.resetToDefault(mockAssociateDao);
	}
	@AfterClass
	public static void tearDownTestEnv() {
		mockAssociateDao=null;
		payrollServices = null;
	}

}
