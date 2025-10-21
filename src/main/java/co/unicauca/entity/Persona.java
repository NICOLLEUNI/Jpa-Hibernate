package co.unicauca.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;

    public Persona(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public Persona() {
    }
}
