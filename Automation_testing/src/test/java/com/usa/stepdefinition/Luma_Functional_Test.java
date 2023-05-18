package com.usa.stepdefinition;

import org.testng.Assert;

import com.usa.basepage.SuperClass;
import com.usa.elementpage.PageFactoryElements;
import com.usa.genericfuntions.CommonMethods;
import com.usa.genericfuntions.WaitHelper;

import io.cucumber.java.en.*;

public class Luma_Functional_Test extends SuperClass {
	PageFactoryElements pf;
	
	@Given("user able to login the application")
	public void user_able_to_login_the_application() throws InterruptedException {
		//initialization();	 
	    pf = new PageFactoryElements();
	    log.info(">>>>>>User able to login the application<<<<<<<");
		pf.applicationLogin();
		CommonMethods.captureScreenshot(driver, "LoginPage");
		
	    
	}
	@When("user able to select Jackets from Men module")
	public void user_able_to_select_jackets_from_men_module() {
		log.info(">>>>>>User able to Select Men Module(<<<<<<<");
		WaitHelper.seleniumWait(pf.getSelectMenModule());
		CommonMethods.HoverOver(pf.getSelectMenModule());  
		
		log.info(">>>>>>User able to Select Tops From Men Module<<<<<<<");
		WaitHelper.seleniumWait(pf.getSelectTopsFromMenModule());
		CommonMethods.HoverOver(pf.getSelectTopsFromMenModule());
		
		log.info(">>>>>>User able to Select Jacket From Men Module<<<<<<");
		WaitHelper.seleniumWait(pf.getSelectJacketFromMenModule());
		CommonMethods.actionClick(pf.getSelectJacketFromMenModule());
	    
	}
	@When("user able to select a Jacket product's size, color, quantity")
	public void user_able_to_select_a_jacket_product_s_size_color_quantity() throws InterruptedException {
		log.info(">>>>>>User able to SelectJupiterAll_WeatherTrainer<<<<<<<");
		CommonMethods.actionClick(pf.getSelectJupiterAll_WeatherTrainer()); 
		
		log.info(">>>>>>User able to getSelectSize<<<<<<<");
		WaitHelper.seleniumWait(pf.getSelectSize());
		CommonMethods.actionClick(pf.getSelectSize());
		
		log.info(">>>>>>User able to getSelectColor<<<<<<<");
		WaitHelper.seleniumWait(pf.getSelectColor());
		CommonMethods.actionClick(pf.getSelectColor());
		
		
		log.info(">>>>>>User able to getSelectQuantity<<<<<<<");
		WaitHelper.seleniumWait(pf.getSelectQuantity());
		pf.getSelectQuantity().clear();
		pf.getSelectQuantity().sendKeys("1");	
		
	}
	
	@When("user able to click add to cart button")
	public void user_able_to_click_add_to_cart_button() {
		
		log.info(">>>>>>User able to Select Click On AddToCart<<<<<<<");	
	WaitHelper.seleniumWait(pf.getSelectClickOnAddToCart());
	CommonMethods.actionClick(pf.getSelectClickOnAddToCart());
	    
	}
	@When("user able to click on the shopping cart pop-up")
	public void user_able_to_click_on_the_shopping_cart_pop_up() {
		
		log.info(">>>>>>User able to ClickShoppingCart<<<<<<<");
		WaitHelper.seleniumWait(pf.getClickShoppingCart());
		CommonMethods.actionClick(pf.getClickShoppingCart()); 
	    
	}
	@When("user able to click on the proceed to checkout")
	public void user_able_to_click_on_the_proceed_to_checkout() {
		
		log.info(">>>>>>User able to Proceed_to_Checkout<<<<<<<");
		WaitHelper.seleniumWait(pf.getProceed_to_Checkout());
		CommonMethods.actionClick(pf.getProceed_to_Checkout());
	    
	}
	@When("user able to add shipping information")
	public void user_able_to_add_shipping_information() throws InterruptedException {
		
    log.info(">>>>>>User able to addNewShippingDetails<<<<<<<");
    CommonMethods.getPageRefresh();
    Thread.sleep(3000);
	pf.addNewShippingDetails();
	        
	    
	}
	@When("user able to select shipping method radial button and click on next button")
	public void user_able_to_select_shipping_method_radial_button_and_click_on_next_button() {
		
		log.info(">>>>>>User able to select shipping method radial button and click on next button<<<<<<<");
		CommonMethods.getPageRefresh(); 
		WaitHelper.seleniumWait(pf.getSelectShippingMethod()); 	
		CommonMethods.actionClick(pf.getSelectShippingMethod()); 	     	     	   
		WaitHelper.seleniumWait(pf.getClickNextBtn()); 	  
		CommonMethods.actionClick(pf.getClickNextBtn());				
	    
	}
	@When("user able to click on the place order button")
	public void user_able_to_click_on_the_place_order_button() {
		
		log.info(">>>>>>User able to click on PlaceOrder<<<<<<<");
		WaitHelper.seleniumWait(pf.getClickPlaceOrder());
	    CommonMethods.jsClick(pf.getClickPlaceOrder());
	        
	    
	}
	@Then("user able to verify the confirmation message {string}")
	public void user_able_to_verify_the_confirmation_message(String expectedResult) {
	    
		log.info(">>>>>>User able to varify the confirmation message<<<<<<<");
		Assert.assertEquals(expectedResult,pf.getVerifyTextMessage().getText());
		System.out.println("Order Confirmation:"+ pf.getVerifyTextMessage().getText());
	      
	}

}
