package co.unicauca.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;


@Getter
@Setter
@Entity
public class TrabajoGrado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Docente director;


    @ManyToMany
    @JoinTable(
            name = "trabajo_codirectores",
            joinColumns = @JoinColumn(name = "trabajo_id"),
            inverseJoinColumns = @JoinColumn(name = "docente_id")
    )
    private List<Docente> coDirector;

    @OneToMany(mappedBy = "trabajoGrado", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Estudiante> estudiantes;

    @Enumerated(EnumType.STRING)
    private TipoTrabajo tipo;

    public TrabajoGrado(int id, String titulo, Docente director, List<Docente> coDirector, List<Estudiante> estudiantes, TipoTrabajo tipo) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.coDirector = coDirector;
        this.estudiantes = estudiantes;
        this.tipo = tipo;
    }

    public TrabajoGrado() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Docente getDirector() {
        return director;
    }

    public void setDirector(Docente director) {
        this.director = director;
    }

    public List<Docente> getCoDirector() {
        return coDirector;
    }

    public void setCoDirector(List<Docente> coDirector) {
        this.coDirector = coDirector;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public TipoTrabajo getTipo() {
        return tipo;
    }

    public void setTipo(TipoTrabajo tipo) {
        this.tipo = tipo;
    }
}
