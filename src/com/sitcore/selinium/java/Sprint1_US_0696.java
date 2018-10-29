package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class Sprint1_US_0696 {
	
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	
	@Test
	public void sprint1_US_0696() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCompetitorRT();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.fillContactFormAndSave(sdf.format(todayDate), "CCRT");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate)+"CCRT", _);
		ObjectRepositoryMain.takeScreenShot("sprint1_US_0696");
		Assert.assertEquals("You can't add an Opportunity to a Competitor", ObjectRepositoryMain.getXpath("//p[contains(text(),\"You can't add an Opportunity to a Competitor\")]"));
		ObjectRepositoryMain.closeChrome();
	}

}
