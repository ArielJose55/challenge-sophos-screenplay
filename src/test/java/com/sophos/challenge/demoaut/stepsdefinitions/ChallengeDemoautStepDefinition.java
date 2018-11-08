package com.sophos.challenge.demoaut.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import com.sophos.challenge.demoaut.models.User;
import com.sophos.challenge.demoaut.models.repositories.UserRespository;
import com.sophos.challenge.demoaut.tasks.Login;
import com.sophos.challenge.demoaut.tasks.OpenTheBrowser;
import com.sophos.challenge.demoaut.tasks.RegisterWith;
import com.sophos.challenge.demoaut.user_interface.DemoautHomePage;
import com.sophos.challenge.demoaut.util.exceptions.ReaderPropertiesFailException;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ChallengeDemoautStepDefinition {
	
	@Managed(driver = "chrome")
	private WebDriver browser;
	
	private Actor valentino = Actor.named("valentino");
	
	private DemoautHomePage homePageDemoaut;
	
	private User userValetino;
	
	@Before(order = 1)
	public void setupData() {
		try {
			this.userValetino = UserRespository.createUser();
		} catch (ReaderPropertiesFailException e) {
			e.printStackTrace();
		}
	}
	
	@Before(order = 2)
	public void setupEnviroment() {
		valentino.can(BrowseTheWeb.with(browser));
	}
	
	@Given("^that I opened  browser at Demoaut home page$")
	public void that_i_opened_browser_at_demoaut_home_page() throws Exception {
		valentino.wasAbleTo(OpenTheBrowser.at(homePageDemoaut));
	}
	
	@And("^I register in the application$")
	public void i_register_in_the_application() throws Exception {
		valentino.wasAbleTo(RegisterWith.theCredentialsOf(userValetino));
	}
	
	@And("^I input to the application$")
	public void i_input_to_the_application() throws Exception {
		valentino.wasAbleTo(Login.withCredencialOfUser(userValetino));
	}
	
	
}
