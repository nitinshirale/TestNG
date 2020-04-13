package demotestNG;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.*;		

public class Login_form_report {				
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;							

	@BeforeClass
	public void beforeClass() throws Exception {	   
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver", "E:\\ST\\chromedriver.exe");					
    	 driver = new ChromeDriver();					
        test.log(LogStatus.INFO, "Browser Started...");
        baseUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";					
        report = new ExtentReports("E:\\st\\logintest.html"); 
        test = report.startTest("Verify Welcome Text");
      test.log(LogStatus.INFO, "Web application opened");
        //driver.manage().window().maximize();
        driver.get(baseUrl);
	}
	@Test
	public void validLoginTest() throws Exception{
		
		try {
        // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement email = driver.findElement(By.id("email"));	
        email.sendKeys("nitinshirale051@gmail.com");	
        test.log(LogStatus.INFO, "Enter email");

        // Get the WebElement corresponding to the Password Field		
        WebElement password = driver.findElement(By.name("passwd"));							
        test.log(LogStatus.INFO, "Enter Password");
        // Find the submit button		
        WebElement login = driver.findElement(By.id("SubmitLogin"));
        test.log(LogStatus.INFO, "Clicked on Submit");
                    		
        // Using click method to submit form		
             
        password.sendKeys("12345678");	
       //Thread.sleep(1000);
        login.click();	 		
        System.out.println("Login Done with Click");					
  WebElement searchText = driver.findElement(By.id("search_query_top"));							
      // Get the WebElement corresponding to the Password Field		
    WebElement searchSubmit = driver.findElement(By.name("submit_search"));	
    test.log(LogStatus.INFO, "Search Box Clicked");
        searchText.sendKeys("top");
      searchSubmit.click(); 
       WebElement searchresult=driver.findElement(By.className("heading-counter"));
       
       if(searchresult.getText().equals("0 results have been found."))
       {                       
        	System.out.println("no result found");

      }
       
        System.out.println("Search done");
        
        WebElement logout=driver.findElement(By.className("logout"));
       
        logout.click();
        System.out.println("logout successfully!!");
		  } catch (Exception e) {
	            e.printStackTrace();}

	}
	@AfterClass
	public void afterrun() {
		driver.quit();
		report.endTest(test);
		//report.flush();
	}
    }		