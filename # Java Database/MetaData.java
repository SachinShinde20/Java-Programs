import java.sql.*;

public class MetaData {
    public static void main(String[] args) {

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root",
                        "Pass@123");) {
            // DataBase MetaData
            System.out.println("\nDatabase Metadata: ");
            DatabaseMetaData metaData = connection.getMetaData();

            System.out.println("Driver: " + metaData.getDriverName());
            System.out.println("Driver Version: " + metaData.getDriverVersion());
            System.out.println("User: " + metaData.getUserName());
            System.out.println("Database Product name: " + metaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + metaData.getDatabaseProductVersion());
            System.out.println("Support Transaction? " + metaData.supportsTransactions());
            System.out.println("Support Batch Update? " + metaData.supportsBatchUpdates());
            System.out.println("Catalog: " + metaData.getCatalogs());

            // Resultset Metadata
            System.out.println("\nResultset Metadata: ");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM emp;");
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            System.out.println("Column Count: " + resultSetMetaData.getColumnCount());

            for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
                System.out.println("-----------------------------------------------");
                System.out.println("Table Name: " + resultSetMetaData.getTableName(i));
                System.out.println("Column Names: " + resultSetMetaData.getColumnName(i));
                System.out.println("Column Data Type: " + resultSetMetaData.getColumnTypeName(i));
                System.out.println("Column Size: " + resultSetMetaData.getColumnDisplaySize(i));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}