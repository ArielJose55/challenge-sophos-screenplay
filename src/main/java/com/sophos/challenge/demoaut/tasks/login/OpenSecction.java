package com.sophos.challenge.demoaut.tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.challenge.demoaut.models.User;
import com.sophos.challenge.demoaut.tasks.register.RegisterWith;
import com.sophos.challenge.demoaut.user_interface.login.DemoautLoginPage;
import com.sophos.challenge.demoaut.util.exceptions.NoFoundElementException;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenSecction implements Task{


	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(Click.on(DemoautLoginPage.LOGIN_OUT_BUTTON));
		} catch (Exception ex) {
			throw new NoFoundElementException("No existe o no encontro el elemento :"+ex.getMessage());
		}
	}
	
	public static OpenSecction theLogin() {		
		return instrumented(OpenSecction.class);
	}

}
