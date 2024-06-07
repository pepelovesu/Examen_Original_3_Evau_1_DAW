package es.etg.tierno.daw.examen.vera.controller;

import java.io.IOException;

import es.etg.tierno.daw.examen.vera.App;
import es.etg.tierno.daw.examen.vera.model.dao.BaseDatos;
import es.etg.tierno.daw.examen.vera.model.dao.FactoryBD;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EmpresaController extends Application{

    public final String FICHERO_FXML = "view/empresa";
    private Scene scene;
    private BaseDatos dao;

    @Override
    public void start(Stage stage) throws IOException {
        dao = FactoryBD.obtener(null);
        scene = new Scene(loadFXML(FICHERO_FXML), 600, 400);
        stage.setScene(scene);
        stage.setTitle("Recursos Humanos - DAWSoft");
        stage.show();
    }

    void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
}
