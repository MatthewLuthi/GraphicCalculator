package ui.ui.panels;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class OperationsPanel extends JPanel {

    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton;

    public OperationsPanel() {
        super(new GridLayout(5, 1));
        createComponents();
    }

    private void createComponents() {
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");

        add(divideButton);
        add(multiplyButton);
        add(subtractButton);
        add(addButton);
        add(equalsButton);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSubtractButton() {
        return subtractButton;
    }

    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    public JButton getDivideButton() {
        return divideButton;
    }

    public JButton getEqualsButton() {
        return equalsButton;
    }

    public List<JButton> getButtons() {
        List<JButton> buttons = new ArrayList<JButton>();
        buttons.add(addButton);
        buttons.add(subtractButton);
        buttons.add(multiplyButton);
        buttons.add(divideButton);
        buttons.add(equalsButton);

        return buttons;
    }
}
