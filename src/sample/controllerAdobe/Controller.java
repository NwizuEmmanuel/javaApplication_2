package sample.controllerAdobe;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private JFXButton myAccBtn;

    @FXML
    private JFXButton imgButton;

    @FXML
    private TextField priceTagField;

    @FXML
    private TextField typeTagField;

    @FXML
    private Label priceTag;

    @FXML
    private Label typeTag;

    @FXML
    private JFXComboBox<String> dishSign;

    @FXML
    private JFXComboBox<String> packageStyle;

    public Controller() throws FileNotFoundException {
    }

    @FXML
    //This scene opens when my account button is clicked.
    private void myAccBtnListener(Event event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("/sample/fxmlAdobe/sample_3.fxml"));
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Account");
        stage.setScene(new Scene(root, 400, 400));
        stage.showAndWait();
    }

    @FXML
    private void imgButtonListener(Event event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/fxmlAdobe/sample_4.fxml"));

        Parent root=loader.load();
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Account");
        stage.setScene(new Scene(root, 800, 800));

        Controller_4 controller_4 = (Controller_4) loader.getController();
        String imgPath = "src/sample/images/bbq_1.jpg";
//        String imgPathCorr = imgPath.replace("\\", "/");
        controller_4.priceTagFieldListener(imgPath,"#3,000","Cow Hog(Beef)");
        stage.showAndWait();
    }


@Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    dishSign.getItems().addAll("Foil","Fancy Plate");
    packageStyle.getItems().addAll("French style","American style");
    }
}
