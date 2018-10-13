package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
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
	private static List<TestResultModel> resultList = new ArrayList<TestResultModel>();
	public TestResultModel resultModel = new TestResultModel();
	@Rule
    public TestRule watcher = new TestWatcher() {
        @Override
        protected void succeeded(Description description) {
        	if(!description.getMethodName().equals("sendEmail")) {
        		resultModel.setTestResult("Success");
        		resultList.add(resultModel);
        		resultModel = new TestResultModel();
        		//emailbody += description.getMethodName()+":			Pass!			OpportunityName: "+opportunityName+"\n";
        		
        	}
        }

        @Override
        protected void failed(Throwable e, Description description) {
        	if(!description.getMethodName().equals("sendEmail"))
        		resultModel.setTestResult("Fail");
		    	resultList.add(resultModel);
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
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SDR();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCustomerRecord();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccounCustomerRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Customer Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- Contact Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
		
	}
	@Test
	public void B_SalesOps_CustomerAccountRT_SDRRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SDRRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SDR();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCustomerRecord();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccounCustomerRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Customer Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectSDRRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_SDRRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- SDR Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}
	
	@Test
	public void C_SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SDR();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCustomerRecord();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccounCustomerRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Customer Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectSalesRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_SalesRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- Sales Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void D_SalesOps_AccountRequestRT_ContactRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SDR();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectAccountRequestRT();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccountRequestRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Account Request Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- Contact Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}
	
	@Test
	public void E_SalesOps_AccountRequestRT_SDRRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_PAM();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectAccountRequestRT();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccountRequestRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Account Request Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectSDRRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_SDRRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- SDR Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}
	
	@Test
	public void F_SalesOps_AccountRequestRT_SalesRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_PAM();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectAccountRequestRT();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccountRequestRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Account Request Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectSalesRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_SalesRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- Sales Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}
	
	//Cannot create opportunity for competitor is the error
	@Test
	public void G_SalesOps_CompetitortRT_ContactRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_PAM();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCompetitorRT();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccountCompetitorRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Competitor Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.SalesOps_AccountCompetitor_createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- Contact Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.takeScreenShot("SalesOps_CompetitortRT_ContactRT_Opp_Product_Creation");
		Assert.assertEquals("Review the errors on this page.", ObjectRepositoryMain.getGenericError());
		resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}
	
	@Test
	public void H_SalesOps_CompetitortRT_SDRRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_PAM();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCompetitorRT();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccountCompetitorRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Competitor Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.SalesOps_AccountCompetitor_createNewContact();
		ObjectRepositoryMain.selectSDRRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_SDRRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- SDR Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.takeScreenShot("SalesOps_CompetitortRT_ContactRT_Opp_Product_Creation");
		Assert.assertEquals("Review the errors on this page.", ObjectRepositoryMain.getGenericError());
		resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void I_SalesOps_CompetitortRT_SalesRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CompetitortRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_MarketOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectCompetitorRT();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccountCompetitorRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Competitor Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.SalesOps_AccountCompetitor_createNewContact();
		ObjectRepositoryMain.selectSalesRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_SalesRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- Sales Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.takeScreenShot("SalesOps_CompetitortRT_SalesRT_Opp_Product_Creation");
		Assert.assertEquals("Review the errors on this page.", ObjectRepositoryMain.getGenericError());
		resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void J_SalesOps_ProgramRecordRT_ContactRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_ProgramRecordRT_ContactRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_MarketOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectProgramRT();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccountProgramRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Program Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- Contact Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}
	
	@Test
	public void K_SalesOps_ProgramRecordRT_SDRRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_ProgramRecordRT_ContactRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_MarketOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectProgramRT();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccountProgramRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Program Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectSDRRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_SDRRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- SDR Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void L_SalesOps_ProgramRecordRT_SalesRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_ProgramRecordRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_MarketOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectProgramRT();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccountProgramRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("- Program Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectSalesRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_SalesRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("- Sales Record Type");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		resultModel.setOpportunityName(sdf.format(todayDate));
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
		ObjectRepositoryMain.SalesOps_SDRRT_Creation(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		opportunityName = sdf.format(todayDate);
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}

	@Test
	public void M_Sales_CustomerAccountRT_ContactRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales");
		resultModel.setMethodName("SalesOps_ProgramRecordRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_Sales();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(2000);
		todayDate = new Date();
		ObjectRepositoryMain.Sales_AccountRequestRT_Creation(sdf.format(todayDate));
		resultModel.setAccountName(sdf.format(todayDate));
		resultModel.setAccountType("");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		todayDate = new Date();
		ObjectRepositoryMain.Sales_ContactRT_Creation(sdf.format(todayDate));
		resultModel.setContactName(sdf.format(todayDate));
		resultModel.setContactType("");
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		resultModel.setOpportunityName(sdf.format(todayDate));
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
		todayDate = new Date();
		ObjectRepositoryMain.SalesOps_AccounCustomerRT_Creation(sdf.format(todayDate));
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
		SendEmail.sendEMail(emailbody, "Automated_Regression_Pack", resultList);
	}

}