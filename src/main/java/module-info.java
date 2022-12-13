module com.httt.simpo_java {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires MaterialFX;
    opens com.httt.simpo_java to javafx.fxml;
    exports com.httt.simpo_java;
    exports com.httt.simpo_java.control;
    opens com.httt.simpo_java.control to javafx.fxml;


}