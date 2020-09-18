package pages;

import com.codeborne.selenide.Condition;
import cross.automationLibrary.base.BasePage;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static cross.automationLibrary.configuration.Platform.Constants.WEB;

@Component
@Profile({WEB})
public class GithubHomePage extends BasePage<GithubHomePage> {
    public void verifyLoggedInGithub(){
        $("USER_ICON").should(Condition.appear).isDisplayed();
    }

    public void goToPullRequests(){
        $("PULL_REQUESTS_BUTTON").click();
    }

    public void goToIssues(){
        $("ISSUES_BUTTON").click();
    }

    public void goToRepositories(){
        $("MENU_DROPDOWN").click();
        $("REPOSITORIES_BUTTON").click();
    }

    public void goToOrganizations(){
        $("MENU_DROPDOWN").click();
        $("ORGANIZATIONS_BUTTON").click();
    }
}
