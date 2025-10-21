package co.unicauca.entity;

public enum TipoTrabajo {
    INVESTIGACION("Investigación"),
    PRACTICA_PROFESIONAL("Práctica Profesional"),
    PLAN_COTERMINAL("Plan Co-terminal");

    private final String descripcion;

    TipoTrabajo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
