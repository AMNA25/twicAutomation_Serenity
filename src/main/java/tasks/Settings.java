package tasks;

import components.HomePage;
import components.SettingsPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Settings {
    public static Task clickProfile(){
        return Task.where("Profile screen",
                Click.on(SettingsPage.profile)
        );
    }

}
