import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\chromedriver\\chromedriver.exe");


				//WebDriver driver= new FirefoxDriver();

				WebDriver driver= new ChromeDriver();
				//WebDriver driver= new InternetExplorerDriver();
				driver.get("http://echoecho.com/htmlforms10.htm");
				Thread.sleep(6000L);
				
			int num=0;
			num=driver.findElements(By.xpath("//input[@name='group1']")).size();
			for(int i=0; i<num;i++)
			{
			String radivalue=	driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (radivalue.equals("Milk")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
			}
				
				

	}

}
