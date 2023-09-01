package Mavenproject.javaselenium;

import java.io.File;

import java.io.IOException;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class YouTubeRightClickDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();

        // Open YouTube
        driver.get("https://nxtgenaiacademy.com/multiplewindows/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[text()=\"New Browser Tab\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"New Browser Tab\"]")).click();
        
         
        String originalwindow=driver.getWindowHandle();
        for(String handle:driver.getWindowHandles())
        {	
        if(!handle.equals(originalwindow))
            {
        	driver.switchTo().window(handle);
          	break;
            }
	     }
        
       

        // Switch to the new tab
//        String originalHandle = driver.getWindowHandle();
//        //System.out.println(originalHandle);
//        
//        for (String handle : driver.getWindowHandles()) {
//            if (!handle.equals(originalHandle)) {
//                driver.switchTo().window(handle);
//                break;
//            }
//           // System.out.println(driver.getWindowHandles());
//        }
        
        
       
         
        WebElement ele=driver.findElement(By.xpath("//span[text()=\"Click here to view Course 3 Curriculum\"]"));
        
        Actions act=new Actions(driver);
        //act.scrollToElement(ele).perform();
        act.moveToElement(ele).perform();
       
        act.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).perform();
    }
}  

	


