package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selIntro {
	public static void main(String[] args)
	{
		WebDriver webdriver=null;
		System.setProperty("webdriver.chrome.driver","C:\\MyDownloads\\chromedriver_win32\\chromedriver.exe");
		webdriver=new ChromeDriver();
	
	
//		System.setProperty("webdriver.gecko.driver","C:\\MyDownloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		webdriver = new FirefoxDriver();		
//		System.setProperty("webdriver.edge.driver","C:\\MyDownloads\\edgedriver_win32\\msedgedriver.exe");
//		webdriver = new EdgeDriver();
//		
		webdriver.get("https://www.simplilearn.com");
		System.out.println(webdriver.getTitle());
		System.out.println(webdriver.getCurrentUrl());
		webdriver.quit();			
	}
	

}
