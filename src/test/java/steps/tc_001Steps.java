package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_001Page;

import static org.junit.Assert.assertTrue;

public class tc_001Steps {
    WebDriver driver = new ChromeDriver();
    tc_001Page claimReportPage = new tc_001Page(driver);

    @Given("I navigate to Canned Reports > Module Claim > Report Code > Claim Accounting Report")
    public void navigateToClaimAccountingReport() {
        claimReportPage.openClaimAccountingReportPage();
    }

    @When("I select 'Submit' and then 'View Log'")
    public void selectSubmitAndViewLog() {
        claimReportPage.submitReport();
        claimReportPage.viewLog();
    }

    @Then("the system should start the Excel file export process")
    public void verifyExportProcessStarts() {
        assertTrue(claimReportPage.isExportProcessStarted());
    }

    @Then("the exported Excel file should reflect the requested modifications")
    public void verifyExcelFileModifications() {
        assertTrue(claimReportPage.doesExcelReflectModifications());
    }
}