package pages;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;

public class tc_009Page {

    private Workbook workbook;
    private Sheet sheet;

    public void openExcelFile() {
        try {
            File file = new File("ruta/a/archivo.xlsx");
            FileInputStream fis = new FileInputStream(file);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheetAt(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isColumnPresent(String columnName) {
        return sheet.getRow(0).cellIterator().hasNext(cell -> cell.getStringCellValue().equals(columnName));
    }

    public boolean areRetentionValuesCorrect(String columnName) {
        // Lógica para verificar que los valores sean correctos
        // Implementar lógica de verificación de montos
        return true;
    }

    public void performAccuracyTest() {
        // Implementar test de precisión usando datos de prueba
    }

    public boolean isAccuracyTestPassed() {
        // Implementar verificación de que los tests de precisión han pasado
        return true;
    }
}