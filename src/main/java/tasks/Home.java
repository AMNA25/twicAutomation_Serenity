package tasks;

import components.HomePage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Home {
    public static Task clickSettings(){
        return Task.where("Home actions",
                Click.on(HomePage.settingsTab)
        );
    }
}
