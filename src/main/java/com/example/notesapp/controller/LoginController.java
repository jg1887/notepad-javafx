package com.example.notesapp.controller;

import com.example.notesapp.NotepadApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Text enterText;

    @FXML private void onEnterButtonClick() {
        Stage currentStage = NotepadApplication.getStage();
        FXMLLoader fxmlLoader = new FXMLLoader(NotepadApplication.class.getResource("HomeScreen.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 1920, 1080);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        currentStage.setTitle("Homepage");
        currentStage.setScene(scene);
        currentStage.show();
    }

}
