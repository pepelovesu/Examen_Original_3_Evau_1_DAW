package es.etg.tierno.daw.examen.vera.model.entities;

import java.util.List;

public interface AnalisisEmpresa {
    public double calcularMayorSueldo(List<Trabajador> trabajadores);
    public double calcularMenorSueldo(List<Trabajador> trabajadores);
    public double calcularMedioSueldo(List<Trabajador> trabajadores);
    public double calcularVariacionMediaSueldo(List<Trabajador> trabajadores);
}
