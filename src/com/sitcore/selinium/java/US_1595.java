package com.sitcore.selinium.java;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


public class US_1595 {
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
		resultModel.setMethodName("User Story - 1595");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SalesOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickContactsTab();
		ObjectRepositoryMain.clickNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectContactRecordType();
		ObjectRepositoryMain.verifyTentativeRelationshipType_Fields_1595();
		Thread.sleep(1000);
		ObjectRepositoryMain.clickNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectSDRRecordType();
		ObjectRepositoryMain.verifyTentativeRelationshipType_Fields_1595();
		Thread.sleep(1000);
		ObjectRepositoryMain.clickNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectSalesRecordType();
		ObjectRepositoryMain.verifyTentativeRelationshipType_Fields_1595();
		Thread.sleep(1000);
		ObjectRepositoryMain.closeChrome();
	}

}
