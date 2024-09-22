 Introduction to JDBC

Java Database Connectivity (JDBC) is an API that enables Java applications to interact with databases. It provides methods to query and update data in a database and is part of the Java Standard Edition platform.

 Table of Contents

1. [Types of JDBC Drivers](types-of-jdbc-drivers)
2. [DriverManager](drivermanager)
3. [Connection](connection)
4. [Statement](statement)
5. [ResultSet](resultset)
6. [SQLException](sqlexception)

7. [Types of Statements in JDBC](types-of-statements-in-jdbc)
8. [Methods to Execute SQL Queries](methods-to-execute-sql-queries)







 Types of JDBC Drivers

JDBC drivers are client-side adapters that convert Java requests to database protocols. There are four types of JDBC drivers:

 1. Type-1 Driver (JDBC-ODBC Bridge Driver)
- Description: Converts JDBC method calls into ODBC function calls using an ODBC driver to connect to the database.
- Advantages: Built-in with JDK, database-independent.
- Disadvantages: Not secure, requires ODBC driver installation on client machines, not portable.
- Example: `sun.jdbc.odbc.JdbcOdbcDriver` (removed in Java 8).

 2. Type-2 Driver (Native-API Driver)
- Description: Uses client-side libraries of the database to convert JDBC method calls into native calls of the database API.
- Advantages: Better performance than Type-1.
- Disadvantages: Requires database-specific client libraries on client machines, not portable.
- Example: Oracle OCI driver.

 3. Type-3 Driver (Network Protocol Driver)
- Description: Uses a middle-tier server to convert JDBC calls into the database-specific protocol. The client connects to the middleware server, which then connects to the database.
- Advantages: No client-side library required, can connect to multiple databases.
- Disadvantages: Requires middleware server, can be slower due to additional network calls.
- Example: IBM WebSphere.

 4. Type-4 Driver (Thin Driver)
- Description: Pure Java driver that converts JDBC calls directly into the database-specific protocol.
- Advantages: Platform-independent, no client-side library required, best performance.
- Disadvantages: Database-specific, requires database-specific driver.
- Example: `com.mysql.cj.jdbc.Driver` for MySQL.




 DriverManager

`DriverManager` is a class in the `java.sql` package that manages a list of database drivers. It serves as an interface between the user and the drivers.

 Key Functions
1. Loading Drivers: Automatically loads drivers present in the classpath in JDBC 4.0 and later.
2. Establishing Connections: Attempts to establish a connection to the database using the appropriate driver.
3. Managing Drivers: Maintains a list of driver classes registered using the `DriverManager.registerDriver()` method.

 Example
```java
// Registering the driver is optional in JDBC 4.0 and later
Class.forName("com.mysql.cj.jdbc.Driver");
// Establishing a connection
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
```



 Connection

`Connection` is an interface in the `java.sql` package representing a connection to a specific database.

 Methods Provided
- Creating Statements: To execute SQL queries.
- Managing Transactions: To commit or rollback transactions.
- Closing Connections: To close the connection and release resources.

 Example
```java
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
// Creating a statement
Statement stmt = con.createStatement();
// Closing the connection
con.close();
```



 Statement

`Statement` is an interface in the `java.sql` package used to execute SQL queries against the database.

 Types of Statements
1. Statement: Executes simple SQL queries without parameters.
2. PreparedStatement: Executes precompiled SQL queries with parameters.
3. CallableStatement: Executes stored procedures.

 Example
```java
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
while (rs.next()) {
    System.out.println(rs.getString("column_name"));
}
```




 ResultSet

`ResultSet` is an interface that represents the result set of a query, acting as a cursor to navigate through the retrieved data.

 Key Features
- Navigating Rows: Methods like `next()`, `previous()`, `first()`, and `last()` to navigate through rows.
- Retrieving Data: Methods like `getString()`, `getInt()`, `getDouble()`, etc., to retrieve data from columns.

 Example
```java
ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
while (rs.next()) {
    System.out.println(rs.getString("column_name"));
}
// Closing the ResultSet
rs.close();
```



 SQLException

`SQLException` is an exception that provides information on database access errors.

 Methods to Retrieve Information
- SQLState: A string indicating the SQL state.
- Error Code: An integer specific to each vendor.
- Message: A description of the error.

 Example
```java
try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
} catch (SQLException e) {
    System.err.println("SQLState: " + e.getSQLState());
    System.err.println("Error Code: " + e.getErrorCode());
    System.err.println("Message: " + e.getMessage());
}
```






 Types of Statements in JDBC

1. Statement: Executes simple SQL queries without parameters.
   - Example: `SELECT * FROM mytable`
2. PreparedStatement: Executes precompiled SQL queries with parameters, more efficient, helps prevent SQL injection.
   - Example: `SELECT * FROM mytable WHERE id = ?`
3. CallableStatement: Executes stored procedures in the database, can accept input and output parameters.

 Methods to Execute SQL Queries

1. `executeQuery()`
   - Purpose: Executes SQL statements returning a single `ResultSet`, typically `SELECT` queries.
   - Return Type: `ResultSet`

2. `executeUpdate()`
   - Purpose: Executes SQL statements that modify the database (e.g., `INSERT`, `UPDATE`, `DELETE`). Returns the number of rows affected.
   - Return Type: `int`

3. `execute()`
   - Purpose: Executes any SQL statement. Returns a boolean indicating whether the result is a `ResultSet` (true) or an update count (false).
   - Return Type: `boolean`







 ------------------------------------------- Result Set -------------------------------------------

 * ResultSet Type:
 * 
 * Forward-Only ResultSet (Default)
 * - Cursor Movement: The cursor can only move forward, one row at a time.
 * - internal working: Statement statement =
 * connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,
 * ResultSet.CONCUR_READ_ONLY);
 * 
 * Bi-Directional ResultSet
 * - Cursor Movement: The cursor can move both forward and backward.


 
 * (Forward-Only ResultSet):
 * ResultSet.TYPE_FORWARD_ONLY: The cursor can only move forward.
 * 
 * 
 * (Bi-Directional ResultSet):
 * ResultSet.TYPE_SCROLL_INSENSITIVE:
 * - Behavior: If someone else changes the data in the database after you have
 * created the ResultSet, you won’t see those changes.
 * The data you see remains the same as when the ResultSet was created.
 * 
 * ResultSet.TYPE_SCROLL_SENSITIVE: Behavior:
 * - If someone else changes the data in the database after you have created the
 * ResultSet, you will see those changes.
 * The data you see can update to reflect the current state of the database.




 * Concurrency Mode:
 * (Forward-Only ResultSet and Bi-Directional ResultSet):
 * ResultSet.CONCUR_READ_ONLY: You can only read the data; you cannot update it.
 * 
 * (Bi-Directional ResultSet):
 * ResultSet.CONCUR_UPDATABLE: You can read and update the data.