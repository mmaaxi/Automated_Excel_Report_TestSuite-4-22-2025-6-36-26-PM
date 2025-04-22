package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {

    WebDriver driver;

    By montoReservaColumn = By.xpath("//th[contains(text(), 'Monto (reserva)')]");
    By montoAcumuladoColumn = By.xpath("//th[contains(text(), 'Monto acumulado Folio Reserva 5401')]");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToReservasScreen() {
        driver.get("URL_DE_LA_PANTALLA_DE_RESERVAS");
    }

    public void locateMontoReservaColumn() {
        driver.findElement(montoReservaColumn).isDisplayed();
    }

    public void verifyMontoAcumuladoColumnExists() {
        driver.findElement(montoAcumuladoColumn).isDisplayed();
    }

    public void verifySumFormula() {
        // Implementación para verificar la fórmula de suma
    }

    public void validateSumFormula() {
        // Implementación para validar el resultado de la fórmula
    }

    public void testWithReservationData() {
        // Implementación para realizar pruebas con datos de reserva
    }

    public void validateAccumulatedAmounts() {
        // Implementación para validar los montos acumulados
    }
}