package com.sophos.challenge.demoaut.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import com.sophos.challenge.demoaut.tasks.OpenTheBrowser;
import com.sophos.challenge.demoaut.user_interface.DemoautHomePage;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ChallengeDemoautStepDefinition {
	
	@Managed(driver = "chrome")
	private WebDriver browser;
	
	private Actor valentino = Actor.named("valentino");
	
	private DemoautHomePage homePageDemoaut; 
	
	@Before
	public void setup() {
		valentino.can(BrowseTheWeb.with(browser));
	}
	
	@Given("^that I opened  browser at Demoout home page$")
	public void that_i_opened_browser_at_linio_home_page() throws Exception {
		valentino.wasAbleTo(OpenTheBrowser.at(homePageDemoaut));
	}
	
}
