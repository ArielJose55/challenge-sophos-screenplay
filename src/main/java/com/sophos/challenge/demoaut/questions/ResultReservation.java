package com.sophos.challenge.demoaut.questions;


import com.sophos.challenge.demoaut.user_interface.reservation.ConfirmReservationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ResultReservation implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return Visibility.of(ConfirmReservationPage.LABEL_CONFIRMATION).viewedBy(actor).asBoolean();
	}
	
	public static ResultReservation isElementoDispleyed() {
        return new ResultReservation();
    }
	
	
}
