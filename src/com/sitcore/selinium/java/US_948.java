package com.sitcore.selinium.java;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class US_948 {
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
	public void salesOps_VerfyAccountFields() throws Exception {
		
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SalesOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCustomerRecord();
		Thread.sleep(2000);
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_AccountCustomerRT_Creation(accountName);
		resultModel.setAccountName(accountName);
		resultModel.setAccountType("- Customer Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(contactName);
		resultModel.setContactName(contactName);
		resultModel.setContactType("- Contact Record Type");
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(opportunityName, contactName);
		resultModel.setOpportunityName(opportunityName);
		ObjectRepositoryMain.fillNewProductAndSave(opportunityName);
		ObjectRepositoryMain.closeChrome();
		
	}

}
