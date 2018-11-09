package com.sophos.challenge.demoaut.tasks.reservation;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.challenge.demoaut.user_interface.reservation.DemoautChooseFlightPage;
import com.sophos.challenge.demoaut.util.exceptions.NoFoundElementException;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ChooseFlight implements Task{

	DemoautChooseFlightPage chooseFlightPage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(Click.on(chooseFlightPage.selectFlightDeparting()));
			actor.attemptsTo(Click.on(chooseFlightPage.selectFlightArriving()));
			actor.attemptsTo(Click.on(chooseFlightPage.continueReservation()));
		}catch (Exception ex) {
			throw new NoFoundElementException("No existe o no encontro el elemento :"+ex.getMessage());
		}
	}
	
	public static ChooseFlight amongSeveralOptions() {
		return instrumented(ChooseFlight.class);
	}

}
