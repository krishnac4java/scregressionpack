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
		ObjectRepositoryMain.loginQA();
	}
	@After
	public void Final_Steps_To_Close() throws Exception {
		Thread.sleep(8000);
		ObjectRepositoryMain.closeChrome();
	}
	@Test
	public void AccountCreation_CustomerRT_SalesOpsUser() throws Exception {
		user = "Automation_SalesOps";
		AccountCreation_CustomerRT();
	}
	@Test
	public void AccountCreation_CustomerRT_SDRUser() throws Exception {
		user = "automation_SDR";
		AccountCreation_CustomerRT();
	}
	@Test
	public void AccountCreation_CustomerRT_SalesUser() throws Exception {
		user = "automation_sales";
		AccountCreation_CustomerRT();
	}
	@Test
	public void AccountCreation_CustomerRT_PamUSer() throws Exception {
		user = "automation_pam";
		AccountCreation_CustomerRT();
	}
	@Test
	public void AccountCreation_CustomerRT_MopsUSer() throws Exception {
		user = "automation_mops";
		AccountCreation_CustomerRT();
	}
	@Test
	public void AccountCreation_CustomerRT() throws Exception {
		ObjectRepositoryMain.proxySalesOpsUser(user);
		ObjectRepositoryMain.clickAccountsTab();
		if(user.equals("Automation_SalesOps"))
			ObjectRepositoryMain.selectCustomerRecord();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
	}
	
	@Test
	public void AccountCreation_AccRqstRcrd() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectAccRqstRT();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("AccRT", sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}
	
	@Test
	public void AccountCreation_Competitor() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCompetitorRT();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("CompRT", sdf.format(todayDate));
	}
	
	@Test
	public void AccountCreation_Program() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectProgramRT();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("PRT", sdf.format(todayDate));
	}

}
