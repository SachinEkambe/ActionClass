package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		
		act.moveToElement(ele).build().perform();

	}

}
