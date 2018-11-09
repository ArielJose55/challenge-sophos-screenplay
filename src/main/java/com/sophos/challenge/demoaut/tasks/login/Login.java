package com.sophos.challenge.demoaut.tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import com.sophos.challenge.demoaut.models.User;
import com.sophos.challenge.demoaut.user_interface.login.DemoautLoginPage;
import com.sophos.challenge.demoaut.user_interface.register.DemoautRegisterPage;
import com.sophos.challenge.demoaut.util.exceptions.NoFoundElementException;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{

	private User user;

	public Login(User user) {
		super();
		this.user = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(Enter.theValue(user.getUserInformation().getUsername()).into(DemoautLoginPage.INPUT_LOGIN_USERNAME));
			actor.attemptsTo(Enter.theValue(user.getUserInformation().getPassword()).into(DemoautLoginPage.INPUT_LOGIN_PASSWORD));
			actor.attemptsTo(Click.on(DemoautLoginPage.LOGIN_IN_BUTTON));
		}catch (Exception ex) {
			throw new NoFoundElementException("No existe o no encontro el elemento :"+ex.getMessage());
		}		
	}

	public static Login withCredencialOfUser(User user) {
		return instrumented(Login.class, user);
	}
}
