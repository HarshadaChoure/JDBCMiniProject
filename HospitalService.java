package com.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dao.HospitalImplementationDao;
import com.entity.Doctor;
import com.entity.Patient;

public class HospitalService 
{
	public void view() throws ClassNotFoundException, SQLException
	{
		List<Patient>patientList=new HospitalImplementationDao().viewPatient();
		for(Patient p:patientList)
		{
			System.out.println("-------------PATIENT DATA--------------");
			System.out.print("\t"+p.getPid());
			System.out.print("\t"+p.getName());
			System.out.print("\t"+p.getBirthdate());
			System.out.println("\t"+p.getGender());
			System.out.println("\t"+p.getMobileNo());
			System.out.println("\t"+p.getAddress());
			System.out.println("\t"+p.getBloodGroup());
			System.out.println("\t"+p.getDiseases());
			System.out.println("\t"+p.getMedicineAllergy());
			System.out.println("\t"+p.getDoctorId());
			
		}
	}
	
	public void insertPatient() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Patient Id");
		int pid=sc.nextInt();
		System.out.println("Enter the Patient name");
		String name=sc.next();
		System.out.println("Enter the Patient Birthdate");
		String birthdate=sc.next();
		System.out.println("Enter the Patient Gender");
		String gender=sc.next();
		System.out.println("Enter the Patient MobileNO");
		long mobileNo=sc.nextLong();
		System.out.println("Enter the Patient Address");
		String address=sc.next();
		System.out.println("Enter the Patient Blood Group");
		String bloodGroup=sc.next();
		System.out.println("Enter the Patient Diseases");
		String diseases=sc.next();
		System.out.println("Enter the Patient Medicine Allergy");
		String medicineAllergy=sc.next();
		System.out.println("Enter the Doctor Id  handled the Patient");
		String doctorId=sc.next();
		
		Patient p=new Patient();
		p.setPid(pid);
		p.setName(name);
		p.setBirthdate(birthdate);
		p.setGender(gender);
		p.setMobileNo(mobileNo);
		p.setAddress(address);
		p.setBloodGroup(bloodGroup);
		p.setDiseases(diseases);
		p.setMedicineAllergy(medicineAllergy);
		p.setDoctorId(doctorId);
		new HospitalImplementationDao().insertNewPatient(p);
	}
	
	public void updatePatient() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Patient Id");
		int pid=sc.nextInt();
		System.out.println("Enter the Patient name");
		String name=sc.next();
		System.out.println("Enter the Patient Birthdate");
		String birthdate=sc.next();
		System.out.println("Enter the Patient Gender");
		String gender=sc.next();
		System.out.println("Enter the Patient MobileNO");
		long mobileNo=sc.nextLong();
		System.out.println("Enter the Patient Address");
		String address=sc.next();
		System.out.println("Enter the Patient Blood Group");
		String bloodGroup=sc.next();
		System.out.println("Enter the Patient Diseases");
		String diseases=sc.next();
		System.out.println("Enter the Patient Medicine Allergy");
		String medicineAllergy=sc.next();
		System.out.println("Enter the Doctor Id handled the Patient");
		String doctorId=sc.next();
		
		Patient p=new Patient();
		p.setPid(pid);
		p.setName(name);
		p.setBirthdate(birthdate);
		p.setGender(gender);
		p.setMobileNo(mobileNo);
		p.setAddress(address);
		p.setBloodGroup(bloodGroup);
		p.setDiseases(diseases);
		p.setMedicineAllergy(medicineAllergy);
		p.setDoctorId(doctorId);
		new HospitalImplementationDao().updatePatient(p);
		
	}
	public void deletePatient() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the Patient id");
		int pid=sc.nextInt();
		Patient p=new Patient();
		
		
		p.setPid(pid);
		new HospitalImplementationDao().deletePatient(p);
	}
	/*----------------------------Doctor------------------------------------------------------*/
	public void viewD() throws ClassNotFoundException, SQLException
	{
		List<Doctor>doctorList=new HospitalImplementationDao().viewDoctor();
		for(Doctor d:doctorList)
		{
			
			
			
		}
	}
	
	public void insertDoctor() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Doctor Id");
		String doctorId=sc.next();
		System.out.println("Enter the Doctor name");
		String dname=sc.next();
		System.out.println("Enter the Doctor Birthdate");
		String dbirthdate=sc.next();
		System.out.println("Enter the Doctor Gender");
		String dgender=sc.next();
		System.out.println("Enter the Doctor MobileNO");
		long dmobileNo=sc.nextLong();
		System.out.println("Enter the Doctor Address");
		String daddress=sc.next();
		System.out.println("Enter the Doctor Blood Group");
		String dbloodGroup=sc.next();
		System.out.println("Enter the Doctor Specility");
		String speciality=sc.next();
		System.out.println("Enter the Doctor Medicine Allergy");
		String medicineAllergy=sc.next();
		
		
		
		Doctor d=new Doctor();
		d.setDoctorId(doctorId);
		d.setDname(dname);
		d.setDbirthdate(dbirthdate);
		d.setDgender(dgender);
		d.setDmobileNo(dmobileNo);
		d.setDaddress(daddress);
		d.setDbloodGroup(dbloodGroup);
		d.setSpeciality(speciality);
		d.setMedicineAllergy(medicineAllergy);
		
		new HospitalImplementationDao().insertNewDoctor(d);
	}
	
	public void updateDoctor() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Doctor Id");
		String doctorId=sc.next();
		System.out.println("Enter the Doctor name");
		String dname=sc.next();
		System.out.println("Enter the Doctor Birthdate");
		String dbirthdate=sc.next();
		System.out.println("Enter the Doctor Gender");
		String dgender=sc.next();
		System.out.println("Enter the Doctor MobileNO");
		long dmobileNo=sc.nextLong();
		System.out.println("Enter the Doctor Address");
		String daddress=sc.next();
		System.out.println("Enter the Doctor Blood Group");
		String dbloodGroup=sc.next();
		System.out.println("Enter the Doctor Specility");
		String speciality=sc.next();
		System.out.println("Enter the Doctor Medicine Allergy");
		String medicineAllergy=sc.next();
		
		
		
		Doctor d=new Doctor();
		d.setDoctorId(doctorId);
		d.setDname(dname);
		d.setDbirthdate(dbirthdate);
		d.setDgender(dgender);
		d.setDmobileNo(dmobileNo);
		d.setDaddress(daddress);
		d.setDbloodGroup(dbloodGroup);
		d.setSpeciality(speciality);
		d.setMedicineAllergy(medicineAllergy);
		
		new HospitalImplementationDao().updateDoctor(d);
	}
	
	public void deleteDoctor() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the Doctor id");
		String doctorId=sc.next();
		Doctor d=new Doctor();
		
		
		d.setDoctorId(doctorId);
		new HospitalImplementationDao().deleteDoctor(d);
	}
}
