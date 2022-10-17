package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDEMO1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection

        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/730batch";
        Connection con = DriverManager.getConnection(url,username,password);

        // 3. creating statement
        Statement st = con.createStatement();

        // 4. executing query
        String sql = "insert into student values(2,'Sagar','Comp',88)";
        st.executeUpdate(sql);
    }
}
