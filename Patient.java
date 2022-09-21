package com.entity;

public class Patient
{
	private int pid;
	private String name;
	private String birthdate;
	private String gender;
	private long mobileNo;
	private String address;
	private String bloodGroup;
	private String diseases;
	private String medicineAllergy;	
	private String doctorId;
	public Patient()
	{
		
	}
	public Patient(int pid, String name, String birthdate, String gender, long mobileNo, String address,
			String bloodGroup, String diseases, String medicineAllergy, String doctorId) {
		super();
		this.pid = pid;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.diseases = diseases;
		this.medicineAllergy = medicineAllergy;
		this.doctorId = doctorId;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int i) {
		this.pid = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	public String getMedicineAllergy() {
		return medicineAllergy;
	}
	public void setMedicineAllergy(String medicineAllergy) {
		this.medicineAllergy = medicineAllergy;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", name=" + name + ", birthdate=" + birthdate + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + ", address=" + address + ", bloodGroup=" + bloodGroup + ", diseases="
				+ diseases + ", medicineAllergy=" + medicineAllergy + ", doctorId=" + doctorId + "]";
	}
	
	
}
