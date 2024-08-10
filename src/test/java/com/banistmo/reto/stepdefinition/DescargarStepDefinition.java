package com.banistmo.reto.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import iu.PersonasHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.NombreDelDocumento;
import task.DescargarDocumentoReglamento;
import task.IrInversionVirtual;

public class DescargarStepDefinition {

    @Dado("que el {actor} quiere acceder a una inversion virtual")
    public void queElActorQuiereAccederAUnaInversionVirtual(Actor actor) {
        actor.wasAbleTo(
                Open.browserOn().the(PersonasHomePage.class),
                IrInversionVirtual.delProductoInversionVirtual()
        );
    }

    @Cuando("^descarga el documento (.*)")
    public void descargaElDocumento(String nombreDocumento) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DescargarDocumentoReglamento.pdf()
        );
    }

    @Entonces("deberia ver el documento generado")
    public void deberiaVerElDocumentoGenerado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(NombreDelDocumento.es("Reglamento+Inversi")));
    }

}
