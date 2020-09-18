package steps;

import cross.automationLibrary.base.BaseSteps;
import io.cucumber.java.en.Then;
import pages.GithubRepositoriesPage;

public class GithubRepositoriesPageSteps extends BaseSteps {
    GithubRepositoriesPage githubRepositoriesPage;
    @Then("I verify the repositories page")
    public void verifyPullRepositoriesPage() throws InterruptedException {
        githubRepositoriesPage.verifyRepositoriesPage();
    }
}
