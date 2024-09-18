import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
                String url = "jdbc:mysql://localhost:3306/";
                String user = "root";
                String pass = "Pass";

                // Query
                String query = "SELECT * FROM Student";

                // Load The Drivers (Not Necessary since JDBC 4.0 and later)
                // Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish The Connection
                Connection con = DriverManager.getConnection(url, user, pass);
                System.out.println("Connection Establishment Successfully...");

                // Statement
                Statement stme = con.createStatement();

                // ResultSet
                ResultSet rs = stme.executeQuery(query);

                while (rs.next()) {
                        int id = rs.getInt("id");
                        String name = rs.getString("name");
                        String course = rs.getString("coursea");

                        System.out.println("\n==========================================");
                        System.out.println(" id: " + id);
                        System.out.println(" Name: " + name);
                        System.out.println(" Course: " + course);
                }
                System.out.println("\n==========================================");

                // close
                rs.close();
                stme.close();
                con.close();
                System.out.println("All Resources Closed Successfully.");
        }
}
