package seleniumbasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public void intializeBrowser()
	{
		//driver=new FirefoxDriver();
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
	}
	public void closeBrowser()
	{
		//driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.intializeBrowser();
		//base.closeBrowser();

	}

}
