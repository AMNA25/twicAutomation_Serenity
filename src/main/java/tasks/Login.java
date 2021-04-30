package tasks;

import components.LoginPage;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Login {

    public static Task positiveLogin(){
        return Task.where("Actor enters valid credentials",
                Click.on(LoginPage.ManualSignIn),
                Enter.theValue("max@twic.ai").into(LoginPage.emailField),
                Click.on(LoginPage.nextButton),
                Enter.theValue("foobar").into(LoginPage.enterPassword),
                Click.on(LoginPage.loginButton)
        );

    }
}
