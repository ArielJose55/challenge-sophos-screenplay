package com.sophos.challenge.demoaut.questions;

import com.sophos.challenge.demoaut.user_interface.login.DemoautLoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ResultLogin implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return Visibility.of(DemoautLoginPage.IMAGE_RESULT_CONFIRMATION).viewedBy(actor).asBoolean();
	}
	
	public static ResultLogin isElementoDispleyed() {
        return new ResultLogin();
    }
}
