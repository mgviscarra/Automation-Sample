package pages.android;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pages.GithubMainPage;

import static cross.automationLibrary.configuration.Platform.Constants.ANDROID;

@Component
@Profile({ANDROID})
public class AndroidGithubMainPage extends GithubMainPage {
    @Override
    public void loginIntoGithub(String email, String password) throws InterruptedException {
        $("SIGN_IN_LINK").click();
        Thread.sleep(5000);
        if($("EMAIL_TEXT_BOX").isDisplayed()){
            $("EMAIL_TEXT_BOX").sendKeys(email);
            $("PASSWORD_TEXT_BOX").sendKeys(password);
            $("SIGN_IN_BUTTON").click();
        }
        Thread.sleep(8000);
    }
}
