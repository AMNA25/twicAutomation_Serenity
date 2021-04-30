package components;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target settingsTab = Target.the("settingsTab")
            .located(MobileBy.AccessibilityId("UserSettingsScreen"));

}
