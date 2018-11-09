package com.sophos.challenge.demoaut.user_interface.reservation;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmReservationPage {

	public static Target INPUT_NAME = Target.the("Input text field for the name")
            .locatedBy("//input[@name='passFirst0']");
	
	public static Target INPUT_LASTNAME    =  Target.the("Input text field for the lastname")
            .locatedBy("//input[@name='passLast0']");
	
	
	public static Target NUMBER_CART =  Target.the("Input text field for the email")
            .locatedBy("//input[@name='creditnumber']");
	
	public static Target PURCHASE =  Target.the("Input text field for the email")
            .locatedBy("//input[@name='buyFlights' and @type='image']");
}
