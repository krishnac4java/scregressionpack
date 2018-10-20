package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

public class US_1293 {
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	@Test
	public void LeadCreation_ContactUSComment() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser_SalesOps();
		/*ObjectRepositoryMain.clickAccountsTabAndNew();
		ObjectRepositoryMain.selectCustomerRecord();
		todayDate = new Date();
		String accountName = sdf.format(todayDate);
		ObjectRepositoryMain.SalesOps_AccountCustomerRT_Creation(sdf.format(todayDate));
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		String contactName = sdf.format(todayDate);
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(sdf.format(todayDate));
		Thread.sleep(1000);
		ObjectRepositoryMain.clickOnContacts_Related_Tab(contactName);
		ObjectRepositoryMain.clickOnAddToCampaign();
		Thread.sleep(1000);
		todayDate = new Date();
		String campaignName = sdf.format(todayDate);
		ObjectRepositoryMain.contact_newCampaign(sdf.format(todayDate));
		ObjectRepositoryMain.contact_chooseCampaign();*/
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		todayDate = new Date();
		ObjectRepositoryMain.salesOps_LeadGeneration_Lead_Creation_WO_Account(sdf.format(todayDate));
		ObjectRepositoryMain.convert_Lead(sdf.format(todayDate));
		ObjectRepositoryMain.convert_Lead_clickContact(sdf.format(todayDate));
		String contactUSComment = ObjectRepositoryMain.verify_ContactUsComment(sdf.format(todayDate));
		Assert.assertEquals("ContactUsComment", contactUSComment);
		ObjectRepositoryMain.closeChrome();
	}

}
