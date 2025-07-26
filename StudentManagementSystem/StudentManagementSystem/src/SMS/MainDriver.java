package SMS;
import java.sql.Connection;
import java.sql.Statement;
public class MainDriver {
public static String addStdntDetails(Info obj) {
	Connection con =utility.getConnection();
	if(obj.getName().length()<5 && obj.getId()>999 || obj.getId()<100 && obj.getMobileNo().length()<10 && obj.getSub1()>100 && obj.getSub2()>100&& obj.getSub3()>100&& obj.getSub4()>100&& obj.getSub5()>100) {
		return "INVALID DATA";
	}
	try {
		Statement stmt=con.createStatement();
		String sql=String.format("insert into student values(%d,'%s','%s','%s',%d,%d,%d,%d,%d,%d,%.2f,'%s','%s')",obj.getId(),obj.getName(),obj.getMobileNo(),obj.getEmail(),obj.getSub1(),obj.getSub2(),obj.getSub3(),obj.getSub4(),obj.getSub5(),obj.getTotal(),obj.getPercentage(),obj.getGrade(),obj.getResult());
		stmt.executeUpdate(sql);
		return "SUCCESSFULLY INSERTED";
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	return "FAILED";
}
}