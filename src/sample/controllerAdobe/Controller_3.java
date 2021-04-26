package sample.controllerAdobe;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller_3 {

    @FXML
    private Button ChangeButton;



    @FXML
    private TextField infoScreen;

    @FXML
    private TextField infoScreen1;


    @FXML
    private Button okButton1;

    @FXML
    // change button update ur account info
    private void ChangeButtonListener(Event event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("/sample/fxmlAdobe/sample_2.fxml"));
        Stage stage = new Stage();
        Stage stage1 = (Stage) ChangeButton.getScene().getWindow();
        stage.setTitle("Your info");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setResizable(false);
        stage.setScene(new Scene(root, 300, 300));
        stage1.close();
        stage.show();
    }

    @FXML
    private void accountScreenListener(Event even) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/fxmlAdobe/sample_2.fxml"));
        Controller_2 myCont = (Controller_2) loader.getController();
        infoScreen.setText(myCont.username);
    }

    @FXML
    private void accountScreen1Listener(Event even) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/fxmlAdobe/sample_2.fxml"));
        Controller_2 myCont = (Controller_2) loader.getController();
        infoScreen1.setText(myCont.email);

    }

    @FXML
    private void okButton1Listener(Event event) throws IOException {
        Stage stage1 = (Stage) ChangeButton.getScene().getWindow();
        stage1.close();

    }
}
