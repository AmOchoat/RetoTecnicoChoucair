package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPasswordPage extends PageObject {
    public final static Target INPUT_PASSWORD = Target.the("where do whe write the user's password")
            .located(By.id("password"));
    public final static Target INPUT_PASSWORD_CONFIRMATION = Target.the("where do we write the user's password confirmation")
            .located(By.id("confirmPassword"));
    public final static Target CHECKBOX_STAY_INFORMED = Target.the("where do whe select to accept the accept to receive messages")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public final static Target CHECKBOX_TERMS_OF_USE = Target.the("where do whe select to accept the accept the terms of use and guidelines guidelines")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public final static Target CHECKBOX_PRIVACY_AND_SECURITY = Target.the("where do whe select to accept the accept the privacy and security guidelines")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public final static Target BUTTON_COMPLETE = Target.the("button to complete the creation account process")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
