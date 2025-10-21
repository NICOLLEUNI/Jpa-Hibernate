package co.unicauca.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import co.unicauca.entity.TrabajoGrado;

import java.util.List;
@Getter
@Setter
@Entity
public class Estudiante extends Persona {


    private String codigoEstudiante;

    @ManyToOne
    @JoinColumn(name = "trabajo_id")
    @JsonBackReference
    private TrabajoGrado trabajoGrado;

    public Estudiante(String correo, String contrasena, String codigoEstudiante, TrabajoGrado trabajo) {
        super( correo, contrasena);
        this.codigoEstudiante = codigoEstudiante;
        this.trabajoGrado = trabajo;
    }

    public Estudiante(String codigoEstudiante, TrabajoGrado trabajos) {
        this.codigoEstudiante = codigoEstudiante;
        this.trabajoGrado = trabajos;
    }

    public Estudiante()
    {

    }

}