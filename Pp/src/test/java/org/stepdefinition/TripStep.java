package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TripStep {
	
	public static WebDriver w ;
	@Given("launch the browser")
	public void launch_the_browser() {
	 WebDriverManager.chromedriver().setup();
	 
	 w= new ChromeDriver();
	 w.get("https://www.goibibo.com/");
	 w.manage().window().maximize();
	}

	@Given("Sign up the page")
	public void sign_up_the_page() {
	    
		WebElement sign = w.findElement(By.xpath("//span[@role = 'presentation']"));
		sign.click();
		//WebElement contdemail = w.findElement(By.xpath("//span[text()='Continue with email'] "));
		//contdemail.click();
	}

	@When("Enter the travel destination")
	public void enter_the_travel_destination() {
	    WebElement clkh = w.findElement(By.xpath("//span[text()='Hotels']"));
	    clkh.click();
	}

	@When("Choose the dates")
	public void choose_the_dates() throws InterruptedException, AWTException {
		
		
		
		
	    WebElement pl = w.findElement(By.xpath("//span[text()='Where to']//following::p[text()='e.g. - Area, Landmark or Property Name']"));
	   // WebDriverWait wait = new WebDriverWait(w,java.time.Duration.ofSeconds(15));
	    //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Where to']//following::p[text()='e.g. - Area, Landmark or Property Name']")));
	    pl.click();
	    Thread.sleep(6000);
	    WebElement gg = w.findElement(By.xpath("//input[@placeholder='e.g. - Area, Landmark or Property Name']"));
	    //pl.sendKeys("Chennai");
	  
	    
	    
	    gg.click();
	    gg.sendKeys("Chennai");
	    
	    
	    
	    Thread.sleep(6000);
	    List<WebElement> auto = w.findElements(By.xpath("//ul[@ id='downshift-1-menu' ]/li"));
	    int count = auto.size();
	    System.out.println("number of places shown "+count);
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    //auto.get(count-count).click();
	    Thread.sleep(5000);
	      WebElement chin = w.findElement(By.xpath("//span[text()='Check-in']//preceding::span[@class='Widgetstyles__FswDownArrow-sc-n46q69-7 fQspnw fswDownArrow']"));
		   chin.click();
		   WebElement fromdate = w.findElement(By.xpath("//span[@data-testid='date_27_11_2024']"));
		   fromdate.click();
		   
		   WebElement todate = w.findElement(By.xpath("//span[@data-testid='date_2_0_2025']"));
		   todate.click();
		   
		   w.findElement(By.xpath("//a[text()='SEARCH']")).click();
	    
	}
//
	@When("Select the hotels")
	public void select_the_hotels() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Thread.sleep(3000);
		//w.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		Actions a = new Actions(w);
		
		
		WebElement hotel = w.findElement(By.xpath("//div[@class='HotelCardV2styles__SRPCardRatingWrapper-sc-6przws-10 lbbLDs']//following::a[text()='Taj Wellington Mews, Chennai']"));
	    
	WebDriverWait wait = new WebDriverWait(w, null);
	wait.withTimeout(java.time.Duration.ofSeconds(60));
	wait.until(ExpectedConditions.elementToBeClickable(hotel));
		//Thread.sleep(10000);
	a.moveToElement(hotel);
	a.click(hotel).build().perform();
		//wait.until(ExpectedConditions.elementToBeClickable(hotel));
		hotel.click();
	}
//
//	@Then("Choose the rooms and amount")
//	public void choose_the_rooms_and_amount() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Go to payment tab")
//	public void go_to_payment_tab() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}


}
