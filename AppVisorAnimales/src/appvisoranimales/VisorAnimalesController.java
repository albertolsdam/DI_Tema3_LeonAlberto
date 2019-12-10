/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

/**
 *
 * @author Usuario
 */
public class VisorAnimalesController implements Initializable {

    @FXML
    private ListView<Animal> listviewAnimales;
    @FXML
    private ImageView imageView;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Animal gato = new Animal("Gato", "image/thumbgato.jpg", "image/gato.jpg");
        Animal pajaro = new Animal("Pajaro", "image/thumbpajaro.jpg", "image/pajaro.jpg");
        Animal perro = new Animal("Perro", "image/thumbperro.jpg", "image/perro.jpg");

        ObservableList<Animal> animales = FXCollections.observableArrayList();
        animales.addAll(gato, pajaro, perro);
        
        listviewAnimales.setItems(animales);
        listviewAnimales.setCellFactory((ListView<Animal> l) -> new CeldaImagenTexto());
        listviewAnimales.getSelectionModel().selectedItemProperty().addListener(
        (ObservableValue<? extends Animal> ov, Animal old_val, 
                Animal new_val) -> {
                imageView.setImage(new Image(new_val.getRutaGrande()));
        });
    }

}
