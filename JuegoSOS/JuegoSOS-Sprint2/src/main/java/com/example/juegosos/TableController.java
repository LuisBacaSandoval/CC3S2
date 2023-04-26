package com.example.juegosos;

import com.example.juegososlogica.Tablero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TableController{
    @FXML
    Button btnRed, btnBlue;
    @FXML
    public void navigateToNextWindow(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tableSOS-view.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root,447,872);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("TheGameSOS");
        stage.show();

        //Cerramos la ventana table-view
        Stage myStage = (Stage) this.btnRed.getScene().getWindow();
        myStage.close();

    }

    @FXML
    public void clickRedButton(ActionEvent actionEvent) throws IOException {
        Tablero.setJugador1("red");
        Tablero.setJugador2("blue");
        Tablero.setTurn("JFR");
        navigateToNextWindow(actionEvent);
    }
    @FXML
    public void clickBlueButton(ActionEvent actionEvent) throws IOException {
        Tablero.setJugador1("blue");
        Tablero.setJugador2("red");
        Tablero.setTurn("JFA");
        navigateToNextWindow(actionEvent);
    }
    @FXML
    public  void clickRandomButton(ActionEvent actionEvent) throws IOException {
        int numero = (int) (Math.random() * 2);
        System.out.println(numero);
        if(numero == 0){
            Tablero.setJugador1("red");
            Tablero.setJugador2("blue");
            Tablero.setTurn("JFR");
        }else{
            Tablero.setJugador1("blue");
            Tablero.setJugador2("red");
            Tablero.setTurn("JFA");
            navigateToNextWindow(actionEvent);
        }
        navigateToNextWindow(actionEvent);
    }
}