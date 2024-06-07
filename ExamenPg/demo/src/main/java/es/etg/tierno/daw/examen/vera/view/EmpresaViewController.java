package es.etg.tierno.daw.examen.vera.view;

import es.etg.tierno.daw.examen.vera.controller.EmpresaController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;

public class EmpresaViewController {

    
    private EmpresaController controller;

    public void setController(EmpresaController controller) {
        this.controller = controller;
    }


    @FXML
    private Button btGenerarInforme;

    @FXML
    private Button btInsertarTrabajador;

    @FXML
    private Label lbDNI;

    @FXML
    private Label lbNombre;

    @FXML
    private Label lbPuesto;

    @FXML
    private Label lbSueldo;

    @FXML
    private MenuItem mbDesarrollador;

    @FXML
    private MenuItem mbDirector;

    @FXML
    private MenuItem mbExperto;

    @FXML
    private MenuItem mbJunior;

    @FXML
    private MenuButton mbPuesto;

    @FXML
    void addTrabajador(MouseEvent event) {

    }

    @FXML
    void generarInforme(MouseEvent event) {

    }
}
