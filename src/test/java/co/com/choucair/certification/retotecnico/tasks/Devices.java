package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.RetoTecnicoData;
import co.com.choucair.certification.retotecnico.userinterface.UtestDevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class Devices implements Task {

    private RetoTecnicoData retoTecnicoData;

    public Devices(RetoTecnicoData retoTecnicoData) {
        this.retoTecnicoData = retoTecnicoData;
    }

    public static Devices fillOut(RetoTecnicoData retoTecnicoData) {
        return Tasks.instrumented(Devices.class, retoTecnicoData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestDevicesPage.INPUT_CONTAINER_YOUR_COMPUTER),
                Enter.theValue(retoTecnicoData.getStrComputerOS()).into(UtestDevicesPage.INPUT_YOUR_COMPUTER).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(UtestDevicesPage.INPUT_CONTAINER_OS_VERSION),
                Enter.theValue(retoTecnicoData.getStrOSVersion()).into(UtestDevicesPage.INPUT_OS_VERSION).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(UtestDevicesPage.INPUT_CONTAINER_COMPUTER_LANGUAGE),
                Enter.theValue(retoTecnicoData.getStrDevicesLanguage()).into(UtestDevicesPage.INPUT_COMPUTER_LANGUAGE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

                Click.on(UtestDevicesPage.INPUT_CONTAINER_YOUR_MOBILE_DEVICE),
                Enter.theValue(retoTecnicoData.getStrMobileDevice()).into(UtestDevicesPage.INPUT_YOUR_MOBILE_DEVICE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(UtestDevicesPage.INPUT_CONTAINER_MOBILE_DEVICE_MODEL),
                Enter.theValue(retoTecnicoData.getStrDeviceModel()).into(UtestDevicesPage.INPUT_MOBILE_DEVICE_MODEL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(UtestDevicesPage.INPUT_CONTAINER_MOBILE_DEVICE_OS),
                Enter.theValue(retoTecnicoData.getStrDeviceOS()).into(UtestDevicesPage.INPUT_MOBILE_DEVICE_OS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

                Click.on(UtestDevicesPage.BUTTON_FINAL)
        );
    }
}
