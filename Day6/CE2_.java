package com.Day9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CE2_ {
	WebDriver d;
	WebDriver d1;
	WebDriver d2;
	
	  @Test(groups="SmokeTest")
	  public void Testcase1() throws InterruptedException {
		  
		  ChromeOptions co= new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver();
			d=new ChromeDriver();
			d.get("https://www.godaddy.com/");
			d.manage().window().maximize();	
			Thread.sleep(4000);
		  String title=d.getTitle();
		  Assert.assertEquals("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN", title);
		  String url=d.getCurrentUrl();
		  Assert.assertEquals("https://www.godaddy.com/en-in", url);
		  
	  }
	  
	  @Test(groups="RegressionTest")
	  public void Testcase02() throws InterruptedException {
		  
		  ChromeOptions co1= new ChromeOptions();
			co1.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver();
			d1=new ChromeDriver();
			d1.get("https://www.godaddy.com/");
			d1.manage().window().maximize();	
			Thread.sleep(4000);
		  d1.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  d1.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		  d1.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
		  
	  }
	  
	  @Test(groups="RegressionTest")
	  public void Testcase03() throws InterruptedException {
		  
		  ChromeOptions co2= new ChromeOptions();
			co2.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver();
			d2=new ChromeDriver();
			d2.get("https://www.godaddy.com/");
			d2.manage().window().maximize();	
			Thread.sleep(4000);
		  d2.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  d2.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		  d2.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
		  String title=d2.getTitle();
		  System.out.println(title);
		  d2.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).isEnabled();
		  d2.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/div[2]/button")).isEnabled();
		  WebElement input=d2.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]"));
		  input.sendKeys("Food");

	  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
