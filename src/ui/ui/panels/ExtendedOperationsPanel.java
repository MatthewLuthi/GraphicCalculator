package ui.ui.panels;

import javax.swing.*;
import java.awt.*;

public class ExtendedOperationsPanel extends JPanel {

    private JButton leftBracket, rightBracket, squareRoot, exponent;

    public ExtendedOperationsPanel() {
        super(new GridLayout(1, 4));
        createComponents();
    }

    private void createComponents() {
        leftBracket = new JButton("(");
        rightBracket = new JButton(")");
        squareRoot = new JButton("sqrt");
        exponent = new JButton("^");

        add(leftBracket);
        add(rightBracket);
        add(squareRoot);
        add(exponent);
    }

    public JButton getLeftBracket() {
        return leftBracket;
    }

    public JButton getRightBracket() {
        return rightBracket;
    }

    public JButton getSquareRoot() {
        return squareRoot;
    }

    public JButton getExponent() {
        return exponent;
    }
}

