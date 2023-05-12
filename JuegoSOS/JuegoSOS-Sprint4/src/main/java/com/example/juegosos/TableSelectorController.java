package com.example.juegosos;

import com.example.juegososlogica.Ficha;
import com.example.juegososlogica.Tablero;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TableSelectorController {
    @FXML
    Button btnSelector;
    @FXML
    RadioButton rbSimple, rbGeneral;
    @FXML
    TextField tfRow, tfColumn;


    public void selectorGame() throws IOException {
        int row = Integer.parseInt(this.tfRow.getText());
        int column = Integer.parseInt(this.tfColumn.getText());

        //Asignamos los valores de las filas y columnas al tablero
        Tablero.setNroRow(row);
        Tablero.setNroColumn(column);
        //inicializamos el tablero de tamaño rowxcolumn
        Ficha [][] table = new Ficha[row][column];
        Tablero.setTable(table);

        //guardamos modo de juego
        if(row<3 && column<3){
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("El tamaño del tablero debe ser: ");
            message.setTitle("Tamañao de tablero");
            message.setContentText("Mayor o igual a un tablero 3x3");
            message.showAndWait();
        }else{
            if(rbSimple.isSelected()){
                Tablero.setModeGame("Simple");
                FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("table-view.fxml"));
                Parent root1 = fxmlLoader1.load();
                TableController tableController = fxmlLoader1.getController();

                Scene scene1 = new Scene(root1, 447,872);
                Stage stage1 = new Stage();

                stage1.setScene(scene1);
                stage1.setTitle("TheGameSOS");
                stage1.show();

                //Cerramos la ventana welcome-view
                Stage myStage1 = (Stage) this.btnSelector.getScene().getWindow();
                myStage1.close();
            }else if(rbGeneral.isSelected()){
                if(row == 3 && column == 3){
                    Alert message = new Alert(Alert.AlertType.INFORMATION);
                    message.setHeaderText("Solo puedes seleccionar el modo de juego: ");
                    message.setTitle("Modo de juego");
                    message.setContentText("Simple en un tablero de 3x3");
                    message.showAndWait();
                }else{
                    Tablero.setModeGame("General");
                    FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("table-view.fxml"));
                    Parent root1 = fxmlLoader1.load();
                    TableController tableController = fxmlLoader1.getController();

                    Scene scene1 = new Scene(root1, 447,872);
                    Stage stage1 = new Stage();

                    stage1.setScene(scene1);
                    stage1.setTitle("TheGameSOS");
                    stage1.show();

                    //Cerramos la ventana welcome-view
                    Stage myStage1 = (Stage) this.btnSelector.getScene().getWindow();
                    myStage1.close();
                }
            }
        }

    }
}
