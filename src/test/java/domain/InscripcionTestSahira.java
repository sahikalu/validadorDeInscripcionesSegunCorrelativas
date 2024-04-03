package domain;
import domain.sistemaAcademico.Alumno;
import domain.sistemaAcademico.Inscripcion;
import domain.sistemaAcademico.Materia;
import org.junit.Assert;
import org.junit.Test;

public class InscripcionTestSahira {

    private Alumno sahira = new Alumno("Sahira","A. Kalustian", 1755845);
    private Materia ayed = new Materia("Algoritmos y Estructuras de Datos", 887326234);
    private Materia md = new Materia("Matermática Discreta", 723898934);
    private Materia syo = new Materia("Sistemas y Organizaciones", 982461247);
    private Materia pdep = new Materia("Paradigmas de Programacion", 982365098);
    private Inscripcion sahiraAPdeP = new Inscripcion(sahira);

    @Test

    public void sahiraInscribirseAPdP() {

        this.pdep.agregarCorrelativas(md, ayed);
        this.sahira.agregarMateriasAprobadas(ayed, md, syo);
        this.sahiraAPdeP.inscribirA(pdep);

        Assert.assertTrue(this.sahiraAPdeP.aprobada());

    }

}
