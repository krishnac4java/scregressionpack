package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

public class US_512 {
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	@Test
	public void salesOps_VerfyAccountFields() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser_SalesOps();
		ObjectRepositoryMain.clickAccountsTabAndNew();
		ObjectRepositoryMain.selectCustomerRecord();
		Thread.sleep(5000);
		ObjectRepositoryMain.salesops_verifyAccountField_CompositRiskScore();
		ObjectRepositoryMain.salesops_verifyAccountField_PaymentDefaultRisk();
		ObjectRepositoryMain.closeChrome();
	}

}
