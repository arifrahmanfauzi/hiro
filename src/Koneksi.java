import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Koneksi {
     public static Connection konek;
      public static Connection getkoneksi(){
        String host ="jdbc:mysql://localhost/rapor",
                user="root",
                pass="";
        
        try {
            konek =(Connection)DriverManager.getConnection(host,user,pass);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
        return konek;
    }
}
