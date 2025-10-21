package co.unicauca.infra.config;

import co.unicauca.entity.*;
import co.unicauca.repository.DocenteRepository;
import co.unicauca.repository.EstudianteRepository;
import co.unicauca.repository.TrabajoGradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EstudianteRepository estudianteRepository;
    @Autowired
    private DocenteRepository docenteRepository;
    @Autowired
    private TrabajoGradoRepository trabajoGradoRepository;


    @Override
    public void run(String... args) throws Exception {
        // --- Crear docentes ---
        Docente docente1 = new Docente();
        docente1.setNombre("Libardo Pantoja");
        docente1.setCorreo("wpantoja@unicauca.edu.co");
        docente1.setContrasena("secret12345X");
        docente1.setDepartamento(Departamento.sistemas);

        Docente docente2 = new Docente();
        docente2.setNombre("Erwin Meza");
        docente2.setCorreo("erwinmeza@unicauca.edu.co");
        docente2.setContrasena("secret12345X");
        docente2.setDepartamento(Departamento.sistemas);

        docenteRepository.saveAll(List.of(docente1, docente2));

        // --- Crear estudiantes ---
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("José María");
        estudiante1.setCorreo("estudiante1@unicauca.edu.co");
        estudiante1.setContrasena("secre12345X");
        estudiante1.setCodigoEstudiante("189238723");

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Carlos Pérez");
        estudiante2.setCorreo("estudiante2@unicauca.edu.co");
        estudiante2.setContrasena("secre12345X");
        estudiante2.setCodigoEstudiante("189238724");

        // --- Crear trabajo de grado ---
        TrabajoGrado trabajo = new TrabajoGrado();
        trabajo.setTitulo("Impacto de TikTok en el desarrollo cognitivo de los niños");
        trabajo.setDirector(docente1);
        trabajo.setCoDirector(List.of(docente2)); // si manejas varios coDirectores
         trabajo.setTipo(TipoTrabajo.INVESTIGACION); // si tu enum está definido

        // --- Relacionar bidireccionalmente ---
        estudiante1.setTrabajoGrado(trabajo);
        estudiante2.setTrabajoGrado(trabajo);
        trabajo.setEstudiantes(List.of(estudiante1, estudiante2));

        // --- Persistir ---
        trabajoGradoRepository.save(trabajo);
        // No es necesario guardar los estudiantes si tienes cascade = CascadeType.ALL en la relación
    }
}