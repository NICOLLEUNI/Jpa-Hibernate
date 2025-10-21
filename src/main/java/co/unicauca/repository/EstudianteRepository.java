package co.unicauca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import co.unicauca.entity.Estudiante;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {

    // 🔹 Opción 1: usando método derivado (Spring crea la query automáticamente)
    List<Estudiante> findByTrabajoGradoIsNull();

    // 🔹 Opción 2: usando JPQL explícito
    @Query("SELECT e FROM Estudiante e WHERE e.trabajoGrado IS NULL")
    List<Estudiante> buscarEstudiantesSinTrabajo();
}
