package org.example.csc329_hw1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 1000);
        stage.setTitle("Player Scores");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
      // launch();
        PQList pqList = new PQList();
        File file = new File("/Users/cbandrowski/School/CSC311/CSC329_HW1/src/main/java/org/example/csc329_hw1/input.txt");

        if (!file.exists()) {
            System.out.println("File not found");
            return;
        }
        System.out.println("Reading file");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String nameline;
            while((nameline = br.readLine()) != null){
                String scoreLine = br.readLine();
                int score = Integer.parseInt(scoreLine.trim());
                pqList.add(new Player(nameline, score));
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading file");
        }
        System.out.println("\nPlayers Loaded:");
        System.out.println(pqList);
        System.out.println("List size" + pqList.getSize());

        System.out.println("\nRemove highest Score -----------------------------------------------------------------------------------------------------------");

        //Remove the highest score players and print updatedlist
        Player highest = pqList.getHighestScoreplayer();
        if(highest != null){
            System.out.println("Highest score is " + highest.toString());
        }
        System.out.println("Updated List:");
        System.out.println("Updated Size"+pqList.getSize());
        System.out.println(pqList);

        System.out.println("\nCopy Constructor ----------------------------------------------------------------------------------------------------------------");

        //Create a copy using the Copy Constructor
        PQList copyPqList = new PQList(pqList);
        System.out.println("Copy List size "+copyPqList.getSize());
        System.out.println(copyPqList);

        System.out.println("\nCreate Clone ---------------------------------------------------------------------");

        PQList cloneList = new PQList(pqList);
        System.out.println("Clone List size "+cloneList.getSize());
        System.out.println(cloneList);

        System.out.println("\nSearch using Equals ---------------------------------------------------------------------");
        String searchName = "Tyler Scott";
        Player foundPlayer = pqList.searchByName(searchName);
        if(foundPlayer != null){
            System.out.println("Found player " + foundPlayer);
        }else{
            System.out.println(searchName + " not found");
        }


    }
}