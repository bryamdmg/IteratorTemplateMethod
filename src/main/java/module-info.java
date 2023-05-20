module mx.uv.fei.gui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    exports TemplateMethod.gui;
    opens TemplateMethod.gui to javafx.fxml;
}