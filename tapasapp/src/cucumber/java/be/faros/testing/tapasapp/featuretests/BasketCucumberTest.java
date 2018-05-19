package be.faros.testing.tapasapp.featuretests;

import static org.assertj.core.api.Assertions.assertThat;

import be.faros.testing.tapasapp.BaseCucumberTest;
import be.faros.testing.tapasapp.store.domain.usecases.dto.TapasOrder;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.math.BigDecimal;

/**
 * TODO 03 (Let's read: Our Steps Definitions File)
 * A steps definition file is used to give a technical implementation to the steps that Cucumber will be doing during our tests.
 * Methods will be added here so when using the correct annotations, we can bind them to Cucumber steps.
 */
public class BasketCucumberTest extends BaseCucumberTest {

  /**
   * TODO 06 Uncomment the following methods, so they can be used as Step Definitions. Try running your test again after.
   */
/*
  @When("^the user creates a new Basket$")
  public void theUserCreatesANewBasket() {
    userBasketManagement.createNewBasket();
  }

  @Then("^the total number of items in the Basket with id (\\d+) equals (\\d+)$")
  public void theTotalNumberOfItemsInTheBasketWithIdEquals(int basketId, int totalNumber) {
    assertThat(userBasketManagement.retrieveListOfAllTapasOrdersInBasket(basketId).stream().map(to -> to.getAmount()).reduce(0L, Long::sum))
        .isEqualTo(totalNumber);
  }
*/

  @After
  public void clear() {
    super.clearDatabase();
  }
}
