package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class Lead_Creation_All_Record_Types {

	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");

	@Test
	public void SalesOps_AccountCustomerRT_LeadGeneration_Lead_Creation() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser_SalesOps();
		ObjectRepositoryMain.clickAccountsTabAndNew();
		ObjectRepositoryMain.selectCustomerRecord();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccountCustomerRT_Creation(sdf.format(todayDate));
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		String accountName = sdf.format(todayDate); 
		todayDate = new Date();
		ObjectRepositoryMain.salesOps_LeadGeneration_Lead_Creation(accountName, sdf.format(todayDate));
		ObjectRepositoryMain.verifyTestRecordChecbox();
	}
	@Test
	public void LeadCreation_AM_CustomerRT() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser_SalesOps();
		ObjectRepositoryMain.clickAccountsTabAndNew();
		ObjectRepositoryMain.selectCustomerRecord();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.actMgmtLeadGenType();
		ObjectRepositoryMain.salesOps_LeadGeneration_Lead_Creation("AMRT", sdf.format(todayDate));
	}
	@Test
	public void LeadCreation_SDRG_CustomerRT() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser_SalesOps();
		ObjectRepositoryMain.clickAccountsTabAndNew();
		ObjectRepositoryMain.selectCustomerRecord();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.sdrGenLeadGenType();
		ObjectRepositoryMain.salesOps_LeadGeneration_Lead_Creation("SDRGRT", sdf.format(todayDate));
	}
	@Test
	public void LeadCreation_SRT_CustomerRT() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser_SalesOps();
		ObjectRepositoryMain.clickAccountsTabAndNew();
		ObjectRepositoryMain.selectCustomerRecord();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.salesRTtLeadGenType();
		ObjectRepositoryMain.salesOps_LeadGeneration_Lead_Creation("SRTRT", sdf.format(todayDate));
	}

}
