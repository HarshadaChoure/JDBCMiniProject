package com.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.service.HospitalService;

public class HospitalMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.println("---------Welcome to Hospital Management System---------");
		System.out.println("1.View Patient Data");
		System.out.println("2.Insert Patient Data");
		System.out.println("3.Update Patient Data");
		System.out.println("4.Delete Patient data");
		System.out.println("5.View Doctor Data");
		System.out.println("6.Insert Doctor Data");
		System.out.println("7.Update Doctor Data");
		System.out.println("8.Delete Doctor data");
		do
		{
		System.out.println("Enter the choice");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("---Patient Details---");
			new HospitalService().view();
			break;
		case 2:
			System.out.println("--- Insert Patient Details---");
			new HospitalService().insertPatient();
			break;
		case 3:
			System.out.println("---Update Patient Details---");
			new HospitalService().updatePatient();
			break;
		case 4:
			System.out.println("---Delete Patient Details---");
			new HospitalService().deletePatient();
			break;
		case 5:
			System.out.println("---Doctor Details---");
			new HospitalService().viewD();
			break;
		case 6:
			System.out.println("--- Insert Doctor Details---");
			new HospitalService().insertDoctor();
			break;
		case 7:
			System.out.println("---Update Doctor Details---");
			new HospitalService().updateDoctor();
			break;
		case 8:
			System.out.println("---Delete Doctor Details---");
			new HospitalService().deleteDoctor();
			break;
		}
		
		System.out.println("Do you want to continue");
           a=sc.next();
	}
	while(a.equals("y"));
	}

	}


