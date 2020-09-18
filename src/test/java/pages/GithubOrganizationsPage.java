package pages;

import com.codeborne.selenide.Condition;
import cross.automationLibrary.base.BasePage;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static cross.automationLibrary.configuration.Platform.Constants.WEB;

@Component
@Profile({WEB})
public class GithubOrganizationsPage extends BasePage<GithubOrganizationsPage> {
    public void verifyOrganizationsPage() throws InterruptedException {
        $("ORGANIZATIONS_LABEL").should(Condition.appear).isDisplayed();
    }
}
