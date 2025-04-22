package steps;

import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("El usuario tiene acceso al archivo Excel")
    public void elUsuarioTieneAccesoAlArchivoExcel() {
        page.openExcelFile();
    }

    @When("El usuario revisa el archivo Excel en búsqueda de la columna 'IVA 0%'")
    public void elUsuarioRevisaElArchivoExcelEnBusquedaDeLaColumnaIVA0() {
        page.searchColumnIVA0();
    }

    @Then("La columna 'IVA 0%' se muestra en el documento")
    public void laColumnaIVA0SeMuestraEnElDocumento() {
        assert page.isColumnIVA0Present();
    }

    @Given("La columna 'IVA 0%' está presente en el documento")
    public void laColumnaIVA0EstaPresenteEnElDocumento() {
        assert page.isColumnIVA0Present();
    }

    @When("El usuario valida los montos correspondientes a operaciones con tasa del 0% de IVA")
    public void elUsuarioValidaLosMontosCorrespondientesAOpcionesConTasaDel0DeIVA() {
        page.validateIVA0Amounts();
    }

    @Then("Los valores en la columna 'IVA 0%' son correctos y corresponden a las operaciones registradas")
    public void losValoresEnLaColumnaIVA0SonCorrectosYCorrespondenALasOperacionesRegistradas() {
        assert page.areIVA0AmountsCorrect();
    }

    @Given("El usuario tiene acceso a la documentación de la HU")
    public void elUsuarioTieneAccesoADocumentacionDeLaHU() {
        page.accessDocumentation();
    }

    @When("El usuario compara la propiedad y ubicación de la columna con la HU")
    public void elUsuarioComparaLaPropiedadYUbicaciónDeLaColumnaConLaHU() {
        page.compareWithDocumentation();
    }

    @Then("La propiedad y ubicación de la columna coinciden con lo especificado en la HU")
    public void laPropiedadYUbicaciónDeLaColumnaCoincidenConLoEspecificadoEnLaHU() {
        assert page.isColumnConfigurationCorrect();
    }
}