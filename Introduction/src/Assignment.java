import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\chromedriver\\chromedriver.exe");

		// WebDriver driver= new FirefoxDriver();

		WebDriver driver = new ChromeDriver();
		// WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		if( !driver.findElement(By.id("checkBoxOption2")).isSelected())
		{
			driver.findElement(By.id("checkBoxOption2")).click();
			String Lable2=driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
			driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).sendKeys(Lable2);
			driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(Lable2);
			driver.findElement(By.id("alertbtn")).click();
			
			Alert alt=driver.switchTo().alert();
			String getText=alt.getText();
			if(getText.contains(Lable2))
			{
				System.out.println(alt.getText());
				alt.accept();
			}

			
		}
		

	}

}
