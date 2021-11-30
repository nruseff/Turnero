
package Metodos;

/**
 * v 1.0.3 02/08/2017
 * @author Emiliano
 */

import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Leer {
    public int buscarultimoticketexpress() //Buscar el ultimo numero de ticket
    {
        try 
        {
        Conectar stconecta = new Conectar();
        String stconsulta = "select max(numturno) as numturno from turnoexpress";
        ResultSet rs = stconecta.consulta(stconsulta);
        rs.next();
        int idserviciotecnico = rs.getInt(1);
        stconecta.miconexion.close();
        return idserviciotecnico;
        
        }
        catch (Exception e)
        {
        }
        return 0;
    }
    public Turno[] LeerTurnoExpress(){
        try{
            Conectar miConectar=new Conectar();
            String consulta="select numturno from turnoexpress where turnoexpress.estturno='1'"; //Consulta Modificada 26/01/2018 por Nico
            ResultSet rs=miConectar.consulta(consulta);
            rs.last();
            Turno miTurnoEX[]=new Turno[rs.getRow()];
            rs.beforeFirst();
            int contador=0;
            while(rs.next()){
                miTurnoEX[contador]=new Turno();
                miTurnoEX[contador].setNumturno(rs.getInt("numturno"));
                
                contador++;
            }
           
            miConectar.miconexion.close();//160218
            rs.close();
            return miTurnoEX;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;
    }
    
   
     public Turno[] LeerTurnoObraSocial(){
        try{
            Conectar miConectar=new Conectar();
            String consulta="select numturno from turnosobrasocial where turnosobrasocial.estturno='1'"; //Consulta Modificada 26/01/2018 por Nico
            ResultSet rs=miConectar.consulta(consulta);
            rs.last();
            Turno miTurnoOB[]=new Turno[rs.getRow()];
            rs.beforeFirst();
            
            int contador=0;
            while(rs.next()){
                miTurnoOB[contador]=new Turno();
                miTurnoOB[contador].setNumturno(rs.getInt("numturno"));
                
                contador++;
            }
            
            miConectar.miconexion.close();//160218
            rs.close();
            return miTurnoOB;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;
    }
    public Turno[] LeerTurnoObraSocialLlamado(){
        try{
            Conectar miConectar=new Conectar();
            String consulta="select numturno from turnosobrasocial where turnosobrasocial.estturno='2'"; //Consulta Modificada 26/01/2018 por Nico
            ResultSet rs=miConectar.consulta(consulta);
            rs.last();
            Turno miTurnoOB[]=new Turno[rs.getRow()];
            rs.beforeFirst();
            int contador=0;
            while(rs.next()){
                miTurnoOB[contador]=new Turno();
                miTurnoOB[contador].setNumturno(rs.getInt("numturno"));
                contador++;
            }
            rs.close();
            miConectar.miconexion.close();//160218
            return miTurnoOB;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;
    }
    public Turno[] LeerTurnoObraSocialAtendido(){
        try{
            Conectar miConectar=new Conectar();
            String consulta="SELECT max( numturno ) AS 'numturno' FROM turnosobrasocial WHERE turnosobrasocial.estturno = '3'"; //Consulta Modificada 26/01/2018 por Nico
            ResultSet rs=miConectar.consulta(consulta);
            rs.last();
            Turno miTurnoOB[]=new Turno[rs.getRow()];
            rs.beforeFirst();
            int contador=0;
            while(rs.next()){
                miTurnoOB[contador]=new Turno();
                //miPersona[contador].setIdturno(rs.getInt("idturno"));
                miTurnoOB[contador].setNumturno(rs.getInt("numturno"));
                contador++;
                
            }
            rs.close();
            miConectar.miconexion.close();//160218
            return miTurnoOB;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;
    }
    
   public Turno[] LeerTurnoExpressLlamado(){
        try{
            Conectar miConectar=new Conectar();
            String consulta="select numturno from turnoexpress where turnoexpress.estturno='2'"; //Consulta Modificada 26/01/2018 por Nico
            ResultSet rs=miConectar.consulta(consulta);
            rs.last();
            Turno miTurnoEx[]=new Turno[rs.getRow()];
            rs.beforeFirst();
            int contador=0;
            while(rs.next()){
                miTurnoEx[contador]=new Turno();
                //miPersona[contador].setIdturno(rs.getInt("idturno"));
                miTurnoEx[contador].setNumturno(rs.getInt("numturno"));
                contador++;
            }
            rs.close();
            miConectar.miconexion.close();//160218
            return miTurnoEx;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;
    }
    
    public Turno[] LeerTurnoExpressAtendido(){
        try{
            Conectar miConectar=new Conectar();
            String consulta="SELECT max( numturno ) AS 'numturno' FROM turnoexpress WHERE turnoexpress.estturno = '3'"; //Consulta Modificada 26/01/2018 por Nico
            ResultSet rs=miConectar.consulta(consulta);
            rs.last();
            Turno miTurnoEx[]=new Turno[rs.getRow()];
            rs.beforeFirst();
            int contador=0;
            while(rs.next()){
                miTurnoEx[contador]=new Turno();
                //miPersona[contador].setIdturno(rs.getInt("idturno"));
                miTurnoEx[contador].setNumturno(rs.getInt("numturno"));
                contador++;
                
            }
            rs.close();
            miConectar.miconexion.close();//160218
            return miTurnoEx;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;
    }
}

    
    



    