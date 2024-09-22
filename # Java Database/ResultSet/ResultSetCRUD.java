import java.sql.*;

public class ResultSetCRUD {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "Pass@123";

        try (
                Connection connection = DriverManager.getConnection(url, user, pass);
                // Bi-Directional Result Set
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                ResultSet resultSet = statement.executeQuery("SELECT * FROM emp;");) {
            // Jump to record
            resultSet.absolute(5);
            System.out.println("Row No. : " + resultSet.getRow());

            int id = resultSet.getInt("emp_id");
            String lastName = resultSet.getString("lastname");
            String firstName = resultSet.getString("firstname");
            int salary = resultSet.getInt("salary");

            System.out.println(" ------------------------------- ");
            System.out.println("Row No : " + resultSet.getRow());
            System.out.println("Id : " + id);
            System.out.println("Name : " + firstName + " " + lastName);
            System.out.println("Salary : " + salary);

            /*
             * // Updating the Record
             * resultSet.updateString("lastname", "Gujarati");
             * resultSet.updateString("firstname","Rahul");
             * resultSet.updateString("salary","350000");
             * // Update the record
             * resultSet.updateRow();
             * System.out.println("\nRecord Updated\n");
             */

            /*
             * // Insert Record
             * resultSet.moveToInsertRow();
             * resultSet.updateInt("emp_id",501);
             * resultSet.updateString("lastname", "Patil");
             * resultSet.updateString("firstname","Jotiba");
             * resultSet.updateString("salary","35000");
             * // inset the record
             * resultSet.insertRow();
             * System.out.println("\nNew Record Inserted\n");
             */

            /*
             * // Delete Record
             * resultSet.deleteRow();
             * System.out.println("\nRow Deleted\n");
             */
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
