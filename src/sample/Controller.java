package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private Label labelA;
    @FXML private Label labelB;
    @FXML private Label labelSum;
    @FXML private TextField TFA;
    @FXML private TextField TFB;
    @FXML private TextField TFSum;
    @FXML private Button Calc;
    @FXML private Button Clear;

    public void ClickedCalc(ActionEvent e) {
        double aNum = Double.parseDouble(TFA.getText());
        double bNum = Double.parseDouble(TFB.getText());
        TFSum.setText(Double.toString(aNum + bNum)); }
    public void ClickedClear(ActionEvent e) {
        TFA.setText(""); TFB.setText(""); TFSum.setText("");
    }
}



