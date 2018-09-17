package MasterScript1;
import org.junit.Assert;
import org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	private static SimpleDateFormat sdf = new SimpleDateFormat("SSSssmmHHyyyMMdd");
	private static Date todayDate = new Date();
	
	@Before
	  public static void launchChrome() throws Exception {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\SC\\Desktop\\eclipse\\eclipse\\chromedriver.exe");
		  driver = new ChromeDriver();   
		  driver.get("https://test.salesforce.com");
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);      
	      
	    }
		
	public static void loginQA() throws InterruptedException {
		
		driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("vima@sitecore.net.sitecoreqa");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Ovj4519oe26qa");	   
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(2000);
	}	
		
	public static void clickLeadsTab() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Leads')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='New']")).click();
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
	public static void loginFinalUAT() throws InterruptedException {
		
		driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("vima@sitecore.net.finaluat");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Ovj4519oe26");	    
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(2000);
	}
	
	public static void clickAccountsTab() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(1000);
		System.out.println("ok");
		
	}

	public static void selectCustomerRecord() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Customer Record')]")).click();
		driver.findElement(By.xpath("//div[@class='forceChangeRecordTypeFooter']//button[2]")).click();
		Thread.sleep(3000);
	}

	public static void fillAccountsFormAndSave() {
		driver.findElement(By.xpath("//div[@class='autocompleteWrapper slds-grow']//input[1]")).sendKeys(sdf.format(todayDate)+"Test");
		driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Verified')]")).click();
		driver.findElement(By.xpath("//fieldset/div/div[2]/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'United Kingdom')]")).click();
		driver.findElement(By.xpath("//div/div/div/div/fieldset/div/div[3]/div/div/textarea")).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath("//div/div/div/div/fieldset/div/div[4]/div/div/input")).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath("//div/div/div/div/fieldset/div/div[4]/div[2]/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'England')]")).click();
		driver.findElement(By.xpath("//div/div/div/div/fieldset/div/div[5]/div/div/input")).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath("//div[@class='slds-form-element__control']/div/input")).sendKeys("1234567890");
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

	public static void fillContactFormAndSave() throws InterruptedException {
		driver.findElement(By.xpath("//div/div/div/div/div/fieldset/div/div[4]/input")).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath("//div/div/div/div/div[2]/div/div/div/div/input")).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath("//div[5]/div[2]/div/div/div/input")).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath("//div[4]/div/div/div[5]/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//div[2]/force-list-view-manager-search-bar/div/lightning-input/div/input")).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath("//a[@title='"+sdf.format(todayDate)+"']")).click();
		driver.findElement(By.xpath("//li[@class='tabs__item uiTabItem']//span[@class='title'][contains(text(),'Related')]")).click();
		driver.findElement(By.xpath("//div[@class='windowViewMode-normal oneContent active lafPageHost']//div[@class='container']//div[1]//article[1]//div[1]//div[1]//div[1]//ul[1]//li[1]//a[1]")).click();
		driver.findElement(By.xpath("//div[@class='forceChangeRecordTypeFooter']//button[2]")).click();
		driver.findElement(By.xpath("//div/div/div/div/div/div/div/div/div/input")).sendKeys(sdf.format(todayDate));
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'License')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/div/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();



	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	