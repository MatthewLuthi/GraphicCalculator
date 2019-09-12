package ui;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        GraphicCalculator calculator = new GraphicCalculator();
        SwingUtilities.invokeLater(calculator);
    }
}
