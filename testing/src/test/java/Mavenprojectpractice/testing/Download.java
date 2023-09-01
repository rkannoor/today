package Mavenprojectpractice.testing;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Download {

	public static void main(String[] args) throws InterruptedException {
		

		
		        // Set the path to your ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Create a new instance of the Chrome driver
		        WebDriver driver = new FirefoxDriver();

		        try {
		            // Step 1: Download files from the first link
		            driver.get("https://the-internet.herokuapp.com/download");
		            WebElement downloadLink = driver.findElement(By.linkText("some-file.txt")); // Change to match your file name
		            downloadLink.click();

		            // BONUS - Download only non-PNG image
		            // You can add logic here to check the file extension before clicking the link

		            // Step 2: Upload the downloaded file to the second link
		            driver.get("https://the-internet.herokuapp.com/upload");
		            WebElement uploadInput = driver.findElement(By.id("file-upload"));

		         /*  // Specify the path to the downloaded file you want to upload
		            String filePath = "C:\\Users\\ADMIN\\Downloads\\some-file.txt"; // Change to your file path
		            uploadInput.sendKeys(filePath);

		            // Submit the form to upload the file
		            WebElement uploadButton = driver.findElement(By.id("file-submit"));
		            uploadButton.click();

		            // Wait for a while to see the result (you can add explicit waits here)
		            Thread.sleep(5000);*/
		            
		     ;
		            
		            
		            
		            

		        } 
		            finally {
//		             Close the browser
//	            driver.quit();
		        }
		    }
		}


