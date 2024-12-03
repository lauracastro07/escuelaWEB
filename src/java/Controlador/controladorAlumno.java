/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Alumno;
import Modelo.ConexionBD;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Laura Castro
 */
@Controller
public class controladorAlumno {
    ConexionBD con = new ConexionBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    
    //metodo para  la vista de index
    @RequestMapping(value = "AltaAlumno.htm", method = RequestMethod.GET)
    public ModelAndView vistaAgregarAlumno(){
        mav.addObject(new Alumno());
        mav.setViewName("AltaAlumno");
        return mav;
    }
    @RequestMapping(value = "AltaAlumno.htm", method = RequestMethod.POST)
    public ModelAndView AgregarAlumno(Alumno o){
        String sql = "insert into asignatura(cuenta, nombre, paterno, materno, fechaNac, sexo, direccion, celular, correo, codigo )values(?,?,?,?,?,?,?,?,?,?)";
        this.jdbcTemplate.update(sql, o.getCuenta(), o.getNombre(), o.getPaterno(), o.getMaterno(), o.getFechaNac(), o.getSexo(),
        o.getDireccion(), o.getCelular(), o.getCorreo(), o.getCodigo());
        return new ModelAndView("redirect:/AltaAlumno.htm");
    }
}
