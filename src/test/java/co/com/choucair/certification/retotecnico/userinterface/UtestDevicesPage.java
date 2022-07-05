package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDevicesPage extends PageObject {
    public final static Target INPUT_CONTAINER_YOUR_COMPUTER = Target.the("container where do we write and select the user's computer OS")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div"));
    public final static Target INPUT_YOUR_COMPUTER = Target.the("where do we write and select the user's computer OS")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));
    public final static Target INPUT_CONTAINER_OS_VERSION = Target.the("container where do we write and select the OS version of the user's computer")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div"));
    public final static Target INPUT_OS_VERSION = Target.the("where do we write and select the OS version of the user's computer")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));
    public final static Target INPUT_CONTAINER_COMPUTER_LANGUAGE = Target.the("container where do we write and select the language of the user's computer")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div"));
    public final static Target INPUT_COMPUTER_LANGUAGE = Target.the("where do we write and select the language of the user's computer")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]"));

    public final static Target INPUT_CONTAINER_YOUR_MOBILE_DEVICE = Target.the("container where do we write and select the user's mobile device brand")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));
    public final static Target INPUT_YOUR_MOBILE_DEVICE = Target.the("where do we write and select the user's mobile device brand")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    public final static Target INPUT_CONTAINER_MOBILE_DEVICE_MODEL = Target.the("container where do we write and select the model of the user's mobile device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));
    public final static Target INPUT_MOBILE_DEVICE_MODEL = Target.the("where do we write and select the model of the user's mobile device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public final static Target INPUT_CONTAINER_MOBILE_DEVICE_OS = Target.the("container where do we write and select the OS of the user's mobile device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));
    public final static Target INPUT_MOBILE_DEVICE_OS = Target.the("where do we write and select the OS of the user's mobile device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public final static Target BUTTON_FINAL = Target.the("Button to the final page")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
