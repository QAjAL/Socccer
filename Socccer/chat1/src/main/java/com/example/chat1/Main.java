package com.example.chat1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label questionLabel = new Label();
        TextField answerField = new TextField();
        Button submitButton = new Button("Подтвердить");

        SoccerQuiz quiz = new SoccerQuiz(questionLabel, answerField, submitButton);
        quiz.startQuiz();

        VBox root = new VBox(questionLabel, answerField, submitButton);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
