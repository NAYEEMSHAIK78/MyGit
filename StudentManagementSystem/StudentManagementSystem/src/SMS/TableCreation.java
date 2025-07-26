package SMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreation {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/students";
        String uname = "root";
        String pass = "Nay@9494";

        Connection con = DriverManager.getConnection(url, uname, pass);

        String sql = "CREATE TABLE student1 ("
                + "SID INT, "
                + "NAME VARCHAR(100), "
                + "MobileNumber VARCHAR(15), "
                + "EmailID VARCHAR(100), "
                + "SUB1 INT, "
                + "SUB2 INT, "
                + "SUB3 INT, "
                + "SUB4 INT, "
                + "SUB5 INT, "
                + ")";

        Statement stmt = con.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Table created");
        con.close();
    }
}
