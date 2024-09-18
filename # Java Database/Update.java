import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Update {
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String user = "root";
    private static final String pass = "Pass";
    // Query
    private static String query = "UPDATE Student SET name = 'Carol White', coursea = 'Electric' WHERE name = 'Carol Blue';";

    public static void main(String[] args) {
        try {
            // Connection Establishment
            Connection connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Successful");

            // Statement
            Statement statement = connection.createStatement();
            System.out.println("Statement Created successfully");

            // result
            // int noOfRowsAffected = statement.executeUpdate( "UPDATE Student SET name =
            // 'Carol Green', coursea = 'Environment' WHERE name = 'Carol White';");
            int noOfRowsAffected = statement.executeUpdate(query);
            if (noOfRowsAffected > 0) {
                System.out.println("Record Updated, " + noOfRowsAffected + " row affected");
            } else {
                System.out.println("Query does not executed");
            }

            // Closing the resources
            statement.close();
            connection.close();
            System.out.println("Closed the Resources");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
