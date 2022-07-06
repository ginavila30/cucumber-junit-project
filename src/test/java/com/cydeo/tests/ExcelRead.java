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
        System.out.println(sheet.getRow(1).getCell(0));
        System.out.println(sheet.getRow(3).getCell(2));
        //Physical counts of rows -> counts rows with content only starting from 1
        int usedRows= sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);
        //getLastRowNum-> counts all cells starting from 1
        int lastUsedRow= sheet.getLastRowNum();
        System.out.println(lastUsedRow);

        //Finding dynamically a cell wih specific value (NAME).
        for (int rownum = 0; rownum < usedRows ; rownum++) {
            if(sheet.getRow(rownum).getCell(0).toString().equals("Vinod")){
                System.out.println(sheet.getRow(rownum).getCell(0));
            }
        }
        //Finding dynamically Linda's job ID

        for (int rownum = 0; rownum < usedRows ; rownum++) {
            if(sheet.getRow(rownum).getCell(0).toString().equals("Linda")){
                System.out.println("Linda's job ID->"+sheet.getRow(rownum).getCell(2));
            }
        }
        file.close();
    }
}

