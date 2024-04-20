package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import java.time.LocalTime;

public class Controller {
    @FXML
    private Button ContinuePage2;

    @FXML
    private Label title1;

    @FXML
    private Label title2;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private TextField nameinput;

    @FXML
    private TextField phoneinput;

    @FXML
    private TextField locationinput;

    @FXML
    private TextArea probleminput;

    @FXML
    private TextField severityinput;

    @FXML
    private Button ContinuePage3;

    @FXML
    private Label exception1;

    int phoneNumber;
    String name;
    String location;
    int severity;
    String problem;
    String logdate;
    String logtime;
    @FXML
    protected void onContinueClick1() {
            phoneNumber = Integer.parseInt(phoneinput.getText());
            exception1.setVisible(false);
            name = nameinput.getText();
            location = locationinput.getText();
            title1.setText("Please provide information on your emergency");
            label1.setText("Severity (out of 10):");
            label2.setText("Please describe the problem:");
            label3.setVisible(false);
            nameinput.setVisible(false);
            phoneinput.setVisible(false);
            locationinput.setVisible(false);
            ContinuePage2.setVisible(false);
            probleminput.setVisible(true);
            severityinput.setVisible(true);
            ContinuePage3.setVisible(true);

    }

    @FXML
    protected void onContinueClick2() {
        severity = Integer.parseInt(severityinput.getText());
        problem = probleminput.getText();
        label1.setVisible(false);
        label2.setVisible(false);
        probleminput.setVisible(false);
        severityinput.setVisible(false);
        ContinuePage3.setVisible(false);
        title1.setText("Thank you. Help is on the way");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        logdate = String.valueOf(date);
        logtime = String.valueOf(time);
        title2.setVisible(true);
        title2.setText("Your issue has been logged at " + time + " on " + date);
    }
}