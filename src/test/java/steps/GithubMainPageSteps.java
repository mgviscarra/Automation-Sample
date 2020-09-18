package steps;

import cross.automationLibrary.base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GithubMainPage;
import model.User;


public class GithubMainPageSteps extends BaseSteps {
    GithubMainPage githubMainPage;
    @Given("'Github' page is loaded")
    public void goToGithubMainPage() {
        githubMainPage.goToGithubMainPage();
    }
    @And("I try to log on Github with invalid credentials")
    public void logWithInvalidCredentials() throws InterruptedException {
        githubMainPage.loginIntoGithub(testdata(User.class, "invalidUser").getUsername(), testdata(User.class, "invalidUser").getPassword());
    }
    @And("I log on Github with valid credentials")
    public void logWithValidCredentials() throws InterruptedException {
        githubMainPage.loginIntoGithub(testdata(User.class, "validUser").getUsername(), testdata(User.class, "validUser").getPassword());
    }
    @Then("I verify that credentials error message is displayed")
    public void verifyCredentialsErrorMessage() {
        githubMainPage.verifyCredentialsErrorMessage();
    }
}
