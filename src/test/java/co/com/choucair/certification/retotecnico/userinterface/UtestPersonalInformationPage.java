package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPersonalInformationPage extends PageObject {
    public final static Target INPUT_FIRST_NAME = Target.the("where do we write the user first name")
            .located(By.id("firstName"));
    public final static Target INPUT_LAST_NAME = Target.the("where do we write the user first name")
            .located(By.id("lastName"));
    public final static Target INPUT_EMAIL = Target.the("where do we write the user last name")
            .located(By.id("email"));
    public final static Target INPUT_MONTH_BIRTH = Target.the("where do whe select the user month of birth dropdown")
            .located(By.id("birthMonth"));
    public final static Target INPUT_DAY_BIRTH = Target.the("where do whe select the user day of birth")
            .located(By.id("birthDay"));
    public final static Target INPUT_YEAR_BIRTH = Target.the("where do whe select the user year of birth")
            .located(By.id("birthYear"));
    public final static Target BUTTON_NEXT_LOCATION = Target.the("where do click to pass to form next section")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span"));
}
