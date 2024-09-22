import java.sql.*;

public class BiDirectionalResultSet {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "Pass@123";

        try (
                Connection connection = DriverManager.getConnection(url, user, pass);
                // Bi-Directional Result Set
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                ResultSet resultSet = statement.executeQuery("SELECT * FROM emp;");
                )
        {
            // Get the no of row at which pointer is
            System.out.println("Row No. : " + resultSet.getRow());

            // Goes to first record
            resultSet.next();

            // Jump to record
            // resultSet.absolute(5);
            // System.out.println("Row No. : "+resultSet.getRow());

            // goes to previous record (Current row - 1)
            // resultSet.previous();

            // Goes to last and first
            // resultSet.last();
            // resultSet.first();

            int id = resultSet.getInt("emp_id");
            String lastName = resultSet.getString("lastname");
            String firstName = resultSet.getString("firstname");
            int salary = resultSet.getInt("salary");

            System.out.println(" ------------------------------- ");
            System.out.println("Row No : " + resultSet.getRow());
            System.out.println("Id : " + id);
            System.out.println("Name : " + firstName + " " + lastName);
            System.out.println("Salary : " + salary);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
