/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import componentes_leonalberto.SelectorDeslizamiento;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 *
 * @author Usuario
 */
public class AppUsoSelectorFXMLController implements Initializable {

    @FXML
    private Label pulsado;
    @FXML
    private SelectorDeslizamiento selectorArriba;
    @FXML
    private SelectorDeslizamiento selectorAbajo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<String> arriba = new ArrayList<>();
        ArrayList<String> abajo = new ArrayList<>();

        arriba.add("1");
        arriba.add("2");
        arriba.add("3");

        abajo.add("UNO");
        abajo.add("DOS");
        abajo.add("TRES");

        selectorArriba.setItems(arriba);
        selectorArriba.setOnAction(e -> {
            pulsado.setText("Se ha pulsado el selector de arriba");
            pulsado.setTextFill(Color.RED);
        });

        selectorAbajo.setItems(abajo);
        selectorAbajo.setOnAction(e -> {
            pulsado.setText("Se ha pulsado el selector de abajo");
            pulsado.setTextFill(Color.BLUE);
        });
    }

}
