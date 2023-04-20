package cc1;

import java.io.ObjectInputStream.GetField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1 {
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
	  
	  
	  
	  WebElement add_to_Cart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
      add_to_Cart.click();
      
      WebElement contents=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
      contents.click();
      
      WebElement checkout=driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
      checkout.click();
      
      WebElement first_name=driver.findElement(By.id("first-name"));
      first_name.sendKeys("NAVEEN");
      
      WebElement last_name=driver.findElement(By.id("last-name"));
      last_name.sendKeys("KRISHNA");
      
      WebElement pin=driver.findElement(By.id("postal-code"));
      pin.sendKeys("641008");
      
      WebElement cont=driver.findElement(By.id("continue"));
      cont.click();
      
      WebElement name=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
      System.out.println(name.getText());

      WebElement price=driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div"));
      System.out.println(price.getText());
      
      String title=driver.getTitle();
      String exp="Swag Labs";
      
      if(title==exp) {
    	  System.out.println("title verified");
      }
      else {
    	  System.out.println("not matched");
      }
      
      String url=driver.getCurrentUrl();
      String expurl="https://www.saucedemo.com/checkout-step-two.html";
      
      if(url==expurl) {
    	  System.out.println("url verified");
      }
      else {
    	  System.out.println("not matched");
      }
      
      

      
      
      
      
}
}