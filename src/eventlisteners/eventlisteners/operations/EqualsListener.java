package eventlisteners.eventlisteners.operations;

import applicationlogic.Calculator;
import eventlisteners.ButtonListener;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class EqualsListener extends ButtonListener {

    private JTextField resultField;

    public EqualsListener(Calculator calculator, JTextField numberField, JTextField resultField) {
        super(calculator, numberField);
        this.resultField = resultField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        resultField.setText(Double.toString(getCalculator().getValue()));
    }
}
