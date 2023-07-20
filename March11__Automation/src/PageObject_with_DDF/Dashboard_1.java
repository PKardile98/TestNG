package PageObject_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_1 {

	WebDriver driver;
	
	public Dashboard_1(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p\"]")
	
	WebElement Time;
	
	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	
	WebElement Name;
	
	public void usernamevalidation() {
		
		String Text = Name.getText();
		if(Text.equals("Santhosh Thadimerri")) { // Santhosh Thadimerri


			
			System.out.println("Correct Name");
		}
		
		else {
			
			System.out.println("Incorrect name");
		}
	}
	
	public void At_time() {
		
		Boolean B1=Time.isDisplayed();
		System.out.println(B1);
		
	}
}
