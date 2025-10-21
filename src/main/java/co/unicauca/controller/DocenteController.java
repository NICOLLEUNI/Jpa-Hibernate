package co.unicauca.controller;


import co.unicauca.entity.Docente;
import co.unicauca.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/docentes")
public class DocenteController {

    @Autowired
    private DocenteRepository docenteRepository;


    @GetMapping
    public List<Docente> getAllDocentes() {
        return docenteRepository.findAll();

    }
}
