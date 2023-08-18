import java.sql.DriverManager;

public class Connection {

    java.sql.Connection connection;
    void Crate_conn(){
        try {
            String user = "root";
            String password = "Shanmol@78";

            String url = "jdbc:mysql://localhost:3306/JDBC_Demo";

            connection = DriverManager.getConnection(url, user, password);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    void Close_conn(){
        try {
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
