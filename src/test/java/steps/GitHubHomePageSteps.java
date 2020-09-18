package steps;

import cross.automationLibrary.base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.GithubHomePage;

public class GitHubHomePageSteps extends BaseSteps {
    GithubHomePage githubHomePage;
    @Then("I verify that I am logged in Github")
    public void verifyLoggedInGithub() {
        githubHomePage.verifyLoggedInGithub();
    }
    @And("I go to pull requests")
    public void goToPullRequests() {
        githubHomePage.goToPullRequests();
    }
    @And("I go to issues")
    public void goToIssues(){
        githubHomePage.goToIssues();
    }
    @And("I go to repositories")
    public void goToRepositories(){
        githubHomePage.goToRepositories();
    }
    @And("I go to organizations")
    public void goToOrganizations(){
        githubHomePage.goToOrganizations();
    }
}
