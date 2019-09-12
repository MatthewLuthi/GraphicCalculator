package eventlisteners.eventlisteners.operations;

import applicationlogic.Calculator;
import eventlisteners.ButtonListener;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SubtractListener extends ButtonListener {

    public SubtractListener(Calculator calculator, JTextField numberField) {
        super(calculator, numberField);
    }
}
