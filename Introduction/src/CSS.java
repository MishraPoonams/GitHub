import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\chromedriver\\chromedriver.exe");


		//WebDriver driver= new FirefoxDriver();

		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new InternetExplorerDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("input#username")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("hello");
		//driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("pass");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
	
		

	}

}
