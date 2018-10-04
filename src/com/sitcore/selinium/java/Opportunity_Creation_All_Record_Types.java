package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class Opportunity_Creation_All_Record_Types {

	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	
	@Test
	public void opportunityCreation_CustomerRT() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.fillContactFormAndSave(sdf.format(todayDate), "CCRT");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate)+"CCRT");
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
	}
}
