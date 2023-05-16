package mx.uv.fei.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import mx.uv.fei.logic.Linux;
import mx.uv.fei.logic.SistemaOperativo;

import java.io.IOException;

public class LinuxController {
    @FXML
    private Label labelPaso1;
    @FXML
    private Label labelPaso2;
    @FXML
    private Label labelPaso3;
    @FXML
    private Label labelPaso4;
    @FXML
    private Label labelPaso5;
    @FXML
    private Label labelPaso6;
    @FXML
    private Label labelDistros;
    @FXML
    private GridPane gridPaneDistros;

    @FXML
    public void encenderLinux() {
        labelDistros.setVisible(true);
        gridPaneDistros.setVisible(true);
    }

    @FXML
    public void arch() {
        SistemaOperativo arch = new Linux();
        arch.iniciarSistemaOperativo("Arch");
        labelPaso1.setText("Inicia POST");
        labelPaso2.setText("Cargar UEFI");
        labelPaso3.setText("Arranca bootloader GRUB");
        labelPaso4.setText("Cargar kernels de Arch");
        labelPaso5.setText("Se ejecuta Init");
        labelPaso6.setText("Muestra escritorio GNOME");
    }
    @FXML
    public void ubuntu() {
        SistemaOperativo arch = new Linux();
        arch.iniciarSistemaOperativo("Ubuntu");
        labelPaso1.setText("Inicia POST");
        labelPaso2.setText("Cargar UEFI");
        labelPaso3.setText("Arranca bootloader GRUB");
        labelPaso4.setText("Cargar kernels de Ubuntu");
        labelPaso5.setText("Se ejecuta Init");
        labelPaso6.setText("Muestra escritorio KDE");
    }
    @FXML
    public void fedora() {
        SistemaOperativo arch = new Linux();
        arch.iniciarSistemaOperativo("Fedora");
        labelPaso1.setText("Inicia POST");
        labelPaso2.setText("Cargar UEFI");
        labelPaso3.setText("Arranca bootloader GRUB");
        labelPaso4.setText("Cargar kernels de Fedora");
        labelPaso5.setText("Se ejecuta Init");
        labelPaso6.setText("Muestra escritorio XCFE");
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
