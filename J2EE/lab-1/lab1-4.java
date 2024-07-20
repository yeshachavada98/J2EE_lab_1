import java.sql.*;
public class PUpdateDemo {
public static void main(String[] args) {
Connection conn = null;
PreparedStatement pstmt = null;
String url = "jdbc:ucanaccess://E:/company.accdb";
try {
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
conn = DriverManager.getConnection(url);
")System.out.println("Creating prepared statement...");
String sql = "UPDATE emp SET Lastname = ? WHERE Firstname = ?";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, "Rana;
pstmt.setString(2, "Lopa");
int val = pstmt.executeUpdate();
System.out.println(val + " record(s) updated successfully");
pstmt.close();
conn.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}
