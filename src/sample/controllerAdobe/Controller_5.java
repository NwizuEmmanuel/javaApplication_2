package sample.controllerAdobe;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller_5 implements Initializable {

    @FXML
    private JFXButton cartBtn;

    @FXML
    private JFXListView<String> cartItems;

    @FXML
    private void cartItems(Event event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("/sample/fxmlAdobe/sample_5.fxml"));
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Your cart");
        stage.setScene(new Scene(root, 400, 400));
        stage.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> cartList = FXCollections.<String>observableArrayList("Caroline", "Kansas");
        cartItems.setItems(cartList);
    }
}
