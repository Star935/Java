package encapsulation;

import javax.swing.*;

public class MainAddition {
    public static void main(String[] args) {
        Addition addition1 = new Addition();
        addition1.setNumber1(Integer.parseInt(JOptionPane.showInputDialog("Enter the number")));
        addition1.setNumber2(Integer.parseInt(JOptionPane.showInputDialog("Enter the second number")));
        JOptionPane.showMessageDialog(null,"The addition is "+addition1.additions());
    }
}
