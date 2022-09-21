package com.dao;
import java.sql.SQLException;
import java.util.List;

import com.entity.Doctor;
import com.entity.Patient;
public interface Hospitaldao
{
	public List<Patient> viewPatient() throws ClassNotFoundException, SQLException;
	public void insertNewPatient(Patient p) throws ClassNotFoundException, SQLException;
	public void updatePatient(Patient p) throws ClassNotFoundException, SQLException;
    public void deletePatient(Patient p) throws ClassNotFoundException, SQLException;
    
    public List<Doctor> viewDoctor() throws ClassNotFoundException, SQLException;
	public void insertNewDoctor(Doctor d) throws ClassNotFoundException, SQLException;
	public void updateDoctor(Doctor d) throws ClassNotFoundException, SQLException;
    public void deleteDoctor(Doctor d) throws ClassNotFoundException, SQLException;
}
