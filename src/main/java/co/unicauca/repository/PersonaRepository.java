package co.unicauca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.unicauca.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
