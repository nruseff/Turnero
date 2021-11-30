package Metodos;
import java.sql.*;
import javax.sql.DataSource;
import javax.swing.JOptionPane;

public class Conectar {
    
   public Connection miconexion;
   public Statement stSentencias;
   public ResultSet rsDatos;
   public PreparedStatement psPrepararSentencias;
    
    public Conectar () throws ClassNotFoundException, SQLException
    {
     try {
         Class.forName("com.mysql.jdbc.Driver");
         String url = ("jdbc:mysql://serv-aplicacion/turnero");
         miconexion = DriverManager.getConnection(url, "Adrian","alsina303");
         stSentencias = miconexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
         
     }
     catch (ClassCastException ex)
     {
         throw ex;
     }
     catch (SQLException ex)
     {
         throw ex;
     }
     
    }
    public ResultSet consulta (String sql ) throws SQLException
    {
        try 
           {
            rsDatos = stSentencias.executeQuery(sql);
            
           }
        catch (SQLException ex)
             {
              throw ex;        
             }
    return rsDatos;
    
    }
    
    
}