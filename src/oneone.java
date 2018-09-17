import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class oneone {
  public WebDriver driver;
  //private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  
  //----------------------- Object Map--------
  //Sheet 0 = Account
  //Sheet 1 = Contact
  //Sheet 2 = Lead
  //------------------------------------------
  
//----------------------------------------	
//Open Salesforce.com in Chrome Browser
//----------------------------------------
  @Before
  public void OpenChrome() throws Exception {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\VijayaMaram\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();   
	  driver.get("https://login.salesforce.com");
	  driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);      
    }
