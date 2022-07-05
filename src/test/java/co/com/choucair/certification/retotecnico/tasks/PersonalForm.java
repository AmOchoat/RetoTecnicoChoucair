package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.RetoTecnicoData;
import co.com.choucair.certification.retotecnico.userinterface.UtestPersonalInformationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

public class PersonalForm implements Task {

    private RetoTecnicoData retoTecnicoData;

    public PersonalForm(RetoTecnicoData retoTecnicoData) {
        this.retoTecnicoData = retoTecnicoData;
    }

    public static PersonalForm fillOut(RetoTecnicoData retoTecnicoData) {
        return Tasks.instrumented(PersonalForm.class, retoTecnicoData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(retoTecnicoData.getStrFirstName()).into(UtestPersonalInformationPage.INPUT_FIRST_NAME),
                Enter.theValue(retoTecnicoData.getStrLastName()).into(UtestPersonalInformationPage.INPUT_LAST_NAME),
                Enter.theValue(retoTecnicoData.getStrEmailAddress()).into(UtestPersonalInformationPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(retoTecnicoData.getStrBirthMonth()).from(UtestPersonalInformationPage.INPUT_MONTH_BIRTH),
                SelectFromOptions.byVisibleText(retoTecnicoData.getStrBirthDay()).from(UtestPersonalInformationPage.INPUT_DAY_BIRTH),
                SelectFromOptions.byVisibleText(retoTecnicoData.getStrBirthYear()).from(UtestPersonalInformationPage.INPUT_YEAR_BIRTH),
                Click.on(UtestPersonalInformationPage.BUTTON_NEXT_LOCATION)
        );
    }
}
