package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    
    tc_002Page page = new tc_002Page();

    @Given("El usuario abre el archivo Excel exportado")
    public void abrirArchivoExcelExportado() {
        page.abrirArchivoExcel();
    }

    @When("El usuario localiza la Columna C")
    public void localizarColumnaC() {
        page.encontrarColumnaC();
    }

    @Then("La Columna C contiene la llave generada para cada fila")
    public void validarContenidoColumnaC() {
        Assert.assertTrue(page.validarLlavesGeneradasColumnaC());
    }

    @Then("La fórmula utilizada en cada celda de Columna C coincide con {string}")
    public void validarFormulaLlave(String formulaEsperada) {
        Assert.assertTrue(page.validarFormula(formulaEsperada));
    }

    @When("El usuario realiza pruebas con datos de prueba")
    public void realizarPruebasConDatosDePrueba() {
        page.usarDatosDePrueba();
    }

    @Then("Cada llave se genera correctamente basado en los valores de las celdas indicadas")
    public void validarGeneracionLlaves() {
        Assert.assertTrue(page.verificarConsistenciaLlaves());
    }
}