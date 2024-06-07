module es.etg.tierno.daw.examen.vera {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens es.etg.tierno.daw.examen.vera to javafx.fxml;
    opens es.etg.tierno.daw.examen.vera.view to javafx.fxml;
    exports es.etg.tierno.daw.examen.vera to javafx.graphics;
    exports es.etg.tierno.daw.examen.vera.controller;
    exports es.etg.tierno.daw.examen.vera.view;
}
