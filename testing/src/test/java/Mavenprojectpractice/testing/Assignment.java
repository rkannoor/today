package Mavenprojectpractice.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Assignment {

	
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	        
	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new FirefoxDriver();
	        
	        // Navigate to the website
	        driver.get("http://the-internet.herokuapp.com/challenging_dom");

	        // Find the table element
	        WebElement table = driver.findElement(By.cssSelector("table"));

	        // Extract table data and store it in a List
	        List<String> tableData = new ArrayList<>();
	        List<WebElement> rows = table.findElements(By.tagName("tr"));
	        for (WebElement row : rows) {
	            List<WebElement> cells = row.findElements(By.tagName("td"));
	            for (WebElement cell : cells) {
	                tableData.add(cell.getText());
	            }
	            System.out.println();
	        }

	        // Generate CSV file
	        String csvFileName = "webtable_" + System.currentTimeMillis() + ".csv";
	        String csvFilePath = "./Home" + csvFileName;

	        try {
	            FileWriter csvWriter = new FileWriter(csvFilePath);
	            for (String data : tableData) {
	                csvWriter.append(data);
	                csvWriter.append(",");
	            }
	            
	            csvWriter.flush();
	            csvWriter.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Close the WebDriver
	        driver.quit();
	    }
	}
