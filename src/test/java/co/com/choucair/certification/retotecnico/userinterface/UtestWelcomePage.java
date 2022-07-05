package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestWelcomePage extends PageObject {

    public final static Target TEXT_BUTTON_COMPLETE = Target.the("button that represent the end of the automation")
            .located(By.xpath("//*[@id='laddaBtn']/span[1]/span"));
    public final static Target TITTLE_WELCOME = Target.the("welcome title to confirm the account creation")
            .located(By.xpath("//*[@id='mainContent']/div/div/div[1]/div/h1"));
}
