package com.example.juegosos;

import com.example.juegososlogica.Tablero;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
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
        System.out.println(Tablero.getTurn());
        int row = Integer.parseInt(this.row.getText()) - 1;
        int column = Integer.parseInt(this.column.getText()) - 1;
        Label lb = new Label("-");

        if(rbS.isSelected()){
            lb = new Label("S");
            if(Tablero.getTurn()=="JFR"){
                lb.setTextFill(Color.color(1, 0, 0));
            }else if(Tablero.getTurn()=="JFA"){
                lb.setTextFill(Color.color(0, 0, 1));
            }
        }else if(rbO.isSelected()){
            lb = new Label("O");
            if(Tablero.getTurn()=="JFR"){
                lb.setTextFill(Color.color(1, 0, 0));
            }else if(Tablero.getTurn()=="JFA"){
                lb.setTextFill(Color.color(0, 0, 1));
            }
        }
        gpTable.add(lb,row,column);
        if(Tablero.getTurn() == "JFR"){
            Tablero.setTurn("JFA");
        }else if(Tablero.getTurn() == "JFA"){
            Tablero.setTurn("JFR");
        }
    }

}
