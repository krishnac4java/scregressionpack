package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

public class US_1383 {
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	@Test
	public void A_SalesOps_CustomerAccountRT_ContactRT_Opp_Product_Creation() throws Exception {
		//resultModel.setLoginName("Sales Operations");
		//resultModel.setMethodName("");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SDR();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCustomerRecord();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccountCustomerRT_Creation(sdf.format(todayDate));
		//resultModel.setAccountName(sdf.format(todayDate));
		//resultModel.setAccountType("- Customer Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(sdf.format(todayDate));
		//resultModel.setContactName(sdf.format(todayDate));
		//resultModel.setContactType("- Contact Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		String funnelStatus = ObjectRepositoryMain.verifyFunnelStatus();
		Assert.assertEquals("Opportunity", funnelStatus);
		//resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}

}
