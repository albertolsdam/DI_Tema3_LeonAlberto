/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import componentes_leonalberto.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Alberto Leon
 */
public class AppUsoTextoBotonController implements Initializable {
    
    @FXML
    private Label labelGrabar;
    @FXML
    private CampoTextoBoton campo1;
    @FXML
    private CampoTextoBoton campo2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        campo1.getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                labelGrabar.setText("Se ha guardado: "+campo1.getText());
            }
        });

        campo2.getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                labelGrabar.setText("Se ha guardado: "+campo2.getText());
            }
        });
    }    
    
}
