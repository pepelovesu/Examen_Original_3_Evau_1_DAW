package es.etg.tierno.daw.examen.vera.model.entities;

import java.util.List;

import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Directora;

public interface AnalisisDirectora {
    public double calcularMayorSueldoDirectora(List<Directora> trabajador);
    public double calcularMenorSueldoDirectora(List<Directora> trabajador);
}
