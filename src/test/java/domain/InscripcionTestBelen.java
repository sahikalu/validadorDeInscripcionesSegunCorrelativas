package domain;

import domain.sistemaAcademico.Alumno;
import domain.sistemaAcademico.Inscripcion;
import domain.sistemaAcademico.Materia;
import org.junit.Assert;
import org.junit.Test;

public class InscripcionTestBelen {

    private Alumno belen = new Alumno("Belen", "Rolero", 1752445);
    private Materia ayed = new Materia("Algoritmos y Estructuras de Datos", 887326234);
    private Materia md = new Materia("Matermática Discreta", 723898934);
    private Materia syo = new Materia("Sistemas y Organizaciones", 982461247);
    private Materia pdep = new Materia("Paradigmas de Programacion", 982365098);
    private Inscripcion belenAPdeP = new Inscripcion(belen);

    @Test

    public void belenInscribirseAPdP() {

        this.pdep.agregarCorrelativas(md, ayed);
        this.belen.agregarMateriasAprobadas(md, syo);
        this.belenAPdeP.inscribirA(pdep);

        Assert.assertFalse(this.belenAPdeP.aprobada());

    }

}