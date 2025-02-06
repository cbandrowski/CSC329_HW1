module org.example.csc329_hw1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.csc329_hw1 to javafx.fxml;
    exports org.example.csc329_hw1;
}