package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

public class US_1294 {
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	@Test
	public void LeadCreation_Conversion() throws Exception {
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
		ObjectRepositoryMain.convert_Lead_clickOpportunity(sdf.format(todayDate));
		String closeDate = ObjectRepositoryMain.verifyDate_ConvertedLead();
		SimpleDateFormat sm = new SimpleDateFormat("mm/dd/yyyy");
		Date closedDate = sm.parse(closeDate);
		todayDate.setHours(0);
		todayDate.setMinutes(0);
		todayDate.setSeconds(0);
		closedDate.setHours(0);
		closedDate.setMinutes(0);
		closedDate.setSeconds(0);
		long diff = closedDate.getTime() - todayDate.getTime();
		long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		Assert.assertEquals(90,days);
		ObjectRepositoryMain.closeChrome();
		//ObjectRepositoryMain.contact_selectCampaign(campaignName);
		//ObjectRepositoryMain.contact_chooseCampaign();
		//ObjectRepositoryMain.verifyTestRecordChecbox();
	}

}
