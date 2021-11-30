/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Modificar {
 
  public void modificarestturnoEX (int numturno) {
    try{
       Conectar miconecta= new Conectar();
       String xinsert="Update turnoexpress set turnoexpress.estturno='2' where turnoexpress.numturno=?";
       miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xinsert);
       miconecta.psPrepararSentencias.setInt(1,numturno);
       miconecta.psPrepararSentencias.executeUpdate();
       miconecta.psPrepararSentencias.close();
       
    }  
       catch (Exception e){
       JOptionPane.showMessageDialog(null, e.toString());
       }
  }
  
  public void modificarestturnollamadoEX () {
    try{
       Conectar miconecta= new Conectar();
       String xinsert="Update turnoexpress set turnoexpress.estturno='3' where turnoexpress.estturno='2'";
       miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xinsert);
       miconecta.psPrepararSentencias.executeUpdate();
       
    }  
       catch (Exception e){
       JOptionPane.showMessageDialog(null, e.toString());
       }
  }
    
  public void modificarestturnoOB (int numturno) {
    try{
       Conectar miconecta= new Conectar();
       String xinsert="Update turnosobrasocial set turnosobrasocial.estturno='2' where turnosobrasocial.numturno=?";
       miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xinsert);
       miconecta.psPrepararSentencias.setInt(1,numturno);
       miconecta.psPrepararSentencias.executeUpdate();
       
    }  
       catch (Exception e){
       JOptionPane.showMessageDialog(null, e.toString());
       }
  }
  
  public void modificarestturnollamadoOB () {
    try{
       Conectar miconecta= new Conectar();
       String xinsert="Update turnosobrasocial set turnosobrasocial.estturno='3' where turnosobrasocial.estturno='2'";
       miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xinsert);
       miconecta.psPrepararSentencias.executeUpdate();
       
    }  
       catch (Exception e){
       JOptionPane.showMessageDialog(null, e.toString());
       }
    
  }  
  
  public void modificarestturnoEXnoatendido (int numturno) {
    try{
       Conectar miconecta= new Conectar();
       String xinsert="Update turnoexpress set turnoexpress.estturno='4' where turnoexpress.numturno=?";
       miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xinsert);
       miconecta.psPrepararSentencias.setInt(1,numturno);
       miconecta.psPrepararSentencias.executeUpdate();
       miconecta.psPrepararSentencias.close();
       
    }  
       catch (Exception e){
       JOptionPane.showMessageDialog(null, e.toString());
       }
  }
  
  public void modificarestturnoOBnoatendido (int numturno) {
    try{
       Conectar miconecta= new Conectar();
       String xinsert="Update turnosobrasocial set turnosobrasocial.estturno='4' where turnosobrasocial.numturno=?";
       miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xinsert);
       miconecta.psPrepararSentencias.setInt(1,numturno);
       miconecta.psPrepararSentencias.executeUpdate();
       
    }  
       catch (Exception e){
       JOptionPane.showMessageDialog(null, e.toString());
       }
  }
  
    
}
