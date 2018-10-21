package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class US_1292 {
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
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
	public void SalesOps_AccountCustomerRT_LeadGeneration_Lead_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("User Story - 1292");
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
		ObjectRepositoryMain.closeChrome();
	}

}
