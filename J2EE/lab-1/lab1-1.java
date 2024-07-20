import java.sql.*;
public class JdbcInsertDemo
{
    public static void main(String[] args)
    {
        Connection conn=null;
        Statement stmt=null;
          String url="jdbc:ucanaccess://E:/company.accdb";
        try
        {
            Class.forName("net.ucanacess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection(url);

            stmt=conn.createStatement();
            Stirng sql="insert into emp values (3,'abc','def','ghi')";
            int val=stmt.executeUpdate(sql);

            System.out.println(val+"record inserted successfully");

            stmt.close();
            conn.close();
        }
           catch(Exception e)
           {
            e.printStackTrace();
            }
     }
}