package cucumberStandard;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleCucumber {
	
		WebDriver driver;
	
	
	@Given("^navigate to gmail page$")
	public void navigate(){
		
		driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");         
	       }
	@When ("^user logged in using username as \"(.*)\" and password as \"(.*)\"$")
	public void login(String username,String password){
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       }
	@Then("^home page should be displayed$")
	public void verifySuccessful(){
	      String expectedText="Gmail";
	      String actualText=         driver.findElement(By.xpath("//*[@id='gbq1']/div/a/span")).getText();
	      Assert.assertEquals("Login not successful",expectedText.equals(actualText));
	      }
	}


