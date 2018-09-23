package MasterScript1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lead_val_Rule_SAL_ToConvert {
	
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");

	public static void main (String[] args) throws Exception {
		
				
		//ObjectRepositoryMain ORM = new ObjectRepositoryMain ();
		
		/*ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.selectLeadRTandClickNext();
		ObjectRepositoryMain.createLead();	*/	
	}
	
	@Test
	public void intialization() throws Exception {
		//ObjectRepositoryMain.launchChrome();
		//ObjectRepositoryMain.loginQA();
		//ObjectRepositoryMain.clickLeadsTab();
		//ObjectRepositoryMain.selectLeadRTandClickNext();
		//ObjectRepositoryMain.createLead();
	}
	
	@Test
	public void AccountCreation_CustomerRT() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.fillContactFormAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewOpportunityFormAndSave(sdf.format(todayDate));
		ObjectRepositoryMain.fillNewProductAndSave(sdf.format(todayDate));
	}
	
	@Test
	public void AccountCreation_AccRqstRcrd() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectAccRqstRT();
		ObjectRepositoryMain.fillAccountsFormAndSave("AccRT", sdf.format(todayDate));
	}
	
	@Test
	public void AccountCreation_Competitor() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCompetitorRT();
		ObjectRepositoryMain.fillAccountsFormAndSave("CompRT", sdf.format(todayDate));
	}
	
	@Test
	public void AccountCreation_Program() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectProgramRT();
		ObjectRepositoryMain.fillAccountsFormAndSave("PRT", sdf.format(todayDate));
	}
	
	/*@Test
	public void TESTUATAccountCreation() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.scrollTest();
	}*/
	
}
	






