/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Metodos.Conectar;

/**
 *
 * @author Emiliano
 */
public class CopiarTablas {
    public void CopiarTablaturnoexpress(){
        try {
            Conectar miconecta = new Conectar();
            String xinsert = "INSERT INTO `turnero`.`turnoexpress_historicos` SELECT * FROM  `turnero`.`turnoexpress` ;";
            miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xinsert);
            miconecta.psPrepararSentencias.executeUpdate();
            } catch (Exception e) {
        }
    }
    public void CopiarTablaturnoobrasocial(){
        try {
            Conectar miconecta = new Conectar();
            String xinsert = "INSERT INTO  `turnero`.`turnosobrasocial_historicos` SELECT * FROM  `turnero`.`turnosobrasocial`;";
            miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xinsert);
            miconecta.psPrepararSentencias.executeUpdate();
            } catch (Exception e) {
        }
    }
    public void CopiarTablafechaturnosexpress(){
        try {
            Conectar miconecta = new Conectar();
            String xinsert = "INSERT INTO  `turnero`.`fechaturnose_historicos` SELECT * FROM  `turnero`.`fechaturnose`;";
            miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xinsert);
            miconecta.psPrepararSentencias.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void CopiarTablafechaturnosobrasocial(){
        try {
            Conectar miconecta = new Conectar();
            String xinsert = "INSERT INTO  `turnero`.`fechaturnoos_historicos` SELECT * FROM  `turnero`.`fechaturnoos`;";
            miconecta.psPrepararSentencias = miconecta.miconexion.prepareStatement(xinsert);
            miconecta.psPrepararSentencias.executeUpdate();
        } catch (Exception e) {
        }
    }
            
    
}
