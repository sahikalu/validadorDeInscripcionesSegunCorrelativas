package domain;

import domain.sistemaAcademico.Alumno;
import domain.sistemaAcademico.Inscripcion;
import domain.sistemaAcademico.Materia;
import org.junit.Assert;
import org.junit.Test;

public class InscripcionTestVicky {
    private Alumno vicky = new Alumno("Vicky", "Xipolitakis", 1302445);
    private Materia ayed = new Materia("Algoritmos y Estructuras de Datos", 887326234);
    private Materia md = new Materia("Matermática Discreta", 723898934);
    private Materia syo = new Materia("Sistemas y Organizaciones", 982461247);
    private Materia pdep = new Materia("Paradigmas de Programacion", 982365098);
    private Inscripcion vickyAPdeP = new Inscripcion(vicky);

    @Test


    public void vickyInscribirseAPdP() {

        this.pdep.agregarCorrelativas(md, ayed);
        this.vicky.agregarMateriasAprobadas(syo);
        this.vickyAPdeP.inscribirA(pdep);

        Assert.assertFalse(this.vickyAPdeP.aprobada());

    }
}
