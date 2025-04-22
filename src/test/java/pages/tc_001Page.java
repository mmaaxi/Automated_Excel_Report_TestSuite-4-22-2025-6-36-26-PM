package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openClaimAccountingReportPage() {
        driver.navigate().to("http://example.com/reports/claim/accounting");
    }

    public void submitReport() {
        driver.findElement(By.id("submit-btn")).click();
    }

    public void viewLog() {
        driver.findElement(By.id("view-log-btn")).click();
    }

    public boolean isExportProcessStarted() {
        // Implement logic to verify if the export process has started
        return driver.findElement(By.id("export-progress")).isDisplayed();
    }

    public boolean doesExcelReflectModifications() {
        // Implement logic to verify the Excel file content for modifications
        // This might include downloading the file and checking its contents
        return true; // Placeholder for actual logic
    }
}