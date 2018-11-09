package com.sophos.challenge.demoaut.user_interface.reservation;

import java.util.HashMap;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DemoautReservationPage  extends PageObject{
	
	private HashMap <Integer, WebElementFacade> webElements;
	
	@FindBy(xpath="//select[@name='passCount']")
	WebElementFacade passenger;
	
	@FindBy(xpath="//select[@name='fromPort']")
	WebElementFacade departingFrom;
	
	@FindBy(xpath="//select[@name='fromMonth']")
	WebElementFacade dateOn;
	
	@FindBy(xpath="//select[@name='fromDay']")
	WebElementFacade dayOn;
	
	@FindBy(xpath="//select[@name='toPort']")
	WebElementFacade arrivingIn;

	@FindBy(xpath="//select[@name='toMonth']")
	WebElementFacade dateOut;
	
	@FindBy(xpath="//select[@name='toDay']")
	WebElementFacade dayOut;
	
	@FindBy(xpath="//select[@name='airline']")
	WebElementFacade airline;
	
	@FindBy(xpath="//input[@type='radio' and @name='tripType' and @value='oneway']")
	WebElementFacade oneway;
	
	@FindBy(xpath="//input[@type='radio' and @name='servClass' and @value='Coach']")
	WebElementFacade economic;
	
	@FindBy(xpath="//input[@type='image' and @name='findFlights']")
	WebElementFacade submit;
	
	
	
	public void fillWebElements(){
		webElements = new HashMap<>();
		webElements.put(1,passenger);
		webElements.put(2,departingFrom);
		webElements.put(3,dateOn);
		webElements.put(4,dayOn);
		webElements.put(5,arrivingIn);
		webElements.put(6,dateOut);
		webElements.put(7,dayOut);
		webElements.put(8,airline);
	}
	
	
	
	public WebElementFacade selectDropdownValues(int element) {
		if(element == 1)
			return webElements.get(element).selectByIndex(0);
		return webElements.get(element).selectByIndex(2);
	}
	
	public WebElementFacade selectOpcionOneWay() {
		return oneway;
	}
	
	public WebElementFacade selectOpcionEconomicClass() {
		return economic;
	}
	
	public WebElementFacade submitReservation() {
		return submit;
	}
}
