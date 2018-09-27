package MasterScript1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class LeadValidationRules {
	
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	
	@Test
	public void LeadValidation_Account_Mandatory_SQL_Stage() throws Exception {
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
	public void LeadValidation_Covert_With_Funnel_Stage_SQL() throws Exception {
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
	public void LeadValidation_CountryMandatory() throws Exception {
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
	public void LeadValidation_Disqualification_Reason_Mandatory() throws Exception {
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
