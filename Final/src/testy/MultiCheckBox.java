package testy;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultiCheckBox {
	WebDriver driver;
	@Test
	public void multicheck()
	{
		 driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/signup?h1=en-GB");
		List<WebElement> els=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement el :els )
		{
			if(!el.isSelected())
			{
				el.click();
				System.out.println(el);
			}
		}
	}

}
// "//input[@type='checkbox']"                      "//input[@type='checkbox']"                                                        