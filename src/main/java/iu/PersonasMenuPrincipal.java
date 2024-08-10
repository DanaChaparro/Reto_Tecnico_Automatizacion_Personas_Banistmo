package iu;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PersonasMenuPrincipal extends PageObject {

    public static final Target MENU_PRODUCTOS = Target.the("opción del menú productos").located(By.id("header-personas"));
    public static final Target MENU_PRODUCTOS_SERVICIOS = Target.the("opción del menú productos y servicios").located(By.id("menu-productos"));
    public static final Target OPCION_INVERSIONES = Target.the("producto inversiones").located(By.id("header-productos-inversiones"));

}
