package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.RetoTecnicoData;
import co.com.choucair.certification.retotecnico.userinterface.UtestPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Password implements Task {

    private RetoTecnicoData retoTecnicoData;

    public Password(RetoTecnicoData retoTecnicoData) {
        this.retoTecnicoData = retoTecnicoData;
    }

    public static Password fillOut(RetoTecnicoData retoTecnicoData) {
        return Tasks.instrumented(Password.class, retoTecnicoData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(retoTecnicoData.getStrPassword()).into(UtestPasswordPage.INPUT_PASSWORD),
                Enter.theValue(retoTecnicoData.getStrPasswordConfirmation()).into(UtestPasswordPage.INPUT_PASSWORD_CONFIRMATION),
                Click.on(UtestPasswordPage.CHECKBOX_STAY_INFORMED),
                Click.on(UtestPasswordPage.CHECKBOX_TERMS_OF_USE),
                Click.on(UtestPasswordPage.CHECKBOX_PRIVACY_AND_SECURITY),

                Click.on(UtestPasswordPage.BUTTON_COMPLETE)
        );
    }
}
