package com.sitcore.selinium.java;

import org.junit.Test;

public class SFDC_Dynamics_Integration {
	
	@Test
	public void opportunity_Integration() throws Exception {
		ObjectRepositoryMain.launchChrome_Dynamics();
		ObjectRepositoryMain.dynamicsIntreation();
	}

}
