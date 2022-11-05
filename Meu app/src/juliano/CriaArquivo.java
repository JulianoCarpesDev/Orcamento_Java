/*package juliano;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CriaArquivo {}


public List<Object> criar() throws IOException{
		List<Object> orcamento = new ArrayList<>();
		
		FileInputStream file = new FileInputStream("D:\\modelo.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		
		Sheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row>iterator = sheet.iterator();
		
		
		
		
		
		List<Row> linhas = (List<Row>) toList(sheet.iterator());
		
		return orcamento;
		
	}

	private List<?> toList(Iterator<?> iterator) {
		return IteratorUteis.toList(iterator);
	}
}*/
