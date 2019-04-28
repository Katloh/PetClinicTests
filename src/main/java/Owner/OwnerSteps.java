package Owner;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class OwnerSteps {

    private Owner owner;

    @Given("a customer with an age of 17")
    public void aCustomerWithAnAgeOf17(){
        owner = new Owner(17);
    }

    @When("customer celebrates birthday")
    public void customerCelebratesBirthday(){
        owner.celebrateBirthday();
    }

    @Then("the customers age is 18")
    public void theCustomersAgeIs18(){
        Assert.assertEquals(owner.getAge(), 18);
    }
}
