import java.sql.*;

public class PDeleteRecord {

   
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String url = "jdbc:ucanaccess://E:/company.accdb";

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection(url);
            String sql = "DELETE FROM your_table_name WHERE empno = ?";
            pstmt = connection.prepareStatement(sql);
            int empno = 1; 
            preparedStatement.setInt(1,empno);
            int rowsDeleted = pstmt.executeUpdate();
            System.out.println("Number of records deleted: " + rowsDeleted);
            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } 
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }