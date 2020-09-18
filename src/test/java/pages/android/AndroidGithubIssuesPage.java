package pages.android;

import com.codeborne.selenide.Condition;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pages.GithubIssuesPage;

import static cross.automationLibrary.configuration.Platform.Constants.ANDROID;

@Component
@Profile({ANDROID})
public class AndroidGithubIssuesPage extends GithubIssuesPage {

    @Override
    public void verifyIssuesPage(){
        $("CREATED_TAB").should(Condition.appear).isDisplayed();
        $("ASSIGNED_TAB").should(Condition.appear).isDisplayed();
        $("MENTIONED_TAB").should(Condition.appear).isDisplayed();
        $("BACK_BUTTON").click();
    }
}
