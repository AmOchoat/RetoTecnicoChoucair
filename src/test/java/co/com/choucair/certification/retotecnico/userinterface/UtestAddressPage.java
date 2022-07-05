package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestAddressPage extends PageObject {
    public final static Target INPUT_CITY = Target.the("where do we write and select the user city")
            .located(By.id("city"));
    public final static Target INPUT_POSTAL_CODE = Target.the("where do we write the user postal code")
            .located(By.id("zip"));
    public final static Target INPUT_COUNTRY_CONTAINER = Target.the("container where do we write and select the user country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public final static Target INPUT_COUNTRY = Target.the("Where do we write the user's country")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public final static Target BUTTON_TO_DEVICES = Target.the("button to go to devices section")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
