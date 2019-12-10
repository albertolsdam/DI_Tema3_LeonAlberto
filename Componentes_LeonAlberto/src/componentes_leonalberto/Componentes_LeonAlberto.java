/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package componentes_leonalberto;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class Componentes_LeonAlberto extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        CampoTextoBoton customControl = new CampoTextoBoton();
        SelectorDeslizamiento selector = new SelectorDeslizamiento();
        Temporizador temporizador = new Temporizador(20);
        
        customControl.setText("Hello!");
        customControl.getChildren().add(temporizador);
        temporizador.playTime();
        
        Scene scene = new Scene(customControl);
        //Scene scene = new Scene(selector);
        
        stage.setScene(scene);
        stage.setTitle("Custom Control");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
