import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\chromedriver\\chromedriver.exe");


		//WebDriver driver= new FirefoxDriver();
String dateselected="25";
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.path2usa.com/travel-companions");
       driver.findElement(By.xpath("//*[@id='travel_date']")).click();
       
     while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
     {
    	 driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
     }
      List<WebElement> dats= driver.findElements(By.className("day"));
      for(int i=0;i<driver.findElements(By.className("day")).size();i++)
      {
    	  String datetext=driver.findElements(By.className("day")).get(i).getText();
    	  if(datetext.equals(dateselected)) 
    	  {
    		  System.out.println(driver.findElements(By.className("day")).get(i).getText());
    		  driver.findElements(By.className("day")).get(i).click();
    		  break;
    	  }
      }
	}

}
