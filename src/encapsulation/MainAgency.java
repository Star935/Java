package encapsulation;

import javax.swing.*;

public class MainAgency {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.setAdress(JOptionPane.showInputDialog("Enter your direction"));
        agency.setAgentName(JOptionPane.showInputDialog("Name of your agency"));
        agency.setPrice(Integer.parseInt(JOptionPane.showInputDialog("Price")));
        JOptionPane.showMessageDialog(null,"The name of the agency is "+agency.getAgentName());
    }
}
