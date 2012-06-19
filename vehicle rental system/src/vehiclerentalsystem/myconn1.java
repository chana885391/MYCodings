/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vehiclerentalsystem;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author chana911
 */
public class myconn1 {
    private static Connection conn;
    public static Connection getConnection() throws Exception{

        if(conn == null){
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","123");
        }
        return conn;
    }



}
