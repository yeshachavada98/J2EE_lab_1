import java.sql.*;
public class AccessJdbcExample
{
public static void main(String[] args)
{
Connection conn = null;
Statement stmt = null;
String url = "jdbc:ucanaccess://E:/company.accdb";
try
{
// Register JDBC driver
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
conn = DriverManager.getConnection(url);
// Execute a query
System.out.println("Creating statement...");
stmt = conn.createStatement();
String sql = "SELECT * FROM emp  where empno> 2";
ResultSet rs = stmt.executeQuery(sql);
// Extract data from result set
while (rs.next())
{

// Retrieve by column name
String fnm = rs.getString(2);
String lnm = rs.getString(3);
// Display values
System.out.println(" fName: " + fnm);
System.out.println(" LName: " + lnm);
}
rs.close();
stmt.close();
conn.close();
}
catch (Exception e)
{
e.printStackTrace();
}
}
}