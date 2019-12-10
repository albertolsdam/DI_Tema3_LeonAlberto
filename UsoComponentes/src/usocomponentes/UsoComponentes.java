/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usocomponentes;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import componentes_leonalberto.*;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

/**
 *
 * @author Usuario
 */
public class UsoComponentes extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        CampoTextoBoton campoBoton = new CampoTextoBoton();
        campoBoton.setText("Hello!");
        VBox caja1 = new VBox();
        caja1.setAlignment(Pos.CENTER);
        
        Temporizador temporizador = new Temporizador(20);
        
        ArrayList<String> items = new ArrayList<>();
        items.add("0");
        items.add("1");
        items.add("2");

        CampoTextoNumerico control2 = new CampoTextoNumerico();
        SelectorDeslizamiento selector = new SelectorDeslizamiento();

        caja1.getChildren().add(campoBoton);
        caja1.getChildren().add(control2);
        caja1.getChildren().add(selector);
        
        selector.setItems(items);
        
        caja1.getChildren().add(temporizador);
        temporizador.playTime();

        Scene scene = new Scene(caja1);

        stage.setScene(scene);
        stage.setTitle("Mis Componentes - Alberto Leon");
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
