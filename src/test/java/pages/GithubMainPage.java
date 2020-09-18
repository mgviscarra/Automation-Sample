package pages;

import com.codeborne.selenide.Condition;
import cross.automationLibrary.base.BasePage;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static cross.automationLibrary.configuration.Platform.Constants.WEB;
import static io.appium.java_client.remote.MobilePlatform.ANDROID;


@Component
@Profile({WEB})
public class GithubMainPage extends BasePage<GithubMainPage> {

    public void goToGithubMainPage() {
        System.out.println("I am on Github Page");
    }

    public void verifyCredentialsErrorMessage(){
        $("INCORRECT_CREDENTIALS_MESSAGE").should(Condition.appear).isDisplayed();
    }

    public void loginIntoGithub(String email, String password) throws InterruptedException {
        $("SIGN_IN_LINK").click();
        $("EMAIL_TEXT_BOX").sendKeys(email);
        $("PASSWORD_TEXT_BOX").sendKeys(password);
        $("SIGN_IN_BUTTON").click();
        Thread.sleep(5000);
    }

}
