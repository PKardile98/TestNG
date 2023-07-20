package PageObject_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	WebDriver driver;
	
	public Login_Page(WebDriver driver) { // constructor
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	// Page Factory
	
	@FindBy(xpath = "//input[@name=\"username\"]") // Xpath of the username using find by.
	public WebElement Username;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement Button;
	
	public void username(String Email) {
		
		Username.sendKeys(Email);
	}
	
    public void Pass(String Password1) {
		
    	Password.sendKeys(Password1);
	}
    
    public void Login() {
		
    	Button.click();
	}
    
    public void Goto() {
		
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	
	
	
	
}
