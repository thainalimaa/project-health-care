package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDatabase {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_health_care";
    private static String usuario = "root";
    private static String senha = "Tata727271";
    private static String drive = "com.mysql.jdbc.Driver";

    
    public static Connection obtemConexao() throws Exception {
        String url = String.format(
        "jdbc:mysql://%s:%s/%s", host, porta, db);
        return DriverManager.getConnection(
        url, usuario, senha);
    }
    
    public static Connection getConnection() throws Exception{
        Class.forName(drive);
            String url = String.format(
        "jdbc:mysql://%s:%s/%s", host, porta, db);
            return DriverManager.getConnection(url, usuario, senha);
    }
}
