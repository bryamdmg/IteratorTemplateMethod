package TemplateMethod.gui;

import TemplateMethod.logic.MacOS;
import TemplateMethod.logic.SistemaOperativo;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class MacOSController {
    @FXML
    private Label labelPaso1;
    @FXML
    private Label labelPaso2;
    @FXML
    private Label labelPaso3;
    @FXML
    private Label labelPaso4;

    @FXML
    public void encenderMacOS() {
        SistemaOperativo macos = new MacOS();
        macos.iniciarSistemaOperativo("MacOS");
        labelPaso1.setText("Iniciar firmware EFI");
        labelPaso2.setText("Cargar núcleo XNU");
        labelPaso3.setText("Arranca Apple bootloader");
        labelPaso4.setText("Muestra escritorio");
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
