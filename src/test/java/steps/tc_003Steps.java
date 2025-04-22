package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;
import org.junit.Assert;

public class tc_003Steps {
    tc_003Page excelPage = new tc_003Page();

    @Given("El archivo Excel exportado está abierto")
    public void el_archivo_excel_exportado_está_abierto() {
        excelPage.openExcelSheet();
    }

    @When("Localizo la columna inmediatamente a la derecha de la columna 'i'")
    public void localizo_la_columna_inmediatamente_a_la_derecha_de_la_columna_i() {
        excelPage.findColumnRightToI();
    }

    @Then("Observo la nueva columna titulada 'Estado Código'")
    public void observo_la_nueva_columna_titulada_estado_código() {
        Assert.assertTrue(excelPage.isEstadoCodigoColumnPresent());
    }

    @When("Verifico la ubicación de la columna 'Estado Código'")
    public void verifico_la_ubicación_de_la_columna_estado_código() {
        // Verificación interna de la página
    }

    @Then("La columna 'Estado Código' se encuentra en la posición esperada")
    public void la_columna_estado_código_se_encuentra_en_la_posición_esperada() {
        Assert.assertTrue(excelPage.isEstadoCodigoColumnInCorrectPosition());
    }

    @When("Comparo la columna con el anexo de la historia de usuario")
    public void comparo_la_columna_con_el_anexo_de_la_historia_de_usuario() {
        // Lógica de comparación con el anexo
    }

    @Then("El nombre y posición cumplen con el requerimiento descrito")
    public void el_nombre_y_posición_cumplen_con_el_requerimiento_descrito() {
        Assert.assertTrue(excelPage.doesColumnMeetRequirements());
    }
}