package com.usa.elementpage;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.basepage.SuperClass;
import com.usa.genericfuntions.CommonMethods;
import com.usa.genericfuntions.WaitHelper;

public class PageFactoryElements extends SuperClass{
	
	public PageFactoryElements() {
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(linkText = "Sign In")
	@CacheLookup
	private WebElement signInBtn;
	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
	@FindBy(id = "email")
	@CacheLookup
	private WebElement EnterUserName;
	public WebElement getEnterUserName() {
		return EnterUserName;
	}
		
	@FindBy(id = "pass")
	@CacheLookup
	private WebElement EnterPassword;
	public WebElement getEnterPassword() {
		return EnterPassword;
	}	
	
	@FindBy(xpath="//button[@id='send2']")
	@CacheLookup
	private WebElement ClickOnSignBtn;
	public WebElement getClickOnSignBtn() {
		return ClickOnSignBtn;
	}	
	
	
	@FindBy(linkText="Men")
	@CacheLookup
	private WebElement SelectMenModule;
	public WebElement getSelectMenModule() {
		return SelectMenModule;
	}	
	
	
	@FindBy(linkText="Tops")
	@CacheLookup
	private WebElement SelectTopsFromMenModule;
	public WebElement getSelectTopsFromMenModule() {
		return SelectTopsFromMenModule;
	}		
	
	
	@FindBy(linkText="Jackets")
	@CacheLookup
	private WebElement SelectJacketFromMenModule;
	public WebElement getSelectJacketFromMenModule() {
		return SelectJacketFromMenModule;
	}	
	
	@FindBy(xpath="(//*[@class='product-item-link'])[3]")
	@CacheLookup
	private WebElement SelectJupiterAll_WeatherTrainer;
	public WebElement getSelectJupiterAll_WeatherTrainer() {
		return SelectJupiterAll_WeatherTrainer;
	}	
	
	
	@FindBy(xpath="(//div[@class='swatch-option text'])[1]")
	@CacheLookup
	private WebElement SelectSize;
	public WebElement getSelectSize() {
		return SelectSize;
	}	
	
	
	@FindBy(xpath="(//div[@class='swatch-option color'])[3]")
	@CacheLookup
	private WebElement SelectColor;
	public WebElement getSelectColor() {
		return SelectColor;
	}	
	
	
	@FindBy(xpath="//input[@name='qty']")
	@CacheLookup
	private WebElement SelectQuantity;
	public WebElement getSelectQuantity() {
		return SelectQuantity;
	}	
	
	
	@FindBy(xpath="//button[@class='action primary tocart']")
	@CacheLookup
	private WebElement ClickOnAddToCart;
	public WebElement getSelectClickOnAddToCart() {
		return ClickOnAddToCart;
		
	}	
	
	@FindBy(linkText="shopping cart")
	@CacheLookup
	private WebElement ClickShoppingCart;
	public WebElement getClickShoppingCart() {
		return ClickShoppingCart;
		
	}		
	
	@FindBy(xpath="(//*[contains(text(),'Proceed to Checkout')])[2]")
	@CacheLookup
	private WebElement Proceed_to_Checkout;
	public WebElement getProceed_to_Checkout() {
		return Proceed_to_Checkout;
		
	}		
	
	@FindBy(xpath="//*[text()='New Address']")
	@CacheLookup
	private WebElement AddNewAdress;
	public WebElement getAddNewAdress() {
		return AddNewAdress;
		
	}		
	
	//-------------------------------Add new shipping address

	
	@FindBy(xpath="//input[@name='firstname']")
	@CacheLookup
	private WebElement EnterFirstName;
	public WebElement getEnterFirstName() {
		return EnterFirstName;
	
	}
	
	@FindBy(xpath="//input[@name='lastname']")
	@CacheLookup
	private WebElement EnterLastName;
	public WebElement getEnterLastName() {
		return EnterLastName;
	
	}
		
	@FindBy(xpath="//input[@name='company']")
	@CacheLookup
	private WebElement EnterCompanyName;
	public WebElement getEnterCompanyName() {
		return EnterCompanyName;
	
	}		
	
	@FindBy(xpath="(//*[@class='input-text'])[9]")
	@CacheLookup
	private WebElement EnterCustomerAddress;
	public WebElement geteEnterCustomerAddress() {
		return EnterCustomerAddress;
	
	}
	
	
	@FindBy(xpath="(//*[@type = 'text'])[8]")
	@CacheLookup
	private WebElement EnterCity;
	public WebElement geteEnterCity() {
		return EnterCity;
	}
	
	
	@FindBy(xpath="(//*[@class='select'])[1]")
	@CacheLookup
	private WebElement SelectState;
	public WebElement getSelectState() {
		return SelectState;
	}
	
	
	@FindBy(xpath="(//*[@type='text'])[10]")
	@CacheLookup
	private WebElement EnterZipCode;
	public WebElement getEnterZipCode() {
		return EnterZipCode;
	}
	
	
	@FindBy(xpath="(//*[@class='select'])[2]")
	@CacheLookup
	private WebElement SelectCountry;
	public WebElement getSelectCountry() {
		return SelectCountry;
	}
	
	
	@FindBy(xpath="(//*[@type='text'])[11]")
	@CacheLookup
	private WebElement EnterPhoneNumber;
	public WebElement getEnterPhoneNumber() {
		return EnterPhoneNumber;
	}
	
	
	@FindBy(xpath="//*[text()='Ship here']")
	@CacheLookup
	private WebElement ClickOnShipHere;
	public WebElement getClickOnShipHere() {
		return ClickOnShipHere;
	}	
	
	@FindBy(xpath="(//*[@type='radio'])[1]")
	@CacheLookup
	private WebElement SelectShippingMethod;
	public WebElement getSelectShippingMethod() {
		return SelectShippingMethod;
	}	
	
	@FindBy(xpath="//*[text()='Next']")
	@CacheLookup
	private WebElement ClickNextBtn;
	public WebElement getClickNextBtn() {
		return ClickNextBtn;
	}		
	
	@FindBy(xpath="//*[text()='Place Order']")
	@CacheLookup
	private WebElement ClickPlaceOrder;
	public WebElement getClickPlaceOrder() {
		return ClickPlaceOrder;
	}		
	
	
	@FindBy(xpath="//*[text()='Thank you for your purchase!']")
	@CacheLookup
	private WebElement VerifyTextMessage;
	public WebElement getVerifyTextMessage() {
		return VerifyTextMessage;
	}		
	
	@FindBy (xpath="(//*[@class='select'])[1]/option") 	 
	@CacheLookup 	
	private List<WebElement> selectListOfState;  	
	public List<WebElement> getselectListOfState() { 	
		return selectListOfState; 		 	
       }
	
	@FindBy (xpath="(//*[@class='select'])[2]/option") 	 
	@CacheLookup 	
	private List<WebElement> selectListOfCountry;  	
	public List<WebElement> getselectListOfCountry() { 
		return selectListOfCountry; 			
	}
	
	
	
	
	public void addNewShippingDetails() {
		
		WaitHelper.seleniumWait(getAddNewAdress());
		CommonMethods.jsClick(getAddNewAdress());
		
		WaitHelper.seleniumWait(getEnterFirstName());
		getEnterFirstName().clear();
		getEnterFirstName().sendKeys("Pushpo");
		
		WaitHelper.seleniumWait(getEnterLastName());
		getEnterLastName().clear();
		getEnterLastName().sendKeys("Akter");
		
		WaitHelper.seleniumWait(getEnterCompanyName());
		getEnterCompanyName().clear();
		getEnterCompanyName().sendKeys("Walmart");
		
		WaitHelper.seleniumWait(geteEnterCustomerAddress());
		geteEnterCustomerAddress().clear();
		geteEnterCustomerAddress().sendKeys("12th rd");
		
		WaitHelper.seleniumWait(geteEnterCity());
		geteEnterCity().clear();
		geteEnterCity().sendKeys("New York");
		
		//select state	
		
		WaitHelper.seleniumWait(getSelectState()); 
		 CommonMethods.dropdown(getSelectState(), "New York"); 
		 //CommonMethods.handleDropdown(getselectListOfState(), "New York"); 
		
		
		WaitHelper.seleniumWait(getEnterZipCode());
		getEnterZipCode().clear();
		getEnterZipCode().sendKeys("11418");
		//select country
		
		WaitHelper.seleniumWait(getSelectCountry());   		
		CommonMethods.dropdown(getSelectCountry(),"United States");   		
		//CommonMethods.handleDropdown(getselectListOfCountry(), "United States"); 
		
		
		WaitHelper.seleniumWait(getEnterPhoneNumber());
		getEnterPhoneNumber().clear();
		getEnterPhoneNumber().sendKeys("3319007660");
		
		WaitHelper.seleniumWait(getClickOnShipHere());
		CommonMethods.actionClick(getClickOnShipHere());
		
		
	}
		
	
//--------------------------------------
	public void applicationLogin() {
		
		WaitHelper.seleniumWait(getSignInBtn());
    	CommonMethods.actionClick(getSignInBtn());
    	
    	WaitHelper.seleniumWait(getEnterUserName());
    	getEnterUserName().sendKeys(prop.getProperty("userName"));
		
    	WaitHelper.seleniumWait(getEnterPassword());
    	getEnterPassword().sendKeys(prop.getProperty("password"));
		
    	WaitHelper.seleniumWait(getClickOnSignBtn());
    	CommonMethods.actionClick(getClickOnSignBtn());
    	
		
		
		
		
	}
	
	
}
