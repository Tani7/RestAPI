package com.amdocs.RestAPI;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT,classes=RestApiApplication.class)

public class StepDef {
	
	String restApiurl; Double result,expected;
	
	@Given("Rest APi {string}")
	public void rest_APi(String URL) {
		restApiurl=URL;
	 	
	}

	@When("I invoke the given rest api")
	public void i_invoke_the_given_rest_api() {
	   RestTemplate restTemplate=new RestTemplate();
	   result=restTemplate.getForObject(restApiurl,Double.class);
	}

	@Then("the expected sum is {int}")
	public void the_expected_sum_is(Integer int1) {
		expected=(double)int1;
		assertEquals(expected,expected,0.01);
	}


}
