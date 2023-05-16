module mx.uv.fei.gui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    exports mx.uv.fei.gui;
    opens mx.uv.fei.gui to javafx.fxml;
}