package firstgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener {

    private static JLabel label_firstName;
    private static JLabel label_lastName;
    private static JLabel label_depCode;

    private static JTextField user_firstName;
    private static JTextField user_lastName;
    private static JComboBox comboBox;

    private static JButton button;
    private static JLabel getNewUser;
    private static JLabel getEmail;
    private static JLabel getPassword;

    private int defaultPassword = 10;


    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(365, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Employee administration");
        frame.add(panel);

        panel.setLayout(null);

        // label setup
        label_firstName = new JLabel("First Name:");
        label_firstName.setBounds(20, 20, 80, 25);
        panel.add(label_firstName);

        label_lastName = new JLabel("Last name:");
        label_lastName.setBounds(20, 50, 80, 25);
        panel.add(label_lastName);

        label_depCode = new JLabel("Dep. code:");
        label_depCode.setBounds(20, 80, 80, 25);
        panel.add(label_depCode);

        // text field setup
        user_firstName = new JTextField(20);
        user_firstName.setBounds(110, 20, 175, 25);
        panel.add(user_firstName);

        user_lastName = new JTextField(20);
        user_lastName.setBounds(110, 50, 175, 25);
        panel.add(user_lastName);

        comboBox = new JComboBox();
        comboBox.addItem("Sales");
        comboBox.addItem("Development");
        comboBox.addItem("Accounting");
        comboBox.getSelectedItem();
        comboBox.setBounds(110, 80, 175, 25);
        panel.add(comboBox);

        // button setup
        button = new JButton("Create new user");
        button.setBounds(90, 130, 200, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        // submit and print
        getNewUser = new JLabel("");
        getNewUser.setBounds(20, 165, 400, 50);
        getNewUser.setBackground(Color.white);
        panel.add(getNewUser);

        getEmail = new JLabel("");
        getEmail.setBounds(20, 195, 400, 50);
        panel.add(getEmail);

        getPassword = new JLabel("");
        getPassword.setBounds(20, 225, 400, 50);
        panel.add(getPassword);

        frame.setVisible(true);
    }


    // generate random password
    private String randomPassword(int length) {
        String characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$&";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * characters.length());
            password[i] = characters.charAt(random);
        }
        return new String(password);

    }

    public void actionPerformed(ActionEvent e) {

        String newUser = "New employee: " + user_firstName.getText() + " " + user_lastName.getText();
        String firstName = user_firstName.getText();
        String lastName = user_lastName.getText();
        String dep = (String )comboBox.getSelectedItem();
        String email = "New email: " + firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dep.toLowerCase() + ".company.com";
        String password = "New password: " + randomPassword(defaultPassword);

        getNewUser.setText(newUser);
        getEmail.setText(email);
        getPassword.setText(password);
    }
}
