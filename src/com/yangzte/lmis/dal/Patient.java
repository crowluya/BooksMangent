package com.yangzte.lmis.dal;
import java.util.*;


public class Patient {

	   private String PatientName;     //��������
	   private String admID;           //סԺID
	   private String BedNo;           //������
	   private String MCType;          //ҽ������
	   private  Date admTime;          //��Ժʱ��
	   private  Date DisadmTime;       //��Ժʱ��
	   
	   //�޲ι��캯��
	   public Patient( ) {
		   
	   }
	   //���캯��
	   public Patient ( String PatientName, String admID, String BedNo, 
			            String MCType, Date admTime, Date DisadmTime)
	   {
		   this.PatientName =  PatientName;
		   this.admID = admID;
		   this.BedNo = BedNo;
		   this.MCType = MCType;
		   this.admTime = admTime;
		   this.DisadmTime = DisadmTime;
	   }
	   
	   //getter ��  setter
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public String getAdmID() {
		return admID;
	}
	public void setAdmID(String admID) {
		this.admID = admID;
	}
	public String getBedNo() {
		return BedNo;
	}
	public void setBedNo(String bedNo) {
		BedNo = bedNo;
	}
	public String getMCType() {
		return MCType;
	}
	public void setMCType(String mCType) {
		MCType = mCType;
	}
	public Date getAdmTime() {
		return admTime;
	}
	public void setAdmTime(Date admTime) {
		this.admTime = admTime;
	}
	public Date getDisadmTime() {
		return DisadmTime;
	}
	public void setDisadmTime(Date disadmTime) {
		DisadmTime = disadmTime;
	}
	   
	public  String  getInfo()	{
		
 	return "����" + PatientName + "סԺ��" + admID +"������" + BedNo
				            + "ҽ������"+ MCType + "��Ժʱ��"+ admTime +"��Ժʱ��" + DisadmTime;
		
	}
	   
	   
	

	   
	   
	   

	
}
