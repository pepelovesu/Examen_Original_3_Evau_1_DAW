package es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo;

import es.etg.tierno.daw.examen.vera.model.entities.Trabajador;

public class Desarrolladora extends Trabajador {

    public final static String PUESTO_DE_TRABAJO = Puesto.DESARROLADORA.getPuesto();

    public Desarrolladora(String nombre, String dni, int sueldo) {
        super(nombre, dni, sueldo, PUESTO_DE_TRABAJO);
    }
    
}
