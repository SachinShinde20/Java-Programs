import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Insert {
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String user = "root";
    private static final String pass = "Pass";
    // Query
    private static String query = "INSERT INTO Student (id, name, coursea) VALUES (8, 'Manav Bhatt', 'Mathematics');";

    public static void main(String[] args) {
        try {
            // Connection Establishment
            Connection connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Successful");

            // Statement
            Statement statement = connection.createStatement();
            System.out.println("Statement Created successfully");

            // result
            // int noOfRowsAffected = statement.executeUpdate("INSERT INTO Student (id,
            // name, coursea) VALUES (8, 'Manav Bhatt', 'Mathematics');");
            int noOfRowsAffected = statement.executeUpdate(query);
            System.out.println("Record Inserted, " + noOfRowsAffected + " row affected");

            // Closing the resources
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
