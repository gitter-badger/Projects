package miniproject;
import java.sql.*;
public class Database {
    Connection con;
    Statement stmt;
    PreparedStatement ps;
    ResultSet r;

    Database() {
        con=null;
        stmt=null;
        ps=null;
        r=null;
    }
    public void getConnection() {
       try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
        con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","oracle");
	stmt=(Statement)con.createStatement();
       }
       catch(Exception e) {}
    }
    public void closeAll() {
        try {
            if(stmt!=null) {
                stmt.close();
            }
            if(ps!=null) {
                ps.close();
            }
            if(con!=null) {
                con.close();
            }
        }
        catch(Exception e){}
    }
}
