package com.sophos.challenge.demoaut.user_interface.reservation;

import java.util.List;

import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DemoautChooseFlightPage extends PageObject{
	
	@FindBy(xpath="//input[@type='radio' and @name='outFlight']")
	List<WebElementFacade> departingFlight;
	
	@FindBy(xpath="//input[@type='radio' and @name='inFlight']")
	List<WebElementFacade> arrivingFlight;
	
	@FindBy(xpath="//input[@type='image' and @name='reserveFlights']")
	WebElementFacade continueReservation;
	
	public WebElementFacade selectFlightDeparting() {
		return departingFlight.get(2);
	}
	
	public WebElementFacade selectFlightArriving() {
		return departingFlight.get(3);
	}
	
	public WebElementFacade continueReservation() {
		return continueReservation;
	}
}
