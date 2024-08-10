package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class NombreDelDocumento implements Question<Boolean> {

    String nombreDelDocumento;

    public NombreDelDocumento(String nombreDelDocumento) {
        this.nombreDelDocumento = nombreDelDocumento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean respuesta = false;
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        String url = driver.getCurrentUrl();
        System.out.println("#####");
        System.out.println(url);
        System.out.println(nombreDelDocumento);
        if (url.contains(nombreDelDocumento)){
            respuesta = true;
        }
        return respuesta;
    }

    public static NombreDelDocumento es(String nombreDocumento) {
        return new NombreDelDocumento(nombreDocumento);
    }

}
