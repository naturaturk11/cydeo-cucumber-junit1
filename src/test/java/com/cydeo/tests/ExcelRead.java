package com.cydeo.tests;

import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

@Test
    public void readFromExcelFile() throws IOException {
    String path="SampleData.xlsx";

    //to read from excel we need toload it to FileInput Stream
    FileInputStream fileInputStream=new FileInputStream(path);

    //workbook>sheeet>row>cell

    //<1> Create a workbook
    XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
    //<2> we need to get specific sheet from currrently opened workbook

    XSSFSheet sheet= workbook.getSheet("Employees");

//<3> Select row and cell
    //Print out mary's cell
    //Indexes start from 0

    System.out.println(sheet.getRow(1).getCell(0));

//print out developer
    System.out.println(sheet.getRow(3).getCell(2));
//return the count of used cells only
    //starts counting from 1
    int usedRows=sheet.getPhysicalNumberOfRows();
    System.out.println(usedRows);

    //Returns the number from top cell bottom cell
    //it does not care if the cell is empty or not
    //starts counting from 0
    int lastUsedRow=sheet.getLastRowNum();
    System.out.println("lastUsedRow = " + lastUsedRow);

    //TODO: cREATE A LOGİC TO PRİNT Vinod's name

    for (int rowNum = 0;rowNum  < usedRows; rowNum++) {

        if(sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")) {
            System.out.println(sheet.getRow(rowNum).getCell(0));

        }
    }

            //TODO:Create a logic to print out Linda's Job ID
            //cHECK İFNAME İS LİNDA >>>>>>PRİNT OUT JOB ID OF LİNDA

            for (int rowNum = 0; rowNum <usedRows ; rowNum++) {
                if(sheet.getRow(rowNum).getCell(0).toString().equals("Linda")){
                    System.out.println("Linda's Job ID is "+sheet.getRow(rowNum).getCell(2));
                }
            }
            
            
            
    }

    }









