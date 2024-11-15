module com.example.drawcat {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.drawcat to javafx.fxml;
    exports com.example.drawcat;
}