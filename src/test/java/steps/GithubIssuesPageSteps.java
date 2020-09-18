package steps;

import cross.automationLibrary.base.BaseSteps;
import io.cucumber.java.en.Then;
import pages.GithubIssuesPage;

public class GithubIssuesPageSteps extends BaseSteps {
    GithubIssuesPage githubIssuesPage;
    @Then("I verify the issues page")
    public void verifyIssuesPage() {
        githubIssuesPage.verifyIssuesPage();
    }
}
