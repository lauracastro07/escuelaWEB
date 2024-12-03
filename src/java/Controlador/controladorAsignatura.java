/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Asignatura;
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
public class controladorAsignatura {
    ConexionBD con = new ConexionBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    
    //metodo para  la vista de index
    @RequestMapping(value = "AltaAsignatura.htm", method = RequestMethod.GET)
    public ModelAndView vistaAgregarAsignatura(){
        mav.addObject(new Asignatura());
        mav.setViewName("AltaAsignatura");
        return mav;
    }
    //metodo para accion de agregar
    @RequestMapping(value = "AltaAsignatura.htm", method = RequestMethod.POST)
    public ModelAndView AgregarAsignatura(Asignatura a){
        String sql = "insert into asignatura(clave, nombre, creditos, cantHoras )values(?,?,?,?)";
        this.jdbcTemplate.update(sql, a.getClave(), a.getNombre(), a.getCreditos(), a.getCantHoras());
        return new ModelAndView("redirect:/AltaAsignatura.htm");
    }
}
