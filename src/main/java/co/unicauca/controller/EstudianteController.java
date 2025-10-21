package co.unicauca.controller;

import co.unicauca.entity.Estudiante;
import co.unicauca.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteRepository estudianteRepository;


    @GetMapping
    public List<Estudiante> getAllEstudiantes() {
        return estudianteRepository.findAll();

    }
}