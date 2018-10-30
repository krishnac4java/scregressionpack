package com.sitcore.selinium.java;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Opportunity_Creation_All_Record_Types {

	public TestResultModel resultModel = new TestResultModel();
	@Rule
    public TestRule watcher = new TestWatcher() {
        @Override
        protected void succeeded(Description description) {
        	if(!description.getMethodName().equals("sendEmail")) {
        		resultModel.setTestResult("Success");
        		ObjectRepositoryMain.resultList.add(resultModel);
        		resultModel = new TestResultModel();
        		//emailbody += description.getMethodName()+":			Pass!			OpportunityName: "+opportunityName+"\n";
        		
        	}
        }

        @Override
        protected void failed(Throwable e, Description description) {
        	if(!description.getMethodName().equals("sendEmail"))
        		resultModel.setTestResult("Fail");
		    	ObjectRepositoryMain.resultList.add(resultModel);
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
	@Test
	public void B_SalesOps_CustomerAccountRT_SDRRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SDRRT_Opp_Product_Creation");
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
		ObjectRepositoryMain.selectSDRRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_SDRRT_Creation(contactName);
		resultModel.setContactName(contactName);
		resultModel.setContactType("- SDR Record Type");
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(opportunityName, contactName);
		resultModel.setOpportunityName(opportunityName);
		ObjectRepositoryMain.fillNewProductAndSave(opportunityName);
		ObjectRepositoryMain.closeChrome();
	}
	
	@Test
	public void C_SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation");
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
		ObjectRepositoryMain.selectSalesRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_SalesRT_Creation(contactName);
		resultModel.setContactName(contactName);
		resultModel.setContactType("- Sales Record Type");
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(opportunityName, contactName);
		resultModel.setOpportunityName(opportunityName);
		ObjectRepositoryMain.fillNewProductAndSave(opportunityName);
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void D_SalesOps_AccountRequestRT_ContactRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SalesOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectAccountRequestRT();
		Thread.sleep(2000);
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_AccountRequestRT_Creation(accountName);
		resultModel.setAccountName(accountName);
		resultModel.setAccountType("- Account Request Record Type");
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
	
	@Test
	public void E_SalesOps_AccountRequestRT_SDRRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SalesOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectAccountRequestRT();
		Thread.sleep(2000);
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_AccountRequestRT_Creation(accountName);
		resultModel.setAccountName(accountName);
		resultModel.setAccountType("- Account Request Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectSDRRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_SDRRT_Creation(contactName);
		resultModel.setContactName(contactName);
		resultModel.setContactType("- SDR Record Type");
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(opportunityName, contactName);
		resultModel.setOpportunityName(opportunityName);
		ObjectRepositoryMain.fillNewProductAndSave(opportunityName);
		ObjectRepositoryMain.closeChrome();
	}
	
	@Test
	public void F_SalesOps_AccountRequestRT_SalesRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SalesOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectAccountRequestRT();
		Thread.sleep(2000);
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_AccountRequestRT_Creation(accountName);
		resultModel.setAccountName(accountName);
		resultModel.setAccountType("- Account Request Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectSalesRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_SalesRT_Creation(contactName);
		resultModel.setContactName(contactName);
		resultModel.setContactType("- Sales Record Type");
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(opportunityName, contactName);
		resultModel.setOpportunityName(opportunityName);
		ObjectRepositoryMain.fillNewProductAndSave(opportunityName);
		ObjectRepositoryMain.closeChrome();
	}
	
	@Test
	public void G_SalesOps_CompetitortRT_ContactRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation");
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
		resultModel.setAccountName(accountName);
		resultModel.setAccountType("- Competitor Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.SalesOps_AccountCompetitor_createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_ContactRT_Creation(contactName);
		resultModel.setContactName(contactName);
		resultModel.setContactType("- Contact Record Type");
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSaveWOCloseDate(opportunityName, contactName);
		ObjectRepositoryMain.takeScreenShot("SalesOps_CompetitortRT_ContactRT_Opp_Product_Creation");
		Assert.assertEquals("You can't add an Opportunity to a Competitor", ObjectRepositoryMain.getXpath("//lightning-messages/div/div/div/p"));
		/*resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));*/
		ObjectRepositoryMain.closeChrome();
	}
	
	@Test
	public void H_SalesOps_CompetitortRT_SDRRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CustomerAccountRT_SalesRT_Opp_Product_Creation");
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
		resultModel.setAccountName(accountName);
		resultModel.setAccountType("- Competitor Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.SalesOps_AccountCompetitor_createNewContact();
		ObjectRepositoryMain.selectSDRRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_SDRRT_Creation(contactName);
		resultModel.setContactName(contactName);
		resultModel.setContactType("- SDR Record Type");
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSaveWOCloseDate(opportunityName, contactName);
		ObjectRepositoryMain.takeScreenShot("SalesOps_CompetitortRT_ContactRT_Opp_Product_Creation");
		Assert.assertEquals("You can't add an Opportunity to a Competitor", ObjectRepositoryMain.getXpath("//lightning-messages/div/div/div/p"));
		/*resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));*/
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void I_SalesOps_CompetitortRT_SalesRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_CompetitortRT_SalesRT_Opp_Product_Creation");
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
		resultModel.setAccountName(accountName);
		resultModel.setAccountType("- Competitor Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.SalesOps_AccountCompetitor_createNewContact();
		ObjectRepositoryMain.selectSalesRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_SalesRT_Creation(contactName);
		resultModel.setContactName(contactName);
		resultModel.setContactType("- Sales Record Type");
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSaveWOCloseDate(opportunityName, contactName);
		ObjectRepositoryMain.takeScreenShot("SalesOps_CompetitortRT_ContactRT_Opp_Product_Creation");
		Assert.assertEquals("You can't add an Opportunity to a Competitor", ObjectRepositoryMain.getXpath("//lightning-messages/div/div/div/p"));
		/*resultModel.setOpportunityName(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));*/
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void J_SalesOps_ProgramRecordRT_ContactRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_ProgramRecordRT_ContactRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SalesOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectProgramRT();
		Thread.sleep(2000);
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_AccountProgramRT_Creation(accountName);
		resultModel.setAccountName(accountName);
		resultModel.setAccountType("- Program Record Type");
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
	
	@Test
	public void K_SalesOps_ProgramRecordRT_SDRRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_ProgramRecordRT_ContactRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SalesOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectProgramRT();
		Thread.sleep(2000);
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_AccountProgramRT_Creation(accountName);
		resultModel.setAccountName(accountName);
		resultModel.setAccountType("- Program Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectSDRRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_SDRRT_Creation(contactName);
		resultModel.setContactName(contactName);
		resultModel.setContactType("- SDR Record Type");
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(opportunityName, contactName);
		resultModel.setOpportunityName(opportunityName);
		ObjectRepositoryMain.fillNewProductAndSave(opportunityName);
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void L_SalesOps_ProgramRecordRT_SalesRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales Operations");
		resultModel.setMethodName("SalesOps_ProgramRecordRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_SalesOps();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(1000);
		ObjectRepositoryMain.selectProgramRT();
		Thread.sleep(2000);
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_AccountProgramRT_Creation(accountName);
		resultModel.setAccountName(accountName);
		resultModel.setAccountType("- Program Record Type");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectSalesRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_SalesRT_Creation(contactName);
		resultModel.setContactName(contactName);
		resultModel.setContactType("- Sales Record Type");
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(opportunityName, contactName);
		resultModel.setOpportunityName(opportunityName);
		ObjectRepositoryMain.fillNewProductAndSave(opportunityName);
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
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SDR_AccounRequestRT_Creation(accountName);
		Thread.sleep(2000);
		// ObjectRepositoryMain.SalesOps_AccounCustomerRT_Creation();
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		//ObjectRepositoryMain.selectContactRecordType();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_SDRRT_Creation(contactName);
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(opportunityName, contactName);
		ObjectRepositoryMain.fillNewProductAndSave(opportunityName);
		ObjectRepositoryMain.closeChrome();
	}

	//@Test
	public void M_Sales_CustomerAccountRT_ContactRT_Opp_Product_Creation() throws Exception {
		resultModel.setLoginName("Sales");
		resultModel.setMethodName("SalesOps_ProgramRecordRT_SalesRT_Opp_Product_Creation");
		ObjectRepositoryMain.launchChrome();
		Thread.sleep(1000);
		ObjectRepositoryMain.loginUser_Sales();
		Thread.sleep(3000);
		ObjectRepositoryMain.clickAccountsTabAndNew();
		Thread.sleep(2000);
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.Sales_AccountRequestRT_Creation(accountName);
		resultModel.setAccountName(accountName);
		resultModel.setAccountType("");
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.Sales_ContactRT_Creation(contactName);
		resultModel.setContactName(contactName);
		resultModel.setContactType("");
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(opportunityName, contactName);
		resultModel.setOpportunityName(opportunityName);
		ObjectRepositoryMain.fillNewProductAndSave(opportunityName);
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
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.SalesOps_AccountCustomerRT_Creation(accountName);
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		//ObjectRepositoryMain.fillContactFormAndSave(sdf.format(todayDate));
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(opportunityName, opportunityName);
		ObjectRepositoryMain.fillNewProductAndSave(opportunityName);
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
		String accountName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.MarketOps_AccountRequestRT_Creation(accountName);
		Thread.sleep(1000);
		ObjectRepositoryMain.click_Save_Button();
		Thread.sleep(1000);
		ObjectRepositoryMain.createNewContact();
		String contactName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.MarketOps_ContactRT_Creation(contactName);
		String opportunityName = ObjectRepositoryMain.fullNameCreation();
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(opportunityName, contactName);
		ObjectRepositoryMain.fillNewProductAndSave(opportunityName);
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

}