package view.pharmacyManagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PharmacyController implements Initializable {

    Stage stage;

        @FXML
        private AnchorPane loginPanel;

        @FXML
        private TextField emailTextField;

        @FXML
        private TextField passwordTextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        emailTextField.setPromptText("ENTER YOUR EMAIL");
        passwordTextField.setPromptText("ENTER YOUR PASSWORD");
    }

    @FXML
    private void closeStage(ActionEvent actionEvent) {
        stage = (Stage) loginPanel.getScene().getWindow();
            stage.close();
    }
}
