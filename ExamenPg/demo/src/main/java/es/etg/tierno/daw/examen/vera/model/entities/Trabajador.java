package es.etg.tierno.daw.examen.vera.model.entities;

public abstract class Trabajador {
    private String nombre;
    private String dni;
    protected int sueldo;
    protected String puesto;

    
    public Trabajador(String nombre, String dni, int sueldo, String puesto) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public String getPusto() {
        return puesto;
    }
    public void setPusto(String pusto) {
        this.puesto = pusto;
    }
}
