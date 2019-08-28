package eventlisteners.eventlisteners.operations;

import applicationlogic.Calculator;
import eventlisteners.ButtonListener;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DivideListener extends ButtonListener {
    public DivideListener(Calculator calculator, JTextField numberField) {
        super(calculator, numberField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getCalculator().divide(getLastEnteredNumericValue());
        getNumberField().setText(getNumberField().getText() + e.getActionCommand());
        System.out.println(getCalculator().getValue());
    }
}
