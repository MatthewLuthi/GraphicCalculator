package eventlisteners;

import applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class NumberListener extends ButtonListener {
    public NumberListener(Calculator calculator, JTextField numberField) {
        super(calculator, numberField);
    }
}
