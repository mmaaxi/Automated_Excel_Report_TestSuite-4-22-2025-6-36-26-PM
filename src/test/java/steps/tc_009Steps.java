package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("que el archivo Excel de la transacción está disponible")
    public void que_el_archivo_Excel_de_la_transacción_está_disponible() {
        page.openExcelFile();
    }

    @When("verifico la presencia de la columna {string}")
    public void verifico_la_presencia_de_la_columna(String columna) {
        Assert.assertTrue("La columna " + columna + " no se encuentra en el archivo.", page.isColumnPresent(columna));
    }

    @Then("la columna {string} se muestra correctamente")
    public void la_columna_se_muestra_correctamente(String columna) {
        // Asume que el método anterior verifica correctamente
    }

    @When("confirmo que los montos retenidos están registrados en la columna {string}")
    public void confirmo_que_los_montos_retenidos_están_registrados_en_la_columna(String columna) {
        Assert.assertTrue("Los montos no están correctamente registrados en la columna.", page.areRetentionValuesCorrect(columna));
    }

    @Then("los valores en la columna coinciden con los montos retenidos calculados")
    public void los_valores_en_la_columna_coinciden_con_los_montos_retenidos_calculados() {
        // Asume que el método anterior verifica correctamente
    }

    @When("realizo pruebas de exactitud de IVA retenido")
    public void realizo_pruebas_de_exactitud_de_IVA_retenido() {
        page.performAccuracyTest();
    }

    @Then("los cálculos y registros son precisos")
    public void los_calculos_y_registros_son_precisos() {
        Assert.assertTrue("Los cálculos o registros no son precisos.", page.isAccuracyTestPassed());
    }
}