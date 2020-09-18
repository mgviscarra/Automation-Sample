package pages;

import com.codeborne.selenide.Condition;
import cross.automationLibrary.base.BasePage;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static cross.automationLibrary.configuration.Platform.Constants.WEB;

@Component
@Profile({WEB})
public class GithubPullRequestsPage extends BasePage<GithubPullRequestsPage> {
    public void verifyPullRequestsPage(){
        $("CREATED_TAB").should(Condition.appear).isDisplayed();
        $("ASSIGNED_TAB").should(Condition.appear).isDisplayed();
        $("MENTIONED_TAB").should(Condition.appear).isDisplayed();
    }
}
