package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.tc_005Page;

public class tc_005Steps {

    WebDriver driver;
    tc_005Page page = new tc_005Page(driver);

    @Given("Estoy en la pantalla de Reservas")
    public void estoy_en_la_pantalla_de_Reservas() {
        page.navigateToReservasScreen();
    }

    @When("Localizo la columna 'Monto (reserva)'")
    public void localizo_columna_monto_reserva() {
        page.locateMontoReservaColumn();
    }

    @Then("Verifico la existencia de la columna 'Monto acumulado Folio Reserva 5401'")
    public void verifico_columna_monto_acumulado() {
        page.verifyMontoAcumuladoColumnExists();
    }

    @When("Verifico que la fórmula sume el monto de reserva acumulado y el monto de reserva actual")
    public void verifico_formula_suma() {
        page.verifySumFormula();
    }

    @Then("La fórmula de suma opera correctamente")
    public void formula_suma_opera_correctamente() {
        page.validateSumFormula();
    }

    @When("Realizo pruebas con datos de reserva")
    public void realizo_pruebas_datos_reserva() {
        page.testWithReservationData();
    }

    @Then("La columna muestra los montos acumulados correctamente")
    public void columna_muestra_montos_acumulados() {
        page.validateAccumulatedAmounts();
    }
}