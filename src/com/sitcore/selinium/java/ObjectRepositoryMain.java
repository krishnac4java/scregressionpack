package com.sitcore.selinium.java;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class ObjectRepositoryMain {
	public  static WebDriver driver;
	
	
	
	
	
	
/****************************************************   HEADER  START   ************************************************************************************************************
	
	1. Xpaths for all the objects on all the record types for various profiles
	2. Common functions 
	3. Specific scenarios 
	
	SalesOps_Account_CustomerRT_Creation	|	SalesOps_Account_AccountRequestRT_Creation	|	SalesOps_Account_CompetitorRT_Creation	|	SalesOps_Account_ProgramRT_Creation
	Sales_Account_CustomerRT_Creation	|	Sales_Account_AccountRequestRT_Creation	|	Sales_Account_CompetitorRT_Creation	|	Sales_Account_ProgramRT_Creation
	SDR_Account_CustomerRT_Creation	|	SDR_Account_AccountRequestRT_Creation	|	SDR_Account_CompetitorRT_Creation	|	SDR_Account_ProgramRT_Creation 
	PartnerAllianceMgr_Account_CustomerRT_Creation	|	PartnerAllianceMgr_Account_AccountRequestRT_Creation	|	PartnerAllianceMgr_Account_CompetitorRT_Creation	|	PartnerAllianceMgr_Account_ProgramRT_Creation
	MarketingOps_Account_CustomerRT_Creation	|	MarketingOps_Account_AccountRequestRT_Creation	|	MarketingOps_Account_CompetitorRT_Creation	|	MarketingOps_Account_ProgramRT_Creation 
	
	4. 
	
	
	
*******************************************************   HEADER  END  *************************************************************************************************************/
	
	
	
	//D:\VijayWorkSpace\ScreenShots\
	//C:\\Users\\SC\\Desktop\\eclipse\\ScreenShots\\
	static String screenShotsPath = "D:\\VijayWorkSpace\\ScreenShots\\";
	
	//D:\VijayWorkSpace\HtmlReports\
	//C:\\Users\\SC\\Desktop\\eclipse\\HtmlReports\\
	static String htmlReportPath = "D:\\VijayWorkSpace\\HtmlReports\\";
	//D:\VijayWorkSpace\chromedriver.exe
	//C:\\Users\\SC\Desktop\\eclipse\\eclipse\\chromedriver.exe
	static String chromeDriverPath = "D:\\VijayWorkSpace\\chromedriver.exe";
	//**************************    COMMON    ********************************************
	static String Save_Button = "//button[@title='Save']";
	static String Submit_Button = "//button[contains(text(),'Submit')]";
	
	//**************************ACCOUNTS********************************************
	
	
	//************************  Sales Ops Profile **********************************
	//**************************Account - Customer Record Type**********************
	 static String Account_CustomerRT_SalesOps_AccountName_EditBox = "//div[@class='autocompleteWrapper slds-grow']//input[1]";
	 static String Account_CustomerRT_SalesOps_DBA_EditBox = "//div[@class='slds-form-element__control']/div/input";
	 static String Account_CustomerRT_SalesOps_ManagingPartner_Lookup = "";	
	 static String Account_CustomerRT_SalesOps_HierarchyLevel_DropDown = "";
	//Options: --None--, Global Ultimate Parent, Sitecore Top Parent, Subsidiary, None	
	 static String Account_CustomerRT_SalesOps_Type_DropDown = "";
	//Options: --None--, Customer, Prospect	
	 static String Account_CustomerRT_SalesOps_ParentAccount_Lookup = "";	
	 static String Account_CustomerRT_SalesOps_RecordStatus_DropDown = "//div[4]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]";
	//Options: --None--, Unverified, Verified
	 static String Account_CustomerRT_SalesOps_RecordStatus_DropDown_Verified ="//a[contains(text(),'Verified')]";	
	 static String Account_CustomerRT_SalesOps_LatticeAccountRanking_EditBox = "";
	 static String Account_CustomerRT_SalesOps_AccountStatus_DropDown = "";
	//Options: --None--, Active, Inactive	
	static String Account_CustomerRT_SalesOps_BillingCountry_DropDown = "//fieldset/div/div[2]/div/div/div/div/div/div/a";	
	//Options:
	 static String Account_CustomerRT_SalesOps_BillingCountry_DropDown_UK = "//a[contains(text(),'United Kingdom')]";
	 static String Account_CustomerRT_SalesOps_BillingSt_EditBox = "//div/div/div/div/fieldset/div/div[3]/div/div/textarea";
	 static String Account_CustomerRT_SalesOps_BillingCity_EditBox = "//div/div/div/div/fieldset/div/div[4]/div/div/input";		
	 static String Account_CustomerRT_SalesOps_BillingState_DropDown = "//div/div/div/div/fieldset/div/div[4]/div[2]/div/div/div/div/div/a";
	//Options:
	 static String Account_CustomerRT_SalesOps_BillingState_DropDown_England = "//a[contains(text(),'England')]";	
	 static String Account_CustomerRT_SalesOps_BillingPostCode_EditBox = "//div/div/div/div/fieldset/div/div[5]/div/div/input";
	
	
	
	
	//************************  Sales Ops Profile **********************************
	//**************************Account - Account Request Record Type****************
	//*******************************************************************************
	 static String Account_AccRequestRT_SalesOps_AccountName_EditBox = "//div[@class='autocompleteWrapper slds-grow']//input[1]";
	 static String Account_AccRequestRT_SalesOps_DBA_EditBox = "//div[@class='slds-form-element__control']/div/input";
	 static String Account_AccRequestRT_SalesOps_ManagingPartner_Lookup = "";	
	 static String Account_AccRequestRT_SalesOps_HierarchyLevel_DropDown = "";
	//Options: --None--, Global Ultimate Parent, Sitecore Top Parent, Subsidiary, None
	
	
	 static String Account_AccRequestRT_SalesOps_Type_DropDown = "";
	//Options: --None--, Customer, Prospect	
	 static String Account_AccRequestRT_SalesOps_ParentAccount_Lookup = "";	
	 static String Account_AccRequestRT_SalesOps_RecordStatus_DropDown = "//div[4]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]";
	//Options: --None--, Unverified, Verified
	 static String Account_AccRequestRT_SalesOps_RecordStatus_DropDown_Verified ="//a[contains(text(),'Verified')]";	
	 static String Account_AccRequestRT_SalesOps_LatticeAccountRanking_EditBox = "";
	 static String Account_AccRequestRT_SalesOps_AccountStatus_DropDown = "";
	//Options: --None--, Active, Inactive	
	static String Account_AccRequestRT_SalesOps_BillingCountry_DropDown = "//fieldset/div/div[2]/div/div/div/div/div/div/a";
	//Options:
	 static String Account_AccRequestRT_SalesOps_BillingCountry_DropDown_UK = "//a[contains(text(),'United Kingdom')]";
	 static String Account_AccRequestRT_SalesOps_BillingSt_EditBox = "//div/div/div/div/fieldset/div/div[3]/div/div/textarea";
	 static String Account_AccRequestRT_SalesOps_BillingCity_EditBox = "//div/div/div/div/fieldset/div/div[4]/div/div/input";	
	 static String Account_AccRequestRT_SalesOps_BillingState_DropDown = "//div/div/div/div/fieldset/div/div[4]/div[2]/div/div/div/div/div/a";	//Options:
	 static String Account_AccRequestRT_SalesOps_BillingState_DropDown_England = "//a[contains(text(),'England')]";	
	 static String Account_AccRequestRT_SalesOps_BillingPostCode_EditBox = "//div/div/div/div/fieldset/div/div[5]/div/div/input";
		
	
	//************************  Sales Ops Profile **********************************
	//**************************Account - Competitor Record Type**********************
	//*******************************************************************************
	 static String Account_CompetitorRT_SalesOps_AccountName_EditBox = "//div[@class='autocompleteWrapper slds-grow']//input[1]";
	 static String Account_CompetitorRT_SalesOps_DBA_EditBox = "//div[@class='slds-form-element__control']/div/input";
	 static String Account_CompetitorRT_SalesOps_ManagingPartner_Lookup = "";	
	 static String Account_CompetitorRT_SalesOps_HierarchyLevel_DropDown = "";
	//Options: --None--, Global Ultimate Parent, Sitecore Top Parent, Subsidiary, None
	
	
	 static String Account_CompetitorRT_SalesOps_Type_DropDown = "";
	//Options: --None--, Customer, Prospect	
	 static String Account_CompetitorRT_SalesOps_ParentAccount_Lookup = "";	
	 static String Account_CompetitorRT_SalesOps_RecordStatus_DropDown = "//div[4]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]";
	//Options: --None--, Unverified, Verified
	 static String Account_CompetitorRT_SalesOps_RecordStatus_DropDown_Verified ="//a[contains(text(),'Verified')]";	
	 static String Account_CompetitorRT_SalesOps_LatticeAccountRanking_EditBox = "";
	 static String Account_CompetitorRT_SalesOps_AccountStatus_DropDown = "";
	//Options: --None--, Active, Inactive	
	static String Account_CompetitorRT_SalesOps_BillingCountry_DropDown = "//fieldset/div/div[2]/div/div/div/div/div/div/a";
	//Options:
	 static String Account_CompetitorRT_SalesOps_BillingCountry_DropDown_UK = "//a[contains(text(),'United Kingdom')]";
	 static String Account_CompetitorRT_SalesOps_BillingSt_EditBox = "//div/div/div/div/fieldset/div/div[3]/div/div/textarea";
	 static String Account_CompetitorRT_SalesOps_BillingCity_EditBox = "//div/div/div/div/fieldset/div/div[4]/div/div/input";	
	 static String Account_CompetitorRT_SalesOps_BillingState_DropDown = "//div/div/div/div/fieldset/div/div[4]/div[2]/div/div/div/div/div/a";	//Options:
	 static String Account_CompetitorRT_SalesOps_BillingState_DropDown_England = "//a[contains(text(),'England')]";	
	 static String Account_CompetitorRT_SalesOps_BillingPostCode_EditBox = "//div/div/div/div/fieldset/div/div[5]/div/div/input";
	
	
	
	
	
	//************************  Sales Ops Profile **********************************
	//**************************Account -  Program Record Type**********************
	//*******************************************************************************
	 static String Account_ProgramRT_SalesOps_AccountName_EditBox = "//div[@class='autocompleteWrapper slds-grow']//input[1]";
	 static String Account_ProgramRT_SalesOps_DBA_EditBox = "//div[@class='slds-form-element__control']/div/input";
	 static String Account_ProgramRT_SalesOps_ManagingPartner_Lookup = "";	
	 static String Account_ProgramRT_SalesOps_HierarchyLevel_DropDown = "";
	//Options: --None--, Global Ultimate Parent, Sitecore Top Parent, Subsidiary, None
	
	
	 static String Account_ProgramRT_SalesOps_Type_DropDown = "";
	//Options: --None--, Customer, Prospect	
	 static String Account_ProgramRT_SalesOps_ParentAccount_Lookup = "";	
	 static String Account_ProgramRT_SalesOps_RecordStatus_DropDown = "//div[4]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]";
	//Options: --None--, Unverified, Verified
	 static String Account_ProgramRT_SalesOps_RecordStatus_DropDown_Verified ="//a[contains(text(),'Verified')]";	
	 static String Account_ProgramRT_SalesOps_LatticeAccountRanking_EditBox = "";
	 static String Account_ProgramRT_SalesOps_AccountStatus_DropDown = "";
	//Options: --None--, Active, Inactive	
	static String Account_ProgramRT_SalesOps_BillingCountry_DropDown = "//fieldset/div/div[2]/div/div/div/div/div/div/a";
	//Options:
	 static String Account_ProgramRT_SalesOps_BillingCountry_DropDown_UK = "//a[contains(text(),'United Kingdom')]";
	 static String Account_ProgramRT_SalesOps_BillingSt_EditBox = "//div/div/div/div/fieldset/div/div[3]/div/div/textarea";
	 static String Account_ProgramRT_SalesOps_BillingCity_EditBox = "//div/div/div/div/fieldset/div/div[4]/div/div/input";	
	 static String Account_ProgramRT_SalesOps_BillingState_DropDown = "//div/div/div/div/fieldset/div/div[4]/div[2]/div/div/div/div/div/a";	//Options:
	 static String Account_ProgramRT_SalesOps_BillingState_DropDown_England = "//a[contains(text(),'England')]";	
	 static String Account_ProgramRT_SalesOps_BillingPostCode_EditBox = "//div/div/div/div/fieldset/div/div[5]/div/div/input";
	
	
	//************************  SDR Profile **********************************
	//**************************Account -  Account Request Record Type *********************
	//*******************************************************************************
	
	 static String Account_AccountRequestRT_SDR_AccountName_EditBox = "//div[@class='autocompleteWrapper slds-grow']//input[1]";				
	 static String Account_AccountRequestRT_SDR_BillingCountry_DropDown = "//fieldset/div/div[2]/div/div/div/div/div/div/a";
	 static String Account_AccountRequestRT_SDR_BillingCountry_DropDown_UK = "//a[contains(text(),'United Kingdom')]";
	 static String Account_AccountRequestRT_SDR_BillingSt_EditBox = "//div/div/div/div/fieldset/div/div[3]/div/div/textarea";
	 static String Account_AccountRequestRT_SDR_BillingCity_EditBox = "//div/div/div/div/fieldset/div/div[4]/div/div/input";
	 static String Account_AccountRequestRT_SDR_BillingState_DropDown = "//div/div/div/div/fieldset/div/div[4]/div[2]/div/div/div/div/div/a";
	 static String Account_AccountRequestRT_SDR_BillingState_DropDown_England = "//a[contains(text(),'England')]";
	 static String Account_AccountRequestRT_SDR_BillingPostCode_EditBox = "//div/div/div/div/fieldset/div/div[5]/div/div/input";
	
	String leadLastName_xPath = "/html[1]/body[1]/div[5]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[4]/input[1]";
	String leadTitle_xPath = "/html[1]/body[1]/div[5]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]";
	String leadLandline_xPath = "/html[1]/body[1]/div[5]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/input[1]";






	static List<TestResultModel> resultList = new ArrayList<TestResultModel>();
	static List<TestResultModel> userStoryresultList = new ArrayList<TestResultModel>();
	static String lastnameError_expected = "Complete this field";
	static String LastNameError;
	
	private static Date todayDate = new Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	
	@Before
	  public static void launchChrome() throws Exception {
		  ChromeOptions options=new ChromeOptions();
		  Map<String, Object> prefs=new HashMap<String,Object>();
		  prefs.put("profile.default_content_setting_values.notifications", 1);
		  //1-Allow, 2-Block, 0-default
		  options.setExperimentalOption("prefs",prefs);
		  System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		  driver = new ChromeDriver(options);   
		  driver.get("https://test.salesforce.com");
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);      
	
	    }
	public static void launchChromeWithSpecificURL(String url) throws Exception {
		  ChromeOptions options=new ChromeOptions();
		  Map<String, Object> prefs=new HashMap<String,Object>();
		  prefs.put("profile.default_content_setting_values.notifications", 1);
		  //1-Allow, 2-Block, 0-default
		  options.setExperimentalOption("prefs",prefs);
		  System.setProperty("webdriver.chrome.driver","D:\\VijayWorkSpace\\chromedriver.exe");
		  //System.setProperty("webdriver.chrome.driver","C:\\Users\\SC\\Desktop\\eclipse\\eclipse\\chromedriver.exe");
		  driver = new ChromeDriver(options);   
		  driver.get(url);
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);      
	
	    }
	public static void launchChrome_Dynamics() throws Exception {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\SC\\Desktop\\eclipse\\eclipse\\chromedriver.exe");
		  driver = new ChromeDriver();   
		  driver.get("https://scl2r.crm.dynamics.com/main.aspx#638525758");
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);      
	
	    }
	public static void closeChrome() throws Exception {
		driver.close();
	}
	public static void loginDynamicsQA() throws InterruptedException {
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")).clear();
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("vima@sitecore.net");
	    driver.findElement(By.xpath("password")).clear();
	    driver.findElement(By.xpath("password")).sendKeys("Ovj4519oe26");	
	    driver.findElement(By.xpath("Login")).click();
	    Thread.sleep(3000);
	}	
		
	public static void loginUser_SDR() throws InterruptedException {
		
		driver.findElement(By.id("username")).clear();
	    //driver.findElement(By.id("username")).sendKeys("automation_salesops@sitecore.net.finaluat");
	    driver.findElement(By.id("username")).sendKeys("automation_sdr@sitecore.com.finaluat");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Ovj4519oe26");	
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(3000);
	}
	
public static void loginUser_SalesOps() throws InterruptedException {
		
		driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("automation_salesops@sitecore.net.finaluat");	
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Ovj4519oe26");	
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(3000);
	}
     public static void loginUser_PAM() throws InterruptedException {
		
		driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("automation_pam@sitecore.com.finaluat");	
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Ovj4519oe26");	
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(3000);
	}
	

     public static void loginUser_Sales() throws InterruptedException {
		
		driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("automation_sales@sitecore.com.finaluat");	
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Ovj4519oe26");	
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(3000);
	}

     public static void loginUser_MarketOps() throws InterruptedException {
		
		driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("automation_mops@sitecore.com.finaluat");	
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Ovj4519oe26");	
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(2000);
	}
	public static void loginAccountCrtnUser(String userName) throws InterruptedException {
		
		driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys(userName);
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Ovj4519oe26");	
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(3000);
	}
		
	public static void clickLeadsTab() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Leads')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(1000);
	}
	
	public static void selectLeadRTandClickNext() throws InterruptedException {
		
		Thread.sleep(1000);
		
		//Select Sales Record Type
		driver.findElement(By.xpath("//span[contains(text(),'Sales Record Type')]")).click();
		driver.findElement(By.xpath("//div[@class='forceChangeRecordTypeFooter']//button[2]")).click();
		Thread.sleep(2000);
		
	}
	
	
	
	public static void createLead() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		Thread.sleep(1000);
		LastNameError = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/ul[1]/li[1]")).getText();
		Thread.sleep(2000);
		Assert.assertEquals(lastnameError_expected, LastNameError);
		Thread.sleep(3000);
		System.out.println(LastNameError);
		
	}
	/*public static void loginFinalUAT() throws InterruptedException {
		
		driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("vima@sitecore.net.sitecoreqa");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Ovj4519oe26qa4");	
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(2000);
	}*/
	
	public static void clickAccountsTabAndNew() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(1000);
		
	}

	public static void selectCustomerRecord() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Customer Record')]")).click();
		driver.findElement(By.xpath("//div[@class='forceChangeRecordTypeFooter']//button[2]")).click();
		Thread.sleep(3000);
	}
	
	public static void selectAccountRequestRT() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Account Request Record')]")).click();
		driver.findElement(By.xpath("//div[@class='forceChangeRecordTypeFooter']//button[2]")).click();
		Thread.sleep(3000);
	}
	
	public static void selectCompetitorRT() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Competitor Record')]")).click();
		driver.findElement(By.xpath("//div[@class='forceChangeRecordTypeFooter']//button[2]")).click();
		Thread.sleep(3000);
	}
	
	public static void selectProgramRT() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Program Record')]")).click();
		driver.findElement(By.xpath("//div[@class='forceChangeRecordTypeFooter']//button[2]")).click();
		Thread.sleep(3000);
	}

	public static void fillAccountsFormAndSave(String postfix, String timestamp) {
		driver.findElement(By.xpath("//div[@class='autocompleteWrapper slds-grow']//input[1]")).sendKeys(timestamp+postfix);
		if(!postfix.equals("PRT")) {
			driver.findElement(By.xpath("//div[4]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Verified')]")).click();
		}
		driver.findElement(By.xpath(Account_CustomerRT_SalesOps_BillingCountry_DropDown)).click();
		driver.findElement(By.xpath(Account_CustomerRT_SalesOps_BillingCountry_DropDown_UK)).click();
		driver.findElement(By.xpath(Account_CustomerRT_SalesOps_BillingSt_EditBox)).sendKeys(timestamp);
		driver.findElement(By.xpath(Account_CustomerRT_SalesOps_BillingCity_EditBox)).sendKeys(timestamp);
		driver.findElement(By.xpath(Account_CustomerRT_SalesOps_BillingState_DropDown)).click();
		driver.findElement(By.xpath(Account_CustomerRT_SalesOps_BillingState_DropDown_England)).click();
		driver.findElement(By.xpath(Account_CustomerRT_SalesOps_BillingPostCode_EditBox)).sendKeys(timestamp);
		//driver.findElement(By.xpath("//div[@class='slds-form-element__control']/div/input")).sendKeys("1234567890");
		driver.findElement(By.xpath(Save_Button)).click();
	}
	
	
	
	public static void SalesOps_AccountCustomerRT_Creation(String timestamp) {
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_AccountName_EditBox)).sendKeys(timestamp);		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_RecordStatus_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_RecordStatus_DropDown_Verified)).click();		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingCountry_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingCountry_DropDown_UK)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingSt_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingCity_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingState_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingState_DropDown_England)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingPostCode_EditBox)).sendKeys(sdf.format(todayDate));
		//driver.findElement(By.xpath("//div[@class='slds-form-element__control']/div/input")).sendKeys("1234567890");		
	}
	
	public static void SalesOps_AccountCustomerRT_Creation_US779(String timestamp) {
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_AccountName_EditBox)).sendKeys(timestamp);		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_RecordStatus_DropDown)).click();
		driver.findElement(By.xpath("//a[contains(text(),'Unverified')]")).click();		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingCountry_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingCountry_DropDown_UK)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingSt_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingCity_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingState_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingState_DropDown_England)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingPostCode_EditBox)).sendKeys(sdf.format(todayDate));
		//driver.findElement(By.xpath("//div[@class='slds-form-element__control']/div/input")).sendKeys("1234567890");		
	}
	
	public static void SalesOps_AccountRequestRT_Creation(String timestamp) {
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccRequestRT_SalesOps_AccountName_EditBox)).sendKeys(timestamp);		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccRequestRT_SalesOps_RecordStatus_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccRequestRT_SalesOps_RecordStatus_DropDown_Verified)).click();		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccRequestRT_SalesOps_BillingCountry_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccRequestRT_SalesOps_BillingCountry_DropDown_UK)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccRequestRT_SalesOps_BillingSt_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccRequestRT_SalesOps_BillingCity_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccRequestRT_SalesOps_BillingState_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccRequestRT_SalesOps_BillingState_DropDown_England)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccRequestRT_SalesOps_BillingPostCode_EditBox)).sendKeys(sdf.format(todayDate));
		//driver.findElement(By.xpath("//div[@class='slds-form-element__control']/div/input")).sendKeys("1234567890");		
	}	
	
	public static void SalesOps_AccountCompetitorRT_Creation(String timestamp) {
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_AccountName_EditBox)).sendKeys(timestamp);		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_RecordStatus_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_RecordStatus_DropDown_Verified)).click();		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingCountry_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingCountry_DropDown_UK)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingSt_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingCity_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingState_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingState_DropDown_England)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingPostCode_EditBox)).sendKeys(sdf.format(todayDate));
		//driver.findElement(By.xpath("//div[@class='slds-form-element__control']/div/input")).sendKeys("1234567890");		
	}
	
	public static void SalesOps_AccountProgramRT_Creation(String timestamp) {
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_AccountName_EditBox)).sendKeys(timestamp);		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_RecordStatus_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_RecordStatus_DropDown_Verified)).click();		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingCountry_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingCountry_DropDown_UK)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingSt_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingCity_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingState_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingState_DropDown_England)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingPostCode_EditBox)).sendKeys(sdf.format(todayDate));
		//driver.findElement(By.xpath("//div[@class='slds-form-element__control']/div/input")).sendKeys("1234567890");		
	}
	
	public static void click_Save_Button() {
		
		driver.findElement(By.xpath(Save_Button)).click();
	}
	
	public static void SDR_AccounRequestRT_Creation(String timestamp) {
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_AccountName_EditBox)).sendKeys(timestamp);
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingCountry_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingCountry_DropDown_UK)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingSt_EditBox)).sendKeys(timestamp);
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingCity_EditBox)).sendKeys(timestamp);
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingState_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingState_DropDown_England)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingPostCode_EditBox)).sendKeys(timestamp);
		//driver.findElement(By.xpath("//button[@title='Save']")).click();
	}
	public static void Sales_AccounCustomerRT_Creation(String timestamp) {
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_AccountName_EditBox)).sendKeys(timestamp);		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_RecordStatus_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_RecordStatus_DropDown_Verified)).click();		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingCountry_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingCountry_DropDown_UK)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingSt_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingCity_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingState_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingState_DropDown_England)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CustomerRT_SalesOps_BillingPostCode_EditBox)).sendKeys(sdf.format(todayDate));
		//driver.findElement(By.xpath("//div[@class='slds-form-element__control']/div/input")).sendKeys("1234567890");		
	}
	
	public static void Sales_AccountCompetitorRT_Creation(String timestamp) {
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_AccountName_EditBox)).sendKeys(timestamp);		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_RecordStatus_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_RecordStatus_DropDown_Verified)).click();		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingCountry_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingCountry_DropDown_UK)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingSt_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingCity_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingState_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingState_DropDown_England)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_CompetitorRT_SalesOps_BillingPostCode_EditBox)).sendKeys(sdf.format(todayDate));
		//driver.findElement(By.xpath("//div[@class='slds-form-element__control']/div/input")).sendKeys("1234567890");		
	}
	
	public static void Sales_AccountProgramRT_Creation(String timestamp) {
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_AccountName_EditBox)).sendKeys(sdf.format(todayDate));		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_RecordStatus_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_RecordStatus_DropDown_Verified)).click();		
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingCountry_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingCountry_DropDown_UK)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingSt_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingCity_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingState_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingState_DropDown_England)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_ProgramRT_SalesOps_BillingPostCode_EditBox)).sendKeys(sdf.format(todayDate));
		//driver.findElement(By.xpath("//div[@class='slds-form-element__control']/div/input")).sendKeys("1234567890");		
	}
	public static void Sales_AccountRequestRT_Creation(String timestamp) {
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_AccountName_EditBox)).sendKeys(timestamp);
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingCountry_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingCountry_DropDown_UK)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingSt_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingCity_EditBox)).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingState_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingState_DropDown_England)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingPostCode_EditBox)).sendKeys(sdf.format(todayDate));
		//driver.findElement(By.xpath("//button[@title='Save']")).click();
	}
	
	public static void MarketOps_AccountRequestRT_Creation(String timestamp) {
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_AccountName_EditBox)).sendKeys(timestamp);
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingCountry_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingCountry_DropDown_UK)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingSt_EditBox)).sendKeys(timestamp);
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingCity_EditBox)).sendKeys(timestamp);
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingState_DropDown)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingState_DropDown_England)).click();
		driver.findElement(By.xpath(ObjectRepositoryMain.Account_AccountRequestRT_SDR_BillingPostCode_EditBox)).sendKeys(timestamp);
		//driver.findElement(By.xpath("//button[@title='Save']")).click();
	}
	
	public static void createNewContact() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='title'][contains(text(),'Related')]")).click();
		driver.findElement(By.xpath("//div[@title='New Contact']")).click();
		Thread.sleep(3000);
		
	}
	public static void SalesOps_AccountCompetitor_createNewContact() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='title'][contains(text(),'Related')]")).click();
		driver.findElement(By.xpath("//article/div/div/div/ul/li/a/div")).click();
		Thread.sleep(3000);
		
	}
	public static void Sales_AccountCompetitor_createNewContact() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='title'][contains(text(),'Related')]")).click();
		driver.findElement(By.xpath("//article/div/div/div/ul/li/a/div")).click();
		Thread.sleep(3000);
		
	}
	public static void selectContactRecordType() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Contact Record Type')]")).click();
		driver.findElement(By.xpath("//div[@class='forceChangeRecordTypeFooter']//button[2]")).click();
		
	}
	
	public static void selectSDRRecordType() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'SDR Record Types')]")).click();
		driver.findElement(By.xpath("//div[@class='forceChangeRecordTypeFooter']//button[2]")).click();
		
	}
	
	public static void selectSalesRecordType() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Sales Record Type')]")).click();
		driver.findElement(By.xpath("//div[@class='forceChangeRecordTypeFooter']//button[2]")).click();
		
	}

	//public static void fillContactFormAndSave(String timestamp, String postName) throws InterruptedException {
	public static void SalesOps_ContactRT_Creation(String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//div/div/div/div/div/fieldset/div/div[4]/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp);
		//driver.findElement(By.xpath("//div/div/div[3]/div/div/div[2]/span/div/div/input")).sendKeys(timestamp+postName+"@gmail.com");
		driver.findElement(By.xpath("//div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/input")).sendKeys(timestamp);
		
		// Funnel Stage
		driver.findElement(By.xpath("//div[4]/div/div/div[5]/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div/ul/li[5]/a")).click();
		Thread.sleep(2000);
		
		// Funnel Status
		//driver.findElement(By.xpath("//div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div/div/div/a")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'Engaged')]")).click();
		//driver.findElement(By.xpath("//div[9]/div/ul/li[3]/a")).click();
		//driver.findElement(By.xpath("/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		//driver.findElement(By.xpath("//div/ul/li[4]/a")).click();
		///html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]
		///html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		Thread.sleep(2000);
	}

	public static void SalesOps_SDRRT_Creation(String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//div/div/div/div/div/fieldset/div/div[4]/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp);
		//driver.findElement(By.xpath("//div/div/div[3]/div/div/div[2]/span/div/div/input")).sendKeys(timestamp+postName+"@gmail.com");
		driver.findElement(By.xpath("//div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/input")).sendKeys(timestamp);
		
		// Funnel Stage
		driver.findElement(By.xpath("//div[4]/div/div/div[5]/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div/ul/li[5]/a")).click();
		Thread.sleep(2000);
		
		// Funnel Status
		//driver.findElement(By.xpath("//div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div/div/div/a")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'Engaged')]")).click();
		//driver.findElement(By.xpath("//div[9]/div/ul/li[3]/a")).click();
		//driver.findElement(By.xpath("/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		//driver.findElement(By.xpath("//div/ul/li[4]/a")).click();
		///html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]
		///html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		Thread.sleep(2000);
	}
	
	public static void SalesOps_SalesRT_Creation(String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//div/div/div/div/div/fieldset/div/div[4]/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp);
		//driver.findElement(By.xpath("//div/div/div[3]/div/div/div[2]/span/div/div/input")).sendKeys(timestamp+postName+"@gmail.com");
		driver.findElement(By.xpath("//div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/input")).sendKeys(timestamp);
		
		// Funnel Stage
		driver.findElement(By.xpath("//div[4]/div/div/div[5]/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div/ul/li[5]/a")).click();
		Thread.sleep(2000);
		
		// Funnel Status
		//driver.findElement(By.xpath("//div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div/div/div/a")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'Engaged')]")).click();
		//driver.findElement(By.xpath("//div[9]/div/ul/li[3]/a")).click();
		//driver.findElement(By.xpath("/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		//driver.findElement(By.xpath("//div/ul/li[4]/a")).click();
		///html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]
		///html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		Thread.sleep(2000);
	}

	public static void Sales_ContactRT_Creation(String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//div/div/div/div/div/fieldset/div/div[4]/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp);
		//driver.findElement(By.xpath("//div/div/div[3]/div/div/div[2]/span/div/div/input")).sendKeys(timestamp+postName+"@gmail.com");
		driver.findElement(By.xpath("//div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/input")).sendKeys(timestamp);
		
		// Funnel Stage
		driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SAL')]")).click();
		Thread.sleep(2000);
		
		// Funnel Status
		//driver.findElement(By.xpath("//div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div/div/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Engaged')]")).click();
		//driver.findElement(By.xpath("//div[9]/div/ul/li[3]/a")).click();
		//driver.findElement(By.xpath("/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		//driver.findElement(By.xpath("//div/ul/li[4]/a")).click();
		///html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]
		///html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		Thread.sleep(2000);
	}

	public static void Sales_SDRRT_Creation(String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//div/div/div/div/div/fieldset/div/div[4]/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp);
		//driver.findElement(By.xpath("//div/div/div[3]/div/div/div[2]/span/div/div/input")).sendKeys(timestamp+postName+"@gmail.com");
		driver.findElement(By.xpath("//div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/input")).sendKeys(timestamp);
		
		// Funnel Stage
		driver.findElement(By.xpath("//div[4]/div/div/div[5]/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div/ul/li[5]/a")).click();
		Thread.sleep(2000);
		
		// Funnel Status
		//driver.findElement(By.xpath("//div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div/div/div/a")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'Engaged')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		Thread.sleep(2000);
	}
	
	public static void Sales_SalesRT_Creation(String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//div/div/div/div/div/fieldset/div/div[4]/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp);
		//driver.findElement(By.xpath("//div/div/div[3]/div/div/div[2]/span/div/div/input")).sendKeys(timestamp+postName+"@gmail.com");
		driver.findElement(By.xpath("//div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/input")).sendKeys(timestamp);
		
		// Funnel Stage
		driver.findElement(By.xpath("//div[4]/div/div/div[5]/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div/ul/li[5]/a")).click();
		Thread.sleep(2000);
		
		// Funnel Status
		//driver.findElement(By.xpath("//div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div/div/div/a")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'Engaged')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		Thread.sleep(2000);
	}

	
	public static void MarketOps_ContactRT_Creation(String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//div/div/div/div/div/fieldset/div/div[4]/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp);
		//driver.findElement(By.xpath("//div/div/div[3]/div/div/div[2]/span/div/div/input")).sendKeys(timestamp+postName+"@gmail.com");
		driver.findElement(By.xpath("//div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/input")).sendKeys(timestamp);
		
		// Funnel Stage
		driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SAL')]")).click();
		Thread.sleep(2000);
		
		// Funnel Status
		//driver.findElement(By.xpath("//div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div/div/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Engaged')]")).click();
		//driver.findElement(By.xpath("//div[9]/div/ul/li[3]/a")).click();
		//driver.findElement(By.xpath("/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		//driver.findElement(By.xpath("//div/ul/li[4]/a")).click();
		///html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]
		///html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		Thread.sleep(2000);
	}
	
	public static void fillNewProductAndSave(String timestamp) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Opportunities')]")).click();
		driver.findElement(By.xpath("//lightning-input/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//lightning-input/div/input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='"+timestamp+"']")).click();
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("scroll(0,100)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@title='Products']")).click();

		
		driver.findElement(By.xpath("//a[@title='Add Products']")).click();
		driver.findElement(By.xpath("//span/span/label/span")).click();			
		driver.findElement(By.xpath("//tr[2]/td[2]/span/span/label/span")).click();
		driver.findElement(By.xpath("//button[contains(@title,'Next')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span/span[2]/button")).click();
		driver.findElement(By.xpath("//tr/td[2]/div/div/div/div/div/div/input")).sendKeys("114");
		driver.findElement(By.xpath("//td[3]/span/span[2]/button")).click();
		driver.findElement(By.xpath("//tr/td[3]/div/div/div/div/div/div/input")).clear();
		driver.findElement(By.xpath("//tr/td[3]/div/div/div/div/div/div/input")).sendKeys("500");
		driver.findElement(By.xpath("//tr[2]/td[2]/span/span[2]/button")).click();
		driver.findElement(By.xpath("//tr[2]/td[2]/div/div/div/div/div/div/input")).sendKeys("115");
		driver.findElement(By.xpath("//tr[2]/td[3]/span/span[2]/button")).click();
		driver.findElement(By.xpath("//tr[2]/td[3]/div/div/div/div/div/div/input")).clear();
		driver.findElement(By.xpath("//tr[2]/td[3]/div/div/div/div/div/div/input")).sendKeys("600");
		driver.findElement(By.xpath("//button[contains(@title,'Save')]")).click();
		Thread.sleep(5000);
	}

	public static void fillNewOpportunityFormAndSave(String timestamp, String contactName) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).sendKeys(contactName);
		driver.findElement(By.xpath("//div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@title='"+contactName+"']")).click();
		driver.findElement(By.xpath("//div[@title='New Opportunity']")).click();
		driver.findElement(By.name("Name")).sendKeys(timestamp);
		driver.findElement(By.name("CloseDate")).sendKeys("Sep 30, 2019");
		//Opportunity Type
		Thread.sleep(1000);
		driver.findElement(By.name("Type")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("Type")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("Type")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("Type")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[contains(text(),'License')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("MD_Opportunity_Type__c")).sendKeys(Keys.ARROW_DOWN);	
		driver.findElement(By.name("MD_Opportunity_Type__c")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("MD_Opportunity_Type__c")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("License_Type__c")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("License_Type__c")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("License_Type__c")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("License_Type__c")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[contains(text(),'Subscription')]")).click();
		Thread.sleep(1000);
		/*driver.findElement(By.xpath("//li[@class='tabs__item uiTabItem']//span[@class='title'][contains(text(),'Related')]")).click();
		driver.findElement(By.xpath("//div[@class='windowViewMode-normal oneContent active lafPageHost']//div[@class='container']//div[1]//article[1]//div[1]//div[1]//div[1]//ul[1]//li[1]//a[1]")).click();
		driver.findElement(By.xpath("//div[@class='forceChangeRecordTypeFooter']//button[2]")).click();
		driver.findElement(By.xpath("//div/div/div/div/div/div/div/div/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'License')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/div/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='uiMenuItem uiRadioMenuItem']//a[@title='New']")).click();
		driver.findElement(By.xpath("//div[4]/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Perpetual')]")).click();
		driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Qualification')]")).click();
		driver.findElement(By.xpath("//div[7]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sales')]")).click();
		driver.findElement(By.xpath("//div[4]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'No Competitor')]")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[2]/table/tbody/tr[6]/td/span")).click();
		driver.findElement(By.xpath("//button[@title='Save']")).click();*/
		driver.findElement(By.xpath(Submit_Button)).click();
		//driver.findElement(By.xpath("//div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).sendKeys(timestamp);
		Thread.sleep(1000);
	}
	
	public static void fillNewOpportunityFormAndSaveWithStage(String timestamp) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//a[@title='"+timestamp+"']")).click();
		driver.findElement(By.xpath("//div[@title='New Opportunity']")).click();
		driver.findElement(By.name("Name")).sendKeys(timestamp);
		//driver.findElement(By.name("CloseDate")).sendKeys("Sep 30, 2019");
		//Opportunity Type
		Thread.sleep(1000);
		driver.findElement(By.name("Type")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("Type")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("Type")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("Type")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[contains(text(),'License')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("MD_Opportunity_Type__c")).sendKeys(Keys.ARROW_DOWN);	
		driver.findElement(By.name("MD_Opportunity_Type__c")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("MD_Opportunity_Type__c")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("License_Type__c")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("License_Type__c")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("License_Type__c")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("License_Type__c")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[8]/lightning-input-field/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div/input")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[10]/span[2]/lightning-base-combobox-formatted-text")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Subscription')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Submit_Button)).click();
		//driver.findElement(By.xpath("//div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).sendKeys(timestamp);
		Thread.sleep(1000);
	}
	
	public static void fillNewOpportunityFormAndSaveWOCloseDate(String timestamp, String contactName) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).sendKeys(contactName);
		driver.findElement(By.xpath("//a[@title='"+contactName+"']")).click();
		driver.findElement(By.xpath("//div[@title='New Opportunity']")).click();
		driver.findElement(By.name("Name")).sendKeys(timestamp);
		//Opportunity Type
		Thread.sleep(1000);
		driver.findElement(By.name("Type")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("Type")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("Type")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("Type")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[contains(text(),'License')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("MD_Opportunity_Type__c")).sendKeys(Keys.ARROW_DOWN);	
		driver.findElement(By.name("MD_Opportunity_Type__c")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("MD_Opportunity_Type__c")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("License_Type__c")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("License_Type__c")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("License_Type__c")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("License_Type__c")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Submit_Button)).click();
		//driver.findElement(By.xpath("//div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).sendKeys(timestamp);
		Thread.sleep(1000);
	}
	
	public static void scrollTest() throws InterruptedException {
		((JavascriptExecutor)driver).executeScript("scroll(0,100)");
		Thread.sleep(8000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(500,100)", "");
		Thread.sleep(8000);
		System.out.println("Window");
		jse.executeScript("scroll(500,150);");
		Thread.sleep(8000);
		System.out.println("Scroll");
		
	}
	public static void leadGenerationLeadGenType() throws InterruptedException {
		driver.findElement(By.xpath("//div[2]/div/label/div/span")).click();
		driver.findElement(By.xpath("//div[2]/div/div[3]/div/button[2]")).click();
	}
	public static void actMgmtLeadGenType() throws InterruptedException {
		driver.findElement(By.xpath("//div[3]/label/div/span")).click();
		driver.findElement(By.xpath("//div[2]/div/div[3]/div/button[2]")).click();
	}
	public static void sdrGenLeadGenType() throws InterruptedException {
		driver.findElement(By.xpath("//div[5]/label/div/span")).click();
		driver.findElement(By.xpath("//div[2]/div/div[3]/div/button[2]")).click();
	}
	public static void salesRTtLeadGenType() throws InterruptedException {
		driver.findElement(By.xpath("//div[7]/label/div/span")).click();
		driver.findElement(By.xpath("//div[2]/div/div[3]/div/button[2]")).click();
	}
	public static void salesOps_LeadGeneration_Lead_Creation(String accountName, String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//fieldset/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mr.')]")).click();
		driver.findElement(By.xpath("//div[4]/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/div/div/fieldset/div/div[2]/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/input")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		driver.findElement(By.xpath("//div[5]/div/div/div/div/input")).sendKeys("1234567890");
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SAL')]")).click();
		driver.findElement(By.xpath("//div[7]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div[11]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div/div[2]/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(accountName);
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//fieldset/div/div[2]/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[@title='United Kingdom']")).click();
		driver.findElement(By.xpath("//div/button[3]")).click();
	}
	public static void salesOps_LeadGeneration_Lead_Creation_WO_Account(String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//fieldset/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mr.')]")).click();
		driver.findElement(By.xpath("//div[4]/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/div/div/fieldset/div/div[2]/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/input")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		driver.findElement(By.xpath("//div[5]/div/div/div/div/input")).sendKeys("1234567890");
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SAL')]")).click();
		driver.findElement(By.xpath("//div[7]/div/div/div/div/textarea")).sendKeys("ContactUsComment");
		driver.findElement(By.xpath("//div[7]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div[11]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div/div[2]/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp);
		/*driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(accountName);
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
		*/driver.findElement(By.xpath("//fieldset/div/div[2]/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[@title='United Kingdom']")).click();
		driver.findElement(By.xpath("//div/button[3]")).click();
	}
	public static void saveLeadWOAccount(String postFix, String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//fieldset/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mr.')]")).click();
		driver.findElement(By.xpath("//div[4]/input")).sendKeys(timestamp+"LC"+postFix);
		driver.findElement(By.xpath("//div/div/div/div/div/div/fieldset/div/div[2]/input")).sendKeys("test");
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp+postFix);
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		driver.findElement(By.xpath("//div[5]/div/div/div/div/input")).sendKeys("1234567890");
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SQL')]")).click();
		driver.findElement(By.xpath("//div[7]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div[11]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div/div[2]/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp+postFix);
		driver.findElement(By.xpath("//fieldset/div/div[2]/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[@title='United Kingdom']")).click();
		driver.findElement(By.xpath("//div/button[3]")).click();
	}
	public static void verifyTestRecordChecbox() throws InterruptedException {
		Thread.sleep(8000);	
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		Thread.sleep(8000);	
		driver.findElement(By.xpath("//div[4]/div/div/div[3]/div/div/div/section/div/div/div[3]/div/div[11]/div/div/div[11]/div/div/div[2]/button")).click();
		boolean testVerified = driver.findElement(By.xpath("//div[11]/div/div/div/div/input")).isSelected();
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/button")).click();
		Assert.assertTrue(testVerified);
	}
	public static String getGenericError() {
		String errormsg = driver.findElement(By.xpath("//div[2]/div/div[3]/div/div/span")).getText();
		return errormsg;
	}
	public static String getSpecificError() {
		String errormsg = driver.findElement(By.xpath("//div[2]/div/div[3]/div/ul/li")).getText();
		return errormsg;
	}
	public static void saveLeadWIncrtStage(String postFix, String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//fieldset/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mr.')]")).click();
		driver.findElement(By.xpath("//div[4]/input")).sendKeys(timestamp+"LC"+postFix);
		driver.findElement(By.xpath("//div/div/div/div/div/div/fieldset/div/div[2]/input")).sendKeys("test");
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp+postFix);
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		driver.findElement(By.xpath("//div[5]/div/div/div/div/input")).sendKeys("1234567890");
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SQL')]")).click();
		driver.findElement(By.xpath("//div[7]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div[11]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div/div[2]/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp+postFix);
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(timestamp+"CRT");
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//fieldset/div/div[2]/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[@title='United Kingdom']")).click();
		driver.findElement(By.xpath("//div/button[3]")).click();
	}
	public static void saveLeadWOCntry(String postFix, String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//fieldset/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mr.')]")).click();
		driver.findElement(By.xpath("//div[4]/input")).sendKeys(timestamp+"LC"+postFix);
		driver.findElement(By.xpath("//div/div/div/div/div/div/fieldset/div/div[2]/input")).sendKeys("test");
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp+postFix);
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		driver.findElement(By.xpath("//div[5]/div/div/div/div/input")).sendKeys("1234567890");
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SAL')]")).click();
		driver.findElement(By.xpath("//div[7]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div[11]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div/div[2]/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp+postFix);
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(timestamp+"CRT");
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/button[3]")).click();
	}
	public static void saveLeadWStatusDisqlfd(String postFix, String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//fieldset/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mr.')]")).click();
		driver.findElement(By.xpath("//div[4]/input")).sendKeys(timestamp+"LC"+postFix);
		driver.findElement(By.xpath("//div/div/div/div/div/div/fieldset/div/div[2]/input")).sendKeys("test");
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp+postFix);
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys(timestamp.replaceAll(" ", "")+"@gmail.com");
		driver.findElement(By.xpath("//div[5]/div/div/div/div/input")).sendKeys("1234567890");
		driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Disqualified')]")).click();
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SAL')]")).click();
		driver.findElement(By.xpath("//div[7]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div[12]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div/div[2]/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp+postFix);
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(timestamp+"CRT");
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//fieldset/div/div[2]/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[@title='United Kingdom']")).click();
		driver.findElement(By.xpath("//div/button[3]")).click();
	}
	
	public static void dynamicsIntreation() {
		driver.findElement(By.xpath("//span[@id='TabSFA']")).click();
		driver.findElement(By.xpath("//span[@class='nav-rowLabel'][contains(text(),'Opportunities')]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/input[1]")).click();

	}
	
	public static void takeScreenShot(String fileName) throws Exception {
		Thread.sleep(8000);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File(screenShotsPath+fileName+".png");
		FileUtils.copyFile(scrFile, destFile);
	}
	public static String getXpath(String xpath) {
		String errormsg = driver.findElement(By.xpath(xpath)).getText();
		return errormsg;
	}
	public static void proxySalesOpsUser(String user) throws Exception {
		driver.findElement(By.xpath("//html/body/div[5]/div/section/header/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/input")).sendKeys(user);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//html/body/div[5]/div/section/header/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/input")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//html/body/div[5]/div/section/header/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//html/body/div[5]/div/section/header/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@title='User Detail']")).click();
		Thread.sleep(10000);
		WebElement iFrame= driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iFrame);
		driver.findElement(By.xpath("//input[4]")).click();

	}
	
	public static void clickOnContacts_Related_Tab (String timestamp) throws Exception {
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//a[@title='"+timestamp+"']")).click();
	}
	
	public static void clickOnAddToCampaign () throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='windowViewMode-normal oneContent active lafPageHost']//span[@class='title'][contains(text(),'Related')]")).click();
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//ul[@class='branding-actions slds-button-group slds-m-left--xx-small small oneActionsRibbon forceActionsContainer']//div[@title='Add to Campaign'][contains(text(),'Add to Campaign')]")).click();
		Thread.sleep(2000);
	}
	
	public static void contact_newCampaign (String campaignName) throws Exception {
		driver.findElement(By.xpath("//span[@title='New Campaign']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[4]/div/div/div/div/div/div/div/div/div/input")).sendKeys(campaignName);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[@title='Other']")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[@title='Sales']")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div[3]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[@title='Global']")).click();
		driver.findElement(By.xpath("//button[@title='Save']//span[contains(@class,'label bBody')][contains(text(),'Save')]")).click();
		Thread.sleep(3000);
	}
	public static void mops_newCampaign (String campaignName) throws Exception {
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[4]/div/div/div/div/div/div/div/div/div/input")).sendKeys(campaignName);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[@title='Other']")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[@title='Sales']")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div[3]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[@title='Global']")).click();
		driver.findElement(By.xpath("//button[@title='Save']//span[contains(@class,'label bBody')][contains(text(),'Save')]")).click();
		Thread.sleep(3000);
	}
	public static void contact_chooseCampaign () throws Exception {
		driver.findElement(By.xpath("//span[contains(@class,'label bBody')][contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//div[6]/div/div/div/div/div/input")).sendKeys("09/30/2019");
		driver.findElement(By.xpath("//button[@title='Save']//span[contains(@class,'label bBody')][contains(text(),'Save')]")).click();
	}
	public static void contact_selectCampaign (String timestamp) throws Exception {
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys(Keys.ENTER);
		
	}
	public static void convert_Lead (String timestamp) throws Exception {
		driver.findElement(By.xpath("//div[@title='Convert']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(@class,'label bBody')][contains(text(),'Convert')]")).click();
		Thread.sleep(5000);
	}
	public static void convert_Lead_clickOpportunity (String timestamp) throws Exception {
		driver.findElement(By.xpath("//a[@title='"+timestamp+"-']")).click();
		Thread.sleep(5000);
	}
	public static void convert_Lead_clickContact (String timestamp) throws Exception {
		driver.findElement(By.xpath("//a[@title='"+timestamp+" "+timestamp+"']")).click();
		Thread.sleep(5000);
	}
	public static String verifyDate_ConvertedLead () throws Exception {
		driver.findElement(By.xpath("//div[@class='windowViewMode-normal oneContent active lafPageHost']//div[@title='Edit'][contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/input")).click();
		String closeDate = driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/input")).getAttribute("value");
		driver.findElement(By.xpath("//button[@title='Cancel']//span[contains(@class,'label bBody')][contains(text(),'Cancel')]")).click();
		/*String closeDate = driver.findElement(By.xpath("//div[5]/div/div/div[3]/div/div/div/section/div/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/span/span")).getText();*/
		return closeDate;
	}
	public static String verify_ContactUsComment (String timestamp) throws Exception {
		/*driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).sendKeys(timestamp+" "+timestamp);
		driver.findElement(By.xpath("//a[@title='"+timestamp+" "+timestamp+"']")).click();*/
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='windowViewMode-normal oneContent active lafPageHost']//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//div[5]/div/div/div/div/textarea")).click();
		String contactUsComment = driver.findElement(By.xpath("//div[5]/div/div/div/div/textarea")).getAttribute("value");
		driver.findElement(By.xpath("//div[@class='forceModalActionContainer--footerAction forceModalActionContainer']//span[contains(@class,'label bBody')][contains(text(),'Cancel')]")).click();
		return contactUsComment;
	}
	
	public static String verifyFunnelStatus () throws Exception {
		Thread.sleep(10000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//li[3]/a/div")).click();
		WebElement element = driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div/div/div/a"));
		String defaultItem = element.getText();
		return defaultItem;
	}
	
	public static void clickCampaignTab () throws Exception {
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Campaigns')]")).click();
		
	}
	public static void mops_create_Edit_Campaign (String campaignName) throws Exception {
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[4]/div/div/div/div/div/div/div/div/div/input")).clear();
		driver.findElement(By.xpath("//div[4]/div/div/div/div/div/div/div/div/div/input")).sendKeys(campaignName+"Edit");
		driver.findElement(By.xpath("//button[@title='Save']//span[contains(@class,'label bBody')][contains(text(),'Save')]")).click();
		Thread.sleep(3000);
	}
	public static void salesops_verifyAccountField_CompositRiskScore() throws Exception {
		driver.findElement(By.xpath("//div[4]/div/div/div/div/input")).sendKeys("Test");
	}
	public static void salesops_verifyAccountField_PaymentDefaultRisk() throws Exception {
		driver.findElement(By.xpath("//div[5]/div/div/div/div/input")).sendKeys("Test");
	}
	public static void salesops_competitor_cursorMovementForScreenShot() {
		driver.findElement(By.name("//lightning-input-field/lightning-input/div/input")).click();
	}
	public static String verifyLeaderShipForecast_AreaField () throws Exception {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//select")).click();
		WebElement element = driver.findElement(By.xpath("//select"));
		String defaultItem = element.getAttribute("value");
		return defaultItem;
	}
	public static String verifyLeaderShipForecast_RegionField () throws Exception {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[2]/div/div/div/select")).click();
		WebElement element = driver.findElement(By.xpath("//div[2]/div/div/div/select"));
		String defaultItem = element.getAttribute("value");
		return defaultItem;
	}
	public static void verifyOpportunity_HostingPreferenceValues ( ) throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[8]/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Azure PaaS')]")).click();
		driver.findElement(By.xpath("//div[8]/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Azure IaaS')]")).click();
		driver.findElement(By.xpath("//div[8]/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'AWS')]")).click();
		driver.findElement(By.xpath("//div[8]/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Rackspace')]")).click();
		driver.findElement(By.xpath("//div[8]/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Savvis')]")).click();
		driver.findElement(By.xpath("//div[8]/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Other')]")).click();
		driver.findElement(By.xpath("//div[8]/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Unknown')]")).click();
	}
	public static void verifyOpportunity_ImplementationDeliveryType ( ) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[2]/div/div[3]/div/button[2]")).click();
		driver.findElement(By.xpath("//div[5]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Affiliate/Partner')]")).click();
		driver.findElement(By.xpath("//div[5]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'3rd Party Vendor')]")).click();
		driver.findElement(By.xpath("//div[5]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Customer')]")).click();
	}
	public static void clickOpportunityTab ( ) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Opportunities')]")).click();
	}
	public static void clickLeadTab ( ) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Leads')]")).click();
	}
	public static void clickContactsTab ( ) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Contacts')]")).click();
	}
	public static void clickNew ( ) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(2000);
	}
	public static void verifyLeads_TentativeRelationTypeValues ( ) throws Exception {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(@class,'label bBody')][contains(text(),'Next')]")).click();

		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Prospect')]")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Customer')]")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Partner')]")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Competitor')]")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Solution Partner')]")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Affiliates')]")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Technology Alliance')]")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Corporate Alliance')]")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'ISV')]")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Account Hierarchy')]")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Other')]")).click();
	}
	
	public static void verifyLeads_TestField ( ) throws Exception {
		driver.findElement(By.xpath("//div[2]/div/div[3]/div/button[2]")).click();
		driver.findElement(By.xpath("//div[12]/div/div/div/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[2]/div/div[3]/div/button")).click();
	}
	public static void verifyContacts_TestField ( ) throws Exception {
		driver.findElement(By.xpath("//div[2]/div/div[3]/div/button[2]")).click();
		driver.findElement(By.xpath("//div[14]/div/div/div[2]/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[2]/div/div[3]/div/button")).click();
	}
	public static void verifyOpportunities_TestField ( ) throws Exception {
		driver.findElement(By.xpath("//div[2]/div/div[3]/div/button[2]")).click();
		driver.findElement(By.xpath("//div[9]/div/div/div[2]/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[2]/div/div[3]/div/button")).click();
	}
	public static void verifyFields_567 ( ) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Select List View']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys("MEL Leads");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@title='Select List View']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).clear();
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys("MQL Leads");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@title='Select List View']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).clear();
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys("SQL Leads");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@title='Select List View']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).clear();
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys("SAL Leads");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
	}
	public static void verifyTentativeRelationshipType_Fields_1595 ( ) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[11]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Solution Partner')]")).click();
		driver.findElement(By.xpath("//div[11]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Affiliates')]")).click();
		driver.findElement(By.xpath("//div[11]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Technology Alliance')]")).click();
		driver.findElement(By.xpath("//div[11]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Corporate Alliance')]")).click();
		driver.findElement(By.xpath("//div[11]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'ISV')]")).click();
		driver.findElement(By.xpath("//div[11]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Account Hierarchy')]")).click();
		driver.findElement(By.xpath("//div[11]/div/div/div/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		driver.findElement(By.xpath("//button[@title='Cancel']//span[contains(@class,'label bBody')][contains(text(),'Cancel')]")).click();

	}
	
	public static String fullNameCreation () {
		RandomCharcterGenerator rchGen = new RandomCharcterGenerator();
		String firstName = rchGen.randomIdentifier(), lastName = rchGen.randomIdentifier();
		String fullName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1) +"_"+
				lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
		return fullName;
	}
}
	
