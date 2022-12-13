module project.librarydemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens project.LibraryDemo to javafx.fxml;
    exports project.LibraryDemo;
}