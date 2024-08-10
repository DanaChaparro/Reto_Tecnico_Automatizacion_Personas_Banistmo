package iu;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PersonasInversiones extends PageObject {

    public static final Target INVERSION_VIRTUAL = Target.the("inversion virtual").located(By.xpath("//a[contains(.,'n Virtual')]"));

}
