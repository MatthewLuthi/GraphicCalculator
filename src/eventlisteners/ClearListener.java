package eventlisteners;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ClearListener extends ButtonListener {

    private JTextField resultField;

    public ClearListener(JTextField numberField, JTextField resultField) {
        super(numberField);
        this.resultField = resultField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getNumberField().setText("");
        resultField.setText("");
    }
}
