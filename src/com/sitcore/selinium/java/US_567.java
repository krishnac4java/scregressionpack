package com.sitcore.selinium.java;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


public class US_567 {
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
		resultModel.setMethodName("User Story - 567");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_MarketOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickLeadTab();
		Thread.sleep(1000);
		ObjectRepositoryMain.verifyFields_567();
		ObjectRepositoryMain.closeChrome();
	}

}
