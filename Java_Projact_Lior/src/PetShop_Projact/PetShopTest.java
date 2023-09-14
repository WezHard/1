package PetShop_Projact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SetUp WebDriver:
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Projact Lior Blatt\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Opening the browser:
		PetShopPage PetShopPage = new PetShopPage(driver);
		//Navigation to the tested site:
		driver.get("file:///C:/Users/USER/Desktop/Projact%20Lior%20Blatt/HTML%20Projact%20Lior%20Blatt/Pages/SignUp/SignUp.html");
		//Maximize the page:
		driver.manage().window().maximize();

		// Find the elements from PetShopPage class:
		WebElement firstNameInput = PetShopPage.FirstName(); {
			WebElement lastNameInput = PetShopPage.LastName();
			WebElement emailInput = PetShopPage.Email();
			WebElement passwordInput = PetShopPage.Password();
			WebElement confirmpasswordInput = PetShopPage.ConfirmPassword();
			WebElement maleRadioButton = PetShopPage.genderMaleInput();
			WebElement genderFemaleButton = PetShopPage.genderFemaleInput();
			WebElement CheckBoxInput = PetShopPage.CheckBoxInput(); 

			//Check if the inputs is empty:
			System.out.println("Test 1, Check if the input field is empty:\n");
			if (firstNameInput.getAttribute("value").isEmpty()) System.out.println("First Name input field is empty."); 
			else System.out.println("First Name input field is Not empty!."); 
			
			if (lastNameInput.getAttribute("value").isEmpty()) 
				System.out.println("Last Name input field is empty.");
			else 
				System.out.println("Last Name input field is Not empty!.");
			
			if (emailInput.getAttribute("value").isEmpty()) 
				System.out.println("Email input field is empty.");
			else System.out.println("Email input field is Not empty!.");
			if (passwordInput.getAttribute("value").isEmpty()) 
				System.out.println("Password input field is empty.");
			else System.out.println("Password input field is Not empty!.");
			if (confirmpasswordInput.getAttribute("value").isEmpty()) 
				System.out.println("Confirm Password input field is empty.");
			else System.out.println("Confirm Password input field is Not empty!.");
			if (maleRadioButton.isSelected()) System.out.println("Male radio button is selected.");
			else System.out.println("Male radio button is not selected.");
			if (genderFemaleButton.isSelected())System.out.println("Female radio button is selected.");
			else System.out.println("Female radio button is not selected.");
			if (CheckBoxInput.isSelected())System.out.println("Check Box is selected.");
			else System.out.println("Check Box is not selected."); 
			}

		//Entering values for all input fields on the page:
		PetShopPage.FirstName().sendKeys("Lior"); {
			PetShopPage.LastName().sendKeys("ifrah");
			PetShopPage.Email().sendKeys("liorxxr321@gmail.com");
			PetShopPage.Password().sendKeys("Lior123");
			PetShopPage.ConfirmPassword().sendKeys("Lior123");
			//Select Radio Button:
			PetShopPage.genderMaleInput().click();
			//Select Check Box Button:
			PetShopPage.CheckBoxInput().click(); 
			System.out.println("PASS: all input fields on the page is filled up");
			}

		//Check that the number of Radio Buttons matches the expected amount:
		java.util.List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='gender']")); {
			int expectedRadioButtons = 2;
			int radioButtonCount = radioButtons.size();
			if (radioButtonCount == expectedRadioButtons) System.out.println("PASS: The number of radio buttons matches the expected amount.");
			else System.out.println("FAILL:  The number of radio buttons not matches the expected amount.");
		}

		//Check that the number of Checkboxes matches the expected amount:
		java.util.List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']")); {
			int expectedCheckBox = 1;
			int CheckBoxsCount = checkboxes.size();
			if (CheckBoxsCount == expectedCheckBox) System.out.println("PASS: The number of Check Boxs matches the expected amount.");
			else System.out.println("FAILL:  The number of Check Boxs not matches the expected amount.");
		}
		// Navigation to another site:
		//driver.get("file:///C:/Users/USER/Desktop/Projact%20Lior%20Blatt/HTML%20Projact%20Lior%20Blatt/PetTime.html");
		
	}
}