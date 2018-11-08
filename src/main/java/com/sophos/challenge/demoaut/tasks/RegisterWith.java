package com.sophos.challenge.demoaut.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import com.sophos.challenge.demoaut.models.User;
import com.sophos.challenge.demoaut.user_interface.DemoautRegisterPage;
import com.sophos.challenge.demoaut.util.exceptions.NoFoundElementException;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class RegisterWith implements Task{
	
	private User user;

	public RegisterWith(User user) {
		super();
		this.user = user;
	}

	@Override
	@Step("{0} register user with credencials")
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(Click.on(DemoautRegisterPage.REGISTER_BUTTON));
			actor.attemptsTo(Enter.theValue(user.getName()).into(DemoautRegisterPage.INPUT_NAME));
			actor.attemptsTo(Enter.theValue(user.getLastName()).into(DemoautRegisterPage.INPUT_LASTNAME));
			actor.attemptsTo(Enter.theValue(user.getPhone()).into(DemoautRegisterPage.INPUT_PHONE));
			actor.attemptsTo(Enter.theValue(user.getEmail()).into(DemoautRegisterPage.INPUT_EMAIL));
			actor.attemptsTo(Enter.theValue(user.getMailInformation().getAddress()).into(DemoautRegisterPage.INPUT_ADRRESS));
			actor.attemptsTo(Enter.theValue(user.getMailInformation().getCity()).into(DemoautRegisterPage.INPUT_CITY));
			actor.attemptsTo(Enter.theValue(user.getMailInformation().getProvince()).into(DemoautRegisterPage.INPUT_PROVINCE));
			actor.attemptsTo(Enter.theValue(user.getMailInformation().getPostalCode()).into(DemoautRegisterPage.INPUT_CODE_POSTAL));
			//actor.attemptsTo(Enter.theValue(user.getMailInformation().getCountry()).into(DemoautRegisterPage.CHOOSE_COUNTRY));
			actor.attemptsTo(Enter.theValue(user.getUserInformation().getUsername()).into(DemoautRegisterPage.INPUT_USERNAME));
			actor.attemptsTo(Enter.theValue(user.getUserInformation().getPassword()).into(DemoautRegisterPage.INPUT_PASSWORD));
			actor.attemptsTo(Enter.theValue(user.getUserInformation().getPassword()).into(DemoautRegisterPage.INPUT_CONFIRM_PASSWORD));
			//actor.attemptsTo(Click.on(DemoautRegisterPage.SUBMIT_BUTTON));
		}catch(Exception ex) {
			throw new NoFoundElementException("No existe o no encontro el elemento :"+ex.getMessage());
		}
	}

	public static RegisterWith theCredentialsOf(User user) {		
		return instrumented(RegisterWith.class, user);
	}	
}
