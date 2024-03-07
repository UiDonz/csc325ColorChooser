module com.example.colorchooserdb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.colorchooserdb to javafx.fxml;
    exports com.example.colorchooserdb;
}