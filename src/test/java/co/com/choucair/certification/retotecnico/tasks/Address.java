package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.RetoTecnicoData;
import co.com.choucair.certification.retotecnico.userinterface.UtestAddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class Address implements Task {

    private RetoTecnicoData retoTecnicoData;

    public Address(RetoTecnicoData retoTecnicoData) {
        this.retoTecnicoData = retoTecnicoData;
    }

    public static Address fillOut(RetoTecnicoData retoTecnicoData) {
        return Tasks.instrumented(Address.class, retoTecnicoData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(retoTecnicoData.getStrCity()).into(UtestAddressPage.INPUT_CITY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Enter.theValue(retoTecnicoData.getStrPostalCode()).into(UtestAddressPage.INPUT_POSTAL_CODE),
                Click.on(UtestAddressPage.INPUT_COUNTRY_CONTAINER),
                Enter.theValue(retoTecnicoData.getStrCountry()).into(UtestAddressPage.INPUT_COUNTRY).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(UtestAddressPage.BUTTON_TO_DEVICES)
        );
    }
}
