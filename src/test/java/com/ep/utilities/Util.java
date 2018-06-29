package com.ep.utilities;

import java.util.Iterator;
import java.util.LinkedList;
//import org.apache.log4j.Logger;
import com.ep.datainitialization.DataInt;

public class Util {



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
				dataInitialization.setAddress2(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setPhonenumber(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setPassword(xls.getCellData(sheetName1, 6, i));
				dataInitialization.setCity(xls.getCellData(sheetName1, 7, i));
				dataInitialization.setZipcode(xls.getCellData(sheetName1, 8, i));
				obj[0] = dataInitialization;
				signup.add(obj);
			}
		}

	} catch (Exception e) {
		//LOG.info(e.toString());

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

				dataInitialization.setEmail(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setPassword(xls.getCellData(sheetName1, 2, i));
				obj[0] = dataInitialization;
				logindata.add(obj);
			}
		}

	} catch (Exception e) {
		//LOG.info(e.toString());

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
				dataInitialization.setStateid(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setGrade(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setDOB(xls.getCellData(sheetName1, 6, i));
				dataInitialization.setWhatisthe504for(xls.getCellData(sheetName1, 7, i));
				dataInitialization.setEquipment(xls.getCellData(sheetName1, 8, i));												
				dataInitialization.setParentaddress(xls.getCellData(sheetName1, 9, i));				
				dataInitialization.setZip(xls.getCellData(sheetName1, 10, i));
				dataInitialization.setHome(xls.getCellData(sheetName1, 11, i));
				dataInitialization.setCell(xls.getCellData(sheetName1, 12, i));
				dataInitialization.setEmailAddress(xls.getCellData(sheetName1, 13, i));
				dataInitialization.setParentemployer(xls.getCellData(sheetName1, 14, i));				
				dataInitialization.setTelephone(xls.getCellData(sheetName1, 15, i));
				dataInitialization.setParentaddress1(xls.getCellData(sheetName1, 16, i));
				dataInitialization.setZip1(xls.getCellData(sheetName1, 17, i));
				dataInitialization.setHome1(xls.getCellData(sheetName1, 18, i));
				dataInitialization.setCell1(xls.getCellData(sheetName1, 19, i));
				dataInitialization.setEmailAddress1(xls.getCellData(sheetName1, 20, i));
				dataInitialization.setParentemployer1(xls.getCellData(sheetName1, 21, i));
				dataInitialization.setTelephone1(xls.getCellData(sheetName1, 22, i));
				dataInitialization.setName(xls.getCellData(sheetName1, 23, i));
				dataInitialization.setRelationtochild(xls.getCellData(sheetName1, 24, i));
				dataInitialization.setCell2(xls.getCellData(sheetName1, 25, i));
				dataInitialization.setEmailAddress2(xls.getCellData(sheetName1, 26, i));
				dataInitialization.setName1(xls.getCellData(sheetName1, 27, i));
				dataInitialization.setRelationtochild1(xls.getCellData(sheetName1, 28, i));
				dataInitialization.setCell3(xls.getCellData(sheetName1, 29, i));
				dataInitialization.setEmailAddress3(xls.getCellData(sheetName1, 30, i));				
				dataInitialization.setPickupname1(xls.getCellData(sheetName1, 31, i));
				dataInitialization.setPickuppersonTelephone1(xls.getCellData(sheetName1, 32, i));				
				dataInitialization.setPickupname1(xls.getCellData(sheetName1, 31, i));
				dataInitialization.setPickuppersonTelephone1(xls.getCellData(sheetName1, 32, i));				
				dataInitialization.setPickupname2(xls.getCellData(sheetName1, 33, i));
				dataInitialization.setPickuppersonTelephone2(xls.getCellData(sheetName1, 34, i));				
				dataInitialization.setPickupname3(xls.getCellData(sheetName1, 35, i));
				dataInitialization.setPickuppersonTelephone3(xls.getCellData(sheetName1, 36, i));				
				dataInitialization.setPickupname4(xls.getCellData(sheetName1, 37, i));
				dataInitialization.setPickuppersonTelephone4(xls.getCellData(sheetName1, 38, i));				
				dataInitialization.setPickupname5(xls.getCellData(sheetName1, 39, i));
				dataInitialization.setPickuppersonTelephone5(xls.getCellData(sheetName1, 40, i));				
				dataInitialization.setPickupname6(xls.getCellData(sheetName1, 41, i));
				dataInitialization.setPickuppersonTelephone6(xls.getCellData(sheetName1, 42, i));				
				dataInitialization.setPickupname7(xls.getCellData(sheetName1, 43, i));
				dataInitialization.setPickuppersonTelephone7(xls.getCellData(sheetName1, 44, i));				
				dataInitialization.setPickupname8(xls.getCellData(sheetName1, 45, i));
				dataInitialization.setPickuppersonTelephone8(xls.getCellData(sheetName1, 46, i));				
				dataInitialization.setPickupname9(xls.getCellData(sheetName1, 47, i));
				dataInitialization.setPickuppersonTelephone9(xls.getCellData(sheetName1, 48, i));				
				dataInitialization.setPickupname10(xls.getCellData(sheetName1, 49, i));
				dataInitialization.setPickuppersonTelephone10(xls.getCellData(sheetName1, 50, i));
				dataInitialization.setHospitalorClinic(xls.getCellData(sheetName1, 51, i));
				dataInitialization.setPhysician(xls.getCellData(sheetName1, 52, i));
				dataInitialization.setPhysicianAddress(xls.getCellData(sheetName1, 53, i));
				dataInitialization.setPhysicianTelephone(xls.getCellData(sheetName1, 54, i));									
				dataInitialization.setParentorGuardian(xls.getCellData(sheetName1, 55, i));
				dataInitialization.setSignatureLegalParentorGuardian(xls.getCellData(sheetName1, 56, i));
				dataInitialization.setCardtype(xls.getCellData(sheetName1, 57, i));
				dataInitialization.setCardnumber(xls.getCellData(sheetName1, 58, i));
				dataInitialization.setMonth(xls.getCellData(sheetName1, 59, i));
				dataInitialization.setYear(xls.getCellData(sheetName1,60, i));
				dataInitialization.setCVV(xls.getCellData(sheetName1, 61, i));
				dataInitialization.setLegalParentGuardianName1(xls.getCellData(sheetName1, 62, i));
				
				obj[0] = dataInitialization;
				studentform.add(obj);
			}
		}

	} catch (Exception e) {
		//LOG.info(e.toString());

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

				dataInitialization.setContactFirstName(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setContactLastName(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setContactemail(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setContactphone(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setSchoolname(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setChlidname(xls.getCellData(sheetName1, 6, i));
				dataInitialization.setComments(xls.getCellData(sheetName1, 7, i));
	
				obj[0] = dataInitialization;
				contactus.add(obj);
			}
		}

	} catch (Exception e) {
		//LOG.info(e.toString());

	}
	return contactus;

    }

public static LinkedList<Object[]> getChangePassword(String sheetName6,Xls_Reader xls) {
	

	LinkedList<Object[]> changepassword = new LinkedList<Object[]>();

	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;

		while (!xls.getCellData(sheetName6, 0, dataStartRowNum + totalRows).equals("")) {
			
			totalRows++;
		}

		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {

			dataInitialization = new DataInt();
			Object obj[] = new Object[1];

			if (xls.getCellData(sheetName6, 0, i).equalsIgnoreCase("ChangePassword")) {

				dataInitialization.setCurrentPassword(xls.getCellData(sheetName6, 1, i));
				dataInitialization.setNewPassword(xls.getCellData(sheetName6, 2, i));
	
				obj[0] = dataInitialization;
				changepassword.add(obj);
			}
		}

	} catch (Exception e) {
		//LOG.info(e.toString());

	}
	return changepassword;

    }

public static LinkedList<Object[]> mergesheets(String firstsheet, String secondsheet,Xls_Reader xls){
	
	
				LinkedList<Object[]>dataoftabone=new LinkedList<Object[]>();
				dataoftabone=getLoginData(firstsheet, xls);	
				LinkedList<Object[]>dataoftabtwo=new LinkedList<Object[]>();
				dataoftabtwo=getChangePassword(secondsheet, xls);
				Iterator<Object[]>itr=dataoftabtwo.iterator();
				
				if (itr.hasNext()) {
		
					dataoftabone.add(itr.next());
				}

			return dataoftabone;
		}



}


