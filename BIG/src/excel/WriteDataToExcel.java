package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {
    public static void main(String[] args) throws IOException {

        // File path to the Excel file
        String filePath = "C:\\Users\\V.I.P\\eclipse-workspace\\BIG\\src\\excel\\users2.xlsx";

        File file = new File(filePath);

        // Create the file if it does not exist
        boolean fileExists = file.exists();
        if (!fileExists) {
            // Create a new Excel workbook and save it to the file path
            XSSFWorkbook newWorkbook = new XSSFWorkbook();
            XSSFSheet newSheet = newWorkbook.createSheet("InitialSheet");
            
            // Write initial data
            XSSFRow row = newSheet.createRow(0);
            XSSFCell cell = row.createCell(0);
            cell.setCellValue("Initial Data");

            try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
                newWorkbook.write(fileOutputStream);
            }
            newWorkbook.close();
            System.out.println("New file created and initial data written.");
        }

        // Open the Excel file for reading and writing
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream)) {

            // Create a new sheet
            XSSFSheet newSheet = workbook.createSheet("NewSheet");

            // Create a new row in the new sheet
            XSSFRow newRow = newSheet.createRow(0);

            // Write data into the new row (for example, write "Test Data" in the first cell of the new row)
            XSSFCell cell = newRow.createCell(0);
            cell.setCellValue("Test Data");

            // Optionally, write more data to the new sheet
            XSSFCell anotherCell = newRow.createCell(1);
            anotherCell.setCellValue("More Data");

            // Write the changes back to the Excel file
            try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
                workbook.write(fileOutputStream);
            }

            System.out.println("New sheet created and data written successfully.");
        }
    }
}
