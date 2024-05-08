package com.example.Universidad.servicios;


import com.example.Universidad.entidades.Universidad;
import com.example.Universidad.operaciones.OperacionesUniversidad;
import com.example.Universidad.repositorios.RepositoriosUniversidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosUniversidad implements OperacionesUniversidad {

    @Autowired
    RepositoriosUniversidad repositoriosUniversidad;

    @Override
    public List<Universidad> listar() {
        return repositoriosUniversidad.findAll();
    }

}
