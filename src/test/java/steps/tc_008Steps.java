package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_008Page;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page page;

    public tc_008Steps() {
        this.driver = Hooks.driver;
        this.page = new tc_008Page(driver);
    }

    @Given("la aplicación ha exportado el archivo Excel")
    public void exportarExcel() {
        // Código para exportar Excel desde la aplicación
    }

    @When("localizo la columna 'IVA exento'")
    public void localizarColumnaIVAExento() {
        page.findIVAExentoColumn();
    }

    @Then("la columna 'IVA exento' se encuentra presente")
    public void verificarColumnaIVAExento() {
        assert page.isIVAExentoColumnPresent();
    }

    @Given("la columna 'IVA exento' está presente en el documento")
    public void columnaPresente() {
        assert page.isIVAExentoColumnPresent();
    }

    @When("verifico que los montos se registren correctamente")
    public void verificarMontos() {
        page.verifyExemptAmounts();
    }

    @Then("la columna muestra los montos exentos correctamente")
    public void verificarMontosCorrectos() {
        assert page.areExemptAmountsCorrect();
    }

    @Given("la información de la columna 'IVA exento'")
    public void obtenerInformacionColumna() {
        page.getIVAExentoInfo();
    }

    @When("comparo con las especificaciones del documento de requisitos")
    public void compararConRequisitos() {
        page.compareWithSpecifications();
    }

    @Then("la información cumple las especificaciones de la historia de usuario")
    public void verificarCumpleEspecificaciones() {
        assert page.isInfoComplyingSpecifications();
    }
}