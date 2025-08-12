package seleniumbasics;

public class HandleNavigationCammand extends Base {

	public void verifyNavigationCommands() {
		//driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HandleNavigationCammand handle =new HandleNavigationCammand();
     handle.intializeBrowser();
     handle.verifyNavigationCommands();
	}
	

}
