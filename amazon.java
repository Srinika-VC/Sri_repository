package pRactice_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.name("field-keywords")).sendKeys("shoe"+Keys.ENTER);
	
}
}
