import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ResultSetOperations {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "Pass@123";

        try (
                Connection connection = DriverManager.getConnection(url, user, pass);
                // Internal working of "Statement statement = connection.createStatement();"
                Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                        ResultSet.CONCUR_READ_ONLY);
                ResultSet resultSet = statement.executeQuery("SELECT * FROM emp;");) {

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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}