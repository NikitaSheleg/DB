import java.sql.*;
public class DB {


    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop?serverTimezone=Europe/Minsk&useSSL=false","root","eNOT$1172$");

        String query = "select * from shop.seller s where s.Rating>49.5 and s.Status = 'high'";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            String seller = rs.getString("idSeller");
            Float rating = rs.getFloat("Rating");
            String status = rs.getString("Status");
            System.out.printf("У продавца %s рейтинг %s и статус %s ", seller, rating, status);
        }
        statement.close();
    }
}





