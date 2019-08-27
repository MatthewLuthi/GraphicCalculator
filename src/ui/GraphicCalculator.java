package ui;

import applicationlogic.Calculator;
import eventlisteners.AddListener;
import eventlisteners.NumberListener;
import eventlisteners.SubtractListener;

import javax.swing.*;
import java.awt.*;

/**
 * Display text and graphics in Java (Add images to buttons)
 */
public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private Calculator calculator;

    private JTextField numberField;
    private OperationsPanel operationsPanel;
    private NumericPanel numericPanel;


    public GraphicCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(230,320));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
//        operationsPanel = new OperationsPanel();
//        operationsPanel.getAddButton().addActionListener(new AddListener(calculator, numberField));
//        operationsPanel.getSubtractButton().addActionListener(new SubtractListener(calculator, numberField));

        container.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        numberField = new JTextField("0");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 0;
        container.add(numberField, c);

        numericPanel = new NumericPanel();
        for (JButton button : numericPanel.getNumberPad()) {
            button.addActionListener(new NumberListener(calculator, numberField));
        }
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        container.add(numericPanel, c);

        operationsPanel = new OperationsPanel();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 1;
        container.add(operationsPanel, c);
    }

    public JFrame getFrame() {
        return frame;
    }
}
