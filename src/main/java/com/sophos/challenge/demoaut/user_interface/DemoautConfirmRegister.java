package com.sophos.challenge.demoaut.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class DemoautConfirmRegister {
	
	public static Target SUBMIT_BUTTON =  Target.the("submit form of register")
            .locatedBy("//input[@name='register']");
	
	public static Target LABEL_CONFIRMATION =  Target.the("submit form of register")
            .locatedBy("//font[@size='2']//b[contains(text(),'Note')]");

}
