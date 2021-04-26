package sample.controllerAdobe;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.io.IOException;

public class Controller_2 {

    @FXML
    private TextField usernameTf;

    @FXML
    private TextField emailTf;

    @FXML
    private Button saveButton;

    public String username = "";
    public String email = "";

    @FXML
    // the save button save ur latest info
    private void saveButtonListener(Event event) throws IOException {
        if ((usernameTf.getCharacters().length() >= 1) && (emailTf.getCharacters().length()>= 1)){
            saveButton.setCancelButton(false);
            Parent root;
            root = FXMLLoader.load(getClass().getResource("/sample/fxmlAdobe/sample_3.fxml"));
            Stage stage = new Stage();
            Stage stage1 = (Stage) saveButton.getScene().getWindow();
            stage.setTitle("Your info");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setResizable(false);
            stage.setScene(new Scene(root, 300, 300));
            stage1.close();
            stage.show();
            username = usernameTf.getText();
            email = emailTf.getText();
        }else {
            saveButton.setCancelButton(true);
        }
    }
}
