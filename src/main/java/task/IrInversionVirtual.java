package task;

import interactions.SwitchWindows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static iu.PersonasInversionVirtual.DOCUMENTOS;
import static iu.PersonasInversiones.INVERSION_VIRTUAL;
import static iu.PersonasMenuPrincipal.*;

public class IrInversionVirtual implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_PRODUCTOS),
                Click.on(MENU_PRODUCTOS_SERVICIOS),
                Click.on(OPCION_INVERSIONES),
                Click.on(INVERSION_VIRTUAL),
                SwitchWindows.setWindow(),
                Scroll.to(DOCUMENTOS).andAlignToTop(),
                Click.on(DOCUMENTOS)
        );
    }

    public static IrInversionVirtual delProductoInversionVirtual(){
        return Tasks.instrumented(IrInversionVirtual.class);
    }

}
