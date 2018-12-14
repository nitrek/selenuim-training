package Com.files.util;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReader {
    public static final String SAMPLE_XLSX_FILE_PATH = "C:\\Users\\adm\\Desktop\\data\\sample.xlsx";

    public static void main(String[] args) throws IOException, InvalidFormatException {

        Workbook workbook = WorkbookFactory.create(new POIFSFileSystem(new File(SAMPLE_XLSX_FILE_PATH)));
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        workbook.forEach(sheet -> {				
            System.out.println("=> " + sheet.getSheetName());
        });

        Sheet sheet = workbook.getSheetAt(0);
        DataFormatter dataFormatter = new DataFormatter();

                sheet.forEach(row -> {
            row.forEach(cell -> {
            	String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue +"-"+ "\t");
            });
            System.out.println();
        });

        // Closing the workbook
        workbook.close();
    }
}