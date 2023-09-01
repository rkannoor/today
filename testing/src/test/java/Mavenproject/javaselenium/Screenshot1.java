package Mavenproject.javaselenium;

import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Screenshot1 {

	//public static void main(String[] args) {
		
		
		 public static WebDriver driver =null;
		
	

	private static void launch() throws InterruptedException, Exception {
		// TODO Auto-generated method stub
	driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=wxzF6lObwIs&list=PL-a9eJ2NZlbRFnZbN8glYFGaEudds86-k&index=23");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.navigate().refresh();
		//driver.get(driver.getCurrentUrl());
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File des=new File ("image.png");
//		FileUtils.copyFile(src, des);
		
		
		// Create an instance of the Actions class
        Actions actions = new Actions(driver);

        
        
        Thread.sleep(2000);
        
        WebElement element=driver.findElement(By.xpath("//span[@id='video-title' and contains(text(), '#4. |Rest Assured Framework|Push Framework To GitHub Repo| #restassured')]"));
//        // Perform the right-click action on the element
//        actions.contextClick(element).build().perform();
//        Thread.sleep(2000);
//        actions.sendKeys("t").perform();
       
        
    
        
       actions.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//       // actions.contextClick(element).build().perform();
//        actions.sendKeys(Keys.CONTROL).sendKeys(Keys.ENTER).perform();
//        actions. sendKeys("W").perform();
//        // Sleep for a moment to allow the new tab to open (you can replace this with an explicit wait)
//        try {
            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        
      
}} 
        
        
        


      

