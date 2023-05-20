package TemplateMethod.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Demo extends Application {
    private static Scene escena;

    public static void main(String[] args) {
        launch();
    }

    static void setRoot(String fxml) throws IOException {
        escena.setRoot(cargarFXML(fxml));
    }

    private static Parent cargarFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Demo.class.getResource(fxml));
        return fxmlLoader.load();
    }

    public static void cambiarVista(String url, int width, int height) throws IOException {
        Stage currentStage = (Stage) escena.getWindow();
        configurarStage(currentStage, width, height);
        Demo.setRoot(url);
    }

    private static void configurarStage(Stage stage, int width, int height) {
        stage.setWidth(width);
        stage.setHeight(height);
        stage.centerOnScreen();
    }

    @Override
    public void start(Stage stage) throws IOException {
        escena = new Scene(cargarFXML("computadora-view.fxml"), 600, 400);
        stage.setTitle("Ejemplo Temple Method");
        stage.setScene(escena);
        stage.show();
    }
}