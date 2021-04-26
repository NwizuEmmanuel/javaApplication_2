package sample.controllerAdobe;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Controller_4 {


    @FXML
    private TextField priceTagField;

    @FXML
    private TextField typeTagField;

    @FXML
    private ImageView imgView;

    public void priceTagFieldListener(String imgPath, String priceTag, String typeTag) throws FileNotFoundException {
        priceTagField.setText(priceTag);
        typeTagField.setText(typeTag);
        File file = new File(imgPath);
        FileInputStream myIs = new FileInputStream(file);
        Image im = new Image(myIs);
        imgView.setImage(im);
    }
}
