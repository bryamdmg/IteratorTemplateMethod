package TemplateMethod.gui;

import TemplateMethod.logic.SistemaOperativo;
import TemplateMethod.logic.Windows;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class WindowsController {
    @FXML
    private Label labelPaso1;
    @FXML
    private Label labelPaso2;
    @FXML
    private Label labelPaso3;
    @FXML
    private Label labelPaso4;

    @FXML
    public void encenderWindows() {
        SistemaOperativo windows = new Windows();
        windows.iniciarSistemaOperativo("Windows");
        labelPaso1.setText("Iniciar firmware UEFI");
        labelPaso2.setText("Cargar núcleo Windows NT");
        labelPaso3.setText("Arranca Windows Boot Manager");
        labelPaso4.setText("Muestra escritorio Windows");
    }

    @FXML
    public void redirectToDemo() {
        try {
            Demo.cambiarVista("computadora-view.fxml",600, 400);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}

