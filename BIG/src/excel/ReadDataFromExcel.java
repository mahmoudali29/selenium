package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
    public static void main(String[] args) throws IOException {
        
        // Open the Excel file
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\V.I.P\\eclipse-workspace\\BIG\\src\\excel\\users.xlsx");

        // Create the workbook instance for the Excel file
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // Get the sheet by name
        XSSFSheet sheet = workbook.getSheet("sheet1");

        // Read a specific cell value (Row 0, Column 1)
        XSSFRow row = sheet.getRow(0);
        XSSFCell cell = row.getCell(1);
        System.out.println("Cell Value: " + cell.getStringCellValue());

        // Get the physical number of rows (rows with actual data)
        int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
        System.out.println("Physical number of rows: " + physicalNumberOfRows);

        // Get the last row number (zero-based index)
        int lastRowNum = sheet.getLastRowNum();
        System.out.println("Last row number (zero-based): " + lastRowNum);

        // Get the last row object
        XSSFRow lastRow = sheet.getRow(lastRowNum);

        // Get the number of physical columns (non-empty cells) in the last row
        int physicalNumberOfColumns = 0;
        if (lastRow != null) {
            physicalNumberOfColumns = lastRow.getPhysicalNumberOfCells();
        }
        System.out.println("Physical number of columns in the last row: " + physicalNumberOfColumns);

        // Now, let's read all the rows and cells:
        System.out.println("\nReading All Rows and Cells:");

        for (int i = 0; i <= lastRowNum; i++) {
            XSSFRow currentRow = sheet.getRow(i);
            if (currentRow != null) {
                for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
                    XSSFCell currentCell = currentRow.getCell(j);
                    if (currentCell != null) {
                        switch (currentCell.getCellType()) {
                            case STRING:
                                System.out.print(currentCell.getStringCellValue() + "\t");
                                break;
                            case NUMERIC:
                                System.out.print(currentCell.getNumericCellValue() + "\t");
                                break;
                            case BOOLEAN:
                                System.out.print(currentCell.getBooleanCellValue() + "\t");
                                break;
                            case FORMULA:
                                System.out.print(currentCell.getCellFormula() + "\t");
                                break;
                            default:
                                System.out.print("Unknown\t");
                                break;
                        }
                    } else {
                        System.out.print("NULL\t");
                    }
                }
                System.out.println(); // New line for the next row
            }
        }

        // Close the workbook
        workbook.close();
        fileInputStream.close();
    }
}
