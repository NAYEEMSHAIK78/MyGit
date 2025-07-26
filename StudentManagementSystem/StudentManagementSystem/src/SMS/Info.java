package SMS;

public class Info {
	private int Id;
	private String name;
	private String mobileNo;
	private String email;
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private int sub5;
	public int total;
	public double percentage;
	public String grade;
	public String result;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getSub4() {
		return sub4;
	}
	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}
	public int getSub5() {
		return sub5;
	}
	public void setSub5(int sub5) {
		this.sub5 = sub5;
	}
	public int getTotal() {
		return sub1+sub2+sub3+sub4+sub5;
	}
	public double getPercentage() {
		return ((double)getTotal()/500)*100;
	}
	public String getGrade() {
		double perc=getPercentage();
		if(perc>75)
			return "A";
		if(perc<75&&perc>50)
			return "B";
		if(perc<50&&perc>35)
			return "C";
		if(perc<35)
			return "D";
		return "E";
	}
	public String getResult() {
		if(getPercentage()>35){
			return "Pass";
		}
		else {
			return "Fail";
		}
	}
	}
