package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Doctor;
import com.entity.Patient;


public class HospitalImplementationDao implements Hospitaldao
{

	@Override
	public List<Patient> viewPatient() throws ClassNotFoundException, SQLException {
		ArrayList<Patient>patientList=new ArrayList<Patient>();
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create the connection 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3303/7462new","root","root");
		
		//create the statement
		PreparedStatement statement =con.prepareStatement("select * from HospitalPatient");
		ResultSet rs=statement.executeQuery();//for show data result set are mandatory and the execute the query
		
		while(rs.next())
		{
			Patient p=new Patient();
			System.out.println("=============================Patient Data================");
			System.out.print((rs.getInt(1)));
			System.out.print("\t"+(rs.getString(2)));
			System.out.print("\t"+(rs.getString(3)));
			System.out.print("\t"+(rs.getString(4)));
			System.out.print("\t"+(rs.getLong(5)));
			System.out.print("\t"+(rs.getString(6)));
			System.out.print("\t"+(rs.getString(7)));
			System.out.print("\t"+(rs.getString(8)));
			System.out.print("\t"+(rs.getString(9)));
			System.out.print("\t"+(rs.getString(10)));
			System.out.println();
		
	}
		return patientList;
	}

	@Override
	public void insertNewPatient(Patient p) throws ClassNotFoundException, SQLException {
		int row;
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3303/7462new","root","root");
		PreparedStatement statement =con.prepareStatement("insert into HospitalPatient values(?,?,?,?,?,?,?,?,?,?)");
		statement.setInt(1, p.getPid());
		statement.setString(2, p.getName());
		statement.setString(3, p.getBirthdate());
		statement.setString(4,p.getGender());
		statement.setLong(5,p.getMobileNo());
		statement.setString(6,p.getAddress());
		statement.setString(7,p.getBloodGroup());
		statement.setString(8,p.getDiseases());
		statement.setString(9,p.getMedicineAllergy());
		statement.setString(10,p.getDoctorId());
		row=statement.executeUpdate();
		
	}


	@Override
	public void updatePatient(Patient p) throws ClassNotFoundException, SQLException {
		int row;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3303/7462new","root","root");
		PreparedStatement statement =con.prepareStatement("update HospitalPatient set Name=?,birthdate=?,gender=?,mobileNo=?,address=?,bloodGroup=?,diseases=?,medicineAllergy=?,doctorId=? where pid=?");
		statement.setInt(1, p.getPid());
		statement.setString(2, p.getName());
		statement.setString(3, p.getBirthdate());
		statement.setString(4, p.getGender());
		statement.setLong(5, p.getMobileNo());
		statement.setString(6, p.getAddress());
		statement.setString(7, p.getBloodGroup());
		statement.setString(8, p.getDiseases());
		statement.setString(9, p.getMedicineAllergy());
		statement.setString(10, p.getDoctorId());
		row=statement.executeUpdate();
		con.close();
	}

	@Override
	public void deletePatient(Patient p) throws ClassNotFoundException, SQLException {
		int row;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3303/7462new","root","root");
		PreparedStatement statement =con.prepareStatement("delete from HospitalPatient where pid=?");
		statement.setInt(1, p.getPid());
		row=statement.executeUpdate();
		
	}
	/*--------------------------------------------------------------------------------------*/
	
	@Override
	public List<Doctor> viewDoctor() throws ClassNotFoundException, SQLException {
		ArrayList<Doctor>DoctorList=new ArrayList<Doctor>();
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create the connection 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3303/7462new","root","root");
		
		//create the statement
		PreparedStatement statement =con.prepareStatement("select * from HospitalDoctor");
		ResultSet rs=statement.executeQuery();//for show data result set are mandatory and the execute the query
		
		while(rs.next())
		{
			Doctor d=new Doctor();
			System.out.print((rs.getString(1)));
			System.out.print("\t"+(rs.getString(2)));
			System.out.print("\t"+(rs.getString(3)));
			System.out.print("\t"+(rs.getString(4)));
			System.out.print("\t"+(rs.getLong(5)));
			System.out.print("\t"+(rs.getString(6)));
			System.out.print("\t"+(rs.getString(7)));
			System.out.print("\t"+(rs.getString(8)));
			System.out.print("\t"+(rs.getString(9)));
			System.out.println();
			DoctorList.add(d);
			
		
	}
		return DoctorList;
	}

	@Override
	public void insertNewDoctor(Doctor d) throws ClassNotFoundException, SQLException {
		int row;
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3303/7462new","root","root");
		PreparedStatement statement =con.prepareStatement("insert into HospitalDoctor values(?,?,?,?,?,?,?,?,?)");
		
		statement.setString(1, d.getDoctorId());
		statement.setString(2,d.getDname());
		statement.setString(3,d.getDbirthdate());
		statement.setString(4,d.getDgender());
		statement.setLong(5,d.getDmobileNo());
		statement.setString(6,d.getDaddress());
		statement.setString(7,d.getDbloodGroup());
		statement.setString(8,d.getSpeciality());
		statement.setString(9,d.getMedicineAllergy());
		row=statement.executeUpdate();
		
		
	}

	@Override
	public void updateDoctor(Doctor d) throws ClassNotFoundException, SQLException {
		int row;
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3303/7462new","root","root");
		PreparedStatement statement =con.prepareStatement("update HospitalDoctor set dname=?,dbirthdate=?,dgender=?,dmobileNo=?,daddress=?,dbloodGroup=?,speciality=?,medicineAllergy=? where doctorId=?");
		
		statement.setString(1, d.getDoctorId());
		statement.setString(2,d.getDname());
		statement.setString(3,d.getDbirthdate());
		statement.setString(4,d.getDgender());
		statement.setLong(5,d.getDmobileNo());
		statement.setString(6,d.getDaddress());
		statement.setString(7,d.getDbloodGroup());
		statement.setString(8,d.getSpeciality());
		statement.setString(9,d.getMedicineAllergy());
		row=statement.executeUpdate();
		
	}

	@Override
	public void deleteDoctor(Doctor d) throws ClassNotFoundException, SQLException {
		int row;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3303/7462new","root","root");
		PreparedStatement statement =con.prepareStatement("delete from HospitalDoctor where doctorId=?");
		statement.setString(1, d.getDoctorId());
		row=statement.executeUpdate();
		
		
	}

	

}
