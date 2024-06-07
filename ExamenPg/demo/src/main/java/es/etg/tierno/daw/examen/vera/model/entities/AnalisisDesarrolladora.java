package es.etg.tierno.daw.examen.vera.model.entities;

import java.util.List;

import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Desarrolladora;


public interface AnalisisDesarrolladora {
    public double calcularMayorSueldoDesarrolladora(List<Desarrolladora> trabajador);
    public double calcularMedioSueldoDesarrolladora(List<Desarrolladora> trabajador);
}
