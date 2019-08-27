package eventlisteners;

import applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    private Calculator calculator;
    private JTextField numberField;

    public ButtonListener(Calculator calculator, JTextField numberField) {
        this.calculator = calculator;
        this.numberField = numberField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        numberField.setText("");
    }

    //TODO: problematic to operational listeners (numberformat exception when writing x,+,-,/...
    protected int getNumericInput() {
        try {
            return Integer.parseInt(numberField.getText());
        } catch (NumberFormatException e) {
            numberField.setText("");
            return 0;
         }
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public JTextField getNumberField() {
        return numberField;
    }
}
