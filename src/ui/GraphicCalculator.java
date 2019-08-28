package ui;

import applicationlogic.Calculator;
import eventlisteners.ClearListener;
import eventlisteners.NumberListener;
import eventlisteners.eventlisteners.operations.*;
import ui.ui.panels.AlphanumericPanel;
import ui.ui.panels.OperationsPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Display text and graphics in Java (Add images to buttons)
 */
public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private Calculator calculator;

    private JTextField numberField;
    private JTextField resultField;
    private OperationsPanel operationsPanel;
    private AlphanumericPanel alphanumericPanel;


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
        container.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        numberField = new JTextField("");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 0;
        container.add(numberField, c);

        initResultField();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 1;
        container.add(resultField, c);

        initNumericPanel();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 2;
        container.add(alphanumericPanel, c);

        initOperationsPanel();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 2;
        container.add(operationsPanel, c);
    }

    private void initResultField() {
        resultField = new JTextField("");
        resultField.setFont(resultField.getFont().deriveFont(Font.BOLD, 25));
        resultField.setHorizontalAlignment(SwingConstants.RIGHT);
    }

    private void initNumericPanel() {
        alphanumericPanel = new AlphanumericPanel();

        for (JButton button : alphanumericPanel.getNumberPad()) {
            button.addActionListener(new NumberListener(calculator, numberField));
        }

        alphanumericPanel.getClearButton().addActionListener(new ClearListener(calculator, numberField, resultField));
    }

    private void initOperationsPanel() {
        operationsPanel = new OperationsPanel();

        operationsPanel.getAddButton().addActionListener(new AddListener(calculator, numberField));
        operationsPanel.getSubtractButton().addActionListener(new SubtractListener(calculator, numberField));
        operationsPanel.getMultiplyButton().addActionListener(new MultiplyListener(calculator, numberField));
        operationsPanel.getDivideButton().addActionListener(new DivideListener(calculator, numberField));
        operationsPanel.getEqualsButton().addActionListener(new EqualsListener(calculator, numberField, resultField));
    }

    public JFrame getFrame() {
        return frame;
    }
}
