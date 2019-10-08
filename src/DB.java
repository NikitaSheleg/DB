import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
    private Connection connection=null;
    Statement statement =null;
    ResultSet resultSet =null;
    public void b() {
        try{
            Class.forName("com.mysql.jdbs.Driver");
            connection= DriverManager.getConnection("");

            statement=connection.createStatement();


            resultSet = statement.executeQuery("");
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
