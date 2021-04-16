package org.demoblaze;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze extends Baseclass {

	public static void main(String[] args) {
		chromeBrowserLaunch();
		LaunchURL("https://blazedemo.com/");
		
		WebElement depcity = driver.findElement(By.name("fromPort"));
		selectVisibleText(depcity,"Portland");
		selectVisibleText(depcity,"Paris");
		selectIndex(depcity,3);
		WebElement destcity = driver.findElement(By.name("toPort"));
		selectVisibleText(destcity,"London");
		selectValue(destcity,"New York");
		selectIndex(destcity,5);
		WebElement FindFlights = driver.findElement(By.xpath("//input[@type='submit']"));
		FindFlights.click();
		WebElement FlightsDets = driver.findElement(By.xpath("//input[@value='Choose This Flight'])[3]"));
		FlightsDets.click();
		
	}
}












