package com.sitcore.selinium.java;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class US_696 {
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
		resultModel.setMethodName("User Story - 1075");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SalesOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCompetitorRT();
		Thread.sleep(2000);
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_AccountCompetitorRT_Creation(accountName);
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.SalesOps_AccountCompetitor_createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(contactName);
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSaveWOCloseDate(opportunityName, contactName);
		ObjectRepositoryMain.takeScreenShot("User Story - 696");
		Assert.assertEquals("You can't add an Opportunity to a Competitor", ObjectRepositoryMain.getXpath("//lightning-messages/div/div/div/p"));
		/*resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));*/
		ObjectRepositoryMain.closeChrome();
	}

}
