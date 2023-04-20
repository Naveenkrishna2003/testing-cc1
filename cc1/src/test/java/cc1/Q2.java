package cc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2 {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	  WebDriver driver;
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver=new ChromeDriver(co);

	  driver.navigate().to("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();

	  WebElement u_name=driver.findElement(By.id("user-name"));
	  u_name.sendKeys("standard_user");
	  
	  WebElement pass=driver.findElement(By.id("password"));
	  pass.sendKeys("secret_sauce");

	  WebElement login=driver.findElement(By.id("login-button"));
	  login.click();

	  Select filter=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
	  filter.selectByVisibleText("Name (A to Z)");
	  
	  WebElement pro1=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
	  System.out.println(pro1.getText());
	  
	  Select filter1=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
	  filter1.selectByVisibleText("Name (Z to A)");
	  
	  WebElement pro2=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
	  System.out.println(pro2.getText());
	  
	  Select filter2=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
	  filter2.selectByVisibleText("Price (low to high");
	
	  WebElement pro3=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
	  System.out.println(pro3.getText());
	 
	  Select filter3=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
	  filter3.selectByVisibleText("Price (high to low");
	  
	  WebElement pro4=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
	  System.out.println(pro4.getText());
}
}