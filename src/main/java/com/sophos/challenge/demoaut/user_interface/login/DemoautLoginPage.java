package com.sophos.challenge.demoaut.user_interface.login;

import net.serenitybdd.screenplay.targets.Target;

public class DemoautLoginPage {

	public static Target LOGIN_OUT_BUTTON =  Target.the("button of login-out")
          .locatedBy("//a[text()='SIGN-OFF']");
	
	public static Target INPUT_LOGIN_USERNAME =  Target.the("submit form of register")
			.locatedBy("//input[@name='userName']");

	public static Target INPUT_LOGIN_PASSWORD =  Target.the("submit form of register")
			.locatedBy("//input[@name='password' and @type='password']");
	
	public static Target LOGIN_IN_BUTTON =  Target.the("submit form of register")
		  .locatedBy("//input[@name='login' and @type='image']");
	
	public static Target IMAGE_RESULT_CONFIRMATION =  Target.the("submit form of register")
			  .locatedBy("//img[@src='/images/masts/mast_flightfinder.gif']");
	
}

