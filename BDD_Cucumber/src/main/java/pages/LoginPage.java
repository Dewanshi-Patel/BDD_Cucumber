package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element list
	@FindBy(how = How.XPATH, using ="//input[@id='username']")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using ="//input[@type='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using ="//button[@class='btn btn-success block full-width']")
	WebElement SIGNIN_ELEMENT;
	
	public void insertUserName(String userName){
		USER_NAME_ELEMENT.sendKeys(userName);
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		
	
	public void insertPassword(String password){
		PASSWORD_ELEMENT.sendKeys(password);
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		}
		
	
	public void clickSigninButton() {
		SIGNIN_ELEMENT.click();
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		}
		
	public String getPageTitle() {
		return driver.getTitle();
	}
	
}
