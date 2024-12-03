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
public class Asignatura {
    private int clave;
    private String nombre;
    private int creditos;
    private int cantHoras;

    public Asignatura() {
    }

    public Asignatura(int clave, String nombre, int creditos, int cantHoras) {
        this.clave = clave;
        this.nombre = nombre;
        this.creditos = creditos;
        this.cantHoras = cantHoras;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }
    
}
