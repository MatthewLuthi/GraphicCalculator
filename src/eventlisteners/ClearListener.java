package eventlisteners;

import applicationlogic.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ClearListener extends ButtonListener {

    public ClearListener(Calculator calculator, JTextField numberField) {
        super(calculator, numberField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getNumberField().setText("");
    }
}
