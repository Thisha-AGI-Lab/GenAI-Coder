module com.thisha.agi.tools.coder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.thisha.agi.tools.coder to javafx.fxml;
    exports com.thisha.agi.tools.coder;
}