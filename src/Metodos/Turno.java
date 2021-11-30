/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Emiliano
 */
public class Turno {
    private int idturno;
    private int numturno;
    private String fechaturno;
    private String horaturno;

    public int getIdturno() {
        return idturno;
    }

    public int getNumturno() {
        return numturno;
    }

    public String getFechaturno() {
        return fechaturno;
    }

    public String getHoraturno() {
        return horaturno;
    }

    public void setFechaturno(String fechaturno) {
        this.fechaturno = fechaturno;
    }

    public void setHoraturno(String horaturno) {
        this.horaturno = horaturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public void setNumturno(int numturno) {
        this.numturno = numturno;
    }
       
}
