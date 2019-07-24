Feature: Calculator Application
	Scenario: Invoking addition
		Given Rest APi "http://localhost:9400/addition?firstOperand=10&seoncdOperand=10"
		When I invoke the given rest api
		Then the expected sum is 20

