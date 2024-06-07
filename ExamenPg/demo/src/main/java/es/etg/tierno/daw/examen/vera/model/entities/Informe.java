package es.etg.tierno.daw.examen.vera.model.entities;

import java.util.List;

import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Desarrolladora;
import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Directora;
import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Experto;
import es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo.Junior;

public class Informe implements Analisis{

    private Empresa empresa;
    

    public Informe(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    // Metodos relacionados a la Empresa (gerealmente).
    @Override
    public double calcularMayorSueldo(List<Trabajador> trabajadores) {
        double sueldoMayor = 0;
        double sueldoSiguiente = 0;

        for (int i = 0; i < trabajadores.size(); i++) {
            sueldoSiguiente = trabajadores.get(i).getSueldo();
            if (sueldoSiguiente > sueldoMayor){
                sueldoMayor = sueldoSiguiente;
            }
        }
        return sueldoMayor;
    }

    @Override
    public double calcularMenorSueldo(List<Trabajador> trabajadores) {

        double sueldoMenor = 100000;
        double sueldoSiguiente = 100000;

        for (int i = 0; i < trabajadores.size(); i++) {
            sueldoSiguiente = trabajadores.get(i).getSueldo();
            if (sueldoSiguiente < sueldoMenor){
                sueldoMenor = sueldoSiguiente;
            }
        }
        return sueldoMenor;
    }

    @Override
    public double calcularMedioSueldo(List<Trabajador> trabajadores) {

        double sueldoTotal = 0;
        double sueldoMedia = 0;
        double sueldoSiguiente = 0;

        for (int i = 0; i < trabajadores.size(); i++) {
            sueldoSiguiente = trabajadores.get(i).getSueldo();
            sueldoTotal += sueldoSiguiente;
        }

        sueldoMedia = sueldoTotal / trabajadores.size();

        return sueldoMedia;
    }

    @Override
    public double calcularVariacionMediaSueldo(List<Trabajador> trabajadores) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularVariacionMediaSueldo'");
    }

    // Metodos relacionados a Directora.
    @Override
    public double calcularMayorSueldoDirectora(List<Directora> trabajador) {
        double sueldoMayor = 0;
        double sueldoSiguiente = 0;

        for (int i = 0; i < trabajador.size(); i++) {
            sueldoSiguiente = trabajador.get(i).getSueldo();
            if (sueldoSiguiente > sueldoMayor){
                sueldoMayor = sueldoSiguiente;
            }
        }
        return sueldoMayor;
    }

    @Override
    public double calcularMenorSueldoDirectora(List<Directora> trabajador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularMenorSueldoDirectora'");
    }


    // Metodos relacionados a Experto.
    @Override
    public double calcularMayorSueldoExperto(List<Experto> trabajador) {
        double sueldoMayor = 0;
        double sueldoSiguiente = 0;

        for (int i = 0; i < trabajador.size(); i++) {
            sueldoSiguiente = trabajador.get(i).getSueldo();
            if (sueldoSiguiente > sueldoMayor){
                sueldoMayor = sueldoSiguiente;
            }
        }
        return sueldoMayor;
    }

    @Override
    public double calcularMedioSueldoExperto(List<Experto> trabajador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularMedioSueldoExperto'");
    }

    // Metodos relacionados a Desarrolladoras.
    @Override
    public double calcularMayorSueldoDesarrolladora(List<Desarrolladora> trabajador) {
        double sueldoMayor = 0;
        double sueldoSiguiente = 0;

        for (int i = 0; i < trabajador.size(); i++) {
            sueldoSiguiente = trabajador.get(i).getSueldo();
            if (sueldoSiguiente > sueldoMayor){
                sueldoMayor = sueldoSiguiente;
            }
        }
        return sueldoMayor;
    }

    @Override
    public double calcularMedioSueldoDesarrolladora(List<Desarrolladora> trabajador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularMedioSueldoDesarrolladora'");
    }

    // Metodos relacionados a Junior.
    @Override
    public double calcularMayorSueldoJunior(List<Junior> trabajador) {
        double sueldoMayor = 0;
        double sueldoSiguiente = 0;

        for (int i = 0; i < trabajador.size(); i++) {
            sueldoSiguiente = trabajador.get(i).getSueldo();
            if (sueldoSiguiente > sueldoMayor){
                sueldoMayor = sueldoSiguiente;
            }
        }
        return sueldoMayor;
    }

    @Override
    public double calcularMedioSueldoJunior(List<Junior> trabajador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularMedioSueldoJunior'");
    }


    @Override
    public String toString() {
        final String PLANTILLA = "INFORME ESTADISTICO DE " + empresa.getSector() + "\n" + "Número de trabajadores analizados: " + empresa.getNumeroTrabajadores();
        return PLANTILLA;
    }


    
}
