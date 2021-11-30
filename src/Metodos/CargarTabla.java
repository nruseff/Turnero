/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adrian
 */
public class CargarTabla {
    
    public JTable cargarTablaTurno (JTable miTabla, DefaultTableModel ObjTabla, Turno[] miTurno, String titulos[]){
        
            ObjTabla.setColumnCount(0);
            ObjTabla.setRowCount(0);
            ObjTabla.setColumnIdentifiers(titulos);
            miTabla.setModel(ObjTabla);
            String datos[]=new String[titulos.length];
            for(int i=0; i<miTurno.length; i++)
            {
               //datos[0]=String.valueOf(miEmpleada[i].getIdPersona());
               datos[0]=String.valueOf(miTurno[i].getNumturno());
               ObjTabla.addRow(datos);
               
            }
            return miTabla;
    }
}
