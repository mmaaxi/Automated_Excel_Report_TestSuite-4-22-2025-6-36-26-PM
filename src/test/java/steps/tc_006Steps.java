package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("^El archivo Excel exportado está abierto$")
    public void abrir_archivo_excel() {
        page.abrirArchivoExcel();
    }

    @When("^Localizo la columna titulada originalmente 'Monto Acumulado Folio OPC'$")
    public void localizar_columna_original() {
        page.localizarColumnaOriginal();
    }

    @Then("^La columna se ha visualmente renombrado$")
    public void columna_visualmente_renombrada() {
        Assert.assertTrue(page.isColumnaRenombrada());
    }

    @And("^Verifico que el nuevo título sea 'Monto Acumulado Folio OPC \\(2121\\)'$")
    public void verificar_nuevo_titulo() {
        Assert.assertEquals("Monto Acumulado Folio OPC (2121)", page.obtenerNuevoTitulo());
    }

    @And("^Comparo con la especificación en la HU y el anexo correspondiente$")
    public void comparar_con_especificacion() {
        Assert.assertTrue(page.compararConEspecificacion());
    }

    @Then("^El cambio de nombre cumple con el requerimiento$")
    public void cambio_cumple_requerimiento() {
        Assert.assertTrue(page.cumpleRequerimiento());
    }
}