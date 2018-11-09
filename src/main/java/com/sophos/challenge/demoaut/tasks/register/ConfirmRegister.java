package com.sophos.challenge.demoaut.tasks.register;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.challenge.demoaut.user_interface.register.DemoautConfirmRegister;
import com.sophos.challenge.demoaut.util.exceptions.NoFoundElementException;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;


public class ConfirmRegister implements Task{

	@Override
	@Step("{0} confirm register in the application")
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(Click.on(DemoautConfirmRegister.SUBMIT_BUTTON));
		}catch(Exception ex) {
			throw new NoFoundElementException("No existe o no encontro el elemento :"+ex.getMessage());
		}		
	}

	public static ConfirmRegister ofMyUser() {
		return instrumented(ConfirmRegister.class);
	}
}
