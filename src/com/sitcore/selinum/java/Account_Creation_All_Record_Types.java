package MasterScript1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class Account_Creation_All_Record_Types {
	
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	
	@Test
	public void AccountCreation_CustomerRT() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
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
