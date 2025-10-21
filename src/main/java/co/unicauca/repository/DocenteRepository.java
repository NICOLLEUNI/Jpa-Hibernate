package co.unicauca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.unicauca.entity.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente,Long>  {
}
