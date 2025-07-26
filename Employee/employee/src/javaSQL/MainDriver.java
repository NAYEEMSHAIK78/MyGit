package javaSQL;
import java.sql.Connection;
import java.sql.Statement;
public class MainDriver {
public static String addEmpDetails(Emp obj) {
	Connection con =DBUtil.getConnection();
	if(obj.getName().length()<5) {
		return "PLS CHECK LENGTH OF NAME";
	}
	try {
		Statement stmt=con.createStatement();
		String sql=String.format("insert into emp values(%d,'%s',%.2f)",obj.getId(),obj.getName().toUpperCase(),obj.getSalary());
		stmt.executeUpdate(sql);
		return "SUCCESS";
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	return "FAILED";
}
public static String updateEmpDetails(int id,String name) {
	Connection con =DBUtil.getConnection();
	try {
		Statement stmt=con.createStatement();
		String sql=String.format("update emp set name='%s' where id=%d",name,id);
		stmt.executeUpdate(sql);
		return "NAME UPDATED";
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	return "NAME NOT UPDATED";
}

}