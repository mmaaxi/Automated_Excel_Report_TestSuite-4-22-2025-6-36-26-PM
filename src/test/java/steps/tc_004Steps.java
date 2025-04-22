package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {
    tc_004Page page = new tc_004Page();

    @Given("el archivo exportado está disponible")
    public void elArchivoExportadoEstaDisponible() {
        Assert.assertTrue(page.isExportedFileAvailable());
    }

    @When("reviso la columna 'estado'")
    public void revisoLaColumnaEstado() {
        page.reviewEstadoColumn();
    }

    @Then("la columna se muestra y contiene valores actualizados")
    public void laColumnaSeMuestraYContieneValoresActualizados() {
        Assert.assertTrue(page.isEstadoColumnUpdated());
    }

    @Given("los valores actuales de la columna 'estado'")
    public void losValoresActualesDeLaColumnaEstado() {
        page.fetchCurrentEstadoValues();
    }

    @When("comparo estos valores con la especificación del anexo HU Sabana Contable_V3")
    public void comparoEstosValoresConLaEspecificacionDelAnexoHUSabanaContableV3() {
        page.compareWithHUAnnex();
    }

    @Then("los valores han sido actualizados de acuerdo con los requerimientos")
    public void losValoresHanSidoActualizadosDeAcuerdoConLosRequerimientos() {
        Assert.assertTrue(page.areValuesUpdatedAsPerRequirements());
    }

    @Given("diferentes conjuntos de datos para la columna 'estado'")
    public void diferentesConjuntosDeDatosParaLaColumnaEstado() {
        page.setupDifferentDataSets();
    }

    @When("realizo pruebas para validar la consistencia de la actualización")
    public void realizoPruebasParaValidarLaConsistenciaDeLaActualizacion() {
        page.checkConsistencyOfUpdates();
    }

    @Then("la columna 'estado' presenta la información correcta en todas las filas")
    public void laColumnaEstadoPresentaLaInformacionCorrectaEnTodasLasFilas() {
        Assert.assertTrue(page.isInformationCorrectInAllRows());
    }
}