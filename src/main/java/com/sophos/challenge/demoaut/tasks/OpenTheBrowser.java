package com.sophos.challenge.demoaut.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.challenge.demoaut.util.exceptions.InitializationBrowserException;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task{
	
	private final static int NUMBER_ATTEMPS = 2;

	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		int attemp = 1;
		while (attemp++ <= NUMBER_ATTEMPS) {
			try {
				actor.attemptsTo(Open.browserOn(page));
			}catch (Exception e) {
				if(attemp == NUMBER_ATTEMPS)
					throw new InitializationBrowserException("Error a cargar la pagina", e);
				else
					continue;
			}
		}
	}

	public static OpenTheBrowser at(PageObject page) {
		return instrumented(OpenTheBrowser.class, page) ;
	}
}
