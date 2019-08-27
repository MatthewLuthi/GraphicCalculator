package ui.ui.panels;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AlphanumericPanel extends JPanel {

    private List<JButton> numberPad;
    private JButton clearButton;

    public AlphanumericPanel() {
        super(new GridBagLayout());

        numberPad = new ArrayList<JButton>();
        createComponents();
    }

    private void createComponents() {
        createNumberPad();
    }

    private void createNumberPad() {
        GridBagConstraints c = new GridBagConstraints();

        clearButton = new JButton("C");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        add(clearButton, c);


        JButton button = new JButton("7");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        numberPad.add(button);
        add(button, c);

        button = new JButton("8");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 1;
        numberPad.add(button);
        add(button, c);

        button = new JButton("9");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 1;
        numberPad.add(button);
        add(button, c);

        button = new JButton("4");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 2;
        numberPad.add(button);
        add(button, c);

        button = new JButton("5");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 2;
        numberPad.add(button);
        add(button, c);

        button = new JButton("6");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 2;
        numberPad.add(button);
        add(button, c);

        button = new JButton("1");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 3;
        numberPad.add(button);
        add(button, c);

        button = new JButton("2");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 3;
        numberPad.add(button);
        add(button, c);

        button = new JButton("3");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 3;
        numberPad.add(button);
        add(button, c);

        button = new JButton("0");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 4;
        numberPad.add(button);
        add(button, c);

        button = new JButton(".");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 4;
        numberPad.add(button);
        add(button, c);
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public List<JButton> getNumberPad() {
        return numberPad;
    }
}
