/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author SALA1
 */
public class Alumno {
    private int cuenta;
    private String nombre;
    private String paterno;
    private String materno;
    private Date fechaNac;
    private String sexo;
    private String direccion;
    private long celular;
    private String correo;
    private int codigo;

    public Alumno() {
    }

    public Alumno(int cuenta, String nombre, String paterno, String materno, Date fechaNac, String sexo, String direccion, long celular, String correo, int codigo) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
        this.codigo = codigo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
