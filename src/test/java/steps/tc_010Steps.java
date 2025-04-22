package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("I am on the payment movements section")
    public void iAmOnThePaymentMovementsSection() {
        page.navigateToPaymentMovementsSection();
    }

    @When("I identify the cell for 'Monto Acumulado Folio OPC (2121)'")
    public void iIdentifyTheCellForMontoAcumuladoFolioOpc() {
        Assert.assertTrue(page.isMontoAcumuladoFolioOPCLocated());
    }

    @Then("the cell is located in the designated payment section")
    public void theCellIsLocatedInTheDesignatedPaymentSection() {
        Assert.assertTrue(page.isCellInDesignatedSection());
    }

    @When("I verify the formula in the cell")
    public void iVerifyTheFormulaInTheCell() {
        String expectedFormula = "=Z4+AD5+AE5+AH5+AC5+AB5+AM5";
        Assert.assertEquals(expectedFormula, page.getCellFormula());
    }

    @Then("the formula should be \"=Z4+AD5+AE5+AH5+AC5+AB5+AM5\"")
    public void theFormulaShouldBe() {
        // This step is intentionally left blank for clarity, as the assertion is done in the previous step
    }
    
    @When("I execute the formula with different IVA values")
    public void iExecuteTheFormulaWithDifferentIVAValues() {
        page.inputDifferentValuesAndCalculate();
    }

    @Then("the result should be consistent with the sum of the given values")
    public void theResultShouldBeConsistent() {
        Assert.assertTrue(page.isCalculationConsistent());
    }
}