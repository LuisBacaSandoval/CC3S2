package com.example.juegosos;

import com.example.juegososlogica.Ficha;
import com.example.juegososlogica.Tablero;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;

public class TableSOSController{
    @FXML
    Button btnIngresar;
    @FXML
    ImageView imgColor;
    @FXML
    GridPane gpTable;
    @FXML
    TextField row, column;
    @FXML
    RadioButton rbS, rbO;


    public void enterLetter(){
        int row = Integer.parseInt(this.row.getText()) - 1;
        int column = Integer.parseInt(this.column.getText()) - 1;
        String aux="";
        String letra="";

        Label lb = new Label("-");
        if(rbS.isSelected()){
            lb = new Label("S");
            letra = "S";
            if(Tablero.getTurn()=="JFR"){
                lb.setTextFill(Color.color(1, 0, 0));
                aux = "red";
            }else if(Tablero.getTurn()=="JFA"){
                lb.setTextFill(Color.color(0, 0, 1));
                aux = "blue";
            }
        }else if(rbO.isSelected()){
            lb = new Label("O");
            letra = "O";
            if(Tablero.getTurn()=="JFR"){
                lb.setTextFill(Color.color(1, 0, 0));
                aux = "red";
            }else if(Tablero.getTurn()=="JFA"){
                lb.setTextFill(Color.color(0, 0, 1));
                aux = "blue";
            }
        }
        if(row>=Tablero.getNroRow() || column>=Tablero.getNroColumn()){
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("El tamaño del tablero es: "+Tablero.getNroRow()+"x"+Tablero.getNroColumn());
            message.setTitle("Limite filas y columnas");
            message.setContentText("No puedes superar ese límite.");
            message.showAndWait();
        }else{
            Tablero.setFicha(row,column,aux,letra);
            gpTable.add(lb,column,row);
            if(Tablero.jugar()=="red"){
                Alert message = new Alert(Alert.AlertType.INFORMATION);
                message.setHeaderText("El jugador que ganó es: : ");
                message.setTitle("Ganador...");
                message.setContentText("Red");
                message.showAndWait();
            }else if(Tablero.jugar()=="blue"){
                Alert message = new Alert(Alert.AlertType.INFORMATION);
                message.setHeaderText("El jugador que ganó es: : ");
                message.setTitle("Ganador...");
                message.setContentText("Blue");
                message.showAndWait();
            }else if(Tablero.jugar()=="empate"){
                Alert message = new Alert(Alert.AlertType.INFORMATION);
                message.setHeaderText("El jugador que ganó es: : ");
                message.setTitle("Ganador...");
                message.setContentText("Empate");
                message.showAndWait();
            }else{
                if(Tablero.getTurn() == "JFR"){
                    Tablero.setTurn("JFA");
                }else if(Tablero.getTurn() == "JFA"){
                    Tablero.setTurn("JFR");
                }
            }
        }


    }

}