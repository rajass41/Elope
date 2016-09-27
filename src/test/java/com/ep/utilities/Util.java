package com.ep.utilities;

import java.util.LinkedList;
import org.apache.log4j.Logger;
import com.ep.datainitialization.DataInt;

public class Util {



public static final Logger LOG = Logger.getLogger(Util.class);

public static LinkedList<Object[]> getSignup(String sheetName1,Xls_Reader xls) {
	

	LinkedList<Object[]> signup = new LinkedList<Object[]>();

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

			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Signup")) {

				dataInitialization.setFirstName(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setLastName(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setAddress1(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setPhonenumber(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setEmailAddress(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setPassword(xls.getCellData(sheetName1, 6, i));
				dataInitialization.setCity(xls.getCellData(sheetName1, 7, i));
				dataInitialization.setZipCode(xls.getCellData(sheetName1, 8, i));
				
				obj[0] = dataInitialization;
				signup.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return signup;

    }

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
				dataInitialization.setCardtype(xls.getCellData(sheetName1, 21, i));
				dataInitialization.setCardnumber(xls.getCellData(sheetName1, 22, i));
				dataInitialization.setMonth(xls.getCellData(sheetName1, 23, i));
				dataInitialization.setYear(xls.getCellData(sheetName1,24, i));
				dataInitialization.setCVV(xls.getCellData(sheetName1, 25, i));
				
				obj[0] = dataInitialization;
				studentform.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return studentform;

    }
public static LinkedList<Object[]> getContactus(String sheetName1,Xls_Reader xls) {
	

	LinkedList<Object[]> contactus = new LinkedList<Object[]>();

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

			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Contactus")) {

				dataInitialization.setFname(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setLname(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setMailid(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setPh(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setCompany(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setCity(xls.getCellData(sheetName1, 6, i));
				dataInitialization.setZipCode(xls.getCellData(sheetName1, 7, i));
				dataInitialization.setComments(xls.getCellData(sheetName1, 8, i));
	
				obj[0] = dataInitialization;
				contactus.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return contactus;

    }

public static LinkedList<Object[]> getChangePassword(String sheetName1,Xls_Reader xls) {
	

	LinkedList<Object[]> changepassword = new LinkedList<Object[]>();

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

			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("ChangePassword")) {

				dataInitialization.setCurrentPassword(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setNewPassword(xls.getCellData(sheetName1, 2, i));
	
				obj[0] = dataInitialization;
				changepassword.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return changepassword;

    }

}


