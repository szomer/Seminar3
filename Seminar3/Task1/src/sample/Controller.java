package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    public void clickOnConfirm(){
        System.out.println("confirm");
    }

    public void clickOnScore(){
        System.out.println("Scores");
    }

    public void clickOnBack(){
        System.out.println("Scores");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
