package MyLib;

import Database.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author zeldr
 */
public class UserID {
    Connection con= Connect.connectdb();
    PreparedStatement ps = null;
    ResultSet rs = null;
    private int userID;
    private String userName;
    
    public UserID(int userID) {
        this.userID = userID;
    }
    
    public String getUserName() {
        String getUserName = "SELECT fname FROM ACCOUNTS WHERE id = ?";
        
        try {
            ps = con.prepareStatement(getUserName);
            ps.setInt(1, userID);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                userName = rs.getString("fName");
                System.out.println(userName);
            }
        } catch (Exception e) {
        }
        return userName;
    }
}
