package MasterScript1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
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
		ObjectRepositoryMain.fillContactFormAndSave(sdf.format(todayDate), "CCRT");
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
	
	@Test
	public void ContactCreation_CustomerRT() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		todayDate = new Date();
		ObjectRepositoryMain.fillAccountsFormAndSave("CCRT", sdf.format(todayDate));
		ObjectRepositoryMain.createNewContact();
		ObjectRepositoryMain.selectContactRecordType();
		todayDate = new Date();
		ObjectRepositoryMain.fillContactFormAndSave(sdf.format(todayDate), "CCRT");
	}
	@Test
	public void LeadCreation_LG_CustomerRT() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		ObjectRepositoryMain.fillFormAndSaveLead("LGRT", sdf.format(todayDate));
		ObjectRepositoryMain.verifyTestRecordChecbox();
	}
	@Test
	public void LeadCreation_AM_CustomerRT() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.actMgmtLeadGenType();
		ObjectRepositoryMain.fillFormAndSaveLead("AMRT", sdf.format(todayDate));
	}
	@Test
	public void LeadCreatio_SDRG_CustomerRT() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.sdrGenLeadGenType();
		ObjectRepositoryMain.fillFormAndSaveLead("SDRGRT", sdf.format(todayDate));
	}
	@Test
	public void LeadCreation_SRT_CustomerRT() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.salesRTtLeadGenType();
		ObjectRepositoryMain.fillFormAndSaveLead("SRTRT", sdf.format(todayDate));
	}
	@Test
	public void LeadCrtn_ActMndtry() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		ObjectRepositoryMain.saveLeadWOAccount("LGRT", sdf.format(todayDate));
		Assert.assertEquals("Review the errors on this page.", ObjectRepositoryMain.getGenericError());
	}
	@Test
	public void LeadCrtn_StageIncrt() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		ObjectRepositoryMain.saveLeadWIncrtStage("LGRT", sdf.format(todayDate));
		Assert.assertEquals("Review the errors on this page.", ObjectRepositoryMain.getGenericError());
	}
	@Test
	public void LeadCrtn_CntryMndtry() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		ObjectRepositoryMain.saveLeadWOCntry("LGRT", sdf.format(todayDate));
		Assert.assertEquals("Review the errors on this page.", ObjectRepositoryMain.getGenericError());
	}
	@Test
	public void LeadCrtn_StatusDisqualified() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginQA();
		ObjectRepositoryMain.clickAccountsTab();
		ObjectRepositoryMain.selectCustomerRecord();
		ObjectRepositoryMain.fillAccountsFormAndSave("CRT", sdf.format(todayDate));
		ObjectRepositoryMain.clickLeadsTab();
		ObjectRepositoryMain.leadGenerationLeadGenType();
		ObjectRepositoryMain.saveLeadWStatusDisqlfd("LGRT", sdf.format(todayDate));
		Assert.assertEquals("Review the errors on this page.", ObjectRepositoryMain.getGenericError());
	}
}
	






