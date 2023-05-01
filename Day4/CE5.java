package com.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CE5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		EdgeOptions co1=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		WebDriverManager.edgedriver();
		WebDriver d =new ChromeDriver(co);
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		WebElement s1=d.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		s1.sendKeys("Apple");
		d.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		WebDriver d1 =new EdgeDriver(co1);
		d1.get("https://www.google.com/");
		d1.manage().window().maximize();
		WebElement s2=d1.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		s2.sendKeys("Selenium");
		d1.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		WebDriver d2 =new ChromeDriver(co);
		d2.get("https://www.google.com/");
		d2.manage().window().maximize();
		WebElement s3=d2.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		s3.sendKeys("Cucumber");
		d2.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		String id=d.getWindowHandle();
		System.out.println(id);
		String id1=d1.getWindowHandle();
		System.out.println(id1);
		String id2=d2.getWindowHandle();
		System.out.println(id2);
		String title=d.getTitle();
		System.out.println(title);
		String title1=d1.getTitle();
		System.out.println(title1);
		String title2=d2.getTitle();
		System.out.println(title2);
		

	}

}
