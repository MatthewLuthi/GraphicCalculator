package ui;

import applicationlogic.BasicCalculator;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        GraphicCalculator calculator = new GraphicCalculator(new BasicCalculator());
        SwingUtilities.invokeLater(calculator);
    }
}
