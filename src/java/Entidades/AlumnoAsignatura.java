/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author SALA1
 */
public class AlumnoAsignatura {
    private int cuenta;
    private int clave;

    public AlumnoAsignatura() {
    }

    public AlumnoAsignatura(int cuenta, int clave) {
        this.cuenta = cuenta;
        this.clave = clave;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
}
