package excelio;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public void loadDataFromExcelFile(String path, String filename) throws Exception {

		File file = new File(path + File.separatorChar + filename);
		FileInputStream inputStream = new FileInputStream(file);
		file.setReadOnly();
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet(filename);
		wb.getSheetAt(0);
		XSSFRow ligne = null;
		XSSFCell cellule = null;
		Iterator lignes = sheet.rowIterator();
		while (lignes.hasNext()) {
			ligne = (XSSFRow) lignes.next();
			Iterator cellules = ((XSSFRow) lignes).cellIterator();
			while (cellules.hasNext()) {
				cellule = (XSSFCell) cellules.next();
//				if (cellule.getCellType() == CellType.STRING.getCode()) {
					System.out.print(cellule.getStringCellValue() + " ");
//				} else if (cellule.getCellType() == CellType.STRING.getCode()) {
					System.out.print(cellule.getNumericCellValue() + " ");
//				} else {
				}
			}
			System.out.println();
		}
	}


