import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\chromedriver\\chromedriver.exe");


		//WebDriver driver= new FirefoxDriver();

		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(6000L);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000L);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
		
		//driver.findElement(By.xpath(("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction']//a[@value='MAA']"))).click();
		
		driver.findElement(By.xpath(("(//a[@value='MAA'])[2]"))).click();
		int num=0;
		num=driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(num);
		
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		// TODO Auto-generated method stub

		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		
	}

}
