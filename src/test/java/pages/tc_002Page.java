package pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class tc_002Page {

    private Workbook workbook;
    private Sheet sheet;
    
    public void abrirArchivoExcel() {
        try {
            FileInputStream file = new FileInputStream(new File("ruta/del/archivo.xlsx"));
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheetAt(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void encontrarColumnaC() {
        // Implementation to locate Column C
    }

    public boolean validarLlavesGeneradasColumnaC() {
        for (Row row : sheet) {
            Cell cell = row.getCell(2);  // C is the third column
            if (cell == null || cell.getCellType() != CellType.STRING) {
                return false;
            }
        }
        return true;
    }

    public boolean validarFormula(String formulaEsperada) {
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(2);  // C is the third column
            String formulaReal = String.format("=CONCATENATE(%s, \"_\", %s, \"_\", %s, \"_\", %s, \"_\", %s)",
                    row.getCell(3).getStringCellValue(),  // D
                    row.getCell(7).getStringCellValue(),  // H
                    row.getCell(20).getStringCellValue(), // U
                    row.getCell(14).getStringCellValue(), // O
                    row.getCell(4).getStringCellValue()); // E
            if (!cell.getCellFormula().equals(formulaReal)) {
                return false;
            }
        }
        return true;
    }

    public void usarDatosDePrueba() {
        // Implementation for using test data
    }

    public boolean verificarConsistenciaLlaves() {
        // Implementation to verify key consistency
        return true;
    }
}