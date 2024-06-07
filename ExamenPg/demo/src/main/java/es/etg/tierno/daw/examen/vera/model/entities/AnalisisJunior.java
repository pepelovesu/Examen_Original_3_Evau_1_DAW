package es.etg.tierno.daw.examen.vera.model.entities;

import java.util.List;

import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Junior;

public interface AnalisisJunior {
    public double calcularMayorSueldoJunior(List<Junior> trabajador);
    public double calcularMedioSueldoJunior(List<Junior> trabajador);
}
