package ui;

import applicationlogic.Calculator;
import eventlisteners.AddListener;
import eventlisteners.SubtractListener;

import javax.swing.*;
import java.awt.*;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private Calculator calculator;

    private JTextField numberField;
    private OperationsPanel operationsPanel;


    public GraphicCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(230,320));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(2, 1));

        numberField = new JTextField("0");
        numberField.setEnabled(false);

        operationsPanel = new OperationsPanel();
        operationsPanel.getAddButton().addActionListener(new AddListener(calculator, numberField));
        operationsPanel.getSubtractButton().addActionListener(new SubtractListener(calculator, numberField));

        container.add(numberField);
        container.add(operationsPanel);
        container.add(new NumericPanel());
    }

    public JFrame getFrame() {
        return frame;
    }
}
