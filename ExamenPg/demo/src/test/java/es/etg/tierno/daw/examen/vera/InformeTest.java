package es.etg.tierno.daw.examen.vera;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import es.etg.tierno.daw.examen.vera.model.entities.Empresa;
import es.etg.tierno.daw.examen.vera.model.entities.Informe;
import es.etg.tierno.daw.examen.vera.model.entities.Trabajador;
import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Desarrolladora;
import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Directora;
import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Experto;
import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Junior;

public class InformeTest {
   
    private Informe informe;

    
    @Test
    void calcularMayorSueldoTest(){

        /* 
            1a	Pilar	1	6000
            11a	Pilar2	1	5000
            2b	Julian	2	5000
            3c	Eva  	3   5000
            4d	Elena	4	5000
            5e	Juan	4	2000
            6f	Maria	4	2000
            7g	Pedro	4	2000
        */

        List<Trabajador> trabajadores = new ArrayList<>();
        Trabajador trabajador = new Directora("Pilar", "1a", 6000);
        Trabajador trabajador1 = new Directora("Pilar2", "11a", 5000);
        Trabajador trabajador2 = new Experto("Julian", "2b", 5000);
        Trabajador trabajador3 = new Desarrolladora("Eva", "3c", 5000);
        Trabajador trabajador4 = new Junior("Elenea", "4d", 5000);
        Trabajador trabajador5 = new Junior("Juan", "5e", 2000);


        Empresa DAWSoft = new Empresa("Recursos Humanos", trabajadores);

        DAWSoft.add(trabajador);
        DAWSoft.add(trabajador1);
        DAWSoft.add(trabajador2);
        DAWSoft.add(trabajador3);
        DAWSoft.add(trabajador4);
        DAWSoft.add(trabajador5);

        informe = new Informe(DAWSoft);


        assertEquals(6000, informe.calcularMayorSueldo(informe.getEmpresa().getTrabajadores()));
    }

    @Test

    void calcularMenorSueldoTest(){

        /* 
            1a	Pilar	1	6000
            11a	Pilar2	1	5000
            2b	Julian	2	5000
            3c	Eva  	3   5000
            4d	Elena	4	5000
            5e	Juan	4	2000
            6f	Maria	4	2000
            7g	Pedro	4	2000
        */

        List<Trabajador> trabajadores = new ArrayList<>();
        Trabajador trabajador = new Directora("Pilar", "1a", 6000);
        Trabajador trabajador1 = new Directora("Pilar2", "11a", 5000);
        Trabajador trabajador2 = new Experto("Julian", "2b", 5000);
        Trabajador trabajador3 = new Desarrolladora("Eva", "3c", 5000);
        Trabajador trabajador4 = new Junior("Elenea", "4d", 5000);
        Trabajador trabajador5 = new Junior("Juan", "5e", 2000);


        Empresa DAWSoft = new Empresa("Recursos Humanos", trabajadores);

        DAWSoft.add(trabajador);
        DAWSoft.add(trabajador1);
        DAWSoft.add(trabajador2);
        DAWSoft.add(trabajador3);
        DAWSoft.add(trabajador4);
        DAWSoft.add(trabajador5);

        informe = new Informe(DAWSoft);


        assertEquals(2000, informe.calcularMenorSueldo(informe.getEmpresa().getTrabajadores()));
    }

    @Test
    void calcularMedioSueldoTest(){

        /* 
            1a	Pilar	1	6000
            11a	Pilar2	1	5000
            2b	Julian	2	5000
            3c	Eva  	3   5000
            4d	Elena	4	5000
            5e	Juan	4	2000
            6f	Maria	4	2000
            7g	Pedro	4	2000
        */

        List<Trabajador> trabajadores = new ArrayList<>();
        Trabajador trabajador = new Directora("Pilar", "1a", 6000);
        Trabajador trabajador1 = new Directora("Pilar2", "11a", 5000);
        Trabajador trabajador2 = new Experto("Julian", "2b", 5000);
        Trabajador trabajador3 = new Desarrolladora("Eva", "3c", 5000);
        Trabajador trabajador4 = new Junior("Elenea", "4d", 5000);
        Trabajador trabajador5 = new Junior("Juan", "5e", 2000);


        Empresa DAWSoft = new Empresa("Recursos Humanos", trabajadores);

        DAWSoft.add(trabajador);
        DAWSoft.add(trabajador1);
        DAWSoft.add(trabajador2);
        DAWSoft.add(trabajador3);
        DAWSoft.add(trabajador4);
        DAWSoft.add(trabajador5);

        informe = new Informe(DAWSoft);


        assertEquals(4666.666666666667, informe.calcularMedioSueldo(informe.getEmpresa().getTrabajadores()));

    }
}
