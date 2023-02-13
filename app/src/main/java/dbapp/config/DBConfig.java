package dbapp.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/metadb", "root", "1234");
            System.out.println("DB연결성공");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        DBConfig.getConnection();
    }
}
