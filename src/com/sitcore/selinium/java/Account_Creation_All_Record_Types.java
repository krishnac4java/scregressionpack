package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Account_Creation_All_Record_Types {
	
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	private static String user = "Automation_SalesOps";
	@Before
	public void Initial_Steps_To_Login() throws Exception {
		ObjectRepositoryMain.launchChrome();
	}
	@After
	public void Final_Steps_To_Close() throws Exception {
		Thread.sleep(8000);
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void AccountCreation_CustomerRT_SalesOpsUser() throws Exception {
		ObjectRepositoryMain.loginAccountCrtnUser("Automation_SalesOps@sitecore.net.finaluat");
		//ObjectRepositoryMain.proxySalesOpsUser("Automation_SalesOps");
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
	}
	@Test
	public void AccountCreation_CustomerRT_SDRUser() throws Exception {
		ObjectRepositoryMain.loginAccountCrtnUser("automation_sdr@sitecore.com.finaluat");
		//ObjectRepositoryMain.proxySalesOpsUser("automation_SDR");
		ObjectRepositoryMain.clickAccountsTab();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSaveSDRUser("CRT", sdf.format(todayDate));
		
	}
	@Test
	public void AccountCreation_CustomerRT_SalesUser() throws Exception {
		ObjectRepositoryMain.loginAccountCrtnUser("automation_sales@sitecore.com.finaluat");
		//ObjectRepositoryMain.proxySalesOpsUser("automation_sales");
		ObjectRepositoryMain.clickAccountsTab();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSaveSDRUser("CRT", sdf.format(todayDate));
	}
	@Test
	public void AccountCreation_CustomerRT_PamUSer() throws Exception {
		ObjectRepositoryMain.loginAccountCrtnUser("automation_pam@sitecore.com.finaluat");
		//ObjectRepositoryMain.proxySalesOpsUser("automation_pam");
		ObjectRepositoryMain.clickAccountsTab();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSaveSDRUser("CRT", sdf.format(todayDate));
	}
	@Test
	public void AccountCreation_CustomerRT_MopsUSer() throws Exception {
		ObjectRepositoryMain.loginAccountCrtnUser("automation_mops@sitecore.com.finaluat");
		//ObjectRepositoryMain.proxySalesOpsUser("automation_mops");
		ObjectRepositoryMain.clickAccountsTab();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSaveSDRUser("CRT", sdf.format(todayDate));
	}
		
	@Test
	public void AccountCreation_AccRqstRcrd() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectAccRqstRT();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("AccRT", sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}
	
	@Test
	public void AccountCreation_Competitor() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCompetitorRT();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("CompRT", sdf.format(todayDate));
	}
	
	@Test
	public void AccountCreation_Program() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectProgramRT();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("PRT", sdf.format(todayDate));
	}

}
