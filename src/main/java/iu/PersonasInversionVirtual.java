package iu;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PersonasInversionVirtual extends PageObject {

    public static final Target DOCUMENTOS = Target.the("documentos").located(By.xpath("//a[.='Documentos']"));
    public static final Target DESCARGAR_DOCUMENTO = Target.the("documento reglamento inversion virtual bancolombia").located(By.xpath("//a[contains(.,'Virtual Bancolombia')]"));

}
