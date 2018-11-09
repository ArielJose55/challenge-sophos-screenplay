package com.sophos.challenge.demoaut.tasks.reservation;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import com.sophos.challenge.demoaut.user_interface.reservation.DemoautReservationPage;
import com.sophos.challenge.demoaut.util.exceptions.NoFoundElementException;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class RegisterReservation implements Task{
	
	DemoautReservationPage reservationPage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			reservationPage.fillWebElements();
			actor.attemptsTo(Click.on(reservationPage.selectDropdownValues(1)));
			actor.attemptsTo(Click.on(reservationPage.selectDropdownValues(2)));
			actor.attemptsTo(Click.on(reservationPage.selectDropdownValues(3)));
			actor.attemptsTo(Click.on(reservationPage.selectDropdownValues(4)));
			actor.attemptsTo(Click.on(reservationPage.selectDropdownValues(5)));
			actor.attemptsTo(Click.on(reservationPage.selectDropdownValues(6)));
			actor.attemptsTo(Click.on(reservationPage.selectDropdownValues(7)));
			actor.attemptsTo(Click.on(reservationPage.selectDropdownValues(8)));
			actor.attemptsTo(Click.on(reservationPage.selectOpcionOneWay()));
			actor.attemptsTo(Click.on(reservationPage.selectOpcionEconomicClass()));
			actor.attemptsTo(Click.on(reservationPage.submitReservation()));
		}catch (Exception ex) {
			throw new NoFoundElementException("No existe o no encontro el elemento :"+ex.getMessage());
		}
		
	}
	
	public static RegisterReservation inApplication() {		
		return instrumented(RegisterReservation.class);
	}

}
