package Mavenproject.javaselenium;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver = new ChromeDriver();

	        
	        driver.get("https://www.google.co.in/");
	        Thread.sleep(3000);

	       
	        driver.manage().window().maximize();
	        Thread.sleep(3000);

	        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("jai shree ram wallpaper");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).submit();
	        Thread.sleep(3000);
	        WebElement ole=driver.findElement(By.xpath("//img[@id='dimg_37']"));
	        TakesScreenshot ts = (TakesScreenshot)driver;
	        Thread.sleep(3000);
	        File src= ole.getScreenshotAs(OutputType.FILE);
	        Thread.sleep(3000);
	        ImageIO.write(ImageIO.read(src), "png", new File("screenshot4.png"));
	        Thread.sleep(3000);
	      

	       //driver.getCurrentUrl();
	       System.out.println(driver.getTitle());
	        ///driver.quit();
	    }

	}


