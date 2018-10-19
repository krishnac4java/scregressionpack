package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class US_1292 {
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	@Test
	public void SalesOps_AccountCustomerRT_LeadGeneration_Lead_Creation() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser_SalesOps();
		ObjectRepositoryMain.clickAccountsTabAndNew();
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
		ObjectRepositoryMain.contact_chooseCampaign();
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		todayDate = new Date();
		ObjectRepositoryMain.salesOps_LeadGeneration_Lead_Creation(accountName, sdf.format(todayDate));
		//ObjectRepositoryMain.contact_selectCampaign(campaignName);
		//ObjectRepositoryMain.contact_chooseCampaign();
		//ObjectRepositoryMain.verifyTestRecordChecbox();
	}

}
