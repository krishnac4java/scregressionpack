package com.sitcore.selinium.java;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


public class US_478 {
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
		resultModel.setMethodName("User Story - 478");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_MarketOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickLeadsTab();
		Thread.sleep(1000);
		String leadFullName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.leadGeneration("",leadFullName);
		Thread.sleep(1000);
		ObjectRepositoryMain.clickEdit();
		ObjectRepositoryMain.changeType_US_478();
		ObjectRepositoryMain.takeScreenShot("US_478");
		Assert.assertEquals("Ensure BANT Score is at-least 3 before Lead can be Passed onto SQL", ObjectRepositoryMain.getXpath("//div[3]/div/ul/li"));
		//resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
		
	}

}
