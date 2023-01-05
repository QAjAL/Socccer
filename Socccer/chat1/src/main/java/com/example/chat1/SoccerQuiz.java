package com.example.chat1;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SoccerQuiz {
    private int score;
    private int currentQuestion;
    private Label questionLabel;
    private TextField answerField;
    private Button submitButton;
    private String[][] questionsAndAnswers = {
            {"Кто является лучшим бомбардиром английской Премьер-лиги?", "Алан Ширер"},
            {"Какая команда выиграла больше всего титулов Лиги чемпионов УЕФА?", "Реал Мадрид"},
            {"Кто единственный игрок, выигравший чемпионат мира и как игрок, и как тренер?", "Марио Загалло"},
            {"Какая страна выиграла больше всего чемпионатов мира по футболу?", "Бразилия"},
            {"Кто из игроков забил больше всего голов на одном чемпионате мира?", "Мирослав Клозе"},
            {"Кто самый дорогой игрок в истории футбола?", "Роналду"},
            {"Какая команда является рекордсменом по количеству последовательных титулов в высшей лиге?", "Селтик"},
            {"Кто является лучшим бомбардиром испанской Ла Лиги?", "Лионель Месси"},
            {"Какая команда выиграла больше всего титулов Кубка Америки?", "Аргентина"},
            {"Кто является лучшим бомбардиром итальянской Серии А?", "Сильвио Пиола"}
    };



    public SoccerQuiz(Label questionLabel, TextField answerField, Button submitButton) {
        this.score = 0;
        this.currentQuestion = 0;
        this.questionLabel = questionLabel;
        this.answerField = answerField;
        this.submitButton = submitButton;

        submitButton.setOnAction(event -> checkAnswer());
    }

    public void startQuiz() {
        displayQuestion();
    }

    private void displayQuestion() {
        String[] questionAndAnswer = questionsAndAnswers[currentQuestion];
        String question = questionAndAnswer[0];
        questionLabel.setText(question);
    }

    private void checkAnswer() {
        String[] questionAndAnswer = questionsAndAnswers[currentQuestion];
        String answer = questionAndAnswer[1];
        String userAnswer = answerField.getText();
        if (answer.equalsIgnoreCase(userAnswer)) {
            score++;
        }
        currentQuestion++;
        if (currentQuestion < questionsAndAnswers.length) {
            displayQuestion();
        } else {
            endQuiz();
        }
    }

    private void endQuiz() {
        questionLabel.setText("Викторина пройдена! Вы правильно ответили на " + score + " мз " + questionsAndAnswers.length + "вопросов.");
        answerField.setVisible(false);
        submitButton.setVisible(false);
    }
}
