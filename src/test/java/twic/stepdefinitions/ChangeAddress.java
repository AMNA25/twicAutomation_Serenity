package twic.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import tasks.Home;
import tasks.Settings;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChangeAddress {
    @Given("User is on profile page")
    public void user_is_on_profile_page() {
        theActorInTheSpotlight().wasAbleTo(Home.clickSettings());
        theActorInTheSpotlight().wasAbleTo(Settings.clickProfile());
    }

    @When("User fills address form with {word}, {word}, {word}, {word} and {word}")
    public void user_fills_address_form(DataTable dataTable) {
        List<Map<String, String>> address = dataTable.asMaps();
        theActorInTheSpotlight().attemptsTo(tasks.ChangeAddress.fillAddress(address.get(0)));
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }

    @Then("address should get updated")
    public void address_should_get_updated() {

    }

}
