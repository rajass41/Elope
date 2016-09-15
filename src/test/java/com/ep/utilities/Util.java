package com.ep.utilities;

import java.util.LinkedList;

import org.apache.log4j.Logger;

import com.ep.datainitialization.DataInt;

public class Util {



public static final Logger LOG = Logger.getLogger(Util.class);


public static LinkedList<Object[]> getLoginData(String sheetName1,Xls_Reader xls) {
		

	LinkedList<Object[]> logindata = new LinkedList<Object[]>();

	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;

		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {
			
			totalRows++;
		}

		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {

			dataInitialization = new DataInt();
			Object obj[] = new Object[1];

			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Login")) {

				dataInitialization.setUsername(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setUserpassword(xls.getCellData(sheetName1, 2, i));
				
				
				obj[0] = dataInitialization;
				logindata.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return logindata;

    }

public static LinkedList<Object[]> getStudentForm(String sheetName1,Xls_Reader xls) {
	

	LinkedList<Object[]> studentform = new LinkedList<Object[]>();

	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;

		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {
			
			totalRows++;
		}

		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {

			dataInitialization = new DataInt();
			Object obj[] = new Object[1];

			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("StudentForm")) {

				dataInitialization.setLastname(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setFirstname(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setMiddlename(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setSSN(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setGrade(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setStudentid(xls.getCellData(sheetName1, 6, i));
				dataInitialization.setDOB(xls.getCellData(sheetName1, 7, i));
				dataInitialization.setAddress(xls.getCellData(sheetName1, 8, i));
				dataInitialization.setZip(xls.getCellData(sheetName1, 9, i));
				dataInitialization.setHome(xls.getCellData(sheetName1, 10, i));
				dataInitialization.setCell(xls.getCellData(sheetName1, 11, i));
				dataInitialization.setEmailaddress(xls.getCellData(sheetName1, 12, i));
				dataInitialization.setParentemployer(xls.getCellData(sheetName1, 13, i));
				dataInitialization.setTelephone(xls.getCellData(sheetName1, 14, i));
				dataInitialization.setName(xls.getCellData(sheetName1, 15, i));
				dataInitialization.setRelationtochild(xls.getCellData(sheetName1, 16, i));
				dataInitialization.setPickuppersonname(xls.getCellData(sheetName1, 17, i));
				dataInitialization.setPickuppersonTelephone(xls.getCellData(sheetName1, 18, i));
				dataInitialization.setParentorGuardian(xls.getCellData(sheetName1, 19, i));
				dataInitialization.setSignatureLegalParentorGuardian(xls.getCellData(sheetName1, 20, i));
				
				
				
				
				obj[0] = dataInitialization;
				studentform.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return studentform;

    }

}


