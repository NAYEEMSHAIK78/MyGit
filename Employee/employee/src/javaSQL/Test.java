package javaSQL;
import javaSQL.Emp;
import javaSQL.MainDriver;
public class Test {

	public static void main(String[] args) {
		Emp e=new Emp();
		e.setId(111);
		e.setName("Nayeem");
		e.setSalary(10000.0);
		System.out.println(MainDriver.updateEmpDetails(111,"nayeem"));
	}

}
