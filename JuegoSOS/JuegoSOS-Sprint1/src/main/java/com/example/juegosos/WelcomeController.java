package com.example.juegosos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {
    @FXML
    private Button btnStart;

    @FXML
    public void onButtonClickNextWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("table-view.fxml"));
        Parent root = fxmlLoader.load();
        TableController tableController = fxmlLoader.getController();

        Scene scene = new Scene(root, 447,872);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("TheGameSOS");
        stage.show();

        //Cerramos la ventana welcome-view
        Stage myStage = (Stage) this.btnStart.getScene().getWindow();
        myStage.close();
    }

}