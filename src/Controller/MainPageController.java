package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class MainPageController {

    public TextField txtUserName;
    public PasswordField txtPassword;
    public AnchorPane mainPageContext;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        if(txtUserName.getText().equals("Darshana") && txtPassword.getText().equals("q123")){
            URL resource = getClass().getResource("../view/RegisterForm.fxml");
            Parent load = FXMLLoader.load(resource);
            mainPageContext.getChildren().clear();
            mainPageContext.getChildren().add(load);
        }else{
            new Alert(Alert.AlertType.WARNING, "User Name or Password is incorrect..!").show();
        }
    }

    public void goToPasswordField(ActionEvent actionEvent) {
        txtPassword.requestFocus();
    }

    public void goToRegisterButton(ActionEvent actionEvent) throws IOException {
        loginOnAction(actionEvent);
    }
}
