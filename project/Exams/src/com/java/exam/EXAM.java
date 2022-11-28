package com.java.exam;

public class EXAM {
   
	private  String ExamId ;
	private  String Name ;
	private  Integer prN ;
	
	
	public EXAM() {
		// TODO Auto-generated constructor stub
		
		this.ExamId=null;
		this.Name=null;
		this.prN=0;
		
	}
	public EXAM(String id,String name, int prn) {
		// TODO Auto-generated constructor stub
		
		this.ExamId=id;
		this.Name=name;
		this.prN=0;
		
	}
	
	public void setExamId(String examId) {
		ExamId = examId;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setPrN(Integer prN) {
		this.prN = prN;
	}
	public String getExamId() {
		return ExamId;
	}
    public Integer getPrN() {
		return prN;
	}
    public String getName() {
		return Name;
	}
	
	
	
	
	@Override
	public String toString() {
		return "EXAM [ExamId=" + ExamId + ", Name=" + Name + ", prN=" + prN + "]";
	}
	
	
	
	
}
