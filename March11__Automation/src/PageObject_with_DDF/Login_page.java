package PageObject_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver driver;
	
	public Login_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement User_name;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement Pass;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement Button;
	
	public void User_N(String US1) {
		
		User_name.sendKeys(US1);
	}

    public void Pass_1(String Pass_1) {
		
    	Pass.sendKeys(Pass_1);
	}
    
    public void Login_button() {
		
    	Button.click();
	}
    
    public void Goto1() {
    	
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    
    
    
    
}
