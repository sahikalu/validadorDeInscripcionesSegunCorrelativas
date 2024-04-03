package domain.sistemaAcademico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {

        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public Alumno getAlumno() { return alumno; }

    public void setAlumno(Alumno alumno) { this.alumno = alumno; }

    public List<Materia> getMaterias() { return materias; }

    public void inscribirA(Materia ... unasMaterias) {

        Collections.addAll(this.materias, unasMaterias);
    }

    public Boolean aprobada(){

        return this.materias.stream().allMatch(materia -> this.alumno.cumpleCorrelatividadDe(materia));
    }

}
