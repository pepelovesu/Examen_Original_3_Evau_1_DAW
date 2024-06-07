package es.etg.tierno.daw.examen.vera.model.dao;


public interface BaseDatos {
    public int insertarTrabajador(String nombre, String dni, double sueldo, String puesto);
    public void seleccionar();
}
