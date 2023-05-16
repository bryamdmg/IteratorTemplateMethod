package mx.uv.fei.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class ComputadoraController {
    @FXML
    private Label labelEncender;

    @FXML
    private GridPane gridPaneSO;

    @FXML
    public void encender() {
        labelEncender.setText("Antes de encenderla, selecciona un Sistema Operativo:");
        gridPaneSO.setVisible(true);
    }

    @FXML
    public void redirectToWindows() {
        try {
            Demo.cambiarVista("windows-view.fxml",600, 400);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    @FXML
    public void redirectToLinux() {
        try {
            Demo.cambiarVista("linux-view.fxml",600, 400);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    @FXML
    public void redirectToMacOS() {
        try {
            Demo.cambiarVista("macos-view.fxml",600, 400);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}