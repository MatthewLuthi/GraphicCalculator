package eventlisteners;

import applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddListener extends ButtonListener{

    public AddListener(Calculator calculator, JTextField numberField) {
        super(calculator, numberField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int value = validateInput();
        getCalculator().add(value);
    }
}
