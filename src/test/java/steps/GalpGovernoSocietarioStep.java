package steps;

import POs.GalpGovernoSocietarioPO;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GalpGovernoSocietarioStep {

    GalpGovernoSocietarioPO galpGovernoSocietarioPO = new GalpGovernoSocietarioPO();

    @Then("I validate the screen galp Governo societario")
    public void validateLogo () {
        galpGovernoSocietarioPO.validateLogoAmazonMusic();;
    }

    @When("I accept the cookies")
    public void acceptCookies() {
        galpGovernoSocietarioPO.aceitarCookies();
    }
}
