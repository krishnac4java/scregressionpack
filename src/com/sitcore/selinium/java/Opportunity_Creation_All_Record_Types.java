package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Opportunity_Creation_All_Record_Types {

	private static Date todayDate = new Date();
	private static String emailbody = "", opportunityName="";
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	@Rule
    public TestRule watcher = new TestWatcher() {
        @Override
        protected void succeeded(Description description) {
        	if(!description.getMethodName().equals("sendEmail")) {
        		emailbody += description.getMethodName()+":			Pass!			OpportunityName: "+opportunityName+"\n";
        		
        	}
        }

        @Override
        protected void failed(Throwable e, Description description) {
        	if(!description.getMethodName().equals("sendEmail"))
        		emailbody += description.getMethodName()+":			Fail! \n";
        }
    };
	@Test
	public void SalesOps_CustomerAccountRT_ContactRT_Opp_Product_Creation() throws Exception {

		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_PAM();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCustomerRecord();
		Thread.sleep(2000);
		ObjectRepositoryMain.SalesOps_AccounCustomerRT_Creation();
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		opportunityName = sdf.format(todayDate);
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}

	//@Test
	public void SDR_AccountRequestRT_ContactRT_Opp_Product_Creation() throws Exception {

		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SDR();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.SDR_AccounRequestRT_Creation(sdf.format(todayDate));
		Thread.sleep(2000);
		// ObjectRepositoryMain.SalesOps_AccounCustomerRT_Creation();
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		//ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SDR_ContactRT_Creation(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		opportunityName = sdf.format(todayDate);
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}

	@Test
	public void Sales_CustomerAccountRT_ContactRT_Opp_Product_Creation() throws Exception {

		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_Sales();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(2000);
		
		ObjectRepositoryMain.Sales_AccountRequestRT_Creation(sdf.format(todayDate));
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		todayDate = new Date();
		ObjectRepositoryMain.Sales_ContactRT_Creation(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		opportunityName = sdf.format(todayDate);
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}

	//@Test
	public void PartnerAllianceMgr_CustomerAccountRT_ContactRT_Opp_Product_Creation() throws Exception {

		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_PAM();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCustomerRecord();
		Thread.sleep(2000);
		ObjectRepositoryMain.SalesOps_AccounCustomerRT_Creation();
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		//ObjectRepositoryMain.fillContactFormAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		opportunityName = sdf.format(todayDate);
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}

	//@Test
	public void MarketOps_CustomerAccountRT_ContactRT_Opp_Product_Creation() throws Exception {

		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_MarketOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.MarketOps_AccountRequestRT_Creation(sdf.format(todayDate));
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		todayDate = new Date();
		ObjectRepositoryMain.MarketOps_ContactRT_Creation(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		opportunityName = sdf.format(todayDate);
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}

	/*
	 * @Test public void opportunityCreation_CustomerRT() throws Exception {
	 * ObjectRepositoryMain.launchChrome(); ObjectRepositoryMain.loginUser();
	 * ObjectRepositoryMain.clickAccountsTabAndNew();
	 * ObjectRepositoryMain.selectCustomerRecord(); todayDate = new Date();
	 * ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
	 * ObjectRepositoryMain.createNewContact();
	 * ObjectRepositoryMain.selectContactRecordType(); todayDate = new Date(); // VJ
	 * to add Funnel status
	 * ObjectRepositoryMain.fillContactFormAndSave(sdf.format(todayDate));
	 * ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate)+
	 * "CCRT"); ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate)); }
	 */
	@Test
	public void zSendEmail() {
		SendEmail.sendEMail(emailbody, "Automated_Regression_Pack");
	}

}