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
    private static JTextField user_depCode;

    private static JButton button;
    private static JLabel generate;

    private int defaultPassword = 10;


    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Employee administration");
        frame.add(panel);

        panel.setLayout(null);

        // label setup
        label_firstName = new JLabel("First Name:");
        label_firstName.setBounds(10, 20, 80, 25);
        panel.add(label_firstName);

        label_lastName = new JLabel("Last name:");
        label_lastName.setBounds(10, 50, 80, 25);
        panel.add(label_lastName);

        label_depCode = new JLabel("Dep. code:");
        label_depCode.setBounds(10, 80, 80, 25);
        panel.add(label_depCode);

//        String[] depStrings = {"Sales", "Development", "Accountancy"};
//
//        final JComboBox<String> cb = new JComboBox<>(depStrings);
//
//        cb.setMaximumSize(cb.getPreferredSize());
//        cb.setAlignmentX(Component.CENTER_ALIGNMENT);

        // text field setup
        user_firstName = new JTextField(20);
        user_firstName.setBounds(100, 20, 175, 25);
        panel.add(user_firstName);

        user_lastName = new JTextField(20);
        user_lastName.setBounds(100, 50, 175, 25);
        panel.add(user_lastName);

        // button setup
        button = new JButton("Create new user");
        button.setBounds(10, 130, 200, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        // submit and generate label
        generate = new JLabel("");
        generate.setBounds(10, 170, 400, 50);
        panel.add(generate);

        frame.setVisible(true);
    }


        // generate random password
        private String randomPassword(int length){
            String characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$&";
            char[] password = new char[length];
            for (int i = 0; i < length; i++){
                int random = (int) (Math.random() * characters.length());
                password[i] = characters.charAt(random);
            }
            return new String(password);

        }


    public void actionPerformed(ActionEvent e) {

        String newUser = "New employee: " + user_firstName.getText() + " " + user_lastName.getText();
        String firstName = user_firstName.getText();
        String lastName = user_lastName.getText();
        String dep = "Department: " + user_depCode.getText();
        String email = "New email: " + firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dep + ".company.com";
        String password = "\n" + "New password: " + randomPassword(defaultPassword);

//        generate.setText(newUser + email);
//        generate.setText(firstName);
//        generate.setText(lastName);
//        generate.setText(dep);
//        generate.setText(email);
        generate.setText(password);
        }

//        System.out.println("New user: " + firstName + " " + lastName + " " + "from " + dep + " " + "department");
//        String newUser = "New user: " + firstName + " " + lastName;
//        generate.setText(newUser);
//        String newEmail = "New email: " + firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dep + ".company.com";
//        generate.setText(newEmail);


//        label_firstName.setText("Carla");
//        label_lastName.setText("de Oliveira Silva");
//        label_depCode.setText("Developer");
//        label_newEmail.setText("carla.deos@dev.company.com");
//        label_newPassword.setText("ahri5nv2");

    }