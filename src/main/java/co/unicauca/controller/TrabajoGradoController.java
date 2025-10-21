package co.unicauca.controller;

import co.unicauca.entity.Estudiante;
import co.unicauca.entity.TrabajoGrado;
import co.unicauca.repository.TrabajoGradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proyectos")
public class TrabajoGradoController {

    @Autowired
    private TrabajoGradoRepository trabajoGradoRepository;

    @GetMapping
    public List<TrabajoGrado> getAllTrabajoGrado() {
        return trabajoGradoRepository.findAll();
    }
}
