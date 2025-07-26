package SMS;
import java.util.*;
import SMS.Info;
import SMS.MainDriver;
public class Inputs {

	public static void main(String[] args) {
		int subjects=5,defMarks=500;
		Info i=new Info();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Student ID");
		int Id=s.nextInt();
		i.setId(Id);
		System.out.println("Enter name of student");
		String name=s.next();
		i.setName(name);
		s.nextLine();
		System.out.println("Enter mobile number");
		String mobileNumber=s.nextLine();
		i.setMobileNo(mobileNumber);
		System.out.println("Enter Email ID");
		String Email=s.nextLine();
		i.setEmail(Email);
		System.out.println("Enter the marks in sub1");
		int sub1=s.nextInt();
		i.setSub1(sub1);
				System.out.println("Enter the marks in sub2");
		int sub2=s.nextInt();
		i.setSub2(sub2);
			System.out.println("Enter the marks in sub3");
		int sub3=s.nextInt();	
		i.setSub3(sub3);
				System.out.println("Enter the marks in sub4");
		int sub4=s.nextInt();
		i.setSub4(sub4);
				System.out.println("Enter the marks in sub5");
		int sub5=s.nextInt();
		i.setSub5(sub5);
		System.out.println(MainDriver.addStdntDetails(i));
		int totalMarks=sub1+sub2+sub3+sub4+sub5;
		double percentage=((double)totalMarks/defMarks)*100;
		System.out.println("Total marks= "+totalMarks);
		System.out.printf("percentage= %.2f\n",percentage);
		if(percentage>75)
			System.out.println("A grade");
		if(percentage<75&&percentage>50)
			System.out.println("B grade");
		if(percentage<50&&percentage>35)
			System.out.println("C grade");
		if(percentage<35)
			System.out.println("D grade");
	}

}
