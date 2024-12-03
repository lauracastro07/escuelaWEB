/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Carrera;
import Modelo.ConexionBD;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SALA1
 */
@Controller
public class controladorCarrera {
    ConexionBD con = new ConexionBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    
    //Método para la vista del INDEX
    //Request hace redireccionamiento al valor seleccionado.
    @RequestMapping(value = "index.htm", method = RequestMethod.GET)
    public ModelAndView vistaAgrerar(){
        mav.addObject(new Carrera());
        mav.setViewName("index");
        return mav;
    }
  
    //Método para acción de agrgar
    @RequestMapping(value = "index.htm", method = RequestMethod.POST)
    public ModelAndView Agrerar(Carrera c){
        String sql="insert into carrera(nombre)values(?)"; //dependiendo el numero de atributos es el numero de signos de ? que se pondran
        this.jdbcTemplate.update(sql, c.getNombre());
        return new ModelAndView("redirect:/index.htm"); //"redirect:/index.htm es donde queramos que nos vuelva a mandar si queremos a otra pagina solo cambiamos la direccion
        
        
    }
}
