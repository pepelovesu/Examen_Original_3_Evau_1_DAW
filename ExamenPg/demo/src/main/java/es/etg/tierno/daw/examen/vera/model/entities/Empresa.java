package es.etg.tierno.daw.examen.vera.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements Gestionable{
    private String sector;
    private List<Trabajador> trabajadores = new ArrayList<>();

    public Empresa(String sector, List<Trabajador> trabajadores) {
        this.sector = sector;
        this.trabajadores = trabajadores;
    }

    public Empresa() {
        
    }
    
    public Empresa(String sector) {
        this.sector = sector;
    }
    
    
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }
    public int getNumeroTrabajadores() {
        return trabajadores.size();
    }
    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    @Override
    public void add(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }
    @Override
    public void del(Trabajador trabajador) {
        trabajadores.remove(trabajador);
    }
}
