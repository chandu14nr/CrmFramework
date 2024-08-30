package stepdefinitions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import generic.FileLib;
import io.cucumber.java.en.Given;

public class GetData {
	@Given("The sheet name is {string},row index is {int},cell index is {int}")
	public void the_sheet_name_is_row_index_is_cell_index_is(String sheet, Integer row, Integer cell) throws EncryptedDocumentException, IOException {
		FileLib f=new FileLib();
		String data = f.getExcelData(sheet, row, cell);
		System.out.println(data);
	}
}
