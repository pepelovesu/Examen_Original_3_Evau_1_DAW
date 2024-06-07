module es.etg.prog.instituto {
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires javafx.graphics;

    opens es.etg.prog.instituto to javafx.fxml;
    opens es.etg.prog.instituto.view to javafx.fxml;
    exports es.etg.prog.instituto.controller;
    exports es.etg.prog.instituto.view;
    exports es.etg.prog.instituto.model;
}
