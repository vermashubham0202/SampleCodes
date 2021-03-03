package serialization.deserialization;

public class Student {
	private int rollNo;
	private String sName;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sName=" + sName + "]";
	}
	
}