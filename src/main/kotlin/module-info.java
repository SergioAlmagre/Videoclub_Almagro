module com.example.videoclub_almagro {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens controladores to javafx.fxml;
    exports controladores;
}