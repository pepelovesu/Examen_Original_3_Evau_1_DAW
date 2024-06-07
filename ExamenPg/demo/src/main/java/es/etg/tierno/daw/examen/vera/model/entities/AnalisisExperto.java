package es.etg.tierno.daw.examen.vera.model.entities;

import java.util.List;

import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Experto;

public interface AnalisisExperto {
    public double calcularMayorSueldoExperto(List<Experto> trabajador);
    public double calcularMedioSueldoExperto(List<Experto> trabajador);
}
