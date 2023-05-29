package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriverManager.chromedriver().setup();
 
 WebDriver driver=new ChromeDriver();
 
 driver.get("https://demoqa.com/buttons");
 driver.manage().window().maximize();
 Actions act=new Actions(driver);
 WebElement ele=driver.findElement(By.id("rightClickBtn"));
 act.contextClick(ele).build().perform();
	}

}
