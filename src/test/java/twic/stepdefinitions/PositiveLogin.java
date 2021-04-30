package twic.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PositiveLogin {


    @Given("User is on Login page")
    public void user_is_on_i_ll_sign_in_manually_page() {


    }

    @When("User enters {word} in email field")
    public void user_enters_email_in_email_field(String email) {

    }

    @When("User enters {word} in password field")
    public void user_enters_password_in_password_field(String password) {

    }

    @Then("User should be able to login")
    public void user_should_be_able_to_login(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }
}
