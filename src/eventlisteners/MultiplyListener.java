package eventlisteners;

import applicationlogic.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MultiplyListener extends ButtonListener {

    public MultiplyListener(Calculator calculator, JTextField numberField) {
        super(calculator, numberField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int value = validateInput();
        //getCalculator().subtract(value);
    }
}
