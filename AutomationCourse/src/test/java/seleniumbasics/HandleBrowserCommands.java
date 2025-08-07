package seleniumbasics;

public class HandleBrowserCommands extends Base
{
	
	public void verifycommand()
	{
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String handleid = driver.getWindowHandle();
		System.out.println(handleid);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
	}
	


	public static void main(String[] args)  {
		HandleBrowserCommands handleBrowserCommand = new HandleBrowserCommands ();
		handleBrowserCommand.intializeBrowser();
		handleBrowserCommand.verifycommand();
		
		// TODO Auto-generated method stub

	}

}
