package steps;

import cross.automationLibrary.base.BaseSteps;
import io.cucumber.java.en.Then;
import pages.GithubPullRequestsPage;

public class GithubPullRequestsPageSteps extends BaseSteps {
    GithubPullRequestsPage githubPullRequestsPage;
    @Then("I verify the pull request page")
    public void verifyPullRequestsPage() {
        githubPullRequestsPage.verifyPullRequestsPage();
    }
}
