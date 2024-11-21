module dk.easv.demo432 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.demo432 to javafx.fxml;
    exports dk.easv.demo432;
}