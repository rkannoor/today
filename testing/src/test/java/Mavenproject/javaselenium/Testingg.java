package Mavenproject.javaselenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testingg {
	
		public void launching() {
		WebDriver driver=new ChromeDriver();
		//System.setProperty("chromedriver", ".\\chrome.exe");
		driver.get("https://www.programiz.com/java-programming/online-compiler");
		
		
		
	}

}
