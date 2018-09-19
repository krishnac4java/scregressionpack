package MasterScript1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lead_val_Rule_SAL_ToConvert {
		
	public static void main (String[] args) throws Exception {
		
				
		//ObjectRepositoryMain ORM = new ObjectRepositoryMain ();
		
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.selectLeadRTandClickNext();
		ObjectRepositoryMain.createLead();		
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
	public void FinalUATAccountCreation() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginFinalUAT();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		ObjectRepositoryMain.fillAccountsFormAndSave();
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		ObjectRepositoryMain.fillContactFormAndSave();
	}
	
	@Test
	public void TESTUATAccountCreation() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginFinalUAT();
		ObjectRepositoryMain.scrollTest();
	}
	
}
	






