package com.sophos.challenge.demoaut.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class DemoautRegisterPage {
	
	public static Target REGISTER_BUTTON = Target.the("Register button")
            .locatedBy("//a[text()='REGISTER']");
	
	public static Target INPUT_NAME = Target.the("Input text field for the name")
            .locatedBy("//input[@name='firstName']");
	
	public static Target INPUT_LASTNAME    =  Target.the("Input text field for the lastname")
            .locatedBy("//input[@name='lastName']");
	
	public static Target INPUT_PHONE = Target.the("Input text field for the number phone")
            .locatedBy("//input[@name='phone']");
	
	public static Target INPUT_EMAIL =  Target.the("Input text field for the email")
            .locatedBy("//input[@name='userName']");
	
	public static Target INPUT_ADRRESS = Target.the("Input text field for address")
            .locatedBy("//input[@name='address1']");
	
	public static Target INPUT_CITY =  Target.the("Input text field for city")
            .locatedBy("//input[@name='city']");
	
	public static Target INPUT_PROVINCE =  Target.the("Input text field for the province")
            .locatedBy("//input[@name='state']");
	
	public static Target INPUT_CODE_POSTAL =  Target.the("Input text field for the code postal")
            .locatedBy("//input[@name='postalCode']");
	
	public static Target CHOOSE_COUNTRY = Target.the("Input text field for country")
            .locatedBy("//select[@name='country']");
	
	public static Target INPUT_USERNAME =  Target.the("Input text field for the username")
            .locatedBy("//input[@name='email']");
	
	public static Target INPUT_PASSWORD =  Target.the("Input text field for the password")
            .locatedBy("//input[@name='password']");
	
	public static Target INPUT_CONFIRM_PASSWORD =  Target.the("input text field for to confirm password")
            .locatedBy("//input[@name='confirmPassword']");
	
	public static Target SUBMIT_BUTTON =  Target.the("submit form of register")
            .locatedBy("//input[@name='register']");
}
