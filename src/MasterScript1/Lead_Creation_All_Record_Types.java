package MasterScript1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class Lead_Creation_All_Record_Types {

	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");

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
	public void LeadCreation_SDRG_CustomerRT() throws Exception {
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

}
