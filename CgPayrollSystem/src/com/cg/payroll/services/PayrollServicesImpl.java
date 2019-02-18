package com.cg.payroll.services;
import com.cg.payroll.daoservices.AssociateDaoImpl;
import java.util.List;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.exceptions.AssociateDetailNotfoundException;
public class PayrollServicesImpl implements PayrollServices {
	
	private AssociateDAO associateDao;
	public PayrollServicesImpl() {
		associateDao=new AssociateDaoImpl();
		}
	public PayrollServicesImpl(AssociateDAO associateDao) {
		super();
		this.associateDao=associateDao;
	}
	
	@Override
	public int acceptAssociateDetails(String firstName, String LastName, String emailId, String department,
			String designation, String pancard, int YearlyInvestmentUnder80C,int basicSalary,int epf,int companyPf,int accountNumber,String bankName,String ifscCode) {
		Associate associate=new Associate(YearlyInvestmentUnder80C, firstName, LastName, department, designation, pancard, emailId,new Salary(basicSalary, epf, companyPf),
			new BankDetails(accountNumber,bankName,ifscCode));
	associate=associateDao.save(associate);
	return associate.getassociateId();
	}

	@Override
	public double calculateNetSalary(int associateId) throws AssociateDetailNotfoundException {
		Associate associate=getAssociateDetails(associateId);
		double slab1=associate.getsalary().getBasicSalary()-(250000+associate.getyearlyInvestmentUnder8oC()+associate.getsalary().getCompanyPf()+associate.getsalary().getEpf());
		double slab2=slab1-500000;
		double slab3=slab2-1000000;
		double NetSalary;
		if(associate.getsalary().getBasicSalary()<=250000)
		{
			NetSalary=associate.getsalary().getBasicSalary();
		}
		else if(associate.getsalary().getBasicSalary()>250000 && associate.getsalary().getBasicSalary()<=500000) {
			NetSalary=associate.getsalary().getBasicSalary()-(slab1*0.1);
		}
		else if(associate.getsalary().getBasicSalary()>500000 && associate.getsalary().getBasicSalary()<=1000000) {
			NetSalary=associate.getsalary().getBasicSalary()-((slab1*0.1)+slab2*0.2);
		}
		else {
			NetSalary=associate.getsalary().getBasicSalary()-((slab1*0.1)+(slab2*0.2)+(slab3*0.3));
		}
		return NetSalary;
	}
	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailNotfoundException {
		Associate associate=associateDao.findOne(associateId);
		if(associate==null)
			throw new AssociateDetailNotfoundException("Associate details not found for Id"+associateId);
		return associate;
	}
	@Override
	public List<Associate> getAllAssociateDetails() {
		
		return associateDao.findAll();
	}
	}
