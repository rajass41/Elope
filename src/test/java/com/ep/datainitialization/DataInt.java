package com.ep.datainitialization;

import java.io.Serializable;

public class DataInt implements Serializable {

	
	private static final long serialVersionUID = -5841500346110682370L;
	
//----Signup-----//
	
	public String FirstName ="";
	public String LastName ="";
	public String Address1="";
	public String Phonenumber="";
	public String EmailAddress="";
	public String Password="";
	public String City="";
	public String Zipcode="";
	
	
	
	

	
	
					// ---Login------//
	
	
					public String username = "";
					public String userpassword = "";
					
	
					//----StudentForm----//
							
					public String Lastname ="";
					public String Firstname ="";
					public String Middlename ="";
					public String SSN ="";
					public String Grade ="";
					public String Studentid ="";
					public String DOB="";
					public String Address="";
					public String Zip ="";
					public String Home ="";
					public String Cell ="";
					public String Emailaddress ="";
					public String Parentemployer ="";
					public String Telephone ="";
					public String Name ="";
					public String Relationtochild ="";
					public String Pickuppersonname="";
					public String PickuppersonTelephone ="";
					public String ParentorGuardian ="";
					public String SignatureLegalParentorGuardian ="";
 
					
					
	//------Payment ---//
					
					public String Cardtype="";		
					public String Cardnumber ="";		
					public String Month ="";		
					public String Year ="";
					public String CVV  ="";
					
					
					
	//--Signup Getter and Setter Methods--//
					
					public String getFirstName() {
						return FirstName;
					}
					public void setFirstName(String firstName) {
						FirstName = firstName;
					}
					public String getLastName() {
						return LastName;
					}
					public void setLastName(String lastName) {
						LastName = lastName;
					}
					public String getAddress1() {
						return Address1;
					}
					public void setAddress1(String address1) {
						Address1 = address1;
					}
					public String getPhonenumber() {
						return Phonenumber;
					}
					public void setPhonenumber(String phonenumber) {
						Phonenumber = phonenumber;
					}
					public String getEmailAddress() {
						return EmailAddress;
					}
					public void setEmailAddress(String emailAddress) {
						EmailAddress = emailAddress;
					}
					public String getPassword() {
						return Password;
					}
					public void setPassword(String password) {
						Password = password;
					}
					public String getCity() {
						return City;
					}
					public void setCity(String city) {
						City = city;
					}
					public String getZipCode() {
						return ZipCode;
					}
					public void setZipCode(String zipCode) {
						ZipCode = zipCode;
					}
					public String ZipCode="";					
					
					
					
	//----Login Getter and  Setters-------//			
					
					
					public String getUsername() {
						return username;
					}
					public void setUsername(String username) {
						this.username = username;
					}
					public String getUserpassword() {
						return userpassword;
					}
					public void setUserpassword(String userpassword) {
						this.userpassword = userpassword;
					}
					
					
					
	//------StudentForm Getter and Setter----//
					
					
					public String getLastname() {
						return Lastname;
					}
					public void setLastname(String lastname) {
						Lastname = lastname;
					}
					public String getFirstname() {
						return Firstname;
					}
					public void setFirstname(String firstname) {
						Firstname = firstname;
					}
					public String getMiddlename() {
						return Middlename;
					}
					public void setMiddlename(String middlename) {
						Middlename = middlename;
					}
					public String getSSN() {
						return SSN;
					}
					public void setSSN(String sSN) {
						SSN = sSN;
					}
					public String getGrade() {
						return Grade;
					}
					public void setGrade(String grade) {
						Grade = grade;
					}
					public String getStudentid() {
						return Studentid;
					}
					public void setStudentid(String studentid) {
						Studentid = studentid;
					}
					public String getDOB() {
						return DOB;
					}
					public void setDOB(String dOB) {
						DOB = dOB;
					}
					public String getAddress() {
						return Address;
					}
					public void setAddress(String address) {
						Address = address;
					}
					public String getZip() {
						return Zip;
					}
					public void setZip(String zip) {
						Zip = zip;
					}
					public String getHome() {
						return Home;
					}
					public void setHome(String home) {
						Home = home;
					}
					public String getCell() {
						return Cell;
					}
					public void setCell(String cell) {
						Cell = cell;
					}
					public String getEmailaddress() {
						return Emailaddress;
					}
					public void setEmailaddress(String emailaddress) {
						Emailaddress = emailaddress;
					}
					public String getParentemployer() {
						return Parentemployer;
					}
					public void setParentemployer(String parentemployer) {
						Parentemployer = parentemployer;
					}
					public String getTelephone() {
						return Telephone;
					}
					public void setTelephone(String telephone) {
						Telephone = telephone;
					}
					public String getName() {
						return Name;
					}
					public void setName(String name) {
						Name = name;
					}
					public String getRelationtochild() {
						return Relationtochild;
					}
					public void setRelationtochild(String relationtochild) {
						Relationtochild = relationtochild;
					}
					public String getPickuppersonname() {
						return Pickuppersonname;
					}
					public void setPickuppersonname(String pickuppersonname) {
						Pickuppersonname = pickuppersonname;
					}
					public String getPickuppersonTelephone() {
						return PickuppersonTelephone;
					}
					public void setPickuppersonTelephone(String pickuppersonTelephone) {
						PickuppersonTelephone = pickuppersonTelephone;
					}
					public String getParentorGuardian() {
						return ParentorGuardian;
					}
					public void setParentorGuardian(String parentorGuardian) {
						ParentorGuardian = parentorGuardian;
					}
					public String getSignatureLegalParentorGuardian() {
						return SignatureLegalParentorGuardian;
					}
					public void setSignatureLegalParentorGuardian(
							String signatureLegalParentorGuardian) {
						SignatureLegalParentorGuardian = signatureLegalParentorGuardian;
					}
			
					
				//---------Paymeny Getter and Setter methods------//	
					
					public String getCardtype() {
						return Cardtype;
					}
					public void setCardtype(String cardtype) {
						Cardtype = cardtype;
					}
					public String getCardnumber() {
						return Cardnumber;
					}
					public void setCardnumber(String cardnumber) {
						Cardnumber = cardnumber;
					}
					public String getMonth() {
						return Month;
					}
					public void setMonth(String month) {
						Month = month;
					}
					public String getYear() {
						return Year;
					}
					public void setYear(String year) {
						Year = year;
					}
					public String getCVV() {
						return CVV;
					}
					public void setCVV(String cVV) {
						CVV = cVV;
					}
}	
					
	
					





