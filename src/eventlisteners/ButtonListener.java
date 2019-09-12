package eventlisteners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    private JTextField numberField;

    public ButtonListener(JTextField numberField) {
        this.numberField = numberField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        numberField.setText(numberField.getText() + e.getActionCommand());
    }

    protected double getLastEnteredNumericValue() {
        String[] numberGroupings = groupNumbersUsingOperationWildcards();
        return Double.parseDouble(numberGroupings[numberGroupings.length - 1]);
    }

    private String[] groupNumbersUsingOperationWildcards() {
        return numberField.getText().split("[^0-9.]");
    }


    public JTextField getNumberField() {
        return numberField;
    }
}
