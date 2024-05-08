package com.example.Universidad.controladores;

import com.example.Universidad.operaciones.OperacionesUniversidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ControladorUniversidad {
    @Autowired
    OperacionesUniversidad operacionesUniversidad;

    @GetMapping({"/universidades","/"})
    public String listarUniversidades(Model modelo) {
        modelo.addAttribute("universidades",operacionesUniversidad.listar());
        return "universidades";
    }
}
