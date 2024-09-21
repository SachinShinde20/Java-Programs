import java.sql.*;
import java.util.Scanner;

public class empDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/demo";
    private static final String USER = "root";
    private static final String PASS = "Pass@123";

    private static Scanner sc;

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    private static PreparedStatement preparedStatement;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
/* -------------------------------------------- *
        Employee emp = new Employee();

        System.out.print("Enter emp id: ");
        emp.setId(sc.nextInt());
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter emp Firstname: ");
        emp.setFirstName(sc.nextLine());

        System.out.print("Enter emp Lastname: ");
        emp.setLastName(sc.nextLine());

        System.out.print("Enter emp Salary: ");
        emp.setSalary(sc.nextInt());
        sc.nextLine(); // Consume the newline character
        sc.close();
       * ---------------------------------------------- */

        /*
         * ---------------------------
         * Database Part
         * ----------------------------
         */
        try {
            // Connection Established
            connection = getConnectionFromDB();
            System.out.println("\nConnection Established Successfully...");

            // Inserting Records
//            insertRecord(emp);

            // Showing records
            showRecords();

            // Deleting employee by id
//            deleteRecordById();

            // Updating employee by id
//            updateRecordById();

        } catch (SQLException e) {
            System.out.println("Something error Occurred");
            System.out.println(e);
        } finally {
            // Closing the Resources
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
                System.out.println("\nAll Connections Are Closed Successfully...");
            } catch (SQLException e) {
                System.out.println("Error closing resources");
                e.fillInStackTrace();
            }
        }
    }

    /*
     * ---------------------------
     * Database Methods
     * ----------------------------
     */
    // Connection Method
    private static Connection getConnectionFromDB() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // Showing Records
    private static void showRecords() throws SQLException {
        statement = connection.createStatement();

        String query = "Select * from emp";
        resultSet = statement.executeQuery(query);

        System.out.println("\nStatement and ResultSet are Created Successfully for Displaying the Data...");
        System.out.println("\nData:");

        boolean hasRecords = false; // Flag to check if any records are found
        while (resultSet.next()) {
            hasRecords = true; // Set flag to true if a record is found
            System.out.println("----------------------------------");
            System.out.println("id: " + resultSet.getInt("emp_id"));
            System.out.print("Name: " + resultSet.getString("firstname"));
            System.out.println(" " + resultSet.getString("lastname"));
            System.out.println("Salary: " + resultSet.getInt("salary"));
        }
        if (!hasRecords) {
            System.out.println("Table is Empty");
        }
    }

    // Inserting Records
    private static void insertRecord(Employee emp) throws SQLException {
        preparedStatement = connection
                .prepareStatement("INSERT INTO EMP (emp_id, lastname, firstname, salary) values (?, ?, ?, ?);");
        preparedStatement.setInt(1, emp.getId());
        preparedStatement.setString(2, emp.getLastName());
        preparedStatement.setString(3, emp.getFirstName());
        preparedStatement.setInt(4, emp.getSalary());

        int noOfRowsAffected = preparedStatement.executeUpdate();

        if (noOfRowsAffected > 0) {
            System.out.println(
                    "\nData Entered Successfully with successful execution of prepared statement and executeUpdate...");
        } else {
            System.out.println("\nInsert Query does not executed");
        }
    }

    // Deleting Record By id
    private static void deleteRecordById() throws SQLException {
        System.out.print("Enter id of Employee which you want to Delete: ");
        int empId = sc.nextInt();

        preparedStatement = connection
                .prepareStatement("DELETE FROM emp WHERE emp_id = ?;");
        preparedStatement.setInt(1, empId);

        int noOfRowsAffected = preparedStatement.executeUpdate();

        if (noOfRowsAffected > 0) {
            System.out.println(
                    "\nData Deleted Successfully with successful execution of prepared statement and executeUpdate...");
        } else {
            System.out.println("\nDelete Query did not execute. No record found with the given id.");
        }
    }

    // Update Record by Id
    private static void updateRecordById() throws SQLException {
        System.out.print("Enter id of Employee which you want to Update: ");
        int oldEmpId = sc.nextInt();

        System.out.print("Enter emp id: ");
        int emp_Id = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter emp Firstname: ");
        String emp_firstname = sc.nextLine();

        System.out.print("Enter emp Lastname: ");
        String emp_lastname = sc.nextLine();

        System.out.print("Enter emp Salary: ");
        int emp_salary = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        preparedStatement = connection
                .prepareStatement(
                        "UPDATE emp SET emp_id = ?, firstname = ?, lastname = ?, salary = ? WHERE emp_id = ?;");
        preparedStatement.setInt(1, emp_Id);
        preparedStatement.setString(2, emp_firstname);
        preparedStatement.setString(3, emp_lastname);
        preparedStatement.setInt(4, emp_salary);
        preparedStatement.setInt(5, oldEmpId);

        int noOfRowsAffected = preparedStatement.executeUpdate();

        if (noOfRowsAffected > 0) {
            System.out.println(
                    "\nData Updated Successfully with successful execution of prepared statement and executeUpdate...");
        } else {
            System.out.println("\nUpdate Query did not execute. No record found with the given id.");
        }
    }
}
