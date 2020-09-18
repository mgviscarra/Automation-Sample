package pages.android;

import com.codeborne.selenide.Condition;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pages.GithubHomePage;

import static cross.automationLibrary.configuration.Platform.Constants.ANDROID;

@Component
@Profile({ANDROID})
public class AndroidGithubHomePage extends GithubHomePage {

    @Override
    public void goToRepositories(){
        $("REPOSITORIES_BUTTON").click();
    }
    @Override
    public void goToOrganizations(){
        $("ORGANIZATIONS_BUTTON").click();
    }

    @Override
    public void verifyLoggedInGithub() throws InterruptedException {
        $("GITHUB").click();
        $("USER_ICON").should(Condition.appear).isDisplayed();
        Thread.sleep(5000);
    }
}
