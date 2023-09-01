package Mavenprojectpractice.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Assignment1 {

		
		    public static void main(String[] args) {
		        // Set up Chrome WebDriver
//		        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
//		        ChromeOptions options = new ChromeOptions();
//		        options.addArguments("--headless"); // Optional: Run in headless mode
		        WebDriver driver = new FirefoxDriver();
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		        // Navigate to the webpage
		        driver.get("http://the-internet.herokuapp.com/challenging_dom");

		        // Find and read the table data
		        WebElement table = driver.findElement(By.cssSelector(".large-10"));
		        List<WebElement> rows = table.findElements(By.tagName("tr"));
		        List<WebElement> head =  table.findElements(By.tagName("th"));
		        List<List<String>> tableData = new ArrayList<>();
		        
		        System.out.println(head.size());

//		     for (int i = 0; i < rows.size(); i++) {
//		            List<String> rowData = new ArrayList<>();
//		            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
//		            for (WebElement cell : cells) {
//		                rowData.add(cell.getText());
//		            }
//		            tableData.add(rowData);
//		        }
//
//		        // Generate a CSV file with current timestamp
//		        String timestamp = java.time.LocalDateTime.now().toString().replace(":", "-");
//		        String fileName = "./Briq" + timestamp + ".csv";
//
//		        try (FileWriter csvWriter = new FileWriter(fileName)) {
//		            for (List<String> rowData : tableData) {
//		                csvWriter.append(String.join(",", rowData));
//		                csvWriter.append("\n");
//		            }
//		            System.out.println("CSV file created successfully: " + fileName);
//		        } catch (IOException e) {
//		            e.printStackTrace();
//		        }
//
//		        // Close the WebDriver
		        driver.quit();
		    }
		}


