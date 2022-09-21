package com.entity;

public class Doctor
{
	private String doctorId;
	private String dname;
	private String dbirthdate;
	private String dgender;
	private long dmobileNo;
	private String daddress;
	private String dbloodGroup;
	private String speciality;
	private String medicineAllergy;	
	
	public Doctor()
	{
		
	}

	public Doctor(String doctorId, String dname, String dbirthdate, String dgender, long dmobileNo, String daddress,
			String dbloodGroup, String speciality, String medicineAllergy) {
		super();
		this.doctorId = doctorId;
		this.dname = dname;
		this.dbirthdate = dbirthdate;
		this.dgender = dgender;
		this.dmobileNo = dmobileNo;
		this.daddress = daddress;
		this.dbloodGroup = dbloodGroup;
		this.speciality = speciality;
		this.medicineAllergy = medicineAllergy;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDbirthdate() {
		return dbirthdate;
	}

	public void setDbirthdate(String dbirthdate) {
		this.dbirthdate = dbirthdate;
	}

	public String getDgender() {
		return dgender;
	}

	public void setDgender(String dgender) {
		this.dgender = dgender;
	}

	public long getDmobileNo() {
		return dmobileNo;
	}

	public void setDmobileNo(long dmobileNo) {
		this.dmobileNo = dmobileNo;
	}

	public String getDaddress() {
		return daddress;
	}

	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}

	public String getDbloodGroup() {
		return dbloodGroup;
	}

	public void setDbloodGroup(String dbloodGroup) {
		this.dbloodGroup = dbloodGroup;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getMedicineAllergy() {
		return medicineAllergy;
	}

	public void setMedicineAllergy(String medicineAllergy) {
		this.medicineAllergy = medicineAllergy;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", dname=" + dname + ", dbirthdate=" + dbirthdate + ", dgender="
				+ dgender + ", dmobileNo=" + dmobileNo + ", daddress=" + daddress + ", dbloodGroup=" + dbloodGroup
				+ ", speciality=" + speciality + ", medicineAllergy=" + medicineAllergy + "]";
	}

	
	
}
