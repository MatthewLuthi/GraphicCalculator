package eventlisteners.eventlisteners.operations;

import applicationlogic.Calculator;
import eventlisteners.ButtonListener;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MultiplyListener extends ButtonListener {

    public MultiplyListener(Calculator calculator, JTextField numberField) {
        super(calculator, numberField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (numberFieldContainsInitialNumber()) {
            getCalculator().add(Double.parseDouble(getNumberField().getText()));
        } else {
            getCalculator().multiply(getLastEnteredNumericValue());

        }
        getNumberField().setText(getNumberField().getText() + e.getActionCommand());
    }
}
