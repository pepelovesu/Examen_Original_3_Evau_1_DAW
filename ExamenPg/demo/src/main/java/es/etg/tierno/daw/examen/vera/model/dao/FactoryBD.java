package es.etg.tierno.daw.examen.vera.model.dao;

public class FactoryBD {
    public static BaseDatos obtener(Modo modo){
        if (Modo.SLQLITE.equals(modo)) {
            return new SQLIteBD();
        } else if (Modo.MARIADB.equals(modo)) {
            return new MariaDB();
        } else if (Modo.ORACLE.equals(modo)) {
            return new OracleBD();
        } else {
            return new MuckBD();
        }
    }
}
