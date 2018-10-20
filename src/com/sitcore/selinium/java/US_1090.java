package com.sitcore.selinium.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

public class US_1090 {
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	@Test
	public void mops_CreateCampaign() throws Exception {
		ObjectRepositoryMain.launchChrome();
		ObjectRepositoryMain.loginUser_MarketOps();
		ObjectRepositoryMain.clickCampaignTab();
		todayDate = new Date();
		ObjectRepositoryMain.mops_newCampaign(sdf.format(todayDate));
		ObjectRepositoryMain.mops_create_Edit_Campaign(sdf.format(todayDate));
		ObjectRepositoryMain.closeChrome();
	}

}
