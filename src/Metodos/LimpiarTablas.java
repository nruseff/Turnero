/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Metodos.Conectar;
import javax.swing.JOptionPane;

/**
 *
 * @author Emiliano
 */
public class LimpiarTablas {
    public void limpiaturnoexpress()
    {
        try {
            Conectar miconecta = new Conectar();
            String xconsulta = "delete from turnero.turnoexpress";
            miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xconsulta);
            miconecta.psPrepararSentencias.executeUpdate();
            
            
        } catch (Exception e) {
            
        }
    } 
    public void limpiaturnoobrasocial(){
        try {
            Conectar miconecta = new Conectar();
            String xconsulta = "delete from turnero.turnosobrasocial";
            miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xconsulta);
            miconecta.psPrepararSentencias.executeUpdate();
                
        } catch (Exception e) {
        }
    }
    public void limpiafechaturnosexpress(){
        try {
            Conectar miconecta = new Conectar();
            String xconsulta = "delete from turnero.fechaturnose";
            miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xconsulta);
            miconecta.psPrepararSentencias.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void limpiafechaturnosobrasocial(){
        try {
            Conectar miconecta = new Conectar();
            String xconsulta = "delete from turnero.fechaturnoos";
            miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xconsulta);
            miconecta.psPrepararSentencias.executeUpdate();
        } catch (Exception e) {
        }
    }        
    
}
