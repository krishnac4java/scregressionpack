package com.sitcore.selinium.java;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class US_1292 {
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
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_AccountCustomerRT_Creation(accountName);
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(contactName);
		Thread.sleep(1000);
		ObjectRepositoryMain.clickOnContacts_Related_Tab(contactName);
		ObjectRepositoryMain.clickOnAddToCampaign();
		Thread.sleep(1000);
		String campaignName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.contact_newCampaign(campaignName);
		ObjectRepositoryMain.contact_chooseCampaign();
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		String leadName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.salesOps_LeadGeneration_Lead_Creation(accountName, leadName);
		//ObjectRepositoryMain.contact_selectCampaign(campaignName);
		//ObjectRepositoryMain.contact_chooseCampaign();
		//ObjectRepositoryMain.verifyTestRecordChecbox();
		ObjectRepositoryMain.closeChrome();
	}

}
