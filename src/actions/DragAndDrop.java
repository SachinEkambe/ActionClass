package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement trg=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(src, trg).build().perform();
	}
}
