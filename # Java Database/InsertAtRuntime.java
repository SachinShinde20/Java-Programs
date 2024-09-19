import java.sql.*;
import java.util.Scanner;

public class InsertAtRuntime {
    private static final String url = "jdbc:mysql://localhost:3306/demo";
    private static final String user = "root";
    private static final String pass = "Pass@123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        try {
            // Get Connection
            Connection connection = DriverManager.getConnection(url, user, pass);
            System.out.println("\nConnection established successfully");

            // PreparedStatement - value passed at runtime.
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Student (id, name, coursea) VALUES (?, ?, ?);");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, course);

            // Query execution
            int noOfRowsAffected = preparedStatement.executeUpdate();
            // Checking if query is executed properly or not
            if (noOfRowsAffected > 0) {
                System.out.println("Record Inserted, " + noOfRowsAffected + " row affected");
            } else {
                System.out.println("Query did not execute");
            }

            // Closing the resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
