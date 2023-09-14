package PetShop_Projact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetShopPage {

	WebDriver driver;
	// Create UI elements:
	public PetShopPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement FirstName() {
		return driver.findElement(By.cssSelector("[type='firstname']"));
	}
	
	public WebElement LastName() {
		return driver.findElement(By.cssSelector("[type='lastname']"));
	}

	public WebElement Email() {
		return driver.findElement(By.cssSelector("[type='email']"));
	}	

	public WebElement Password() {
		return driver.findElement(By.cssSelector("[type='password']"));
	}	

	public WebElement ConfirmPassword() {
		return driver.findElement(By.cssSelector("[type='Confirmpassword']"));
	}
	
	public WebElement firstNameInput() {
		return driver.findElement(By.cssSelector("[type='firstname']"));
	}

	public WebElement genderMaleInput() {
		return driver.findElement(By.cssSelector("[name=\"gender\"][value=\"Male\"]"));
	}
	
	public WebElement genderFemaleInput() {
		return driver.findElement(By.cssSelector("[name=\"gender\"][value=\"Female\"]"));
	}

	public WebElement CheckBoxInput() {
		return driver.findElement(By.cssSelector("[type='checkbox'][value='n']"));
	}
	

}


