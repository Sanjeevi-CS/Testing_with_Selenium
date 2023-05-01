package com.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CE_2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		WebDriver d =new ChromeDriver(co);
		d.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		d.manage().window().maximize();
		WebElement fname=d.findElement(By.id("input-firstname"));
		fname.sendKeys("Sanjeevi");
		WebElement lname=d.findElement(By.id("input-lastname"));
		lname.sendKeys("C S");
		WebElement email=d.findElement(By.id("input-email"));
		email.sendKeys("727721eucs134@skccet.ac.in");
		WebElement password=d.findElement(By.id("input-password"));
		password.sendKeys("Frustration");
		d.findElement(By.name("newsletter")).click();
		Thread.sleep(4000);
		d.findElement(By.name("agree")).click();
		Thread.sleep(6000);
		d.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
	}

}
