package hellocucumber;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private Order order;
    private String ticket;

    @Given("{string} who wants to buy a drink")
    public void romeo_who_wants_to_buy_drinks(String from) {
        order = new Order();
        order.declareOwner(from);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_juliette(String person) {
        order.declareTarget(person);
    }

    @Then("there is {int} cocktails in the order")
    public void thereIsNbCocktailsCocktailsInTheOrder(int nbCocktails) {
        assertEquals(nbCocktails, order.getCocktails().size());

    }

    @And("a message saying {string} is added")
    public void a_message_saying_is_added(String message) {
        ticket = order.addMessage(message);
    }

    @Then("the ticket must say {string}")
    public void the_ticket_must_say(String expected) {
        assertEquals(expected, ticket);
    }
}
