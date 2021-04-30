package components;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class Address {
    public static Target LINE_1 = Target.the("Line 1")
            .located(MobileBy.AccessibilityId("Address Line 1"));
    public static Target LINE_2 = Target.the("line 2")
            .located(MobileBy.AccessibilityId("Address Line 2"));
    public static Target CITY = Target.the("city")
            .located(MobileBy.AccessibilityId("city"));
    public static Target ZIP_CODE = Target.the("zip")
            .located(MobileBy.AccessibilityId("UserSettingsScreen"));
    public static Target STATE = Target.the("state")
           .locatedBy("//android.widget.EditText[@content-desc=\"zip\"]//following::android.widget.EditText");
    public static Target SAVE_BUTTON = Target.the("save button")
            .located(MobileBy.AccessibilityId("change-address-save-button"));

}
