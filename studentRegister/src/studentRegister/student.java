package studentRegister;

public class student {
	public student(String name, String branch, int year, int rollnumber) {
		super();
		this.name = name;
		this.branch = branch;
		this.year = year;
		this.rollnumber = rollnumber;
	}
	private String name;
	private String branch;
	private int year;
	private int rollnumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

}
