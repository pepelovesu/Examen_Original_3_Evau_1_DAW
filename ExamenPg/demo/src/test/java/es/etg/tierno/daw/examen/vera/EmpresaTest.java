package es.etg.tierno.daw.examen.vera;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import es.etg.tierno.daw.examen.vera.model.entities.Empresa;
import es.etg.tierno.daw.examen.vera.model.entities.Trabajador;
import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Directora;
import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Experto;

public class EmpresaTest {
    private Empresa empresa = new Empresa();

    @Test
    void addTest(){

        Trabajador trabajador1 = new Directora("Alicia", "1a", 5000);
        Trabajador trabajador2 = new Experto("Pepe", "2a", 5000);
        empresa.add(trabajador1);
        empresa.add(trabajador2);

        assertEquals(2, empresa.getNumeroTrabajadores());
    }

    @Test
    void delTest(){

        Trabajador trabajador1 = new Directora("Alicia", "1a", 5000);
        Trabajador trabajador2 = new Experto("Pepe", "2a", 5000);
        empresa.add(trabajador1);
        empresa.add(trabajador2);

        empresa.del(trabajador1);
        empresa.del(trabajador2);

        assertEquals(0, empresa.getNumeroTrabajadores());
    }
}
