package task;

import interactions.SwitchWindows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static iu.PersonasInversionVirtual.DESCARGAR_DOCUMENTO;

public class DescargarDocumentoReglamento implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DESCARGAR_DOCUMENTO),
                SwitchWindows.setWindow()
        );
    }

    public static DescargarDocumentoReglamento pdf(){
        return Tasks.instrumented(DescargarDocumentoReglamento.class);
    }

}
