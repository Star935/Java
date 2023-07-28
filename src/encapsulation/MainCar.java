package encapsulation;

import javax.swing.*;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlate(JOptionPane.showInputDialog("Plate"));
        car.setColor(JOptionPane.showInputDialog("Color"));
        car.setModel(Integer.parseInt(JOptionPane.showInputDialog("Model")));
        JOptionPane.showMessageDialog(null,car.getPlate());
    }
}
