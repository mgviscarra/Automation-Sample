package steps;

import cross.automationLibrary.base.BaseSteps;
import io.cucumber.java.en.Then;
import pages.GithubOrganizationsPage;

public class GithubOrganizationsPageSteps extends BaseSteps {
    GithubOrganizationsPage githubOrganizationsPage;
    @Then("I verify the organizations page")
    public void verifyOrganizationsPage() throws InterruptedException {
        githubOrganizationsPage.verifyOrganizationsPage();
    }
}
