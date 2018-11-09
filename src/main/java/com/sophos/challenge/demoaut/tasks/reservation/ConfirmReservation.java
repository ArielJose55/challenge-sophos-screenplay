package com.sophos.challenge.demoaut.tasks.reservation;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.challenge.demoaut.user_interface.reservation.ConfirmReservationPage;
import com.sophos.challenge.demoaut.util.exceptions.NoFoundElementException;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ConfirmReservation implements Task {

	private String name;
	private String lastName;

	public ConfirmReservation() {
		super();
		this.name = "Maria";
		this.lastName = "Cardona";
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			
			actor.attemptsTo(Enter.theValue(name).into(ConfirmReservationPage.INPUT_NAME));
			actor.attemptsTo(Enter.theValue(lastName).into(ConfirmReservationPage.INPUT_LASTNAME));
			actor.attemptsTo(Enter.theValue("30044556").into(ConfirmReservationPage.NUMBER_CART));
			actor.attemptsTo(Click.on(ConfirmReservationPage.PURCHASE));
		}catch (Exception ex) {
			throw new NoFoundElementException("No existe o no encontro el elemento :"+ex.getMessage());
		}
	}
	
	public static ConfirmReservation inApplication() {		
		return instrumented(ConfirmReservation.class);
	}

}
