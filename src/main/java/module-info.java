module com.example.notesapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.notesapp to javafx.fxml;
    exports com.example.notesapp;
}