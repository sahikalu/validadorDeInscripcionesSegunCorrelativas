package domain.sistemaAcademico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private Integer codigo;
    private List<Materia> correlativas;

    public Materia(String nombre, Integer codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correlativas = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getCodigo() { return codigo; }

    public void setCodigo(Integer codigo) { this.codigo = codigo; }

    public List<Materia> getCorrelativas() { return correlativas; }

    public void agregarCorrelativas(Materia... materias) {

        Collections.addAll(this.correlativas, materias);
    }
}
