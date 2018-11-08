package com.sophos.challenge.demoaut.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.challenge.demoaut.models.User;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Login implements Task{

	public Login() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
	}

	public static Login withCredencialOfUser(User user) {
		return instrumented(Login.class, user);
	}
}
