import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(600, 300);
        frame.setTitle("Robappi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);
        frame.add(panel);

        //email label
        JLabel email = new JLabel("Enter email: ");
        email.setBounds(10, 28, 80, 20);
        email.setForeground(Color.WHITE);
        panel.add(email);

        //email ievada lauks
        JTextField emailField = new JTextField();
        emailField.setBounds(105, 30, 140, 20);
        panel.add(emailField);

        //password label
        JLabel pass = new JLabel("Enter password: ");
        pass.setBounds(10, 58, 100, 20);
        pass.setForeground(Color.WHITE);
        panel.add(pass);

        //Password ievada lauks
        JPasswordField passwordField = new JPasswordField();;
        passwordField.setBounds(105, 60, 140, 20);
        panel.add(passwordField);

        //button
        JButton btn = new JButton("Register");
        btn.setBounds(260, 210, 100, 20);
        btn.setBackground(Color.black);
        btn.setForeground(Color.RED);
        panel.add(btn);


        btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                // sets display value
                String input = emailField.getText();
                String input2 = passwordField.getText();
                //display value
                String res = input;
                String res2 = input2;
                    //display
                    JLabel emailLabel = new JLabel();
                    emailLabel.setBounds(260, 20, 600, 20);
                    panel.add(emailLabel);
                    emailLabel.setText("Tu esi ielogojies: " + res);
                    emailLabel.setForeground(Color.GRAY);

                    JLabel passLabel = new JLabel();
                    passLabel.setBounds(260, 60, 600, 20);
                    panel.add(passLabel);
                    passLabel.setText("Paldies par paroli :) : " + res2);
                    passLabel.setForeground(Color.GRAY);

                    JLabel madeby = new JLabel();
                    madeby.setBounds(475,240, 200, 20);
                    panel.add(madeby);
                    madeby.setText("Made By - Roberts");
                    madeby.setForeground(Color.DARK_GRAY);
                }
            }
        );
                    
        frame.setVisible(true);
    }
}
