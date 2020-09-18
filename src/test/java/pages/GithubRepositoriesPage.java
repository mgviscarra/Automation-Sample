package pages;

import com.codeborne.selenide.Condition;
import cross.automationLibrary.base.BasePage;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static cross.automationLibrary.configuration.Platform.Constants.WEB;

@Component
@Profile({WEB})
public class GithubRepositoriesPage extends BasePage<GithubRepositoriesPage> {
    public void verifyRepositoriesPage() throws InterruptedException {
        $("REPOSITORIES_LABEL").should(Condition.appear).isDisplayed();
    }
}
