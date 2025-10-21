package co.unicauca.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Docente extends  Persona {

    private String codDocente;
    @Enumerated(EnumType.STRING)
    private Departamento departamento;


    public Docente( String correo, String contrasena,String codDocente) {
        super(correo, contrasena);
        this.codDocente = codDocente;
    }

    public Docente() {}
}
