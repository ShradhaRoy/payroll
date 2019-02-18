package com.cg.payroll.client;

import com.cg.payroll.util.PayrollDBUtil;

public abstract class TestMain {

	public static void main(String[] args) {
		PayrollDBUtil.getDBConnection();
		System.out.println("The Connection is open");
		

	}

}
