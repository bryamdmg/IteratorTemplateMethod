module mx.uv.fei.gui.templemethod {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens mx.uv.fei.gui.templemethod to javafx.fxml;
    exports mx.uv.fei.gui.templemethod;
}