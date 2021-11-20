package view;

import model.Cliente;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class LoginGUI implements ActionListener {
    JFrame frame = new JFrame();
    JTextField user = new JTextField();
    JPasswordField pass = new JPasswordField();
    JLabel lbUser = new JLabel("Usuario:");
    JLabel lbPass = new JLabel("Senha:");
    JLabel lbMessage = new JLabel();
    JButton login = new JButton("Entrar");
    JButton reset = new JButton("Reset");

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    public LoginGUI(HashMap<String,String> loginInfoOriginal) {
        loginInfo = loginInfoOriginal;

        lbUser.setBounds(50, 100, 75, 25);
        lbPass.setBounds(50,150,75,25);
        lbMessage.setBounds(125,250,250,35);
        lbMessage.setFont(new Font(null, Font.PLAIN,25));

        user.setBounds(125,100,200,25);
        pass.setBounds(125,150,200,25);

        login.setBounds(125,200,100,25);
        login.setFocusable(false);
        login.addActionListener(this);

        reset.setBounds(225,200,100,25);
        reset.setFocusable(false);
        reset.addActionListener(this);

        frame.add(lbUser);
        frame.add(lbPass);
        frame.add(lbMessage);
        frame.add(user);
        frame.add(pass);
        frame.add(login);
        frame.add(reset);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == reset) {
            user.setText("");
            pass.setText("");
        }

        if(e.getSource() == login) {
            String user1 = user.getText();
            String password1 = String.valueOf(pass.getPassword());

            if(loginInfo.containsKey(user1)) {
                if(loginInfo.get(user1).equals(password1)) {
                    lbMessage.setForeground(Color.green);
                    lbMessage.setText("Login Realizado!");
                    frame.dispose();

                } else {
                    lbMessage.setForeground(Color.red);
                    lbMessage.setText("Senha Incorreta!");
                }
            } else {
                lbMessage.setForeground(Color.red);
                lbMessage.setText("Usuario Incorreto!");
            }
        }
    }
}

