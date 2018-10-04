package com.sitcore.selinium.java;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import  org.junit.Test;
import org.openqa.selenium.support.ui.Select;

public class ObjectRepositoryMain {
	public static WebDriver driver;
	String leadLastName_xPath = "/html[1]/body[1]/div[5]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[4]/input[1]";
	String leadTitle_xPath = "/html[1]/body[1]/div[5]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]";
	String leadLandline_xPath = "/html[1]/body[1]/div[5]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/input[1]";
	static String lastnameError_expected = "Complete this field";
	static String LastNameError;
	
	@Before
	  public static void launchChrome() throws Exception {
		  ChromeOptions options=new ChromeOptions();
		  Map<String, Object> prefs=new HashMap<String,Object>();
		  prefs.put("profile.default_content_setting_values.notifications", 1);
		  //1-Allow, 2-Block, 0-default
		  options.setExperimentalOption("prefs",prefs);
		  System.setProperty("webdriver.chrome.driver","D:\\VijayWorkSpace\\chromedriver.exe");
		  driver = new ChromeDriver(options);   
		  driver.get("https://test.salesforce.com");
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);      
	      
	    }
	
	public static void launchChrome_Dynamics() throws Exception {
		
		  System.setProperty("webdriver.chrome.driver","D:\\VijayWorkSpace\\chromedriver.exe");
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
	    Thread.sleep(2000);
	}	
		
	public static void loginUser() throws InterruptedException {
		
		driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("vima@sitecore.net.finaluat");
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
	    Thread.sleep(2000);
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
	
	public static void clickAccountsTab() throws InterruptedException {
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
	
	public static void selectAccRqstRT() throws InterruptedException {
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
		driver.findElement(By.xpath("//fieldset/div/div[2]/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'United Kingdom')]")).click();
		driver.findElement(By.xpath("//div/div/div/div/fieldset/div/div[3]/div/div/textarea")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/fieldset/div/div[4]/div/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/fieldset/div/div[4]/div[2]/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'England')]")).click();
		driver.findElement(By.xpath("//div/div/div/div/fieldset/div/div[5]/div/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div[@class='slds-form-element__control']/div/input")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[@title='Save']")).click();
	}
	
	public static void fillAccountsFormAndSaveSDRUser(String postfix, String timestamp) {
		driver.findElement(By.xpath("//div[@class='autocompleteWrapper slds-grow']//input[1]")).sendKeys(timestamp+postfix);
		driver.findElement(By.xpath("//fieldset/div/div[2]/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'United Kingdom')]")).click();
		driver.findElement(By.xpath("//div/div/div/div/fieldset/div/div[3]/div/div/textarea")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/fieldset/div/div[4]/div/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//div/div/div/div/fieldset/div/div[4]/div[2]/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'England')]")).click();
		driver.findElement(By.xpath("//div/div/div/div/fieldset/div/div[5]/div/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//button[@title='Save']")).click();
	}
	
	public static void createNewContact() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='title'][contains(text(),'Related')]")).click();
		driver.findElement(By.xpath("//div[@title='New Contact']")).click();
		Thread.sleep(3000);
		
	}
	public static void selectContactRecordType() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Contact Record Type')]")).click();
		driver.findElement(By.xpath("//div[@class='forceChangeRecordTypeFooter']//button[2]")).click();
		
	}

	public static void fillContactFormAndSave(String timestamp, String postName) throws InterruptedException {
		driver.findElement(By.xpath("//div/div/div/div/div/fieldset/div/div[4]/input")).sendKeys(timestamp+postName);
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp+postName);
		driver.findElement(By.xpath("//div/div/div[3]/div/div/div[2]/span/div/div/input")).sendKeys(timestamp+postName+"@gmail.com");
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/input")).sendKeys(timestamp+postName);
		driver.findElement(By.xpath("//div[4]/div/div/div[5]/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//button[@title='Save']")).click();

	}

	public static void fillNewProductAndSave(String timestamp) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Opportunities')]")).click();
		driver.findElement(By.xpath("//lightning-input/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//a[@title='"+timestamp+"']")).click();
		Thread.sleep(8000);
		((JavascriptExecutor)driver).executeScript("scroll(0,100)");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[@title='Products']")).click();

		
		driver.findElement(By.xpath("//a[@title='Add Products']")).click();
		driver.findElement(By.xpath("//span/span/label/span")).click();
		
		
		
		driver.findElement(By.xpath("//button[contains(@title,'Next')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span/span[2]/button")).click();
		driver.findElement(By.xpath("//tr/td[2]/div/div/div/div/div/div/input")).sendKeys("114");
		driver.findElement(By.xpath("//td[3]/span/span[2]/button")).click();
		driver.findElement(By.xpath("//tr/td[3]/div/div/div/div/div/div/input")).clear();
		driver.findElement(By.xpath("//tr/td[3]/div/div/div/div/div/div/input")).sendKeys("500");
		driver.findElement(By.xpath("//button[contains(@title,'Save')]")).click();
	}

	public static void fillNewOpportunityFormAndSave(String timestamp) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).sendKeys(timestamp);
		driver.findElement(By.xpath("//a[@title='"+timestamp+"']")).click();
		driver.findElement(By.xpath("//div[@title='New Opportunity']")).click();
		driver.findElement(By.xpath("//input[@id='input-4']")).sendKeys(timestamp);
		driver.findElement(By.xpath("//input[@id='input-48']")).sendKeys("Sep 30, 2018");
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
	public static void fillFormAndSaveLead(String postFix, String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//fieldset/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mr.')]")).click();
		driver.findElement(By.xpath("//div[4]/input")).sendKeys(timestamp+"LC"+postFix);
		driver.findElement(By.xpath("//div/div/div/div/div/div/fieldset/div/div[2]/input")).sendKeys("test");
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp+postFix);
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys(timestamp+"@gmail.com");
		driver.findElement(By.xpath("//div[5]/div/div/div/div/input")).sendKeys("1234567890");
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SAL')]")).click();
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
	public static void saveLeadWOAccount(String postFix, String timestamp) throws InterruptedException {
		driver.findElement(By.xpath("//fieldset/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mr.')]")).click();
		driver.findElement(By.xpath("//div[4]/input")).sendKeys(timestamp+"LC"+postFix);
		driver.findElement(By.xpath("//div/div/div/div/div/div/fieldset/div/div[2]/input")).sendKeys("test");
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(timestamp+postFix);
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys(timestamp+"@gmail.com");
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
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys(timestamp+"@gmail.com");
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
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys(timestamp+"@gmail.com");
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
		driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).sendKeys(timestamp+"@gmail.com");
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
		File destFile=new File("D:\\VijayWorkSpace\\ScreenShots\\"+fileName+".png");
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
		
}
	
