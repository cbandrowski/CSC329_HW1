package org.example.csc329_hw1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class HelloController {
    @FXML
    private Label welcomeText;

    public void uploadFile(javafx.event.ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select a file to upload");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text File", "*.txt"));
        File selectedFile = fileChooser.showOpenDialog(new Stage());

    }

}