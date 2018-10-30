package com.sitcore.selinium.java;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class US_1383 {
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
	public void A_SalesOps_CustomerAccountRT_ContactRT_Opp_Product_Creation() throws Exception {
		//resultModel.setLoginName("Sales Operations");
		//resultModel.setMethodName("");
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("User Story - 1383");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SDR();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCustomerRecord();
		Thread.sleep(2000);
		ObjectRepositoryMain.SalesOps_AccountCustomerRT_Creation(ObjectRepositoryMain.fullNameCreation());
		//resultModel.setAccountName(sdf.format(todayDate));
		//resultModel.setAccountType("- Customer Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(contactName);
		//resultModel.setContactName(sdf.format(todayDate));
		//resultModel.setContactType("- Contact Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(ObjectRepositoryMain.fullNameCreation(), contactName);
		String funnelStatus = ObjectRepositoryMain.verifyFunnelStatus();
		Assert.assertEquals("Opportunity", funnelStatus);
		//resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}

}
