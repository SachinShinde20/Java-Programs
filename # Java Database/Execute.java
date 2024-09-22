import java.sql.*;
import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Query: ");
        String query = sc.nextLine();

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root",
                        "Pass@123");
                Statement statement = connection.createStatement();) {
            boolean status = statement.execute(query);

            if (status) {
                // used to get compiled result set
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    int id = resultSet.getInt("emp_id");
                    String lastName = resultSet.getString("lastname");
                    String firstName = resultSet.getString("firstname");
                    int salary = resultSet.getInt("salary");

                    System.out.println(" ------------------------------- ");
                    System.out.println("Row No : " + resultSet.getRow());
                    System.out.println("Id : " + id);
                    System.out.println("Name : " + firstName + " " + lastName);
                    System.out.println("Salary : " + salary);
                }
            } else {
                // If the query is an update/insert/delete (e.g., UPDATE, INSERT, DELETE)
                int updateCount = statement.getUpdateCount();
                System.out.println("Rows affected: " + updateCount);
            }
            sc.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
