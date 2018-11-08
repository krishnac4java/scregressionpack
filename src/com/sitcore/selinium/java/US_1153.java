package com.sitcore.selinium.java;

import java.util.Date;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


public class US_1153 {
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
	public void testMethod() throws Exception {
    	resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("User Story - 1075");
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser_SalesOps();
		ObjectRepositoryMain.clickAccountsTabAndNew();
		ObjectRepositoryMain.selectCustomerRecord();
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_AccountCustomerRT_Creation(accountName);
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		ObjectRepositoryMain.salesOps_LeadGeneration_Lead_Creation(accountName, ObjectRepositoryMain.fullNameCreation());
		ObjectRepositoryMain.verifyTestRecordChecbox();
	}

}
