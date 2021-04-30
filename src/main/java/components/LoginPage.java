package components;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static Target ManualSignIn = Target.the("I'll sign in manually button")
            .located(MobileBy.AccessibilityId("sign-in-manually"));
    public static Target emailField = Target.the("Enter email")
            .located(MobileBy.AccessibilityId("work-email-field"));
    public static Target nextButton = Target.the("Next button")
            .located(MobileBy.AccessibilityId("work-email-button"));
    public static Target enterPassword = Target.the("Enter password")
            .located(MobileBy.AccessibilityId("password-field"));
    public static Target loginButton = Target.the("login button")
            .located(MobileBy.AccessibilityId("login-button"));


}
