package es.etg.tierno.daw.examen.vera.model.entities.PuestosTrabajo;

public enum Puesto {

    DIRECTORA("DIRECTORA", 1), 
    EXPERTO("EXPERTO", 2), 
    DESARROLADORA("DESARROLLADORA", 3), 
    JUNIOR("JUNIOR", 4);

    private String puesto;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    Puesto(){
    }

    Puesto(String puesto, int codigo){
        this.puesto = puesto;
        this.codigo = codigo;
    }
}
