package pages.android;

import com.codeborne.selenide.Condition;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pages.GithubOrganizationsPage;

import static cross.automationLibrary.configuration.Platform.Constants.ANDROID;

@Component
@Profile({ANDROID})
public class AndroidGithubOrganizationsPage extends GithubOrganizationsPage {

    @Override
    public void verifyOrganizationsPage() throws InterruptedException {
        $("ORGANIZATIONS_LABEL").should(Condition.appear).isDisplayed();
        $("BACK_BUTTON").click();
    }
}
