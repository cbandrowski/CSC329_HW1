package org.example.csc329_hw1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HelloController {
    public ListView<String> uploadedList;
    public ListView removedList;
    public Label sizeLabel;
    public ListView copyList;
    public Label copyListSizeLabel;
    private PQList pqList = new PQList();
    @FXML
    private Label welcomeText;


    public void uploadFile(javafx.event.ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select a file to upload");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text File", "*.txt"));
        File selectedFile = fileChooser.showOpenDialog(new Stage());


        if(selectedFile == null) {
            uploadedList.getItems().add("File is Empty");
            return;
        }

        try(BufferedReader br = new BufferedReader(new FileReader(selectedFile))){
            String nameLine;
            while((nameLine = br.readLine()) != null){
                String scoreLine = br.readLine();
                int score = Integer.parseInt(scoreLine.trim());
                Player player = new Player(nameLine, score);
                pqList.add(player);
            }
        }catch (IOException | NumberFormatException e){
            e.printStackTrace();
        }
        updateListView();
    }
    private void updateListView(){
        if(pqList.isEmpty()){
            uploadedList.getItems().clear();
            uploadedList.getItems().add("No players found in list");
            return;
        }
        uploadedList.getItems().clear();
        String[] playerList = pqList.toString().split("\n");
        uploadedList.getItems().addAll(playerList);
        sizeLabel.setText(String.valueOf(pqList.getSize()));
    }

    public void removeHighest(ActionEvent actionEvent) {
       Player highest = pqList.getHighestScoreplayer();
       removedList.getItems().add(highest.toString());
       updateListView();
    }

    public void clearList(ActionEvent actionEvent) {
        pqList.clear();
        updateListView();
        removedList.getItems().clear();
        sizeLabel.setText("0");
    }

    public void copyConstructor(ActionEvent actionEvent) {
    }

    public void cloneMethod(ActionEvent actionEvent) {
    }

    public void compareNames(ActionEvent actionEvent) {
    }

    public void clearCopyList(ActionEvent actionEvent) {
    }
}