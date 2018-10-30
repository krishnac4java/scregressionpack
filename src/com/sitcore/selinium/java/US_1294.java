package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class US_1294 {
	private static Date todayDate = new Date();
	public TestResultModel resultModel = new TestResultModel();
	
	@Rule
    public TestRule watcher = new TestWatcher() {
        @Override
        protected void succeeded(Description description) {
        	if(!description.getMethodName().equals("sendEmail")) {
        		resultModel.setTestResult("Success");
        		ObjectRepositoryMain.userStoryresultList.add(resultModel);
        		resultModel = new TestResultModel();
        		//emailbody += description.getMethodName()+":			Pass!			OpportunityName: "+opportunityName+"\n";
        		
        	}
        }

        @Override
        protected void failed(Throwable e, Description description) {
        	if(!description.getMethodName().equals("sendEmail"))
        		resultModel.setTestResult("Fail");
        		ObjectRepositoryMain.userStoryresultList.add(resultModel);
				resultModel = new TestResultModel();
        		//emailbody += description.getMethodName()+":			Fail! \n";
				try {
					ObjectRepositoryMain.closeChrome();
				} catch (Exception e1) {
					
				}
        }
    };
	@Test
	public void LeadCreation_Conversion() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("User Story - 1294");
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
		String leadName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.salesOps_LeadGeneration_Lead_Creation_WO_Account(leadName);
		ObjectRepositoryMain.convert_Lead(leadName);
		ObjectRepositoryMain.convert_Lead_clickOpportunity(leadName);
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
