package components;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class SettingsPage {
    public static Target profile = Target.the("profile")
            .located(MobileBy.AccessibilityId("profile"));
}
