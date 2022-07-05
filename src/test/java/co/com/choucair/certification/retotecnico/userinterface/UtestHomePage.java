package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestHomePage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that redirect us to the sign up form")
            .located((By.xpath("//div[@class='navbar navbar-default navbar-fixed-top unauthenticated-nav-bar']//a[contains(text(),'Join Today')]")));

}
