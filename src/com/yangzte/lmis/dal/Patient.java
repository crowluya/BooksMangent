package com.yangzte.lmis.dal;
import java.util.*;


public class Patient {

	   private String PatientName;     //病人姓名
	   private String admID;           //住院ID
	   private String BedNo;           //病床号
	   private String MCType;          //医保类型
	   private  Date admTime;          //入院时间
	   private  Date DisadmTime;       //出院时间
	   
	   //无参构造函数
	   public Patient( ) {
		   
	   }
	   //构造函数
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
	   
	   //getter 和  setter
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
		
 	return "姓名" + PatientName + "住院号" + admID +"病床号" + BedNo
				            + "医保类型"+ MCType + "入院时间"+ admTime +"出院时间" + DisadmTime;
		
	}
	   
	   
	

	   
	   
	   

	
}
