package StreamApi;

public class Students {

	private String sName;
	private String sClass;
	private int sAge;
	private int rollNumber;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(String sName,String sClass ,int sAge, int rollNumber) {
		super();
		this.sName = sName;
		this.sAge = sAge;
		this.rollNumber = rollNumber;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getsClass() {
		return sClass;
	}
	
	public void  setsClass() {
		this.sClass=sClass;
	}

	@Override
	public String toString() {
		return "Students [sName=" + sName + ", sClass=" + sClass + ", sAge=" + sAge + ", rollNumber=" + rollNumber
				+ "]";
	}
	
	
}
