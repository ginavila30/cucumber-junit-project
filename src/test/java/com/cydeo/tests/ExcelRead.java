package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {
    @Test
    public void read_from_excel_file() throws IOException {
        String path = "SampleData.xlsx";
        FileInputStream file = new FileInputStream(path);
        //create a workbooj obbject
        XSSFWorkbook  workbook = new XSSFWorkbook(file);
        //get a specific sheet from the workbook
        XSSFSheet sheet = workbook.getSheet("Employees");
        //select a row and cell
        System.out.println();
    }
}
