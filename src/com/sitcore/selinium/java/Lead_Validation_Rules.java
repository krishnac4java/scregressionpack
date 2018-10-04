package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Lead_Validation_Rules {
	
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	private static String emailbody = "";
	
	@Rule
    public TestRule watcher = new TestWatcher() {
        @Override
        protected void succeeded(Description description) {
        	if(!description.getMethodName().equals("sendEmail"))
        		emailbody += description.getMethodName()+":			Pass! \n";
        }

        @Override
        protected void failed(Throwable e, Description description) {
        	if(!description.getMethodName().equals("sendEmail"))
        		emailbody += description.getMethodName()+":			Fail! \n";
        }
    };
	
	@Test
	public void LeadValidationRule_Account_Mandatory_SQL_Stage() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		ObjectRepositoryMain.saveLeadWOAccount("LGRT", sdf.format(todayDate));
		ObjectRepositoryMain.takeScreenShot("LeadValidationRule_Account_Mandatory_SQL_Stage");
		Assert.assertEquals("Review the errors on this page.", ObjectRepositoryMain.getGenericError());
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void LeadValidationRule_Covert_With_Funnel_Stage_SQL() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		ObjectRepositoryMain.saveLeadWIncrtStage("LGRT", sdf.format(todayDate));
		ObjectRepositoryMain.takeScreenShot("LeadValidationRule_Covert_With_Funnel_Stage_SQL");
		Assert.assertEquals("Review the errors on this page.", ObjectRepositoryMain.getGenericError());
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void LeadValidationRule_CountryMandatory() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		ObjectRepositoryMain.saveLeadWOCntry("LGRT", sdf.format(todayDate));
		ObjectRepositoryMain.takeScreenShot("LeadValidationRule_CountryMandatory");
		Assert.assertEquals("Review the errors on this page.", ObjectRepositoryMain.getGenericError());
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void LeadValidationRule_Disqualification_Reason_Mandatory() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		ObjectRepositoryMain.saveLeadWStatusDisqlfd("LGRT", sdf.format(todayDate));
		ObjectRepositoryMain.takeScreenShot("LeadValidationRule_Disqualification_Reason_Mandatory");
		Assert.assertEquals("Review the errors on this page.", ObjectRepositoryMain.getGenericError());
		ObjectRepositoryMain.closeChrome();
	}

	@Test
	public void zSendEmail() {
		SendEmail.sendEMail(emailbody, "Automated_Regression_Pack");
	}
}
