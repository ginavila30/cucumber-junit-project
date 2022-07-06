package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    String filePath = "SampleData.xlsx";
    XSSFWorkbook workBook;
    XSSFSheet sheet;

    @Test
    public void excel_write() throws IOException {
        FileInputStream file = new FileInputStream(filePath);
        workBook = new XSSFWorkbook(file);
        sheet= workBook.getSheet("Employees");
        XSSFCell salaryCell = sheet.getRow(0).createCell(3);
        //set value method to enter value into the cell
        salaryCell.setCellValue("Salary");
        XSSFCell salary1= sheet.getRow(1).createCell(3);
        salary1.setCellValue(200000);
        XSSFCell salary2= sheet.getRow(2).createCell(3);
        salary2.setCellValue(110000);
        XSSFCell salary3= sheet.getRow(3).createCell(3);
        salary3.setCellValue(135000);
        XSSFCell salary4= sheet.getRow(4).createCell(3);
        salary4.setCellValue(125000);
        //change Mary's last name
        for (int rownum = 0; rownum < sheet.getLastRowNum() ; rownum++) {
            if(sheet.getRow(rownum).getCell(0).toString().equals("Mary")){
                sheet.getRow(rownum).getCell(1).setCellValue("Jones");

            }
        }


        //Fileoutput stream  to write and save changes on the workbook
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workBook.write(outputStream);
        //close all
        outputStream.close();
        workBook.close();
        file.close();


}}
