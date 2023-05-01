package com.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		WebDriver d =new ChromeDriver(co);
		d.get("https://www.abhibus.com/bus-ticket-booking");
		d.manage().window().maximize();
		WebElement from=d.findElement(By.xpath("//*[@id=\"source\"]"));
		from.sendKeys("Madurai");
		WebElement to=d.findElement(By.xpath("//*[@id=\"destination\"]"));
		to.sendKeys("Chennai");
		d.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[2]/a")).click();
		d.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
	
		
	}

}
