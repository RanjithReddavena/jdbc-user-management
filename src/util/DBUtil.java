package util;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/ranjith";
    private static final String USER = "root";
    private static final String PASSWORD = "Ranjith12370$$";
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}