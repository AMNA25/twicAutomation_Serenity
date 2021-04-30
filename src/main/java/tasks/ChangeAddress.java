package tasks;


import components.Address;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class ChangeAddress {

    public static Task fillAddress(Map<String, String> address){
        return Task.where("Actor fills the address",
                Enter.theValue(address.get("line 1")).into(Address.LINE_1),
                Scroll.to(Address.SAVE_BUTTON),
                Enter.theValue(address.get("line 2")).into(Address.LINE_2),
                Enter.theValue(address.get("city")).into(Address.CITY),
                Enter.theValue(address.get("zipcode")).into(Address.ZIP_CODE),
                //Click.on(Address.STATE)
                Click.on(Address.SAVE_BUTTON)
                );
    }
}
