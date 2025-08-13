package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown extends Base {
	public void verifydropdown() {
	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
	Select select=new Select(dropdown);
	//select.selectByIndex(1);
	//select.deselectByVisibleText("Python");
	select.deselectByValue("SQL");
	}
    public void verifycheckbox() {
    	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
    	WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
    	checkbox.click();
    	System.out.println(checkbox.isDisplayed());
    	System.out.println(checkbox.isEnabled());
    	System.out.println(checkbox.isSelected());
    	if(checkbox.isSelected()) {
    		checkbox.click();
    	}
    }
    public void verifyradiobutton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='purple']"));
		System.out.println(radiobutton.isSelected());
		radiobutton.click();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandleDropDown handledropdown= new HandleDropDown();
		handledropdown.intializeBrowser();
		//handledropdown.verifydropdown();
		//handledropdown.verifycheckbox();
		handledropdown.verifyradiobutton();

	}
	
	}
	


