package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


public class US_779 {
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
	public void testMethod() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("User Story - 779");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SalesOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCustomerRecord();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccountCustomerRT_Creation_US779(sdf.format(todayDate));
		/*resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Customer Record Type");*/
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(sdf.format(todayDate));
		/*resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- Contact Record Type");*/
		ObjectRepositoryMain.fillNewOpportunityFormAndSaveWithStage(sdf.format(todayDate));
		ObjectRepositoryMain.takeScreenShot("US_779");
		Assert.assertEquals("You can't add an Opportunity to a Competitor", ObjectRepositoryMain.getXpath("//lightning-messages/div/div/div/p"));
		//resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
		
	}

}
