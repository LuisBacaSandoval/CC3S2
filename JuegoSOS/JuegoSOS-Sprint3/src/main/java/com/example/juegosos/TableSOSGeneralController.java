package com.example.juegosos;

import com.example.juegososlogica.Tablero;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class TableSOSGeneralController implements Initializable {
    @FXML
    Button btnIngresa;
    @FXML
    TextField row, column;
    @FXML
    RadioButton rbS, rbO;
    @FXML
    private Pane paneTable;
    GridPane gpTable;
    public void enterLetterGeneral(){
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addGridPane();
    }
    private void addGridPane(){
        gpTable = new GridPane();
        gpTable.setPrefSize(300, 300);
        gpTable.setGridLinesVisible(true);
        gpTable.setStyle("-fx-background-color: white;");
        gpTable.setLayoutX((447-300)/2);
        gpTable.setLayoutY(350);

        // Configura el número de filas y columnas del GridPane
        int numRows = Tablero.getNroRow();
        int numCols = Tablero.getNroColumn();
        for (int row = 0; row < numRows; row++) {
            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setPercentHeight(100.0 / numRows);
            gpTable.getRowConstraints().add(rowConstraints);
        }
        for (int col = 0; col < numCols; col++) {
            ColumnConstraints colConstraints = new ColumnConstraints();
            colConstraints.setPercentWidth(100.0 / numCols);
            gpTable.getColumnConstraints().add(colConstraints);
        }

        paneTable.getChildren().add(gpTable);
    }

}
