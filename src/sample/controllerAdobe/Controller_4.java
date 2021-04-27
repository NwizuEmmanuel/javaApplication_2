package sample.controllerAdobe;

import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller_4 implements Initializable {


    @FXML
    private TextField priceTagField;

    @FXML
    private TextField typeTagField;

    @FXML
    private ImageView imgView;

    @FXML
    private JFXComboBox<String> dishSign;

    @FXML
    private JFXComboBox<String> packageStyle;

    public void priceTagFieldListener(String imgPath, String priceTag, String typeTag) throws FileNotFoundException {
        priceTagField.setText(priceTag);
        typeTagField.setText(typeTag);
        File file = new File(imgPath);
        FileInputStream myIs = new FileInputStream(file);
        Image im = new Image(myIs);
        imgView.setImage(im);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> list = FXCollections.observableArrayList("Foil","Fancy plate");
        dishSign.setItems(list);
        ObservableList<String> list1 = FXCollections.observableArrayList("French","African");
        packageStyle.setItems(list1);
    }
}
