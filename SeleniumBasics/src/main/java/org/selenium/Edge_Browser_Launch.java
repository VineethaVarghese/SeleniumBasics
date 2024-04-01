package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Edge_Browser_Launch {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
driver.get("https://demowebshop.tricentis.com/");
		
		//to maximize the url 
		driver.manage().window().maximize();
		
		//to get the Title of URL, its a string type ,so storing in a variable
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get current URL
		String current_url = driver.getCurrentUrl();
		System.out.println(current_url);
		
		//to get window handle id
		String window_handle = driver.getWindowHandle();
		System.out.println(window_handle);
		
		//to get the html code of the current page
		String page_source = driver.getPageSource();
		System.out.println(page_source);
		
		//to close the window
		driver.close();

	}

}
