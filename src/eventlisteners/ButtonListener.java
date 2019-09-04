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

    protected double getLastEnteredNumericValue() {
        String[] numberGroupings = groupNumbersUsingOperationWildcards();
        return Double.parseDouble(numberGroupings[numberGroupings.length - 1]);
    }

    private String[] groupNumbersUsingOperationWildcards() {
        return numberField.getText().split("[^0-9.]");
    }

    protected boolean numberFieldContainsInitialNumber() {
        return groupNumbersUsingOperationWildcards().length == 1;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public JTextField getNumberField() {
        return numberField;
    }
}
