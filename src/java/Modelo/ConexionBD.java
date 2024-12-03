/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author SALA1
 */
public class ConexionBD {
    public DriverManagerDataSource Conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource(); //dataSource es el objeto y puede tener cuakquier nombre
        dataSource.setDriverClassName("com.mysql.jdbc.Driver"); //El driver es del gestor que se va a conectar en este ejemplo es mysql.
        dataSource.setUrl("jdbc:mysql://localhost:3306/escuela"); // local host dirrecion de donde estara. escuela es el nombre de la base de datos.
        dataSource.setUsername("root"); //nombre del usuario
        dataSource.setPassword("root"); //contraseña del gestor de la BD
        return dataSource;
    }
}
