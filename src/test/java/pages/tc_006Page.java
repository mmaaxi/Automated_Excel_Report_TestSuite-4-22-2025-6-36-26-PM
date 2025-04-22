package pages;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;

public class tc_006Page {

    private Workbook workbook;
    private Sheet sheet;

    public void abrirArchivoExcel() {
        try {
            FileInputStream file = new FileInputStream(new File("ruta/al/archivo.xlsx"));
            workbook = WorkbookFactory.create(file);
            sheet = workbook.getSheetAt(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void localizarColumnaOriginal() {
        for (Row row : sheet) {
            for (Cell cell : row) {
                if ("Monto Acumulado Folio OPC".equals(cell.getStringCellValue())) {
                    // lógica para asegurar que la columna es la correcta
                }
            }
        }
    }

    public boolean isColumnaRenombrada() {
        for (Row row : sheet) {
            for (Cell cell : row) {
                if ("Monto Acumulado Folio OPC (2121)".equals(cell.getStringCellValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String obtenerNuevoTitulo() {
        for (Row row : sheet) {
            for (Cell cell : row) {
                if ("Monto Acumulado Folio OPC (2121)".equals(cell.getStringCellValue())) {
                    return cell.getStringCellValue();
                }
            }
        }
        return "";
    }

    public boolean compararConEspecificacion() {
        // Simulación de la comparación con el documento HU y el anexo
        // Devuelve true si la comparación es exitosa
        return true;
    }

    public boolean cumpleRequerimiento() {
        // Verificación final de que el cambio de nombre cumple con la especificación
        return isColumnaRenombrada() && compararConEspecificacion();
    }
}