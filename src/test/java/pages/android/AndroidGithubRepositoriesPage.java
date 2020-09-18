package pages.android;

import com.codeborne.selenide.Condition;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pages.GithubRepositoriesPage;

import static cross.automationLibrary.configuration.Platform.Constants.ANDROID;

@Component
@Profile({ANDROID})
public class AndroidGithubRepositoriesPage extends GithubRepositoriesPage {

    @Override
    public void verifyRepositoriesPage() throws InterruptedException {
        $("REPOSITORIES_LABEL").should(Condition.appear).isDisplayed();
        $("BACK_BUTTON").click();
    }
}
