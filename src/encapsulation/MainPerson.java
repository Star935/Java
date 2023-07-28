package encapsulation;

import javax.swing.*;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName(JOptionPane.showInputDialog("Enter the name"));
        System.out.println(person.getName());

        Person person2 = new Person();
        person2.setName("Carla");
    }
}
