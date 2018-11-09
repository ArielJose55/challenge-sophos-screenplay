package com.sophos.challenge.demoaut.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.WebDriver;

import com.sophos.challenge.demoaut.models.User;
import com.sophos.challenge.demoaut.models.repositories.UserRespository;
import com.sophos.challenge.demoaut.questions.ResultLogin;
import com.sophos.challenge.demoaut.questions.ResultRegister;
import com.sophos.challenge.demoaut.tasks.register.ConfirmRegister;
import com.sophos.challenge.demoaut.tasks.login.Login;
import com.sophos.challenge.demoaut.tasks.login.OpenSecction;
import com.sophos.challenge.demoaut.tasks.OpenTheBrowser;
import com.sophos.challenge.demoaut.tasks.register.RegisterWith;
import com.sophos.challenge.demoaut.tasks.reservation.ChooseFlight;
import com.sophos.challenge.demoaut.tasks.reservation.ConfirmReservation;
import com.sophos.challenge.demoaut.tasks.reservation.RegisterReservation;
import com.sophos.challenge.demoaut.user_interface.register.DemoautHomePage;
import com.sophos.challenge.demoaut.util.exceptions.ReaderPropertiesFailException;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
	
	@Given("that I opened  browser at Demoaut home page")
	public void that_i_opened_browser_at_demoaut_home_page() throws Exception {
		valentino.wasAbleTo(OpenTheBrowser.at(homePageDemoaut));
	}
	
	@And("I entered the registration section and entered my credentials")
	public void i_register_in_the_application() throws Exception {
		valentino.wasAbleTo(RegisterWith.theCredentialsOf(userValetino));
	}
	
	@When("I confirm register of the application")
	public void i_confirm_register_to_the_application() throws Exception {
		valentino.wasAbleTo(ConfirmRegister.ofMyUser());
	}
	
	@Then("I verify if I'm truly registered")
	public void i_verify_register() throws Exception {
		String expected = "Note: Your user name is ".concat(userValetino.getUserInformation().getUsername()).concat(".");
		valentino.should(seeThat(ResultRegister.is(), equalTo(expected)));
	}
	
	@Given("I went to the page section login")
	public void i_went_to_the_page_login() {
		valentino.wasAbleTo(OpenSecction.theLogin());
	}
	
	@When("I input my credentials")
	public void i_input_my_credentials() {
		valentino.wasAbleTo(Login.withCredencialOfUser(userValetino));
	}
	
	@Then("the reserve flight section appeared")
	public void the_reserve_flight_section_appeared() {
		valentino.should(seeThat(ResultLogin.isElementoDispleyed(), equalTo(Boolean.TRUE)));
	}
	
	@Given("I had the flight data to reserve")
	public void i_had_the_flight_data_to_reserve() {
		valentino.wasAbleTo(RegisterReservation.inApplication());
	}
	
	@And("I select a flight")
	public void i_select_a_flight() {
		valentino.wasAbleTo(ChooseFlight.amongSeveralOptions());
	}
	
	@When("I make the flight reservation")
	public void i_make_the_flight_reservation() {
		valentino.wasAbleTo(ConfirmReservation.inApplication());
	}
	@Then("I verify the reservation")
	public void i_verify_the_reservation() {
		
	}
	
}
