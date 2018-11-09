package com.sophos.challenge.demoaut.questions;

import com.sophos.challenge.demoaut.user_interface.register.DemoautConfirmRegister;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ResultRegister implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return !Text.of(DemoautConfirmRegister.LABEL_CONFIRMATION).viewedBy(actor).asString().isEmpty() ? 
				Text.of(DemoautConfirmRegister.LABEL_CONFIRMATION).viewedBy(actor).asString() :
					null;
	}

	public static ResultRegister is() {
		return new ResultRegister();
	}
}
