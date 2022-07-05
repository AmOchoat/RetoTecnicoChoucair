package co.com.choucair.certification.retotecnico.questions;

import co.com.choucair.certification.retotecnico.model.RetoTecnicoData;
import co.com.choucair.certification.retotecnico.userinterface.UtestWelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Account implements Question<Boolean> {

    private RetoTecnicoData retoTecnicoData;

    public Account(RetoTecnicoData retoTecnicoData) {
        this.retoTecnicoData = retoTecnicoData;
    }

    public static Account wasCreated(RetoTecnicoData retoTecnicoData) {
        return new Account(retoTecnicoData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return retoTecnicoData.getStrWelcomeMessage().compareTo(Text.of(UtestWelcomePage.TITTLE_WELCOME).viewedBy(actor).asString()) == 0;
    }
}
