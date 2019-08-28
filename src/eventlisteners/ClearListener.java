package eventlisteners;

import applicationlogic.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ClearListener extends ButtonListener {

    private JTextField resultField;

    public ClearListener(Calculator calculator, JTextField numberField, JTextField resultField) {
        super(calculator, numberField);
        this.resultField = resultField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getNumberField().setText("");
        resultField.setText("");
        getCalculator().clear();
    }
}
